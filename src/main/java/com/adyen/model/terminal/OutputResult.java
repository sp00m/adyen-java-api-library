/*
 * Adyen Terminal API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.terminal;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.terminal.Device;
import com.adyen.model.terminal.InfoQualify;
import com.adyen.model.terminal.Response;
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
 * In the message response, it contains the result of the output, if required in the message request. Information related to the result the output (display, print, input).
 */
@ApiModel(description = "In the message response, it contains the result of the output, if required in the message request. Information related to the result the output (display, print, input).")
@JsonPropertyOrder({
  OutputResult.JSON_PROPERTY_DEVICE,
  OutputResult.JSON_PROPERTY_INFO_QUALIFY,
  OutputResult.JSON_PROPERTY_RESPONSE
})

public class OutputResult {
  public static final String JSON_PROPERTY_DEVICE = "Device";
  private Device device;

  public static final String JSON_PROPERTY_INFO_QUALIFY = "InfoQualify";
  private InfoQualify infoQualify;

  public static final String JSON_PROPERTY_RESPONSE = "Response";
  private Response response;

  public OutputResult() { 
  }

  public OutputResult device(Device device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Device getDevice() {
    return device;
  }


 /**
  * device
  *
  * @param device
  */ 
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevice(Device device) {
    this.device = device;
  }


  public OutputResult infoQualify(InfoQualify infoQualify) {
    this.infoQualify = infoQualify;
    return this;
  }

   /**
   * Get infoQualify
   * @return infoQualify
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INFO_QUALIFY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InfoQualify getInfoQualify() {
    return infoQualify;
  }


 /**
  * infoQualify
  *
  * @param infoQualify
  */ 
  @JsonProperty(JSON_PROPERTY_INFO_QUALIFY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfoQualify(InfoQualify infoQualify) {
    this.infoQualify = infoQualify;
  }


  public OutputResult response(Response response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Response getResponse() {
    return response;
  }


 /**
  * response
  *
  * @param response
  */ 
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponse(Response response) {
    this.response = response;
  }


  /**
   * Return true if this OutputResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputResult outputResult = (OutputResult) o;
    return Objects.equals(this.device, outputResult.device) &&
        Objects.equals(this.infoQualify, outputResult.infoQualify) &&
        Objects.equals(this.response, outputResult.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, infoQualify, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputResult {\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    infoQualify: ").append(toIndentedString(infoQualify)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
   * Create an instance of OutputResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OutputResult
   * @throws JsonProcessingException if the JSON string is invalid with respect to OutputResult
   */
  public static OutputResult fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, OutputResult.class);
  }
/**
  * Convert an instance of OutputResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
