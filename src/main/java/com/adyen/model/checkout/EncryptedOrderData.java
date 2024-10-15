/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * EncryptedOrderData
 */
@JsonPropertyOrder({
  EncryptedOrderData.JSON_PROPERTY_ORDER_DATA,
  EncryptedOrderData.JSON_PROPERTY_PSP_REFERENCE
})

public class EncryptedOrderData {
  public static final String JSON_PROPERTY_ORDER_DATA = "orderData";
  private String orderData;

  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  public EncryptedOrderData() { 
  }

  /**
   * The encrypted order data.
   *
   * @param orderData
   * @return the current {@code EncryptedOrderData} instance, allowing for method chaining
   */
  public EncryptedOrderData orderData(String orderData) {
    this.orderData = orderData;
    return this;
  }

  /**
   * The encrypted order data.
   * @return orderData
   */
  @ApiModelProperty(required = true, value = "The encrypted order data.")
  @JsonProperty(JSON_PROPERTY_ORDER_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrderData() {
    return orderData;
  }

  /**
   * The encrypted order data.
   *
   * @param orderData
   */ 
  @JsonProperty(JSON_PROPERTY_ORDER_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderData(String orderData) {
    this.orderData = orderData;
  }

  /**
   * The &#x60;pspReference&#x60; that belongs to the order.
   *
   * @param pspReference
   * @return the current {@code EncryptedOrderData} instance, allowing for method chaining
   */
  public EncryptedOrderData pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

  /**
   * The &#x60;pspReference&#x60; that belongs to the order.
   * @return pspReference
   */
  @ApiModelProperty(required = true, value = "The `pspReference` that belongs to the order.")
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPspReference() {
    return pspReference;
  }

  /**
   * The &#x60;pspReference&#x60; that belongs to the order.
   *
   * @param pspReference
   */ 
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }

  /**
   * Return true if this EncryptedOrderData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptedOrderData encryptedOrderData = (EncryptedOrderData) o;
    return Objects.equals(this.orderData, encryptedOrderData.orderData) &&
        Objects.equals(this.pspReference, encryptedOrderData.pspReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderData, pspReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptedOrderData {\n");
    sb.append("    orderData: ").append(toIndentedString(orderData)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
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
   * Create an instance of EncryptedOrderData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EncryptedOrderData
   * @throws JsonProcessingException if the JSON string is invalid with respect to EncryptedOrderData
   */
  public static EncryptedOrderData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, EncryptedOrderData.class);
  }
/**
  * Convert an instance of EncryptedOrderData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
