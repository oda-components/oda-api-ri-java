package com.odac.tmfapi.tmf634.delegate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.server.ResponseStatusException;

import com.odac.tmfapi.tmf634.oapi.controller.ResourceSpecificationApiDelegate;
import com.odac.tmfapi.tmf634.oapi.model.ResourceSpecification;
import com.odac.tmfapi.tmf634.oapi.model.ResourceSpecificationFVO;

import com.odac.tmfapi.tmf634.exception.CreateException;
import com.odac.tmfapi.tmf634.exception.NotFoundException;
import com.odac.tmfapi.tmf634.repository.ResourceSpecificationRepository;
import com.odac.tmfapi.tmf634.util.CustomPageable;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.core.JsonProcessingException;

@EnableRedisRepositories(basePackages = {
	"com.odac.tmfapi.tmf634.repository","com.odac.tmfapi.tmf634.oapi.model"})

@Service
public class ResourceSpecificationApiDelegateImpl implements ResourceSpecificationApiDelegate {
    Logger logger = LoggerFactory.getLogger(ResourceSpecificationApiDelegateImpl.class);

    @Autowired
    NativeWebRequest request;

    @Autowired
    private ResourceSpecificationRepository resourceSpecificationRepository;
	
    @Override
	public ResponseEntity<ResourceSpecification> createResourceSpecification(ResourceSpecificationFVO resourceSpecificationFVO,
        String fields) {
        logger.info ("createResourceSpecification:: Received ResourceCatalogFVO [" + resourceSpecificationFVO.toString() + "]");
        String uuid = UUID.randomUUID().toString();
        String location = String.format ("/tmf-api/resourceCatalog/v4/resourceSpecification/%s", uuid);
        ResourceSpecification resourceSpecificationNew = new ResourceSpecification (resourceSpecificationFVO.getAtType());

        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode jsonNode = mapper.valueToTree(resourceSpecificationFVO);  // Convert to JsonNode
            ObjectNode objectNode = (ObjectNode) jsonNode;  // Cast to ObjectNode for modification
//            objectNode.put("id", uuid);
            objectNode.put("href", location);
            if (!objectNode.has("@type")) {
                objectNode.putNull("@type");
            }
            String json = mapper.writeValueAsString(objectNode);  // Convert back to JSON string

            resourceSpecificationNew = mapper.readValue(json, ResourceSpecification.class);
        } catch (JsonProcessingException e) {
            CreateException ex = new CreateException (
                String.format ("received ResourceSpecificationFVO with id %s for createResourceSpecification",
                    resourceSpecificationNew.getId()));
            ex.setStackTrace(e.getStackTrace());
            throw ex;
        }

        if (resourceSpecificationNew.getId() == null) {
            resourceSpecificationNew.setId(uuid);
        } else {
            throw new CreateException(
                String.format ("received ResourceSpecificationFVO with id %s for createResourceSpecification",
                    resourceSpecificationNew.getId()));
        }
        if (resourceSpecificationNew.getAtType() == null) {
            resourceSpecificationNew.setAtType("ResourceSpecification");
        }
        resourceSpecificationRepository.save(resourceSpecificationNew);
        logger.info("New ResourceCatalog Created : {}", uuid);        

		return ResponseEntity.ok().body(resourceSpecificationNew);
	}

	@Override
	public ResponseEntity<ResourceSpecification> retrieveResourceSpecification(String id, String fields) {
        logger.info (String.format ("retrieveResourceSpecification([%s], [%s]) - Trace Id", id, fields));
        ResourceSpecification rs = resourceSpecificationRepository.findById(id)
            .orElseThrow(() -> new NotFoundException("ResourceCatalog not found for Id: " + id));

		return ResponseEntity.ok().body(rs);
	}

	@Override
    public ResponseEntity<List<ResourceSpecification>> listResourceSpecification(String fields, Integer offset, Integer limit) {
        logger.info (String.format ("listResourceSpecification([%s], %d, %d) - Trace Id", fields, offset, limit));

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

		long count = resourceSpecificationRepository.count();

        logger.info (String.format("List Pagination::Count [%d], Offset [%d], Limit [%d]",
            count, offset, limit));
		CustomPageable pr = new CustomPageable (((offset==null) ? 0 : offset-1), ((limit==null) ? 100:limit));// TODO:// remove hardcoding
        Page<ResourceSpecification> resourceSpecifications = resourceSpecificationRepository.findAll (pr);  

        if (resourceSpecifications.isEmpty()) {
            throw new NotFoundException("No resourceSpecifications found");
        }
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set (HttpHeaders.LINK, "<http://localhost:8080/services?page=1>,<http://localhost:8080/services?page=2>");
		responseHeaders.set ("X-Total-Count", String.valueOf (count));
		responseHeaders.set ("URI", request.getContextPath());

		return ResponseEntity.ok()
			.headers(responseHeaders)
			.body(resourceSpecifications.getContent());
    }

	@Override
    public ResponseEntity<Void> deleteResourceSpecification(String id){
        logger.info (String.format ("deleteResourceSpecification([%s]) - Trace Id", id));        
		resourceSpecificationRepository.deleteById(id);
		return null;
//        return ResponseEntity.ok().body();
    }
}
