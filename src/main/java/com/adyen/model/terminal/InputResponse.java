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
import com.adyen.model.terminal.InputResult;
import com.adyen.model.terminal.OutputResult;
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
 * It conveys the result of the input or the result of the outputs, parallel to the message request, except if response not required and absent. Content of the Input Response message.
 */
@ApiModel(description = "It conveys the result of the input or the result of the outputs, parallel to the message request, except if response not required and absent. Content of the Input Response message.")
@JsonPropertyOrder({
  InputResponse.JSON_PROPERTY_OUTPUT_RESULT,
  InputResponse.JSON_PROPERTY_INPUT_RESULT
})

public class InputResponse {
  public static final String JSON_PROPERTY_OUTPUT_RESULT = "OutputResult";
  private OutputResult outputResult;

  public static final String JSON_PROPERTY_INPUT_RESULT = "InputResult";
  private InputResult inputResult;

  public InputResponse() { 
  }

  public InputResponse outputResult(OutputResult outputResult) {
    this.outputResult = outputResult;
    return this;
  }

   /**
   * Get outputResult
   * @return outputResult
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OUTPUT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OutputResult getOutputResult() {
    return outputResult;
  }


 /**
  * outputResult
  *
  * @param outputResult
  */ 
  @JsonProperty(JSON_PROPERTY_OUTPUT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutputResult(OutputResult outputResult) {
    this.outputResult = outputResult;
  }


  public InputResponse inputResult(InputResult inputResult) {
    this.inputResult = inputResult;
    return this;
  }

   /**
   * Get inputResult
   * @return inputResult
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INPUT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InputResult getInputResult() {
    return inputResult;
  }


 /**
  * inputResult
  *
  * @param inputResult
  */ 
  @JsonProperty(JSON_PROPERTY_INPUT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputResult(InputResult inputResult) {
    this.inputResult = inputResult;
  }


  /**
   * Return true if this InputResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputResponse inputResponse = (InputResponse) o;
    return Objects.equals(this.outputResult, inputResponse.outputResult) &&
        Objects.equals(this.inputResult, inputResponse.inputResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputResult, inputResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputResponse {\n");
    sb.append("    outputResult: ").append(toIndentedString(outputResult)).append("\n");
    sb.append("    inputResult: ").append(toIndentedString(inputResult)).append("\n");
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
   * Create an instance of InputResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InputResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to InputResponse
   */
  public static InputResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, InputResponse.class);
  }
/**
  * Convert an instance of InputResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
