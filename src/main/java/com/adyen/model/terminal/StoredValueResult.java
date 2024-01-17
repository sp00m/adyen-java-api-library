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
import com.adyen.model.terminal.StoredValueAccountStatus;
import com.adyen.model.terminal.StoredValueTransactionType;
import com.adyen.model.terminal.TransactionIDType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * For each stored value card loaded or reloaded, in the StoredValue response message. Result of loading/reloading a stored value card..
 */
@ApiModel(description = "For each stored value card loaded or reloaded, in the StoredValue response message. Result of loading/reloading a stored value card..")
@JsonPropertyOrder({
  StoredValueResult.JSON_PROPERTY_STORED_VALUE_TRANSACTION_TYPE,
  StoredValueResult.JSON_PROPERTY_PRODUCT_CODE,
  StoredValueResult.JSON_PROPERTY_EAN_UPC,
  StoredValueResult.JSON_PROPERTY_ITEM_AMOUNT,
  StoredValueResult.JSON_PROPERTY_CURRENCY,
  StoredValueResult.JSON_PROPERTY_STORED_VALUE_ACCOUNT_STATUS,
  StoredValueResult.JSON_PROPERTY_HOST_TRANSACTION_I_D
})

public class StoredValueResult {
  public static final String JSON_PROPERTY_STORED_VALUE_TRANSACTION_TYPE = "StoredValueTransactionType";
  private StoredValueTransactionType storedValueTransactionType;

  public static final String JSON_PROPERTY_PRODUCT_CODE = "ProductCode";
  private Integer productCode;

  public static final String JSON_PROPERTY_EAN_UPC = "EanUpc";
  private Integer eanUpc;

  public static final String JSON_PROPERTY_ITEM_AMOUNT = "ItemAmount";
  private BigDecimal itemAmount;

  public static final String JSON_PROPERTY_CURRENCY = "Currency";
  private String currency;

  public static final String JSON_PROPERTY_STORED_VALUE_ACCOUNT_STATUS = "StoredValueAccountStatus";
  private StoredValueAccountStatus storedValueAccountStatus;

  public static final String JSON_PROPERTY_HOST_TRANSACTION_I_D = "HostTransactionID";
  private TransactionIDType hostTransactionID;

  public StoredValueResult() { 
  }

  public StoredValueResult storedValueTransactionType(StoredValueTransactionType storedValueTransactionType) {
    this.storedValueTransactionType = storedValueTransactionType;
    return this;
  }

   /**
   * Get storedValueTransactionType
   * @return storedValueTransactionType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STORED_VALUE_TRANSACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StoredValueTransactionType getStoredValueTransactionType() {
    return storedValueTransactionType;
  }


 /**
  * storedValueTransactionType
  *
  * @param storedValueTransactionType
  */ 
  @JsonProperty(JSON_PROPERTY_STORED_VALUE_TRANSACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredValueTransactionType(StoredValueTransactionType storedValueTransactionType) {
    this.storedValueTransactionType = storedValueTransactionType;
  }


  public StoredValueResult productCode(Integer productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * Copy.
   * minimum: 1
   * maximum: 20
   * @return productCode
  **/
  @ApiModelProperty(value = "Copy.")
  @JsonProperty(JSON_PROPERTY_PRODUCT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProductCode() {
    return productCode;
  }


 /**
  * Copy.
  *
  * @param productCode
  */ 
  @JsonProperty(JSON_PROPERTY_PRODUCT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductCode(Integer productCode) {
    this.productCode = productCode;
  }


  public StoredValueResult eanUpc(Integer eanUpc) {
    this.eanUpc = eanUpc;
    return this;
  }

   /**
   * Copy.
   * @return eanUpc
  **/
  @ApiModelProperty(value = "Copy.")
  @JsonProperty(JSON_PROPERTY_EAN_UPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEanUpc() {
    return eanUpc;
  }


 /**
  * Copy.
  *
  * @param eanUpc
  */ 
  @JsonProperty(JSON_PROPERTY_EAN_UPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEanUpc(Integer eanUpc) {
    this.eanUpc = eanUpc;
  }


  public StoredValueResult itemAmount(BigDecimal itemAmount) {
    this.itemAmount = itemAmount;
    return this;
  }

   /**
   * Total amount of the item line.
   * minimum: 0.0
   * maximum: 99999999.999999
   * @return itemAmount
  **/
  @ApiModelProperty(value = "Total amount of the item line.")
  @JsonProperty(JSON_PROPERTY_ITEM_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getItemAmount() {
    return itemAmount;
  }


 /**
  * Total amount of the item line.
  *
  * @param itemAmount
  */ 
  @JsonProperty(JSON_PROPERTY_ITEM_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItemAmount(BigDecimal itemAmount) {
    this.itemAmount = itemAmount;
  }


  public StoredValueResult currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Copy.
   * @return currency
  **/
  @ApiModelProperty(value = "Copy.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


 /**
  * Copy.
  *
  * @param currency
  */ 
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public StoredValueResult storedValueAccountStatus(StoredValueAccountStatus storedValueAccountStatus) {
    this.storedValueAccountStatus = storedValueAccountStatus;
    return this;
  }

   /**
   * Get storedValueAccountStatus
   * @return storedValueAccountStatus
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STORED_VALUE_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StoredValueAccountStatus getStoredValueAccountStatus() {
    return storedValueAccountStatus;
  }


 /**
  * storedValueAccountStatus
  *
  * @param storedValueAccountStatus
  */ 
  @JsonProperty(JSON_PROPERTY_STORED_VALUE_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredValueAccountStatus(StoredValueAccountStatus storedValueAccountStatus) {
    this.storedValueAccountStatus = storedValueAccountStatus;
  }


  public StoredValueResult hostTransactionID(TransactionIDType hostTransactionID) {
    this.hostTransactionID = hostTransactionID;
    return this;
  }

   /**
   * Get hostTransactionID
   * @return hostTransactionID
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOST_TRANSACTION_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionIDType getHostTransactionID() {
    return hostTransactionID;
  }


 /**
  * hostTransactionID
  *
  * @param hostTransactionID
  */ 
  @JsonProperty(JSON_PROPERTY_HOST_TRANSACTION_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostTransactionID(TransactionIDType hostTransactionID) {
    this.hostTransactionID = hostTransactionID;
  }


  /**
   * Return true if this StoredValueResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoredValueResult storedValueResult = (StoredValueResult) o;
    return Objects.equals(this.storedValueTransactionType, storedValueResult.storedValueTransactionType) &&
        Objects.equals(this.productCode, storedValueResult.productCode) &&
        Objects.equals(this.eanUpc, storedValueResult.eanUpc) &&
        Objects.equals(this.itemAmount, storedValueResult.itemAmount) &&
        Objects.equals(this.currency, storedValueResult.currency) &&
        Objects.equals(this.storedValueAccountStatus, storedValueResult.storedValueAccountStatus) &&
        Objects.equals(this.hostTransactionID, storedValueResult.hostTransactionID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storedValueTransactionType, productCode, eanUpc, itemAmount, currency, storedValueAccountStatus, hostTransactionID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredValueResult {\n");
    sb.append("    storedValueTransactionType: ").append(toIndentedString(storedValueTransactionType)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    eanUpc: ").append(toIndentedString(eanUpc)).append("\n");
    sb.append("    itemAmount: ").append(toIndentedString(itemAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    storedValueAccountStatus: ").append(toIndentedString(storedValueAccountStatus)).append("\n");
    sb.append("    hostTransactionID: ").append(toIndentedString(hostTransactionID)).append("\n");
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
   * Create an instance of StoredValueResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StoredValueResult
   * @throws JsonProcessingException if the JSON string is invalid with respect to StoredValueResult
   */
  public static StoredValueResult fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, StoredValueResult.class);
  }
/**
  * Convert an instance of StoredValueResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
