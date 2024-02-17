package com.odac.tmfapi.tmf676.repository;

import com.odac.tmfapi.tmf676.oapi.model.Payment;
import com.redis.om.spring.repository.RedisDocumentRepository;

public interface PaymentRepository extends RedisDocumentRepository<Payment, String> {}
