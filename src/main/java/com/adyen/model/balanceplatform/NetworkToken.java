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
import com.adyen.model.balanceplatform.DeviceInfo;
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
 * NetworkToken
 */
@JsonPropertyOrder({
  NetworkToken.JSON_PROPERTY_BRAND_VARIANT,
  NetworkToken.JSON_PROPERTY_CREATION_DATE,
  NetworkToken.JSON_PROPERTY_DEVICE,
  NetworkToken.JSON_PROPERTY_ID,
  NetworkToken.JSON_PROPERTY_PAYMENT_INSTRUMENT_ID,
  NetworkToken.JSON_PROPERTY_STATUS,
  NetworkToken.JSON_PROPERTY_TOKEN_LAST_FOUR,
  NetworkToken.JSON_PROPERTY_TYPE
})

public class NetworkToken {
  public static final String JSON_PROPERTY_BRAND_VARIANT = "brandVariant";
  private String brandVariant;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private OffsetDateTime creationDate;

  public static final String JSON_PROPERTY_DEVICE = "device";
  private DeviceInfo device;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PAYMENT_INSTRUMENT_ID = "paymentInstrumentId";
  private String paymentInstrumentId;

  /**
   * The status of the network token. Possible values: **active**, **inactive**, **suspended**, **closed**.
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive"),
    
    SUSPENDED("suspended"),
    
    CLOSED("closed");

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

  public static final String JSON_PROPERTY_TOKEN_LAST_FOUR = "tokenLastFour";
  private String tokenLastFour;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public NetworkToken() { 
  }

  /**
   * The card brand variant of the payment instrument associated with the network token. For example, **mc_prepaid_mrw**.
   *
   * @param brandVariant
   * @return the current {@code NetworkToken} instance, allowing for method chaining
   */
  public NetworkToken brandVariant(String brandVariant) {
    this.brandVariant = brandVariant;
    return this;
  }

  /**
   * The card brand variant of the payment instrument associated with the network token. For example, **mc_prepaid_mrw**.
   * @return brandVariant
   */
  @ApiModelProperty(value = "The card brand variant of the payment instrument associated with the network token. For example, **mc_prepaid_mrw**.")
  @JsonProperty(JSON_PROPERTY_BRAND_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBrandVariant() {
    return brandVariant;
  }

  /**
   * The card brand variant of the payment instrument associated with the network token. For example, **mc_prepaid_mrw**.
   *
   * @param brandVariant
   */ 
  @JsonProperty(JSON_PROPERTY_BRAND_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandVariant(String brandVariant) {
    this.brandVariant = brandVariant;
  }

  /**
   * Date and time when the network token was created, in [ISO 8601](https://www.iso.org/iso-8601-date-and-time-format.html) extended format. For example, **2020-12-18T10:15:30+01:00**..
   *
   * @param creationDate
   * @return the current {@code NetworkToken} instance, allowing for method chaining
   */
  public NetworkToken creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Date and time when the network token was created, in [ISO 8601](https://www.iso.org/iso-8601-date-and-time-format.html) extended format. For example, **2020-12-18T10:15:30+01:00**..
   * @return creationDate
   */
  @ApiModelProperty(value = "Date and time when the network token was created, in [ISO 8601](https://www.iso.org/iso-8601-date-and-time-format.html) extended format. For example, **2020-12-18T10:15:30+01:00**..")
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  /**
   * Date and time when the network token was created, in [ISO 8601](https://www.iso.org/iso-8601-date-and-time-format.html) extended format. For example, **2020-12-18T10:15:30+01:00**..
   *
   * @param creationDate
   */ 
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * device
   *
   * @param device
   * @return the current {@code NetworkToken} instance, allowing for method chaining
   */
  public NetworkToken device(DeviceInfo device) {
    this.device = device;
    return this;
  }

  /**
   * device
   * @return device
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeviceInfo getDevice() {
    return device;
  }

  /**
   * device
   *
   * @param device
   */ 
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevice(DeviceInfo device) {
    this.device = device;
  }

  /**
   * The unique identifier of the network token.
   *
   * @param id
   * @return the current {@code NetworkToken} instance, allowing for method chaining
   */
  public NetworkToken id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the network token.
   * @return id
   */
  @ApiModelProperty(value = "The unique identifier of the network token.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * The unique identifier of the network token.
   *
   * @param id
   */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The unique identifier of the payment instrument to which this network token belongs to.
   *
   * @param paymentInstrumentId
   * @return the current {@code NetworkToken} instance, allowing for method chaining
   */
  public NetworkToken paymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

  /**
   * The unique identifier of the payment instrument to which this network token belongs to.
   * @return paymentInstrumentId
   */
  @ApiModelProperty(value = "The unique identifier of the payment instrument to which this network token belongs to.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }

  /**
   * The unique identifier of the payment instrument to which this network token belongs to.
   *
   * @param paymentInstrumentId
   */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }

  /**
   * The status of the network token. Possible values: **active**, **inactive**, **suspended**, **closed**.
   *
   * @param status
   * @return the current {@code NetworkToken} instance, allowing for method chaining
   */
  public NetworkToken status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the network token. Possible values: **active**, **inactive**, **suspended**, **closed**.
   * @return status
   */
  @ApiModelProperty(value = "The status of the network token. Possible values: **active**, **inactive**, **suspended**, **closed**.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * The status of the network token. Possible values: **active**, **inactive**, **suspended**, **closed**.
   *
   * @param status
   */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * The last four digits of the network token &#x60;id&#x60;.
   *
   * @param tokenLastFour
   * @return the current {@code NetworkToken} instance, allowing for method chaining
   */
  public NetworkToken tokenLastFour(String tokenLastFour) {
    this.tokenLastFour = tokenLastFour;
    return this;
  }

  /**
   * The last four digits of the network token &#x60;id&#x60;.
   * @return tokenLastFour
   */
  @ApiModelProperty(value = "The last four digits of the network token `id`.")
  @JsonProperty(JSON_PROPERTY_TOKEN_LAST_FOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTokenLastFour() {
    return tokenLastFour;
  }

  /**
   * The last four digits of the network token &#x60;id&#x60;.
   *
   * @param tokenLastFour
   */ 
  @JsonProperty(JSON_PROPERTY_TOKEN_LAST_FOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenLastFour(String tokenLastFour) {
    this.tokenLastFour = tokenLastFour;
  }

  /**
   * The type of wallet the network token is associated with. For example, **applePay**.
   *
   * @param type
   * @return the current {@code NetworkToken} instance, allowing for method chaining
   */
  public NetworkToken type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of wallet the network token is associated with. For example, **applePay**.
   * @return type
   */
  @ApiModelProperty(value = "The type of wallet the network token is associated with. For example, **applePay**.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  /**
   * The type of wallet the network token is associated with. For example, **applePay**.
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Return true if this NetworkToken object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkToken networkToken = (NetworkToken) o;
    return Objects.equals(this.brandVariant, networkToken.brandVariant) &&
        Objects.equals(this.creationDate, networkToken.creationDate) &&
        Objects.equals(this.device, networkToken.device) &&
        Objects.equals(this.id, networkToken.id) &&
        Objects.equals(this.paymentInstrumentId, networkToken.paymentInstrumentId) &&
        Objects.equals(this.status, networkToken.status) &&
        Objects.equals(this.tokenLastFour, networkToken.tokenLastFour) &&
        Objects.equals(this.type, networkToken.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandVariant, creationDate, device, id, paymentInstrumentId, status, tokenLastFour, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkToken {\n");
    sb.append("    brandVariant: ").append(toIndentedString(brandVariant)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tokenLastFour: ").append(toIndentedString(tokenLastFour)).append("\n");
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
   * Create an instance of NetworkToken given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NetworkToken
   * @throws JsonProcessingException if the JSON string is invalid with respect to NetworkToken
   */
  public static NetworkToken fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, NetworkToken.class);
  }
/**
  * Convert an instance of NetworkToken to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
