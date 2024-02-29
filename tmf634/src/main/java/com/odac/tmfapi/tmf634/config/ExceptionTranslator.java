package com.odac.tmfapi.tmf634.config;

import com.odac.tmfapi.tmf634.oapi.model.Error;
import com.odac.tmfapi.tmf634.exception.CreateException;
import com.odac.tmfapi.tmf634.exception.NotFoundException;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionTranslator {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Object> paymentNotFoundException(final NotFoundException e) {
        Map<String, Object> body = new HashMap<>();
        body.put("message", getError(e.getMessage(), HttpStatus.NOT_FOUND.value()));//e.getMessage());
    
        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(CreateException.class)
    public ResponseEntity<Object> createSpecException(final CreateException e) {
        Map<String, Object> body = new HashMap<>();
        body.put("message", getError(e.getMessage(), HttpStatus.BAD_REQUEST.value()));//e.getMessage());
    
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }

    private Error getError(String message, Integer code) {
        Error error = new Error();
        error.setMessage(message);
        error.setCode(code.toString());
        error.setReason(message);
        return error;
    }
}