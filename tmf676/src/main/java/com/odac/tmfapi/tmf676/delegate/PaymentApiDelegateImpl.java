package com.odac.tmfapi.tmf676.delegate;

import java.util.List;
import java.util.UUID;
import java.time.OffsetDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.context.request.NativeWebRequest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.odac.tmfapi.tmf676.exception.CreateException;
import com.odac.tmfapi.tmf676.exception.NotFoundException;
import com.odac.tmfapi.tmf676.oapi.controller.PaymentApiDelegate;
import com.odac.tmfapi.tmf676.oapi.model.Payment;
import com.odac.tmfapi.tmf676.oapi.model.PaymentCreate;
import com.odac.tmfapi.tmf676.repository.PaymentRepository;
import com.odac.tmfapi.tmf676.util.CustomPageable;

import jakarta.servlet.http.HttpServletRequest;


@EnableRedisRepositories(basePackages = {
	"com.odac.tmfapi.tmf676.repository","com.odac.tmfapi.tmf676.oapi.model"})
@Service
public class PaymentApiDelegateImpl implements PaymentApiDelegate {
    Logger logger = LoggerFactory.getLogger(PaymentApiDelegateImpl.class);

    @Autowired
    private PaymentRepository paymentRepository;

	@Autowired
    NativeWebRequest request;

    @Override
	public ResponseEntity<Payment> createPayment(PaymentCreate payment) {
		logger.info ("createPayment:: Received PaymentCreate [" + payment.toString() + "]");
		String uuid = UUID.randomUUID().toString();
		Payment paymentNew = new Payment ();
		HttpServletRequest httpRequest 
          = (HttpServletRequest) request.getNativeRequest();
		String location = String.format ("%s/%s", httpRequest.getRequestURI(), uuid);

		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		mapper.registerModule(new JavaTimeModule());		
		try {
			JsonNode jsonNode = mapper.valueToTree(payment);  // Convert to JsonNode
			ObjectNode objectNode = (ObjectNode) jsonNode;  // Cast to ObjectNode for modification
			objectNode.put("href", location);
			if (!objectNode.has("@type")) {
				objectNode.putNull("@type");
			}
			String json = mapper.writeValueAsString(objectNode);  // Convert back to JSON string

			paymentNew = mapper.readValue(json, Payment.class);
			paymentNew.setPaymentDate (OffsetDateTime.now());
        	paymentNew.setStatus("Completed"); 
        	paymentNew.setStatusDate(OffsetDateTime.now()); 
		
		} catch (JsonProcessingException e) {
			CreateException ex = new CreateException (
				String.format ("received PaymentCreate with id %s for createPayment (1)",
					paymentNew.getId()));
			ex.setStackTrace(e.getStackTrace());
			throw ex;
		}

		if (paymentNew.getId() == null) {
			paymentNew.setId(uuid);
		} else {
			throw new CreateException(
				String.format ("received PaymentCreate with id %s for createPayment (2)",
					paymentNew.getId()));
		}
		if (paymentNew.getAtType() == null) {
			paymentNew.setAtType("Payment");
		}
		paymentRepository.save(paymentNew);
		logger.info("New payment Created : {}", uuid);        

		return ResponseEntity.ok().body(paymentNew);
	}

	@Override
	public ResponseEntity<Payment> retrievePayment(String id, String fields) {
        logger.info (String.format ("retrievePayment([%s], [%s]) - Trace Id", id, fields));
		Payment pmt = paymentRepository.findById(id)
			.orElseThrow(() -> new NotFoundException("Payment not found for Id: " + id));
		return ResponseEntity.ok().body(pmt);
	}

	@Override
    public ResponseEntity<List<Payment>> listPayment(String fields, Integer offset, Integer limit) {
        logger.info (String.format ("listPayment([%s], %d, %d) - Trace Id", fields, offset, limit));

        if (offset != null && offset < 0) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, "Invalid value for offset [" + offset + "]",
                    new Exception("Invalid value for limit [" + offset + "]"));
        }
		if (offset != null && offset == 0) {
			offset =1;
        }
        if (limit != null && limit <= 0) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, "Invalid value for limit [" + offset + "]", 
                    new Exception("Invalid value for limit [" + offset + "]"));
        }
        if (limit != null && limit > 100) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, "Invalid value for limit [" + offset + "]", 
                    new Exception("Invalid value for limit [" + offset + "]"));
        }

		long count = paymentRepository.count();
        logger.info (String.format("List Pagination::Count [%d], Offset [%d], Limit [%d]",
            count, offset, limit));
		CustomPageable pr = new CustomPageable (((offset==null) ? 0 : offset-1), ((limit==null) ? 100:limit));
        Page<Payment> pmts = paymentRepository.findAll (pr);  

		if (pmts.isEmpty()) {
            throw new NotFoundException("No Payments found");
        }
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set ("X-Total-Count", String.valueOf (count));
		responseHeaders.set ("Content-Range", "items " + 
			((offset==null) ? 1 : offset) + "-" + (pr.getOffset ()+pmts.getNumberOfElements()) + "/" + count);

		return ResponseEntity.ok()
			.headers(responseHeaders)
			.body(pmts.getContent());
    }    
}