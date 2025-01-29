/*
 * Negative balance compensation warning 
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.negativebalancewarningwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.negativebalancewarningwebhooks.NegativeBalanceCompensationWarningNotificationData;
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
 * NegativeBalanceCompensationWarningNotificationRequest
 */
@JsonPropertyOrder({
  NegativeBalanceCompensationWarningNotificationRequest.JSON_PROPERTY_DATA,
  NegativeBalanceCompensationWarningNotificationRequest.JSON_PROPERTY_ENVIRONMENT,
  NegativeBalanceCompensationWarningNotificationRequest.JSON_PROPERTY_TIMESTAMP,
  NegativeBalanceCompensationWarningNotificationRequest.JSON_PROPERTY_TYPE
})

public class NegativeBalanceCompensationWarningNotificationRequest {
  public static final String JSON_PROPERTY_DATA = "data";
  private NegativeBalanceCompensationWarningNotificationData data;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private String environment;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  /**
   * Type of webhook.
   */
  public enum TypeEnum {
    BALANCEPLATFORM_NEGATIVEBALANCECOMPENSATIONWARNING_SCHEDULED("balancePlatform.negativeBalanceCompensationWarning.scheduled");

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

  public NegativeBalanceCompensationWarningNotificationRequest() { 
  }

  /**
   * data
   *
   * @param data
   * @return the current {@code NegativeBalanceCompensationWarningNotificationRequest} instance, allowing for method chaining
   */
  public NegativeBalanceCompensationWarningNotificationRequest data(NegativeBalanceCompensationWarningNotificationData data) {
    this.data = data;
    return this;
  }

  /**
   * data
   * @return data
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NegativeBalanceCompensationWarningNotificationData getData() {
    return data;
  }

  /**
   * data
   *
   * @param data
   */ 
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(NegativeBalanceCompensationWarningNotificationData data) {
    this.data = data;
  }

  /**
   * The environment from which the webhook originated.  Possible values: **test**, **live**.
   *
   * @param environment
   * @return the current {@code NegativeBalanceCompensationWarningNotificationRequest} instance, allowing for method chaining
   */
  public NegativeBalanceCompensationWarningNotificationRequest environment(String environment) {
    this.environment = environment;
    return this;
  }

  /**
   * The environment from which the webhook originated.  Possible values: **test**, **live**.
   * @return environment
   */
  @ApiModelProperty(required = true, value = "The environment from which the webhook originated.  Possible values: **test**, **live**.")
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnvironment() {
    return environment;
  }

  /**
   * The environment from which the webhook originated.  Possible values: **test**, **live**.
   *
   * @param environment
   */ 
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  /**
   * When the event was queued.
   *
   * @param timestamp
   * @return the current {@code NegativeBalanceCompensationWarningNotificationRequest} instance, allowing for method chaining
   */
  public NegativeBalanceCompensationWarningNotificationRequest timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * When the event was queued.
   * @return timestamp
   */
  @ApiModelProperty(value = "When the event was queued.")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  /**
   * When the event was queued.
   *
   * @param timestamp
   */ 
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Type of webhook.
   *
   * @param type
   * @return the current {@code NegativeBalanceCompensationWarningNotificationRequest} instance, allowing for method chaining
   */
  public NegativeBalanceCompensationWarningNotificationRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of webhook.
   * @return type
   */
  @ApiModelProperty(required = true, value = "Type of webhook.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * Type of webhook.
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this NegativeBalanceCompensationWarningNotificationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegativeBalanceCompensationWarningNotificationRequest negativeBalanceCompensationWarningNotificationRequest = (NegativeBalanceCompensationWarningNotificationRequest) o;
    return Objects.equals(this.data, negativeBalanceCompensationWarningNotificationRequest.data) &&
        Objects.equals(this.environment, negativeBalanceCompensationWarningNotificationRequest.environment) &&
        Objects.equals(this.timestamp, negativeBalanceCompensationWarningNotificationRequest.timestamp) &&
        Objects.equals(this.type, negativeBalanceCompensationWarningNotificationRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, environment, timestamp, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegativeBalanceCompensationWarningNotificationRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
   * Create an instance of NegativeBalanceCompensationWarningNotificationRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NegativeBalanceCompensationWarningNotificationRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to NegativeBalanceCompensationWarningNotificationRequest
   */
  public static NegativeBalanceCompensationWarningNotificationRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, NegativeBalanceCompensationWarningNotificationRequest.class);
  }
/**
  * Convert an instance of NegativeBalanceCompensationWarningNotificationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
