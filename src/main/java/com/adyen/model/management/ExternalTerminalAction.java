/*
 * Management API
 *
 * The version of the OpenAPI document: 3
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
 * ExternalTerminalAction
 */
@JsonPropertyOrder({
  ExternalTerminalAction.JSON_PROPERTY_ACTION_TYPE,
  ExternalTerminalAction.JSON_PROPERTY_CONFIG,
  ExternalTerminalAction.JSON_PROPERTY_CONFIRMED_AT,
  ExternalTerminalAction.JSON_PROPERTY_ID,
  ExternalTerminalAction.JSON_PROPERTY_RESULT,
  ExternalTerminalAction.JSON_PROPERTY_SCHEDULED_AT,
  ExternalTerminalAction.JSON_PROPERTY_STATUS,
  ExternalTerminalAction.JSON_PROPERTY_TERMINAL_ID
})

public class ExternalTerminalAction {
  public static final String JSON_PROPERTY_ACTION_TYPE = "actionType";
  private String actionType;

  public static final String JSON_PROPERTY_CONFIG = "config";
  private String config;

  public static final String JSON_PROPERTY_CONFIRMED_AT = "confirmedAt";
  private OffsetDateTime confirmedAt;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RESULT = "result";
  private String result;

  public static final String JSON_PROPERTY_SCHEDULED_AT = "scheduledAt";
  private OffsetDateTime scheduledAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TERMINAL_ID = "terminalId";
  private String terminalId;

  public ExternalTerminalAction() { 
  }

  /**
   * The type of terminal action: **InstallAndroidApp**, **UninstallAndroidApp**, **InstallAndroidCertificate**, or **UninstallAndroidCertificate**.
   *
   * @param actionType
   * @return the current {@code ExternalTerminalAction} instance, allowing for method chaining
   */
  public ExternalTerminalAction actionType(String actionType) {
    this.actionType = actionType;
    return this;
  }

  /**
   * The type of terminal action: **InstallAndroidApp**, **UninstallAndroidApp**, **InstallAndroidCertificate**, or **UninstallAndroidCertificate**.
   * @return actionType
   */
  @ApiModelProperty(value = "The type of terminal action: **InstallAndroidApp**, **UninstallAndroidApp**, **InstallAndroidCertificate**, or **UninstallAndroidCertificate**.")
  @JsonProperty(JSON_PROPERTY_ACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getActionType() {
    return actionType;
  }

  /**
   * The type of terminal action: **InstallAndroidApp**, **UninstallAndroidApp**, **InstallAndroidCertificate**, or **UninstallAndroidCertificate**.
   *
   * @param actionType
   */ 
  @JsonProperty(JSON_PROPERTY_ACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  /**
   * Technical information about the terminal action.
   *
   * @param config
   * @return the current {@code ExternalTerminalAction} instance, allowing for method chaining
   */
  public ExternalTerminalAction config(String config) {
    this.config = config;
    return this;
  }

  /**
   * Technical information about the terminal action.
   * @return config
   */
  @ApiModelProperty(value = "Technical information about the terminal action.")
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getConfig() {
    return config;
  }

  /**
   * Technical information about the terminal action.
   *
   * @param config
   */ 
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfig(String config) {
    this.config = config;
  }

  /**
   * The date and time when the action was carried out.
   *
   * @param confirmedAt
   * @return the current {@code ExternalTerminalAction} instance, allowing for method chaining
   */
  public ExternalTerminalAction confirmedAt(OffsetDateTime confirmedAt) {
    this.confirmedAt = confirmedAt;
    return this;
  }

  /**
   * The date and time when the action was carried out.
   * @return confirmedAt
   */
  @ApiModelProperty(value = "The date and time when the action was carried out.")
  @JsonProperty(JSON_PROPERTY_CONFIRMED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getConfirmedAt() {
    return confirmedAt;
  }

  /**
   * The date and time when the action was carried out.
   *
   * @param confirmedAt
   */ 
  @JsonProperty(JSON_PROPERTY_CONFIRMED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfirmedAt(OffsetDateTime confirmedAt) {
    this.confirmedAt = confirmedAt;
  }

  /**
   * The unique ID of the terminal action.
   *
   * @param id
   * @return the current {@code ExternalTerminalAction} instance, allowing for method chaining
   */
  public ExternalTerminalAction id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the terminal action.
   * @return id
   */
  @ApiModelProperty(value = "The unique ID of the terminal action.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * The unique ID of the terminal action.
   *
   * @param id
   */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The result message for the action.
   *
   * @param result
   * @return the current {@code ExternalTerminalAction} instance, allowing for method chaining
   */
  public ExternalTerminalAction result(String result) {
    this.result = result;
    return this;
  }

  /**
   * The result message for the action.
   * @return result
   */
  @ApiModelProperty(value = "The result message for the action.")
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResult() {
    return result;
  }

  /**
   * The result message for the action.
   *
   * @param result
   */ 
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(String result) {
    this.result = result;
  }

  /**
   * The date and time when the action was scheduled to happen.
   *
   * @param scheduledAt
   * @return the current {@code ExternalTerminalAction} instance, allowing for method chaining
   */
  public ExternalTerminalAction scheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

  /**
   * The date and time when the action was scheduled to happen.
   * @return scheduledAt
   */
  @ApiModelProperty(value = "The date and time when the action was scheduled to happen.")
  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getScheduledAt() {
    return scheduledAt;
  }

  /**
   * The date and time when the action was scheduled to happen.
   *
   * @param scheduledAt
   */ 
  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  /**
   * The status of the terminal action: **pending**, **successful**, **failed**, **cancelled**, or **tryLater**.
   *
   * @param status
   * @return the current {@code ExternalTerminalAction} instance, allowing for method chaining
   */
  public ExternalTerminalAction status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the terminal action: **pending**, **successful**, **failed**, **cancelled**, or **tryLater**.
   * @return status
   */
  @ApiModelProperty(value = "The status of the terminal action: **pending**, **successful**, **failed**, **cancelled**, or **tryLater**.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  /**
   * The status of the terminal action: **pending**, **successful**, **failed**, **cancelled**, or **tryLater**.
   *
   * @param status
   */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The unique ID of the terminal that the action applies to.
   *
   * @param terminalId
   * @return the current {@code ExternalTerminalAction} instance, allowing for method chaining
   */
  public ExternalTerminalAction terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

  /**
   * The unique ID of the terminal that the action applies to.
   * @return terminalId
   */
  @ApiModelProperty(value = "The unique ID of the terminal that the action applies to.")
  @JsonProperty(JSON_PROPERTY_TERMINAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTerminalId() {
    return terminalId;
  }

  /**
   * The unique ID of the terminal that the action applies to.
   *
   * @param terminalId
   */ 
  @JsonProperty(JSON_PROPERTY_TERMINAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  /**
   * Return true if this ExternalTerminalAction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalTerminalAction externalTerminalAction = (ExternalTerminalAction) o;
    return Objects.equals(this.actionType, externalTerminalAction.actionType) &&
        Objects.equals(this.config, externalTerminalAction.config) &&
        Objects.equals(this.confirmedAt, externalTerminalAction.confirmedAt) &&
        Objects.equals(this.id, externalTerminalAction.id) &&
        Objects.equals(this.result, externalTerminalAction.result) &&
        Objects.equals(this.scheduledAt, externalTerminalAction.scheduledAt) &&
        Objects.equals(this.status, externalTerminalAction.status) &&
        Objects.equals(this.terminalId, externalTerminalAction.terminalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, config, confirmedAt, id, result, scheduledAt, status, terminalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTerminalAction {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    confirmedAt: ").append(toIndentedString(confirmedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
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
   * Create an instance of ExternalTerminalAction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExternalTerminalAction
   * @throws JsonProcessingException if the JSON string is invalid with respect to ExternalTerminalAction
   */
  public static ExternalTerminalAction fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ExternalTerminalAction.class);
  }
/**
  * Convert an instance of ExternalTerminalAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
