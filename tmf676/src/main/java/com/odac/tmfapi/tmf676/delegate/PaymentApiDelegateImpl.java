package com.odac.tmfapi.tmf676.delegate;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.odac.tmfapi.tmf676.oapi.controller.PaymentApiDelegate;
import com.odac.tmfapi.tmf676.oapi.model.Payment;
import com.odac.tmfapi.tmf676.oapi.model.PaymentCreate;
import com.odac.tmfapi.tmf676.service.PaymentService;

@Service
public class PaymentApiDelegateImpl implements PaymentApiDelegate {

	private final PaymentService paymentService;

	public PaymentApiDelegateImpl(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	
    @Override
	public ResponseEntity<Payment> createPayment(PaymentCreate payment) {
		return ResponseEntity.ok().body(paymentService.createPayment(payment));
	}

	@Override
	public ResponseEntity<Payment> retrievePayment(String id, String fields) {
		return ResponseEntity.ok().body(paymentService.retrievePayment(id, fields));
	}

	@Override
    public ResponseEntity<List<Payment>> listPayment(String fields, Integer offset, Integer limit) {
        return ResponseEntity.ok().body(paymentService.listPayment(fields,offset, limit));
    }    
}
