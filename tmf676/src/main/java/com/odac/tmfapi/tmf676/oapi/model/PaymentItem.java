package com.odac.tmfapi.tmf676.oapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.odac.tmfapi.tmf676.oapi.model.EntityRef;
import com.odac.tmfapi.tmf676.oapi.model.Money;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The paymentItem is the result of lettering process. It enables to assign automatically or manually part of incoming payment amount to a bill
 */

@Schema(name = "PaymentItem", description = "The paymentItem is the result of lettering process. It enables to assign automatically or manually part of incoming payment amount to a bill")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PaymentItem implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private Money amount;

  private EntityRef item;

  private Money taxAmount;

  private Money totalAmount;

  private String atBaseType;

  private java.lang.String atSchemaLocation;

  private String atType;

  public PaymentItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PaymentItem(EntityRef item) {
    this.item = item;
  }

  public PaymentItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the payment Item
   * @return id
  */
  
  @Schema(name = "id", description = "Unique identifier of the payment Item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentItem amount(Money amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @Valid 
  @Schema(name = "amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public Money getAmount() {
    return amount;
  }

  public void setAmount(Money amount) {
    this.amount = amount;
  }

  public PaymentItem item(EntityRef item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
  */
  @NotNull @Valid 
  @Schema(name = "item", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item")
  public EntityRef getItem() {
    return item;
  }

  public void setItem(EntityRef item) {
    this.item = item;
  }

  public PaymentItem taxAmount(Money taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * Get taxAmount
   * @return taxAmount
  */
  @Valid 
  @Schema(name = "taxAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxAmount")
  public Money getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Money taxAmount) {
    this.taxAmount = taxAmount;
  }

  public PaymentItem totalAmount(Money totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
  */
  @Valid 
  @Schema(name = "totalAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalAmount")
  public Money getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Money totalAmount) {
    this.totalAmount = totalAmount;
  }

  public PaymentItem atBaseType(String atBaseType) {
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

  public PaymentItem atSchemaLocation(java.lang.String atSchemaLocation) {
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

  public PaymentItem atType(String atType) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentItem paymentItem = (PaymentItem) o;
    return Objects.equals(this.id, paymentItem.id) &&
        Objects.equals(this.amount, paymentItem.amount) &&
        Objects.equals(this.item, paymentItem.item) &&
        Objects.equals(this.taxAmount, paymentItem.taxAmount) &&
        Objects.equals(this.totalAmount, paymentItem.totalAmount) &&
        Objects.equals(this.atBaseType, paymentItem.atBaseType) &&
        Objects.equals(this.atSchemaLocation, paymentItem.atSchemaLocation) &&
        Objects.equals(this.atType, paymentItem.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount, item, taxAmount, totalAmount, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
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

