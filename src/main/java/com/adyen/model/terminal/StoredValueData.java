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
import com.adyen.model.terminal.OriginalPOITransaction;
import com.adyen.model.terminal.StoredValueAccountID;
import com.adyen.model.terminal.StoredValueTransactionType;
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
 * It contains: - the identification of the stored value accounts or the stored value cards, if provided by the Sale System, and - the associated products sold by the Sale System.. Data related to the stored value card.
 */
@ApiModel(description = "It contains: - the identification of the stored value accounts or the stored value cards, if provided by the Sale System, and - the associated products sold by the Sale System.. Data related to the stored value card.")
@JsonPropertyOrder({
  StoredValueData.JSON_PROPERTY_STORED_VALUE_PROVIDER,
  StoredValueData.JSON_PROPERTY_STORED_VALUE_TRANSACTION_TYPE,
  StoredValueData.JSON_PROPERTY_STORED_VALUE_ACCOUNT_I_D,
  StoredValueData.JSON_PROPERTY_ORIGINAL_P_O_I_TRANSACTION,
  StoredValueData.JSON_PROPERTY_PRODUCT_CODE,
  StoredValueData.JSON_PROPERTY_EAN_UPC,
  StoredValueData.JSON_PROPERTY_ITEM_AMOUNT,
  StoredValueData.JSON_PROPERTY_CURRENCY
})

public class StoredValueData {
  public static final String JSON_PROPERTY_STORED_VALUE_PROVIDER = "StoredValueProvider";
  private String storedValueProvider;

  public static final String JSON_PROPERTY_STORED_VALUE_TRANSACTION_TYPE = "StoredValueTransactionType";
  private StoredValueTransactionType storedValueTransactionType;

  public static final String JSON_PROPERTY_STORED_VALUE_ACCOUNT_I_D = "StoredValueAccountID";
  private StoredValueAccountID storedValueAccountID;

  public static final String JSON_PROPERTY_ORIGINAL_P_O_I_TRANSACTION = "OriginalPOITransaction";
  private OriginalPOITransaction originalPOITransaction;

  public static final String JSON_PROPERTY_PRODUCT_CODE = "ProductCode";
  private Integer productCode;

  public static final String JSON_PROPERTY_EAN_UPC = "EanUpc";
  private Integer eanUpc;

  public static final String JSON_PROPERTY_ITEM_AMOUNT = "ItemAmount";
  private BigDecimal itemAmount;

  public static final String JSON_PROPERTY_CURRENCY = "Currency";
  private String currency;

  public StoredValueData() { 
  }

  public StoredValueData storedValueProvider(String storedValueProvider) {
    this.storedValueProvider = storedValueProvider;
    return this;
  }

   /**
   * If more than one provider to manage on the POI, and StoredValueAccountID absent.
   * @return storedValueProvider
  **/
  @ApiModelProperty(value = "If more than one provider to manage on the POI, and StoredValueAccountID absent.")
  @JsonProperty(JSON_PROPERTY_STORED_VALUE_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoredValueProvider() {
    return storedValueProvider;
  }


 /**
  * If more than one provider to manage on the POI, and StoredValueAccountID absent.
  *
  * @param storedValueProvider
  */ 
  @JsonProperty(JSON_PROPERTY_STORED_VALUE_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredValueProvider(String storedValueProvider) {
    this.storedValueProvider = storedValueProvider;
  }


  public StoredValueData storedValueTransactionType(StoredValueTransactionType storedValueTransactionType) {
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


  public StoredValueData storedValueAccountID(StoredValueAccountID storedValueAccountID) {
    this.storedValueAccountID = storedValueAccountID;
    return this;
  }

   /**
   * Get storedValueAccountID
   * @return storedValueAccountID
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STORED_VALUE_ACCOUNT_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StoredValueAccountID getStoredValueAccountID() {
    return storedValueAccountID;
  }


 /**
  * storedValueAccountID
  *
  * @param storedValueAccountID
  */ 
  @JsonProperty(JSON_PROPERTY_STORED_VALUE_ACCOUNT_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredValueAccountID(StoredValueAccountID storedValueAccountID) {
    this.storedValueAccountID = storedValueAccountID;
  }


  public StoredValueData originalPOITransaction(OriginalPOITransaction originalPOITransaction) {
    this.originalPOITransaction = originalPOITransaction;
    return this;
  }

   /**
   * Get originalPOITransaction
   * @return originalPOITransaction
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_P_O_I_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OriginalPOITransaction getOriginalPOITransaction() {
    return originalPOITransaction;
  }


 /**
  * originalPOITransaction
  *
  * @param originalPOITransaction
  */ 
  @JsonProperty(JSON_PROPERTY_ORIGINAL_P_O_I_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalPOITransaction(OriginalPOITransaction originalPOITransaction) {
    this.originalPOITransaction = originalPOITransaction;
  }


  public StoredValueData productCode(Integer productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * Product code of item purchased with the transaction.
   * minimum: 1
   * maximum: 20
   * @return productCode
  **/
  @ApiModelProperty(value = "Product code of item purchased with the transaction.")
  @JsonProperty(JSON_PROPERTY_PRODUCT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProductCode() {
    return productCode;
  }


 /**
  * Product code of item purchased with the transaction.
  *
  * @param productCode
  */ 
  @JsonProperty(JSON_PROPERTY_PRODUCT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductCode(Integer productCode) {
    this.productCode = productCode;
  }


  public StoredValueData eanUpc(Integer eanUpc) {
    this.eanUpc = eanUpc;
    return this;
  }

   /**
   * Standard product code of item purchased with the transaction.
   * @return eanUpc
  **/
  @ApiModelProperty(value = "Standard product code of item purchased with the transaction.")
  @JsonProperty(JSON_PROPERTY_EAN_UPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEanUpc() {
    return eanUpc;
  }


 /**
  * Standard product code of item purchased with the transaction.
  *
  * @param eanUpc
  */ 
  @JsonProperty(JSON_PROPERTY_EAN_UPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEanUpc(Integer eanUpc) {
    this.eanUpc = eanUpc;
  }


  public StoredValueData itemAmount(BigDecimal itemAmount) {
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


  public StoredValueData currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency of a monetary amount.
   * @return currency
  **/
  @ApiModelProperty(value = "Currency of a monetary amount.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


 /**
  * Currency of a monetary amount.
  *
  * @param currency
  */ 
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  /**
   * Return true if this StoredValueData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoredValueData storedValueData = (StoredValueData) o;
    return Objects.equals(this.storedValueProvider, storedValueData.storedValueProvider) &&
        Objects.equals(this.storedValueTransactionType, storedValueData.storedValueTransactionType) &&
        Objects.equals(this.storedValueAccountID, storedValueData.storedValueAccountID) &&
        Objects.equals(this.originalPOITransaction, storedValueData.originalPOITransaction) &&
        Objects.equals(this.productCode, storedValueData.productCode) &&
        Objects.equals(this.eanUpc, storedValueData.eanUpc) &&
        Objects.equals(this.itemAmount, storedValueData.itemAmount) &&
        Objects.equals(this.currency, storedValueData.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storedValueProvider, storedValueTransactionType, storedValueAccountID, originalPOITransaction, productCode, eanUpc, itemAmount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredValueData {\n");
    sb.append("    storedValueProvider: ").append(toIndentedString(storedValueProvider)).append("\n");
    sb.append("    storedValueTransactionType: ").append(toIndentedString(storedValueTransactionType)).append("\n");
    sb.append("    storedValueAccountID: ").append(toIndentedString(storedValueAccountID)).append("\n");
    sb.append("    originalPOITransaction: ").append(toIndentedString(originalPOITransaction)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    eanUpc: ").append(toIndentedString(eanUpc)).append("\n");
    sb.append("    itemAmount: ").append(toIndentedString(itemAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
   * Create an instance of StoredValueData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StoredValueData
   * @throws JsonProcessingException if the JSON string is invalid with respect to StoredValueData
   */
  public static StoredValueData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, StoredValueData.class);
  }
/**
  * Convert an instance of StoredValueData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
