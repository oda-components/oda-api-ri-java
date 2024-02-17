package com.odac.tmfapi.tmf676.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.stereotype.Service;

import com.odac.tmfapi.tmf676.oapi.model.Payment;
import com.odac.tmfapi.tmf676.oapi.model.PaymentCreate;
import com.odac.tmfapi.tmf676.exception.NotFoundException;
import com.odac.tmfapi.tmf676.repository.PaymentRepository;
import com.redis.om.spring.search.stream.EntityStream;

@EnableRedisRepositories(basePackages = {
	"com.odac.tmfapi.tmf676.repository","com.odac.tmfapi.tmf676.oapi.model"})
@Service
public class PaymentService {
    Logger logger = LoggerFactory.getLogger(PaymentService.class);

    @Autowired
    EntityStream entityStream;

    @Autowired
    private PaymentRepository paymentRepository;
    
    public Payment createPayment (PaymentCreate payment) {
        logger.info ("Received PaymentCreate [" + payment.toString() + "]");
        String uuid = UUID.randomUUID().toString();
        Payment pmt = new Payment (payment.getAccount(), payment.getPaymentMethod());
        pmt.setId(uuid);  // Not in PaymentCreate
        pmt.setHref("xxxx");    // Not in PaymentCreate
        pmt.setAuthorizationCode(payment.getAuthorizationCode());
        pmt.setCorrelatorId(payment.getCorrelatorId());
        pmt.setDescription(payment.getDescription());
        pmt.setName(payment.getName());
        pmt.setPaymentDate (OffsetDateTime.now()); //@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        pmt.setStatus("Completed"); // Not in PaymentCreate
        pmt.setStatusDate(OffsetDateTime.now()); //@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        pmt.setAmount (payment.getAmount());
        pmt.setChannel(payment.getChannel());
        pmt.setPayer(payment.getPayer());
        pmt.setPaymentItem(payment.getPaymentItem());
        pmt.setTaxAmount(payment.getTaxAmount());
        pmt.setTotalAmount(payment.getTotalAmount());
        pmt.setAtBaseType(payment.getAtBaseType());
        pmt.setAtSchemaLocation(payment.getAtSchemaLocation());
        pmt.setAtType(payment.getAtType());
        paymentRepository.save(pmt);        
        logger.info("New Payment Created : {}", uuid);        

        return pmt;
    }
    
    public List<Payment> listPayment(String fields, Integer offset, Integer limit) {
        List<Payment> payments = paymentRepository.findAll();
        if (payments.isEmpty()) {
            throw new NotFoundException("No payments");
        }
        return payments;
    }

    public Payment retrievePayment(String id, String fields) { // TODO: Filter the response fields
        return paymentRepository.findById(id)
            .orElseThrow(() -> new NotFoundException("Payment not found for Id: " + id));
    }
}
