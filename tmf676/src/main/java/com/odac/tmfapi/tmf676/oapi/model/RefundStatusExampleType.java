package com.odac.tmfapi.tmf676.oapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Possible values for the status of a refund
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum RefundStatusExampleType {
  
  PENDINGAUTHORIZATION("pendingAuthorization"),
  
  AUTHORIZED("authorized"),
  
  CAPTURED("captured"),
  
  FAILED("failed"),
  
  CANCELED("canceled"),
  
  DENIED("denied"),
  
  DONE("done");

  private String value;

  RefundStatusExampleType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RefundStatusExampleType fromValue(String value) {
    for (RefundStatusExampleType b : RefundStatusExampleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

