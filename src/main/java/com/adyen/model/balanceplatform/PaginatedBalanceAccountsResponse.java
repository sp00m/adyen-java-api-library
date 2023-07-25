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
import com.adyen.model.balanceplatform.BalanceAccountBase;
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
 * PaginatedBalanceAccountsResponse
 */
@JsonPropertyOrder({
  PaginatedBalanceAccountsResponse.JSON_PROPERTY_BALANCE_ACCOUNTS,
  PaginatedBalanceAccountsResponse.JSON_PROPERTY_HAS_NEXT,
  PaginatedBalanceAccountsResponse.JSON_PROPERTY_HAS_PREVIOUS
})

public class PaginatedBalanceAccountsResponse {
  public static final String JSON_PROPERTY_BALANCE_ACCOUNTS = "balanceAccounts";
  private List<BalanceAccountBase> balanceAccounts = new ArrayList<>();

  public static final String JSON_PROPERTY_HAS_NEXT = "hasNext";
  private Boolean hasNext;

  public static final String JSON_PROPERTY_HAS_PREVIOUS = "hasPrevious";
  private Boolean hasPrevious;

  public PaginatedBalanceAccountsResponse() { 
  }

  public PaginatedBalanceAccountsResponse balanceAccounts(List<BalanceAccountBase> balanceAccounts) {
    this.balanceAccounts = balanceAccounts;
    return this;
  }

  public PaginatedBalanceAccountsResponse addBalanceAccountsItem(BalanceAccountBase balanceAccountsItem) {
    this.balanceAccounts.add(balanceAccountsItem);
    return this;
  }

   /**
   * List of balance accounts.
   * @return balanceAccounts
  **/
  @ApiModelProperty(required = true, value = "List of balance accounts.")
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BalanceAccountBase> getBalanceAccounts() {
    return balanceAccounts;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAccounts(List<BalanceAccountBase> balanceAccounts) {
    this.balanceAccounts = balanceAccounts;
  }


  public PaginatedBalanceAccountsResponse hasNext(Boolean hasNext) {
    this.hasNext = hasNext;
    return this;
  }

   /**
   * Indicates whether there are more items on the next page.
   * @return hasNext
  **/
  @ApiModelProperty(required = true, value = "Indicates whether there are more items on the next page.")
  @JsonProperty(JSON_PROPERTY_HAS_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasNext() {
    return hasNext;
  }


  @JsonProperty(JSON_PROPERTY_HAS_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }


  public PaginatedBalanceAccountsResponse hasPrevious(Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
    return this;
  }

   /**
   * Indicates whether there are more items on the previous page.
   * @return hasPrevious
  **/
  @ApiModelProperty(required = true, value = "Indicates whether there are more items on the previous page.")
  @JsonProperty(JSON_PROPERTY_HAS_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasPrevious() {
    return hasPrevious;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasPrevious(Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
  }


  /**
   * Return true if this PaginatedBalanceAccountsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedBalanceAccountsResponse paginatedBalanceAccountsResponse = (PaginatedBalanceAccountsResponse) o;
    return Objects.equals(this.balanceAccounts, paginatedBalanceAccountsResponse.balanceAccounts) &&
        Objects.equals(this.hasNext, paginatedBalanceAccountsResponse.hasNext) &&
        Objects.equals(this.hasPrevious, paginatedBalanceAccountsResponse.hasPrevious);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccounts, hasNext, hasPrevious);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedBalanceAccountsResponse {\n");
    sb.append("    balanceAccounts: ").append(toIndentedString(balanceAccounts)).append("\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
    sb.append("    hasPrevious: ").append(toIndentedString(hasPrevious)).append("\n");
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
   * Create an instance of PaginatedBalanceAccountsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaginatedBalanceAccountsResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaginatedBalanceAccountsResponse
   */
  public static PaginatedBalanceAccountsResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaginatedBalanceAccountsResponse.class);
  }
/**
  * Convert an instance of PaginatedBalanceAccountsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

