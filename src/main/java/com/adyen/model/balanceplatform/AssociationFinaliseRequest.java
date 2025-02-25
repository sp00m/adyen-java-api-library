/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.balanceplatform.AssociationDelegatedAuthenticationData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * AssociationFinaliseRequest
 */
@JsonPropertyOrder({
  AssociationFinaliseRequest.JSON_PROPERTY_IDS,
  AssociationFinaliseRequest.JSON_PROPERTY_STRONG_CUSTOMER_AUTHENTICATION,
  AssociationFinaliseRequest.JSON_PROPERTY_TYPE
})

public class AssociationFinaliseRequest {
  public static final String JSON_PROPERTY_IDS = "ids";
  private List<String> ids = new ArrayList<>();

  public static final String JSON_PROPERTY_STRONG_CUSTOMER_AUTHENTICATION = "strongCustomerAuthentication";
  private AssociationDelegatedAuthenticationData strongCustomerAuthentication;

  /**
   * The type of resource that you are associating with the SCA device.  Possible value: **PaymentInstrument**
   */
  public enum TypeEnum {
    PAYMENTINSTRUMENT("PaymentInstrument");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public AssociationFinaliseRequest() { 
  }

  /**
   * The list of unique identifiers of the resources that you are associating with the SCA device.  Maximum: 5 strings.
   *
   * @param ids
   * @return the current {@code AssociationFinaliseRequest} instance, allowing for method chaining
   */
  public AssociationFinaliseRequest ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public AssociationFinaliseRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

  /**
   * The list of unique identifiers of the resources that you are associating with the SCA device.  Maximum: 5 strings.
   * @return ids
   */
  @ApiModelProperty(required = true, value = "The list of unique identifiers of the resources that you are associating with the SCA device.  Maximum: 5 strings.")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIds() {
    return ids;
  }

  /**
   * The list of unique identifiers of the resources that you are associating with the SCA device.  Maximum: 5 strings.
   *
   * @param ids
   */ 
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  /**
   * strongCustomerAuthentication
   *
   * @param strongCustomerAuthentication
   * @return the current {@code AssociationFinaliseRequest} instance, allowing for method chaining
   */
  public AssociationFinaliseRequest strongCustomerAuthentication(AssociationDelegatedAuthenticationData strongCustomerAuthentication) {
    this.strongCustomerAuthentication = strongCustomerAuthentication;
    return this;
  }

  /**
   * strongCustomerAuthentication
   * @return strongCustomerAuthentication
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STRONG_CUSTOMER_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AssociationDelegatedAuthenticationData getStrongCustomerAuthentication() {
    return strongCustomerAuthentication;
  }

  /**
   * strongCustomerAuthentication
   *
   * @param strongCustomerAuthentication
   */ 
  @JsonProperty(JSON_PROPERTY_STRONG_CUSTOMER_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrongCustomerAuthentication(AssociationDelegatedAuthenticationData strongCustomerAuthentication) {
    this.strongCustomerAuthentication = strongCustomerAuthentication;
  }

  /**
   * The type of resource that you are associating with the SCA device.  Possible value: **PaymentInstrument**
   *
   * @param type
   * @return the current {@code AssociationFinaliseRequest} instance, allowing for method chaining
   */
  public AssociationFinaliseRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of resource that you are associating with the SCA device.  Possible value: **PaymentInstrument**
   * @return type
   */
  @ApiModelProperty(required = true, value = "The type of resource that you are associating with the SCA device.  Possible value: **PaymentInstrument**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * The type of resource that you are associating with the SCA device.  Possible value: **PaymentInstrument**
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this AssociationFinaliseRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociationFinaliseRequest associationFinaliseRequest = (AssociationFinaliseRequest) o;
    return Objects.equals(this.ids, associationFinaliseRequest.ids) &&
        Objects.equals(this.strongCustomerAuthentication, associationFinaliseRequest.strongCustomerAuthentication) &&
        Objects.equals(this.type, associationFinaliseRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, strongCustomerAuthentication, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociationFinaliseRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    strongCustomerAuthentication: ").append(toIndentedString(strongCustomerAuthentication)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

/**
   * Create an instance of AssociationFinaliseRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AssociationFinaliseRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to AssociationFinaliseRequest
   */
  public static AssociationFinaliseRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AssociationFinaliseRequest.class);
  }
/**
  * Convert an instance of AssociationFinaliseRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
