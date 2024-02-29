package com.odac.tmfapi.tmf634.repository;

import com.odac.tmfapi.tmf634.oapi.model.ResourceSpecification;
import com.redis.om.spring.repository.RedisDocumentRepository;

public interface ResourceSpecificationRepository extends RedisDocumentRepository<ResourceSpecification, String> {}
