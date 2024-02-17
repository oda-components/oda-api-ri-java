package com.odac.tmfapi.tmf676.oapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.odac.tmfapi.tmf676.oapi.model.AccountRef;
import com.odac.tmfapi.tmf676.oapi.model.ChannelRef;
import com.odac.tmfapi.tmf676.oapi.model.Money;
import com.odac.tmfapi.tmf676.oapi.model.PaymentMethodRefOrValue;
import com.odac.tmfapi.tmf676.oapi.model.PaymentRef;
import com.odac.tmfapi.tmf676.oapi.model.RelatedParty;
import java.time.OffsetDateTime;
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
 * The Refund resource represents a performed Refund. It contains both information about the refund and the payment method used to perform it. Skipped properties: id,href,status,statusDate,RefundDate
 */

@Schema(name = "Refund_Create", description = "The Refund resource represents a performed Refund. It contains both information about the refund and the payment method used to perform it. Skipped properties: id,href,status,statusDate,RefundDate")
@JsonTypeName("Refund_Create")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RefundCreate implements Serializable {

  private static final long serialVersionUID = 1L;

  private String authorizationCode;

  private String correlatorId;

  private String description;

  private String name;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime refundDate;

  private AccountRef account;

  private Money amount;

  private ChannelRef channel;

  private PaymentRef payment;

  private PaymentMethodRefOrValue paymentMethod;

  private RelatedParty requestor;

  private Money taxAmount;

  private Money totalAmount;

  private String atBaseType;

  private java.lang.String atSchemaLocation;

  private String atType;

  public RefundCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RefundCreate(AccountRef account, PaymentMethodRefOrValue paymentMethod, Money totalAmount) {
    this.account = account;
    this.paymentMethod = paymentMethod;
    this.totalAmount = totalAmount;
  }

  public RefundCreate authorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
    return this;
  }

  /**
   * Authorization code retrieved from an external payment gateway that could be used for conciliation
   * @return authorizationCode
  */
  
  @Schema(name = "authorizationCode", description = "Authorization code retrieved from an external payment gateway that could be used for conciliation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorizationCode")
  public String getAuthorizationCode() {
    return authorizationCode;
  }

  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }

  public RefundCreate correlatorId(String correlatorId) {
    this.correlatorId = correlatorId;
    return this;
  }

  /**
   * Unique identifier in the client for the refund in case it is needed to correlate
   * @return correlatorId
  */
  
  @Schema(name = "correlatorId", description = "Unique identifier in the client for the refund in case it is needed to correlate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correlatorId")
  public String getCorrelatorId() {
    return correlatorId;
  }

  public void setCorrelatorId(String correlatorId) {
    this.correlatorId = correlatorId;
  }

  public RefundCreate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Text describing the contents of the refund
   * @return description
  */
  
  @Schema(name = "description", description = "Text describing the contents of the refund", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RefundCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Screen name of the refund
   * @return name
  */
  
  @Schema(name = "name", description = "Screen name of the refund", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RefundCreate refundDate(OffsetDateTime refundDate) {
    this.refundDate = refundDate;
    return this;
  }

  /**
   * Date when the refund was performed
   * @return refundDate
  */
  @Valid 
  @Schema(name = "refundDate", description = "Date when the refund was performed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refundDate")
  public OffsetDateTime getRefundDate() {
    return refundDate;
  }

  public void setRefundDate(OffsetDateTime refundDate) {
    this.refundDate = refundDate;
  }

  public RefundCreate account(AccountRef account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @NotNull @Valid 
  @Schema(name = "account", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("account")
  public AccountRef getAccount() {
    return account;
  }

  public void setAccount(AccountRef account) {
    this.account = account;
  }

  public RefundCreate amount(Money amount) {
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

  public RefundCreate channel(ChannelRef channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Get channel
   * @return channel
  */
  @Valid 
  @Schema(name = "channel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("channel")
  public ChannelRef getChannel() {
    return channel;
  }

  public void setChannel(ChannelRef channel) {
    this.channel = channel;
  }

  public RefundCreate payment(PaymentRef payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
  */
  @Valid 
  @Schema(name = "payment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payment")
  public PaymentRef getPayment() {
    return payment;
  }

  public void setPayment(PaymentRef payment) {
    this.payment = payment;
  }

  public RefundCreate paymentMethod(PaymentMethodRefOrValue paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
  */
  @NotNull @Valid 
  @Schema(name = "paymentMethod", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paymentMethod")
  public PaymentMethodRefOrValue getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethodRefOrValue paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public RefundCreate requestor(RelatedParty requestor) {
    this.requestor = requestor;
    return this;
  }

  /**
   * Get requestor
   * @return requestor
  */
  @Valid 
  @Schema(name = "requestor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestor")
  public RelatedParty getRequestor() {
    return requestor;
  }

  public void setRequestor(RelatedParty requestor) {
    this.requestor = requestor;
  }

  public RefundCreate taxAmount(Money taxAmount) {
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

  public RefundCreate totalAmount(Money totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
  */
  @NotNull @Valid 
  @Schema(name = "totalAmount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalAmount")
  public Money getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Money totalAmount) {
    this.totalAmount = totalAmount;
  }

  public RefundCreate atBaseType(String atBaseType) {
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

  public RefundCreate atSchemaLocation(java.lang.String atSchemaLocation) {
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

  public RefundCreate atType(String atType) {
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
    RefundCreate refundCreate = (RefundCreate) o;
    return Objects.equals(this.authorizationCode, refundCreate.authorizationCode) &&
        Objects.equals(this.correlatorId, refundCreate.correlatorId) &&
        Objects.equals(this.description, refundCreate.description) &&
        Objects.equals(this.name, refundCreate.name) &&
        Objects.equals(this.refundDate, refundCreate.refundDate) &&
        Objects.equals(this.account, refundCreate.account) &&
        Objects.equals(this.amount, refundCreate.amount) &&
        Objects.equals(this.channel, refundCreate.channel) &&
        Objects.equals(this.payment, refundCreate.payment) &&
        Objects.equals(this.paymentMethod, refundCreate.paymentMethod) &&
        Objects.equals(this.requestor, refundCreate.requestor) &&
        Objects.equals(this.taxAmount, refundCreate.taxAmount) &&
        Objects.equals(this.totalAmount, refundCreate.totalAmount) &&
        Objects.equals(this.atBaseType, refundCreate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, refundCreate.atSchemaLocation) &&
        Objects.equals(this.atType, refundCreate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationCode, correlatorId, description, name, refundDate, account, amount, channel, payment, paymentMethod, requestor, taxAmount, totalAmount, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundCreate {\n");
    sb.append("    authorizationCode: ").append(toIndentedString(authorizationCode)).append("\n");
    sb.append("    correlatorId: ").append(toIndentedString(correlatorId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    refundDate: ").append(toIndentedString(refundDate)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
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

