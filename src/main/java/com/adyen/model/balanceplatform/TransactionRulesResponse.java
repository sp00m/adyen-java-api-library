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
import com.adyen.model.balanceplatform.TransactionRule;
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
 * TransactionRulesResponse
 */
@JsonPropertyOrder({
  TransactionRulesResponse.JSON_PROPERTY_TRANSACTION_RULES
})

public class TransactionRulesResponse {
  public static final String JSON_PROPERTY_TRANSACTION_RULES = "transactionRules";
  private List<TransactionRule> transactionRules = null;

  public TransactionRulesResponse() { 
  }

  public TransactionRulesResponse transactionRules(List<TransactionRule> transactionRules) {
    this.transactionRules = transactionRules;
    return this;
  }

  public TransactionRulesResponse addTransactionRulesItem(TransactionRule transactionRulesItem) {
    if (this.transactionRules == null) {
      this.transactionRules = new ArrayList<>();
    }
    this.transactionRules.add(transactionRulesItem);
    return this;
  }

   /**
   * List of transaction rules.
   * @return transactionRules
  **/
  @ApiModelProperty(value = "List of transaction rules.")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TransactionRule> getTransactionRules() {
    return transactionRules;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionRules(List<TransactionRule> transactionRules) {
    this.transactionRules = transactionRules;
  }


  /**
   * Return true if this TransactionRulesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRulesResponse transactionRulesResponse = (TransactionRulesResponse) o;
    return Objects.equals(this.transactionRules, transactionRulesResponse.transactionRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRulesResponse {\n");
    sb.append("    transactionRules: ").append(toIndentedString(transactionRules)).append("\n");
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
   * Create an instance of TransactionRulesResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionRulesResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransactionRulesResponse
   */
  public static TransactionRulesResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransactionRulesResponse.class);
  }
/**
  * Convert an instance of TransactionRulesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

