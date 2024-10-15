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
 * ApplePaySessionRequest
 */
@JsonPropertyOrder({
  ApplePaySessionRequest.JSON_PROPERTY_DISPLAY_NAME,
  ApplePaySessionRequest.JSON_PROPERTY_DOMAIN_NAME,
  ApplePaySessionRequest.JSON_PROPERTY_MERCHANT_IDENTIFIER
})

public class ApplePaySessionRequest {
  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_DOMAIN_NAME = "domainName";
  private String domainName;

  public static final String JSON_PROPERTY_MERCHANT_IDENTIFIER = "merchantIdentifier";
  private String merchantIdentifier;

  public ApplePaySessionRequest() { 
  }

  /**
   * This is the name that your shoppers will see in the Apple Pay interface.  The value returned as &#x60;configuration.merchantName&#x60; field from the [&#x60;/paymentMethods&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods) response.
   *
   * @param displayName
   * @return the current {@code ApplePaySessionRequest} instance, allowing for method chaining
   */
  public ApplePaySessionRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * This is the name that your shoppers will see in the Apple Pay interface.  The value returned as &#x60;configuration.merchantName&#x60; field from the [&#x60;/paymentMethods&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods) response.
   * @return displayName
   */
  @ApiModelProperty(required = true, value = "This is the name that your shoppers will see in the Apple Pay interface.  The value returned as `configuration.merchantName` field from the [`/paymentMethods`](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods) response.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }

  /**
   * This is the name that your shoppers will see in the Apple Pay interface.  The value returned as &#x60;configuration.merchantName&#x60; field from the [&#x60;/paymentMethods&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods) response.
   *
   * @param displayName
   */ 
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * The domain name you provided when you added Apple Pay in your Customer Area.  This must match the &#x60;window.location.hostname&#x60; of the web shop.
   *
   * @param domainName
   * @return the current {@code ApplePaySessionRequest} instance, allowing for method chaining
   */
  public ApplePaySessionRequest domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * The domain name you provided when you added Apple Pay in your Customer Area.  This must match the &#x60;window.location.hostname&#x60; of the web shop.
   * @return domainName
   */
  @ApiModelProperty(required = true, value = "The domain name you provided when you added Apple Pay in your Customer Area.  This must match the `window.location.hostname` of the web shop.")
  @JsonProperty(JSON_PROPERTY_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDomainName() {
    return domainName;
  }

  /**
   * The domain name you provided when you added Apple Pay in your Customer Area.  This must match the &#x60;window.location.hostname&#x60; of the web shop.
   *
   * @param domainName
   */ 
  @JsonProperty(JSON_PROPERTY_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  /**
   * Your merchant identifier registered with Apple Pay.  Use the value of the &#x60;configuration.merchantId&#x60; field from the [&#x60;/paymentMethods&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods) response.
   *
   * @param merchantIdentifier
   * @return the current {@code ApplePaySessionRequest} instance, allowing for method chaining
   */
  public ApplePaySessionRequest merchantIdentifier(String merchantIdentifier) {
    this.merchantIdentifier = merchantIdentifier;
    return this;
  }

  /**
   * Your merchant identifier registered with Apple Pay.  Use the value of the &#x60;configuration.merchantId&#x60; field from the [&#x60;/paymentMethods&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods) response.
   * @return merchantIdentifier
   */
  @ApiModelProperty(required = true, value = "Your merchant identifier registered with Apple Pay.  Use the value of the `configuration.merchantId` field from the [`/paymentMethods`](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods) response.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantIdentifier() {
    return merchantIdentifier;
  }

  /**
   * Your merchant identifier registered with Apple Pay.  Use the value of the &#x60;configuration.merchantId&#x60; field from the [&#x60;/paymentMethods&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/paymentMethods) response.
   *
   * @param merchantIdentifier
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantIdentifier(String merchantIdentifier) {
    this.merchantIdentifier = merchantIdentifier;
  }

  /**
   * Return true if this ApplePaySessionRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplePaySessionRequest applePaySessionRequest = (ApplePaySessionRequest) o;
    return Objects.equals(this.displayName, applePaySessionRequest.displayName) &&
        Objects.equals(this.domainName, applePaySessionRequest.domainName) &&
        Objects.equals(this.merchantIdentifier, applePaySessionRequest.merchantIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, domainName, merchantIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplePaySessionRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    merchantIdentifier: ").append(toIndentedString(merchantIdentifier)).append("\n");
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
   * Create an instance of ApplePaySessionRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApplePaySessionRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to ApplePaySessionRequest
   */
  public static ApplePaySessionRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ApplePaySessionRequest.class);
  }
/**
  * Convert an instance of ApplePaySessionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
