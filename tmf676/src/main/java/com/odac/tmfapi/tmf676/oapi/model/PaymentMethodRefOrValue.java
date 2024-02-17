package com.odac.tmfapi.tmf676.oapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.odac.tmfapi.tmf676.oapi.model.AccountRef;
import com.odac.tmfapi.tmf676.oapi.model.RelatedParty;
import com.odac.tmfapi.tmf676.oapi.model.TimePeriod;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * link to the resource that holds information about the payment mean used to complete the operation
 */

@Schema(name = "PaymentMethodRefOrValue", description = "link to the resource that holds information about the payment mean used to complete the operation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PaymentMethodRefOrValue implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String href;

  private String description;

  private Boolean isPreferred;

  private String name;

  private String status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime statusDate;

  @Valid
  private List<@Valid AccountRef> account;

  private RelatedParty relatedParty;

  private TimePeriod validFor;

  private String atBaseType;

  private java.lang.String atSchemaLocation;

  private String atType;

  private String atReferredType;

  public PaymentMethodRefOrValue id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique Identifier within the server for the payment method.
   * @return id
  */
  
  @Schema(name = "id", description = "Unique Identifier within the server for the payment method.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentMethodRefOrValue href(String href) {
    this.href = href;
    return this;
  }

  /**
   * A resource URI pointing to the resource in the server that stores the detailed information. This is typically the resource url to retrieve individual details for the specific payment method
   * @return href
  */
  
  @Schema(name = "href", description = "A resource URI pointing to the resource in the server that stores the detailed information. This is typically the resource url to retrieve individual details for the specific payment method", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PaymentMethodRefOrValue description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Text describing the contents of the payment method
   * @return description
  */
  
  @Schema(name = "description", description = "Text describing the contents of the payment method", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PaymentMethodRefOrValue isPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
    return this;
  }

  /**
   * If the method is the preferred one by the owner. Typically used when querying for the payment methods of a specific customer or account
   * @return isPreferred
  */
  
  @Schema(name = "isPreferred", description = "If the method is the preferred one by the owner. Typically used when querying for the payment methods of a specific customer or account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isPreferred")
  public Boolean getIsPreferred() {
    return isPreferred;
  }

  public void setIsPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
  }

  public PaymentMethodRefOrValue name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Friendly name assigned to the payment method
   * @return name
  */
  
  @Schema(name = "name", description = "Friendly name assigned to the payment method", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PaymentMethodRefOrValue status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PaymentMethodRefOrValue statusDate(OffsetDateTime statusDate) {
    this.statusDate = statusDate;
    return this;
  }

  /**
   * Get statusDate
   * @return statusDate
  */
  @Valid 
  @Schema(name = "statusDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusDate")
  public OffsetDateTime getStatusDate() {
    return statusDate;
  }

  public void setStatusDate(OffsetDateTime statusDate) {
    this.statusDate = statusDate;
  }

  public PaymentMethodRefOrValue account(List<@Valid AccountRef> account) {
    this.account = account;
    return this;
  }

  public PaymentMethodRefOrValue addAccountItem(AccountRef accountItem) {
    if (this.account == null) {
      this.account = new ArrayList<>();
    }
    this.account.add(accountItem);
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @Valid 
  @Schema(name = "account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account")
  public List<@Valid AccountRef> getAccount() {
    return account;
  }

  public void setAccount(List<@Valid AccountRef> account) {
    this.account = account;
  }

  public PaymentMethodRefOrValue relatedParty(RelatedParty relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
  */
  @Valid 
  @Schema(name = "relatedParty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public RelatedParty getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(RelatedParty relatedParty) {
    this.relatedParty = relatedParty;
  }

  public PaymentMethodRefOrValue validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
  */
  @Valid 
  @Schema(name = "validFor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validFor")
  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public PaymentMethodRefOrValue atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public PaymentMethodRefOrValue atSchemaLocation(java.lang.String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  */
  @Valid 
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public java.lang.String getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(java.lang.String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public PaymentMethodRefOrValue atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return atType
  */
  
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class entity name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public PaymentMethodRefOrValue atReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return atReferredType
  */
  
  @Schema(name = "@referredType", description = "The actual type of the target instance when needed for disambiguation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@referredType")
  public String getAtReferredType() {
    return atReferredType;
  }

  public void setAtReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodRefOrValue paymentMethodRefOrValue = (PaymentMethodRefOrValue) o;
    return Objects.equals(this.id, paymentMethodRefOrValue.id) &&
        Objects.equals(this.href, paymentMethodRefOrValue.href) &&
        Objects.equals(this.description, paymentMethodRefOrValue.description) &&
        Objects.equals(this.isPreferred, paymentMethodRefOrValue.isPreferred) &&
        Objects.equals(this.name, paymentMethodRefOrValue.name) &&
        Objects.equals(this.status, paymentMethodRefOrValue.status) &&
        Objects.equals(this.statusDate, paymentMethodRefOrValue.statusDate) &&
        Objects.equals(this.account, paymentMethodRefOrValue.account) &&
        Objects.equals(this.relatedParty, paymentMethodRefOrValue.relatedParty) &&
        Objects.equals(this.validFor, paymentMethodRefOrValue.validFor) &&
        Objects.equals(this.atBaseType, paymentMethodRefOrValue.atBaseType) &&
        Objects.equals(this.atSchemaLocation, paymentMethodRefOrValue.atSchemaLocation) &&
        Objects.equals(this.atType, paymentMethodRefOrValue.atType) &&
        Objects.equals(this.atReferredType, paymentMethodRefOrValue.atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, isPreferred, name, status, statusDate, account, relatedParty, validFor, atBaseType, atSchemaLocation, atType, atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodRefOrValue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isPreferred: ").append(toIndentedString(isPreferred)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDate: ").append(toIndentedString(statusDate)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atReferredType: ").append(toIndentedString(atReferredType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

