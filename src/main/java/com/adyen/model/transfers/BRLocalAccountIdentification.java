/*
 * Transfers API
 *
 * The version of the OpenAPI document: 4
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
 * BRLocalAccountIdentification
 */
@JsonPropertyOrder({
  BRLocalAccountIdentification.JSON_PROPERTY_ACCOUNT_NUMBER,
  BRLocalAccountIdentification.JSON_PROPERTY_BANK_CODE,
  BRLocalAccountIdentification.JSON_PROPERTY_BRANCH_NUMBER,
  BRLocalAccountIdentification.JSON_PROPERTY_ISPB,
  BRLocalAccountIdentification.JSON_PROPERTY_TYPE
})

public class BRLocalAccountIdentification {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_BANK_CODE = "bankCode";
  private String bankCode;

  public static final String JSON_PROPERTY_BRANCH_NUMBER = "branchNumber";
  private String branchNumber;

  public static final String JSON_PROPERTY_ISPB = "ispb";
  private String ispb;

  /**
   * **brLocal**
   */
  public enum TypeEnum {
    BRLOCAL("brLocal");

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

  public BRLocalAccountIdentification() { 
  }

  /**
   * The bank account number, without separators or whitespace.
   *
   * @param accountNumber
   * @return the current {@code BRLocalAccountIdentification} instance, allowing for method chaining
   */
  public BRLocalAccountIdentification accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The bank account number, without separators or whitespace.
   * @return accountNumber
   */
  @ApiModelProperty(required = true, value = "The bank account number, without separators or whitespace.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountNumber() {
    return accountNumber;
  }

  /**
   * The bank account number, without separators or whitespace.
   *
   * @param accountNumber
   */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   * The 3-digit bank code, with leading zeros.
   *
   * @param bankCode
   * @return the current {@code BRLocalAccountIdentification} instance, allowing for method chaining
   */
  public BRLocalAccountIdentification bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

  /**
   * The 3-digit bank code, with leading zeros.
   * @return bankCode
   */
  @ApiModelProperty(required = true, value = "The 3-digit bank code, with leading zeros.")
  @JsonProperty(JSON_PROPERTY_BANK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBankCode() {
    return bankCode;
  }

  /**
   * The 3-digit bank code, with leading zeros.
   *
   * @param bankCode
   */ 
  @JsonProperty(JSON_PROPERTY_BANK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  /**
   * The bank account branch number, without separators or whitespace.
   *
   * @param branchNumber
   * @return the current {@code BRLocalAccountIdentification} instance, allowing for method chaining
   */
  public BRLocalAccountIdentification branchNumber(String branchNumber) {
    this.branchNumber = branchNumber;
    return this;
  }

  /**
   * The bank account branch number, without separators or whitespace.
   * @return branchNumber
   */
  @ApiModelProperty(required = true, value = "The bank account branch number, without separators or whitespace.")
  @JsonProperty(JSON_PROPERTY_BRANCH_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBranchNumber() {
    return branchNumber;
  }

  /**
   * The bank account branch number, without separators or whitespace.
   *
   * @param branchNumber
   */ 
  @JsonProperty(JSON_PROPERTY_BRANCH_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBranchNumber(String branchNumber) {
    this.branchNumber = branchNumber;
  }

  /**
   * The 8-digit ISPB, with leading zeros.
   *
   * @param ispb
   * @return the current {@code BRLocalAccountIdentification} instance, allowing for method chaining
   */
  public BRLocalAccountIdentification ispb(String ispb) {
    this.ispb = ispb;
    return this;
  }

  /**
   * The 8-digit ISPB, with leading zeros.
   * @return ispb
   */
  @ApiModelProperty(value = "The 8-digit ISPB, with leading zeros.")
  @JsonProperty(JSON_PROPERTY_ISPB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIspb() {
    return ispb;
  }

  /**
   * The 8-digit ISPB, with leading zeros.
   *
   * @param ispb
   */ 
  @JsonProperty(JSON_PROPERTY_ISPB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIspb(String ispb) {
    this.ispb = ispb;
  }

  /**
   * **brLocal**
   *
   * @param type
   * @return the current {@code BRLocalAccountIdentification} instance, allowing for method chaining
   */
  public BRLocalAccountIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **brLocal**
   * @return type
   */
  @ApiModelProperty(required = true, value = "**brLocal**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * **brLocal**
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this BRLocalAccountIdentification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BRLocalAccountIdentification brLocalAccountIdentification = (BRLocalAccountIdentification) o;
    return Objects.equals(this.accountNumber, brLocalAccountIdentification.accountNumber) &&
        Objects.equals(this.bankCode, brLocalAccountIdentification.bankCode) &&
        Objects.equals(this.branchNumber, brLocalAccountIdentification.branchNumber) &&
        Objects.equals(this.ispb, brLocalAccountIdentification.ispb) &&
        Objects.equals(this.type, brLocalAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, bankCode, branchNumber, ispb, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BRLocalAccountIdentification {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
    sb.append("    ispb: ").append(toIndentedString(ispb)).append("\n");
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
   * Create an instance of BRLocalAccountIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BRLocalAccountIdentification
   * @throws JsonProcessingException if the JSON string is invalid with respect to BRLocalAccountIdentification
   */
  public static BRLocalAccountIdentification fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BRLocalAccountIdentification.class);
  }
/**
  * Convert an instance of BRLocalAccountIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
