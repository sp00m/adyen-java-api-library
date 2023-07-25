/*
 * Transfers API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

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
 * NZLocalAccountIdentification
 */
@JsonPropertyOrder({
  NZLocalAccountIdentification.JSON_PROPERTY_ACCOUNT_NUMBER,
  NZLocalAccountIdentification.JSON_PROPERTY_ACCOUNT_SUFFIX,
  NZLocalAccountIdentification.JSON_PROPERTY_BANK_CODE,
  NZLocalAccountIdentification.JSON_PROPERTY_TYPE
})

public class NZLocalAccountIdentification {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_ACCOUNT_SUFFIX = "accountSuffix";
  private String accountSuffix;

  public static final String JSON_PROPERTY_BANK_CODE = "bankCode";
  private String bankCode;

  /**
   * **nzLocal**
   */
  public enum TypeEnum {
    NZLOCAL("nzLocal");

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
  private TypeEnum type = TypeEnum.NZLOCAL;

  public NZLocalAccountIdentification() { 
  }

  public NZLocalAccountIdentification accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The 7-digit bank account number, without separators or whitespace.
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The 7-digit bank account number, without separators or whitespace.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public NZLocalAccountIdentification accountSuffix(String accountSuffix) {
    this.accountSuffix = accountSuffix;
    return this;
  }

   /**
   * The 2- to 3-digit account suffix, without separators or whitespace.
   * @return accountSuffix
  **/
  @ApiModelProperty(required = true, value = "The 2- to 3-digit account suffix, without separators or whitespace.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountSuffix() {
    return accountSuffix;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountSuffix(String accountSuffix) {
    this.accountSuffix = accountSuffix;
  }


  public NZLocalAccountIdentification bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

   /**
   * The 6-digit bank code including the 2-digit bank code and 4-digit branch code, without separators or whitespace.
   * @return bankCode
  **/
  @ApiModelProperty(required = true, value = "The 6-digit bank code including the 2-digit bank code and 4-digit branch code, without separators or whitespace.")
  @JsonProperty(JSON_PROPERTY_BANK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankCode() {
    return bankCode;
  }


  @JsonProperty(JSON_PROPERTY_BANK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }


  public NZLocalAccountIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **nzLocal**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**nzLocal**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this NZLocalAccountIdentification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NZLocalAccountIdentification nzLocalAccountIdentification = (NZLocalAccountIdentification) o;
    return Objects.equals(this.accountNumber, nzLocalAccountIdentification.accountNumber) &&
        Objects.equals(this.accountSuffix, nzLocalAccountIdentification.accountSuffix) &&
        Objects.equals(this.bankCode, nzLocalAccountIdentification.bankCode) &&
        Objects.equals(this.type, nzLocalAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountSuffix, bankCode, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NZLocalAccountIdentification {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountSuffix: ").append(toIndentedString(accountSuffix)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
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
   * Create an instance of NZLocalAccountIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NZLocalAccountIdentification
   * @throws JsonProcessingException if the JSON string is invalid with respect to NZLocalAccountIdentification
   */
  public static NZLocalAccountIdentification fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, NZLocalAccountIdentification.class);
  }
/**
  * Convert an instance of NZLocalAccountIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

