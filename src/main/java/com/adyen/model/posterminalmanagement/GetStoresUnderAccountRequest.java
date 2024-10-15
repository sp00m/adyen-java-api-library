/*
 * POS Terminal Management API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.posterminalmanagement;

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
 * GetStoresUnderAccountRequest
 */
@JsonPropertyOrder({
  GetStoresUnderAccountRequest.JSON_PROPERTY_COMPANY_ACCOUNT,
  GetStoresUnderAccountRequest.JSON_PROPERTY_MERCHANT_ACCOUNT
})

public class GetStoresUnderAccountRequest {
  public static final String JSON_PROPERTY_COMPANY_ACCOUNT = "companyAccount";
  private String companyAccount;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public GetStoresUnderAccountRequest() { 
  }

  /**
   * The company account. If you only specify this parameter, the response includes the stores of all merchant accounts that are associated with the company account.
   *
   * @param companyAccount
   * @return the current {@code GetStoresUnderAccountRequest} instance, allowing for method chaining
   */
  public GetStoresUnderAccountRequest companyAccount(String companyAccount) {
    this.companyAccount = companyAccount;
    return this;
  }

  /**
   * The company account. If you only specify this parameter, the response includes the stores of all merchant accounts that are associated with the company account.
   * @return companyAccount
   */
  @ApiModelProperty(required = true, value = "The company account. If you only specify this parameter, the response includes the stores of all merchant accounts that are associated with the company account.")
  @JsonProperty(JSON_PROPERTY_COMPANY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCompanyAccount() {
    return companyAccount;
  }

  /**
   * The company account. If you only specify this parameter, the response includes the stores of all merchant accounts that are associated with the company account.
   *
   * @param companyAccount
   */ 
  @JsonProperty(JSON_PROPERTY_COMPANY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyAccount(String companyAccount) {
    this.companyAccount = companyAccount;
  }

  /**
   * The merchant account. With this parameter, the response only includes the stores of the specified merchant account.
   *
   * @param merchantAccount
   * @return the current {@code GetStoresUnderAccountRequest} instance, allowing for method chaining
   */
  public GetStoresUnderAccountRequest merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

  /**
   * The merchant account. With this parameter, the response only includes the stores of the specified merchant account.
   * @return merchantAccount
   */
  @ApiModelProperty(value = "The merchant account. With this parameter, the response only includes the stores of the specified merchant account.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantAccount() {
    return merchantAccount;
  }

  /**
   * The merchant account. With this parameter, the response only includes the stores of the specified merchant account.
   *
   * @param merchantAccount
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }

  /**
   * Return true if this GetStoresUnderAccountRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStoresUnderAccountRequest getStoresUnderAccountRequest = (GetStoresUnderAccountRequest) o;
    return Objects.equals(this.companyAccount, getStoresUnderAccountRequest.companyAccount) &&
        Objects.equals(this.merchantAccount, getStoresUnderAccountRequest.merchantAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyAccount, merchantAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStoresUnderAccountRequest {\n");
    sb.append("    companyAccount: ").append(toIndentedString(companyAccount)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
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
   * Create an instance of GetStoresUnderAccountRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetStoresUnderAccountRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to GetStoresUnderAccountRequest
   */
  public static GetStoresUnderAccountRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, GetStoresUnderAccountRequest.class);
  }
/**
  * Convert an instance of GetStoresUnderAccountRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
