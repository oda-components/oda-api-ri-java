package com.odac.tmfapi.tmf676.oapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Account reference. A account may be a party account or a financial account.
 */

@Schema(name = "AccountRef", description = "Account reference. A account may be a party account or a financial account.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountRef implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String href;

  private String description;

  private String name;

  private String atBaseType;

  private java.lang.String atSchemaLocation;

  private String atType;

  private String atReferredType;

  public AccountRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AccountRef(String id) {
    this.id = id;
  }

  public AccountRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the account
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Unique identifier of the account", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccountRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the account
   * @return href
  */
  
  @Schema(name = "href", description = "Reference of the account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public AccountRef description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Detailed description of the account
   * @return description
  */
  
  @Schema(name = "description", description = "Detailed description of the account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccountRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the account
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountRef atBaseType(String atBaseType) {
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

  public AccountRef atSchemaLocation(java.lang.String atSchemaLocation) {
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

  public AccountRef atType(String atType) {
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

  public AccountRef atReferredType(String atReferredType) {
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
    AccountRef accountRef = (AccountRef) o;
    return Objects.equals(this.id, accountRef.id) &&
        Objects.equals(this.href, accountRef.href) &&
        Objects.equals(this.description, accountRef.description) &&
        Objects.equals(this.name, accountRef.name) &&
        Objects.equals(this.atBaseType, accountRef.atBaseType) &&
        Objects.equals(this.atSchemaLocation, accountRef.atSchemaLocation) &&
        Objects.equals(this.atType, accountRef.atType) &&
        Objects.equals(this.atReferredType, accountRef.atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, name, atBaseType, atSchemaLocation, atType, atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRef {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

