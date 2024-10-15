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
 * StandalonePaymentCancelResponse
 */
@JsonPropertyOrder({
  StandalonePaymentCancelResponse.JSON_PROPERTY_MERCHANT_ACCOUNT,
  StandalonePaymentCancelResponse.JSON_PROPERTY_PAYMENT_REFERENCE,
  StandalonePaymentCancelResponse.JSON_PROPERTY_PSP_REFERENCE,
  StandalonePaymentCancelResponse.JSON_PROPERTY_REFERENCE,
  StandalonePaymentCancelResponse.JSON_PROPERTY_STATUS
})

public class StandalonePaymentCancelResponse {
  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_PAYMENT_REFERENCE = "paymentReference";
  private String paymentReference;

  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  /**
   * The status of your request. This will always have the value **received**.
   */
  public enum StatusEnum {
    RECEIVED("received");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public StandalonePaymentCancelResponse() { 
  }

  /**
   * The merchant account that is used to process the payment.
   *
   * @param merchantAccount
   * @return the current {@code StandalonePaymentCancelResponse} instance, allowing for method chaining
   */
  public StandalonePaymentCancelResponse merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

  /**
   * The merchant account that is used to process the payment.
   * @return merchantAccount
   */
  @ApiModelProperty(required = true, value = "The merchant account that is used to process the payment.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantAccount() {
    return merchantAccount;
  }

  /**
   * The merchant account that is used to process the payment.
   *
   * @param merchantAccount
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }

  /**
   * The [&#x60;reference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__reqParam_reference) of the payment to cancel.
   *
   * @param paymentReference
   * @return the current {@code StandalonePaymentCancelResponse} instance, allowing for method chaining
   */
  public StandalonePaymentCancelResponse paymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
    return this;
  }

  /**
   * The [&#x60;reference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__reqParam_reference) of the payment to cancel.
   * @return paymentReference
   */
  @ApiModelProperty(required = true, value = "The [`reference`](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__reqParam_reference) of the payment to cancel.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPaymentReference() {
    return paymentReference;
  }

  /**
   * The [&#x60;reference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__reqParam_reference) of the payment to cancel.
   *
   * @param paymentReference
   */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
  }

  /**
   * Adyen&#39;s 16-character reference associated with the cancel request.
   *
   * @param pspReference
   * @return the current {@code StandalonePaymentCancelResponse} instance, allowing for method chaining
   */
  public StandalonePaymentCancelResponse pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

  /**
   * Adyen&#39;s 16-character reference associated with the cancel request.
   * @return pspReference
   */
  @ApiModelProperty(required = true, value = "Adyen's 16-character reference associated with the cancel request.")
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPspReference() {
    return pspReference;
  }

  /**
   * Adyen&#39;s 16-character reference associated with the cancel request.
   *
   * @param pspReference
   */ 
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }

  /**
   * Your reference for the cancel request.
   *
   * @param reference
   * @return the current {@code StandalonePaymentCancelResponse} instance, allowing for method chaining
   */
  public StandalonePaymentCancelResponse reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Your reference for the cancel request.
   * @return reference
   */
  @ApiModelProperty(value = "Your reference for the cancel request.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReference() {
    return reference;
  }

  /**
   * Your reference for the cancel request.
   *
   * @param reference
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * The status of your request. This will always have the value **received**.
   *
   * @param status
   * @return the current {@code StandalonePaymentCancelResponse} instance, allowing for method chaining
   */
  public StandalonePaymentCancelResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of your request. This will always have the value **received**.
   * @return status
   */
  @ApiModelProperty(required = true, value = "The status of your request. This will always have the value **received**.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * The status of your request. This will always have the value **received**.
   *
   * @param status
   */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Return true if this StandalonePaymentCancelResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandalonePaymentCancelResponse standalonePaymentCancelResponse = (StandalonePaymentCancelResponse) o;
    return Objects.equals(this.merchantAccount, standalonePaymentCancelResponse.merchantAccount) &&
        Objects.equals(this.paymentReference, standalonePaymentCancelResponse.paymentReference) &&
        Objects.equals(this.pspReference, standalonePaymentCancelResponse.pspReference) &&
        Objects.equals(this.reference, standalonePaymentCancelResponse.reference) &&
        Objects.equals(this.status, standalonePaymentCancelResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantAccount, paymentReference, pspReference, reference, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandalonePaymentCancelResponse {\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    paymentReference: ").append(toIndentedString(paymentReference)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
   * Create an instance of StandalonePaymentCancelResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StandalonePaymentCancelResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to StandalonePaymentCancelResponse
   */
  public static StandalonePaymentCancelResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, StandalonePaymentCancelResponse.class);
  }
/**
  * Convert an instance of StandalonePaymentCancelResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
