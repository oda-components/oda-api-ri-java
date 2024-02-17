package com.odac.tmfapi.tmf676.oapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.odac.tmfapi.tmf676.oapi.model.AccountRef;
import com.odac.tmfapi.tmf676.oapi.model.ChannelRef;
import com.odac.tmfapi.tmf676.oapi.model.Money;
import com.odac.tmfapi.tmf676.oapi.model.PaymentItem;
import com.odac.tmfapi.tmf676.oapi.model.PaymentMethodRefOrValue;
import com.odac.tmfapi.tmf676.oapi.model.RelatedParty;
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
 * The Payment resource represents a performed payment. It contains both information about the payment and the payment method used to perform it.
 */

@Schema(name = "Payment", description = "The Payment resource represents a performed payment. It contains both information about the payment and the payment method used to perform it.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Payment implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String href;

  private String authorizationCode;

  private String correlatorId;

  private String description;

  private String name;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime paymentDate;

  private String status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime statusDate;

  private AccountRef account;

  private Money amount;

  private ChannelRef channel;

  private RelatedParty payer;

  @Valid
  private List<@Valid PaymentItem> paymentItem;

  private PaymentMethodRefOrValue paymentMethod;

  private Money taxAmount;

  private Money totalAmount;

  private String atBaseType;

  private java.lang.String atSchemaLocation;

  private String atType;

  public Payment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Payment(AccountRef account, PaymentMethodRefOrValue paymentMethod) {
    this.account = account;
    this.paymentMethod = paymentMethod;
  }

  public Payment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of Payment
   * @return id
  */
  
  @Schema(name = "id", description = "Unique identifier of Payment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Payment href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hypertext Reference of the Payment
   * @return href
  */
  
  @Schema(name = "href", description = "Hypertext Reference of the Payment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Payment authorizationCode(String authorizationCode) {
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

  public Payment correlatorId(String correlatorId) {
    this.correlatorId = correlatorId;
    return this;
  }

  /**
   * Unique identifier in the client for the payment in case it is needed to correlate
   * @return correlatorId
  */
  
  @Schema(name = "correlatorId", description = "Unique identifier in the client for the payment in case it is needed to correlate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correlatorId")
  public String getCorrelatorId() {
    return correlatorId;
  }

  public void setCorrelatorId(String correlatorId) {
    this.correlatorId = correlatorId;
  }

  public Payment description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Text describing the contents of the payment
   * @return description
  */
  
  @Schema(name = "description", description = "Text describing the contents of the payment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Payment name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Screen name of the payment
   * @return name
  */
  
  @Schema(name = "name", description = "Screen name of the payment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Payment paymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * Date when the payment was performed
   * @return paymentDate
  */
  @Valid 
  @Schema(name = "paymentDate", description = "Date when the payment was performed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentDate")
  public OffsetDateTime getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
  }

  public Payment status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the payment
   * @return status
  */
  
  @Schema(name = "status", description = "Status of the payment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Payment statusDate(OffsetDateTime statusDate) {
    this.statusDate = statusDate;
    return this;
  }

  /**
   * Date when the status was recorded
   * @return statusDate
  */
  @Valid 
  @Schema(name = "statusDate", description = "Date when the status was recorded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusDate")
  public OffsetDateTime getStatusDate() {
    return statusDate;
  }

  public void setStatusDate(OffsetDateTime statusDate) {
    this.statusDate = statusDate;
  }

  public Payment account(AccountRef account) {
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

  public Payment amount(Money amount) {
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

  public Payment channel(ChannelRef channel) {
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

  public Payment payer(RelatedParty payer) {
    this.payer = payer;
    return this;
  }

  /**
   * Get payer
   * @return payer
  */
  @Valid 
  @Schema(name = "payer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payer")
  public RelatedParty getPayer() {
    return payer;
  }

  public void setPayer(RelatedParty payer) {
    this.payer = payer;
  }

  public Payment paymentItem(List<@Valid PaymentItem> paymentItem) {
    this.paymentItem = paymentItem;
    return this;
  }

  public Payment addPaymentItemItem(PaymentItem paymentItemItem) {
    if (this.paymentItem == null) {
      this.paymentItem = new ArrayList<>();
    }
    this.paymentItem.add(paymentItemItem);
    return this;
  }

  /**
   * Get paymentItem
   * @return paymentItem
  */
  @Valid 
  @Schema(name = "paymentItem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentItem")
  public List<@Valid PaymentItem> getPaymentItem() {
    return paymentItem;
  }

  public void setPaymentItem(List<@Valid PaymentItem> paymentItem) {
    this.paymentItem = paymentItem;
  }

  public Payment paymentMethod(PaymentMethodRefOrValue paymentMethod) {
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

  public Payment taxAmount(Money taxAmount) {
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

  public Payment totalAmount(Money totalAmount) {
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

  public Payment atBaseType(String atBaseType) {
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

  public Payment atSchemaLocation(java.lang.String atSchemaLocation) {
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

  public Payment atType(String atType) {
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
    Payment payment = (Payment) o;
    return Objects.equals(this.id, payment.id) &&
        Objects.equals(this.href, payment.href) &&
        Objects.equals(this.authorizationCode, payment.authorizationCode) &&
        Objects.equals(this.correlatorId, payment.correlatorId) &&
        Objects.equals(this.description, payment.description) &&
        Objects.equals(this.name, payment.name) &&
        Objects.equals(this.paymentDate, payment.paymentDate) &&
        Objects.equals(this.status, payment.status) &&
        Objects.equals(this.statusDate, payment.statusDate) &&
        Objects.equals(this.account, payment.account) &&
        Objects.equals(this.amount, payment.amount) &&
        Objects.equals(this.channel, payment.channel) &&
        Objects.equals(this.payer, payment.payer) &&
        Objects.equals(this.paymentItem, payment.paymentItem) &&
        Objects.equals(this.paymentMethod, payment.paymentMethod) &&
        Objects.equals(this.taxAmount, payment.taxAmount) &&
        Objects.equals(this.totalAmount, payment.totalAmount) &&
        Objects.equals(this.atBaseType, payment.atBaseType) &&
        Objects.equals(this.atSchemaLocation, payment.atSchemaLocation) &&
        Objects.equals(this.atType, payment.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, authorizationCode, correlatorId, description, name, paymentDate, status, statusDate, account, amount, channel, payer, paymentItem, paymentMethod, taxAmount, totalAmount, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    authorizationCode: ").append(toIndentedString(authorizationCode)).append("\n");
    sb.append("    correlatorId: ").append(toIndentedString(correlatorId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDate: ").append(toIndentedString(statusDate)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    paymentItem: ").append(toIndentedString(paymentItem)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

