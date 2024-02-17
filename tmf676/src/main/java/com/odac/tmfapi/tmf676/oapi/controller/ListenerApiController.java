package com.odac.tmfapi.tmf676.oapi.controller;

import com.odac.tmfapi.tmf676.oapi.model.Error;
import com.odac.tmfapi.tmf676.oapi.model.EventSubscription;
import com.odac.tmfapi.tmf676.oapi.model.PaymentAttributeValueChangeEvent;
import com.odac.tmfapi.tmf676.oapi.model.PaymentCreateEvent;
import com.odac.tmfapi.tmf676.oapi.model.PaymentDeleteEvent;
import com.odac.tmfapi.tmf676.oapi.model.PaymentStateChangeEvent;
import com.odac.tmfapi.tmf676.oapi.model.RefundAttributeValueChangeEvent;
import com.odac.tmfapi.tmf676.oapi.model.RefundCreateEvent;
import com.odac.tmfapi.tmf676.oapi.model.RefundDeleteEvent;
import com.odac.tmfapi.tmf676.oapi.model.RefundStateChangeEvent;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Controller
@RequestMapping("${openapi.payment.base-path:/payment/v4}")
public class ListenerApiController implements ListenerApi {

    private final ListenerApiDelegate delegate;

    public ListenerApiController(@Autowired(required = false) ListenerApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ListenerApiDelegate() {});
    }

    @Override
    public ListenerApiDelegate getDelegate() {
        return delegate;
    }

}
