/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.management.Amount;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * CustomNotification
 */
@JsonPropertyOrder({
  CustomNotification.JSON_PROPERTY_AMOUNT,
  CustomNotification.JSON_PROPERTY_EVENT_CODE,
  CustomNotification.JSON_PROPERTY_EVENT_DATE,
  CustomNotification.JSON_PROPERTY_MERCHANT_REFERENCE,
  CustomNotification.JSON_PROPERTY_PAYMENT_METHOD,
  CustomNotification.JSON_PROPERTY_REASON,
  CustomNotification.JSON_PROPERTY_SUCCESS
})

public class CustomNotification {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_EVENT_CODE = "eventCode";
  private String eventCode;

  public static final String JSON_PROPERTY_EVENT_DATE = "eventDate";
  private OffsetDateTime eventDate;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  private String merchantReference;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  private String paymentMethod;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public CustomNotification() { 
  }

  public CustomNotification amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public CustomNotification eventCode(String eventCode) {
    this.eventCode = eventCode;
    return this;
  }

   /**
   * The event that caused the notification to be sent.Currently supported values: * **AUTHORISATION** * **CANCELLATION** * **REFUND** * **CAPTURE** * **DEACTIVATE_RECURRING** * **REPORT_AVAILABLE** * **CHARGEBACK** * **REQUEST_FOR_INFORMATION** * **NOTIFICATION_OF_CHARGEBACK** * **NOTIFICATIONTEST** * **ORDER_OPENED** * **ORDER_CLOSED** * **CHARGEBACK_REVERSED** * **REFUNDED_REVERSED** * **REFUND_WITH_DATA**
   * @return eventCode
  **/
  @ApiModelProperty(value = "The event that caused the notification to be sent.Currently supported values: * **AUTHORISATION** * **CANCELLATION** * **REFUND** * **CAPTURE** * **DEACTIVATE_RECURRING** * **REPORT_AVAILABLE** * **CHARGEBACK** * **REQUEST_FOR_INFORMATION** * **NOTIFICATION_OF_CHARGEBACK** * **NOTIFICATIONTEST** * **ORDER_OPENED** * **ORDER_CLOSED** * **CHARGEBACK_REVERSED** * **REFUNDED_REVERSED** * **REFUND_WITH_DATA**")
  @JsonProperty(JSON_PROPERTY_EVENT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEventCode() {
    return eventCode;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventCode(String eventCode) {
    this.eventCode = eventCode;
  }


  public CustomNotification eventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * The time of the event. Format: [ISO 8601](http://www.w3.org/TR/NOTE-datetime), YYYY-MM-DDThh:mm:ssTZD.
   * @return eventDate
  **/
  @ApiModelProperty(value = "The time of the event. Format: [ISO 8601](http://www.w3.org/TR/NOTE-datetime), YYYY-MM-DDThh:mm:ssTZD.")
  @JsonProperty(JSON_PROPERTY_EVENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEventDate() {
    return eventDate;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
  }


  public CustomNotification merchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
    return this;
  }

   /**
   * Your reference for the custom test notification.
   * @return merchantReference
  **/
  @ApiModelProperty(value = "Your reference for the custom test notification.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantReference() {
    return merchantReference;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }


  public CustomNotification paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The payment method for the payment that the notification is about. Possible values: * **amex** * **visa** * **mc** * **maestro** * **bcmc** * **paypal**  * **sms**  * **bankTransfer_NL** * **bankTransfer_DE** * **bankTransfer_BE** * **ideal** * **elv** * **sepadirectdebit** 
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "The payment method for the payment that the notification is about. Possible values: * **amex** * **visa** * **mc** * **maestro** * **bcmc** * **paypal**  * **sms**  * **bankTransfer_NL** * **bankTransfer_DE** * **bankTransfer_BE** * **ideal** * **elv** * **sepadirectdebit** ")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public CustomNotification reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * A descripton of what caused the notification.
   * @return reason
  **/
  @ApiModelProperty(value = "A descripton of what caused the notification.")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(String reason) {
    this.reason = reason;
  }


  public CustomNotification success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * The outcome of the event which the notification is about. Set to either **true** or **false**. 
   * @return success
  **/
  @ApiModelProperty(value = "The outcome of the event which the notification is about. Set to either **true** or **false**. ")
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  /**
   * Return true if this CustomNotification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomNotification customNotification = (CustomNotification) o;
    return Objects.equals(this.amount, customNotification.amount) &&
        Objects.equals(this.eventCode, customNotification.eventCode) &&
        Objects.equals(this.eventDate, customNotification.eventDate) &&
        Objects.equals(this.merchantReference, customNotification.merchantReference) &&
        Objects.equals(this.paymentMethod, customNotification.paymentMethod) &&
        Objects.equals(this.reason, customNotification.reason) &&
        Objects.equals(this.success, customNotification.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, eventCode, eventDate, merchantReference, paymentMethod, reason, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNotification {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
   * Create an instance of CustomNotification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CustomNotification
   * @throws JsonProcessingException if the JSON string is invalid with respect to CustomNotification
   */
  public static CustomNotification fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CustomNotification.class);
  }
/**
  * Convert an instance of CustomNotification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

