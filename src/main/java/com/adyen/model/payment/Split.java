/*
 * Adyen Payment API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.payment.SplitAmount;
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
 * Split
 */
@JsonPropertyOrder({
  Split.JSON_PROPERTY_ACCOUNT,
  Split.JSON_PROPERTY_AMOUNT,
  Split.JSON_PROPERTY_DESCRIPTION,
  Split.JSON_PROPERTY_REFERENCE,
  Split.JSON_PROPERTY_TYPE
})

public class Split {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private String account;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private SplitAmount amount;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  /**
   * The part of the payment you want to book to the specified &#x60;account&#x60;.  Possible values for the [Balance Platform](https://docs.adyen.com/adyen-for-platforms-model): * **BalanceAccount**: books part of the payment (specified in &#x60;amount&#x60;) to the specified &#x60;account&#x60;. * Transaction fees types that you can book to the specified &#x60;account&#x60;:    * **AcquiringFees**: the aggregated amount of the interchange and scheme fees.    * **PaymentFee**: the aggregated amount of all transaction fees.    * **AdyenFees**: the aggregated amount of Adyen&#39;s commission and markup fees.    * **AdyenCommission**: the transaction fees due to Adyen under [blended rates](https://www.adyen.com/knowledge-hub/interchange-fees-explained).    * **AdyenMarkup**: the transaction fees due to Adyen under [Interchange ++ pricing](https://www.adyen.com/knowledge-hub/interchange-fees-explained).    * **Interchange**: the fees paid to the issuer for each payment made with the card network.    * **SchemeFee**: the fees paid to the card scheme for using their network.  * **Commission**: your platform&#39;s commission on the payment (specified in &#x60;amount&#x60;), booked to your liable balance account. * **Remainder**: the amount left over after a currency conversion, booked to the specified &#x60;account&#x60;. * **TopUp**: allows you and your users to top up balance accounts using direct debit, card payments, or other payment methods. * **VAT**: the value-added tax charged on the payment, booked to your platforms liable balance account. * **Commission**: your platform&#39;s commission (specified in &#x60;amount&#x60;) on the payment, booked to your liable balance account. * **Default**: in very specific use cases, allows you to book the specified &#x60;amount&#x60; to the specified &#x60;account&#x60;. For more information, contact Adyen support.  Possible values for the [Classic Platforms integration](https://docs.adyen.com/classic-platforms): **Commission**, **Default**, **MarketPlace**, **PaymentFee**, **VAT**.
   */
  public enum TypeEnum {
    ACQUIRINGFEES("AcquiringFees"),
    
    ADYENCOMMISSION("AdyenCommission"),
    
    ADYENFEES("AdyenFees"),
    
    ADYENMARKUP("AdyenMarkup"),
    
    BALANCEACCOUNT("BalanceAccount"),
    
    COMMISSION("Commission"),
    
    DEFAULT("Default"),
    
    INTERCHANGE("Interchange"),
    
    MARKETPLACE("MarketPlace"),
    
    PAYMENTFEE("PaymentFee"),
    
    REMAINDER("Remainder"),
    
    SCHEMEFEE("SchemeFee"),
    
    SURCHARGE("Surcharge"),
    
    TIP("Tip"),
    
    TOPUP("TopUp"),
    
    VAT("VAT");

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

  public Split() { 
  }

  /**
   * The unique identifier of the account to which the split amount is booked. Required if &#x60;type&#x60; is **MarketPlace** or **BalanceAccount**.  * [Classic Platforms integration](https://docs.adyen.com/classic-platforms): The [&#x60;accountCode&#x60;](https://docs.adyen.com/api-explorer/Account/latest/post/updateAccount#request-accountCode) of the account to which the split amount is booked. * [Balance Platform](https://docs.adyen.com/adyen-for-platforms-model): The [&#x60;balanceAccountId&#x60;](https://docs.adyen.com/api-explorer/balanceplatform/latest/get/balanceAccounts/_id_#path-id) of the account to which the split amount is booked.
   *
   * @param account
   * @return the current {@code Split} instance, allowing for method chaining
   */
  public Split account(String account) {
    this.account = account;
    return this;
  }

  /**
   * The unique identifier of the account to which the split amount is booked. Required if &#x60;type&#x60; is **MarketPlace** or **BalanceAccount**.  * [Classic Platforms integration](https://docs.adyen.com/classic-platforms): The [&#x60;accountCode&#x60;](https://docs.adyen.com/api-explorer/Account/latest/post/updateAccount#request-accountCode) of the account to which the split amount is booked. * [Balance Platform](https://docs.adyen.com/adyen-for-platforms-model): The [&#x60;balanceAccountId&#x60;](https://docs.adyen.com/api-explorer/balanceplatform/latest/get/balanceAccounts/_id_#path-id) of the account to which the split amount is booked.
   * @return account
   */
  @ApiModelProperty(value = "The unique identifier of the account to which the split amount is booked. Required if `type` is **MarketPlace** or **BalanceAccount**.  * [Classic Platforms integration](https://docs.adyen.com/classic-platforms): The [`accountCode`](https://docs.adyen.com/api-explorer/Account/latest/post/updateAccount#request-accountCode) of the account to which the split amount is booked. * [Balance Platform](https://docs.adyen.com/adyen-for-platforms-model): The [`balanceAccountId`](https://docs.adyen.com/api-explorer/balanceplatform/latest/get/balanceAccounts/_id_#path-id) of the account to which the split amount is booked.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccount() {
    return account;
  }

  /**
   * The unique identifier of the account to which the split amount is booked. Required if &#x60;type&#x60; is **MarketPlace** or **BalanceAccount**.  * [Classic Platforms integration](https://docs.adyen.com/classic-platforms): The [&#x60;accountCode&#x60;](https://docs.adyen.com/api-explorer/Account/latest/post/updateAccount#request-accountCode) of the account to which the split amount is booked. * [Balance Platform](https://docs.adyen.com/adyen-for-platforms-model): The [&#x60;balanceAccountId&#x60;](https://docs.adyen.com/api-explorer/balanceplatform/latest/get/balanceAccounts/_id_#path-id) of the account to which the split amount is booked.
   *
   * @param account
   */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccount(String account) {
    this.account = account;
  }

  /**
   * amount
   *
   * @param amount
   * @return the current {@code Split} instance, allowing for method chaining
   */
  public Split amount(SplitAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * amount
   * @return amount
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SplitAmount getAmount() {
    return amount;
  }

  /**
   * amount
   *
   * @param amount
   */ 
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(SplitAmount amount) {
    this.amount = amount;
  }

  /**
   * Your description for the split item.
   *
   * @param description
   * @return the current {@code Split} instance, allowing for method chaining
   */
  public Split description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Your description for the split item.
   * @return description
   */
  @ApiModelProperty(value = "Your description for the split item.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  /**
   * Your description for the split item.
   *
   * @param description
   */ 
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Your unique reference for the part of the payment booked to the specified &#x60;account&#x60;.  This is required if &#x60;type&#x60; is **MarketPlace** ([Classic Platforms integration](https://docs.adyen.com/classic-platforms)) or **BalanceAccount** ([Balance Platform](https://docs.adyen.com/adyen-for-platforms-model)).  For the other types, we also recommend providing a **unique** reference so you can reconcile the split and the associated payment in the transaction overview and in the reports.
   *
   * @param reference
   * @return the current {@code Split} instance, allowing for method chaining
   */
  public Split reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Your unique reference for the part of the payment booked to the specified &#x60;account&#x60;.  This is required if &#x60;type&#x60; is **MarketPlace** ([Classic Platforms integration](https://docs.adyen.com/classic-platforms)) or **BalanceAccount** ([Balance Platform](https://docs.adyen.com/adyen-for-platforms-model)).  For the other types, we also recommend providing a **unique** reference so you can reconcile the split and the associated payment in the transaction overview and in the reports.
   * @return reference
   */
  @ApiModelProperty(value = "Your unique reference for the part of the payment booked to the specified `account`.  This is required if `type` is **MarketPlace** ([Classic Platforms integration](https://docs.adyen.com/classic-platforms)) or **BalanceAccount** ([Balance Platform](https://docs.adyen.com/adyen-for-platforms-model)).  For the other types, we also recommend providing a **unique** reference so you can reconcile the split and the associated payment in the transaction overview and in the reports.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReference() {
    return reference;
  }

  /**
   * Your unique reference for the part of the payment booked to the specified &#x60;account&#x60;.  This is required if &#x60;type&#x60; is **MarketPlace** ([Classic Platforms integration](https://docs.adyen.com/classic-platforms)) or **BalanceAccount** ([Balance Platform](https://docs.adyen.com/adyen-for-platforms-model)).  For the other types, we also recommend providing a **unique** reference so you can reconcile the split and the associated payment in the transaction overview and in the reports.
   *
   * @param reference
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * The part of the payment you want to book to the specified &#x60;account&#x60;.  Possible values for the [Balance Platform](https://docs.adyen.com/adyen-for-platforms-model): * **BalanceAccount**: books part of the payment (specified in &#x60;amount&#x60;) to the specified &#x60;account&#x60;. * Transaction fees types that you can book to the specified &#x60;account&#x60;:    * **AcquiringFees**: the aggregated amount of the interchange and scheme fees.    * **PaymentFee**: the aggregated amount of all transaction fees.    * **AdyenFees**: the aggregated amount of Adyen&#39;s commission and markup fees.    * **AdyenCommission**: the transaction fees due to Adyen under [blended rates](https://www.adyen.com/knowledge-hub/interchange-fees-explained).    * **AdyenMarkup**: the transaction fees due to Adyen under [Interchange ++ pricing](https://www.adyen.com/knowledge-hub/interchange-fees-explained).    * **Interchange**: the fees paid to the issuer for each payment made with the card network.    * **SchemeFee**: the fees paid to the card scheme for using their network.  * **Commission**: your platform&#39;s commission on the payment (specified in &#x60;amount&#x60;), booked to your liable balance account. * **Remainder**: the amount left over after a currency conversion, booked to the specified &#x60;account&#x60;. * **TopUp**: allows you and your users to top up balance accounts using direct debit, card payments, or other payment methods. * **VAT**: the value-added tax charged on the payment, booked to your platforms liable balance account. * **Commission**: your platform&#39;s commission (specified in &#x60;amount&#x60;) on the payment, booked to your liable balance account. * **Default**: in very specific use cases, allows you to book the specified &#x60;amount&#x60; to the specified &#x60;account&#x60;. For more information, contact Adyen support.  Possible values for the [Classic Platforms integration](https://docs.adyen.com/classic-platforms): **Commission**, **Default**, **MarketPlace**, **PaymentFee**, **VAT**.
   *
   * @param type
   * @return the current {@code Split} instance, allowing for method chaining
   */
  public Split type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The part of the payment you want to book to the specified &#x60;account&#x60;.  Possible values for the [Balance Platform](https://docs.adyen.com/adyen-for-platforms-model): * **BalanceAccount**: books part of the payment (specified in &#x60;amount&#x60;) to the specified &#x60;account&#x60;. * Transaction fees types that you can book to the specified &#x60;account&#x60;:    * **AcquiringFees**: the aggregated amount of the interchange and scheme fees.    * **PaymentFee**: the aggregated amount of all transaction fees.    * **AdyenFees**: the aggregated amount of Adyen&#39;s commission and markup fees.    * **AdyenCommission**: the transaction fees due to Adyen under [blended rates](https://www.adyen.com/knowledge-hub/interchange-fees-explained).    * **AdyenMarkup**: the transaction fees due to Adyen under [Interchange ++ pricing](https://www.adyen.com/knowledge-hub/interchange-fees-explained).    * **Interchange**: the fees paid to the issuer for each payment made with the card network.    * **SchemeFee**: the fees paid to the card scheme for using their network.  * **Commission**: your platform&#39;s commission on the payment (specified in &#x60;amount&#x60;), booked to your liable balance account. * **Remainder**: the amount left over after a currency conversion, booked to the specified &#x60;account&#x60;. * **TopUp**: allows you and your users to top up balance accounts using direct debit, card payments, or other payment methods. * **VAT**: the value-added tax charged on the payment, booked to your platforms liable balance account. * **Commission**: your platform&#39;s commission (specified in &#x60;amount&#x60;) on the payment, booked to your liable balance account. * **Default**: in very specific use cases, allows you to book the specified &#x60;amount&#x60; to the specified &#x60;account&#x60;. For more information, contact Adyen support.  Possible values for the [Classic Platforms integration](https://docs.adyen.com/classic-platforms): **Commission**, **Default**, **MarketPlace**, **PaymentFee**, **VAT**.
   * @return type
   */
  @ApiModelProperty(required = true, value = "The part of the payment you want to book to the specified `account`.  Possible values for the [Balance Platform](https://docs.adyen.com/adyen-for-platforms-model): * **BalanceAccount**: books part of the payment (specified in `amount`) to the specified `account`. * Transaction fees types that you can book to the specified `account`:    * **AcquiringFees**: the aggregated amount of the interchange and scheme fees.    * **PaymentFee**: the aggregated amount of all transaction fees.    * **AdyenFees**: the aggregated amount of Adyen's commission and markup fees.    * **AdyenCommission**: the transaction fees due to Adyen under [blended rates](https://www.adyen.com/knowledge-hub/interchange-fees-explained).    * **AdyenMarkup**: the transaction fees due to Adyen under [Interchange ++ pricing](https://www.adyen.com/knowledge-hub/interchange-fees-explained).    * **Interchange**: the fees paid to the issuer for each payment made with the card network.    * **SchemeFee**: the fees paid to the card scheme for using their network.  * **Commission**: your platform's commission on the payment (specified in `amount`), booked to your liable balance account. * **Remainder**: the amount left over after a currency conversion, booked to the specified `account`. * **TopUp**: allows you and your users to top up balance accounts using direct debit, card payments, or other payment methods. * **VAT**: the value-added tax charged on the payment, booked to your platforms liable balance account. * **Commission**: your platform's commission (specified in `amount`) on the payment, booked to your liable balance account. * **Default**: in very specific use cases, allows you to book the specified `amount` to the specified `account`. For more information, contact Adyen support.  Possible values for the [Classic Platforms integration](https://docs.adyen.com/classic-platforms): **Commission**, **Default**, **MarketPlace**, **PaymentFee**, **VAT**.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * The part of the payment you want to book to the specified &#x60;account&#x60;.  Possible values for the [Balance Platform](https://docs.adyen.com/adyen-for-platforms-model): * **BalanceAccount**: books part of the payment (specified in &#x60;amount&#x60;) to the specified &#x60;account&#x60;. * Transaction fees types that you can book to the specified &#x60;account&#x60;:    * **AcquiringFees**: the aggregated amount of the interchange and scheme fees.    * **PaymentFee**: the aggregated amount of all transaction fees.    * **AdyenFees**: the aggregated amount of Adyen&#39;s commission and markup fees.    * **AdyenCommission**: the transaction fees due to Adyen under [blended rates](https://www.adyen.com/knowledge-hub/interchange-fees-explained).    * **AdyenMarkup**: the transaction fees due to Adyen under [Interchange ++ pricing](https://www.adyen.com/knowledge-hub/interchange-fees-explained).    * **Interchange**: the fees paid to the issuer for each payment made with the card network.    * **SchemeFee**: the fees paid to the card scheme for using their network.  * **Commission**: your platform&#39;s commission on the payment (specified in &#x60;amount&#x60;), booked to your liable balance account. * **Remainder**: the amount left over after a currency conversion, booked to the specified &#x60;account&#x60;. * **TopUp**: allows you and your users to top up balance accounts using direct debit, card payments, or other payment methods. * **VAT**: the value-added tax charged on the payment, booked to your platforms liable balance account. * **Commission**: your platform&#39;s commission (specified in &#x60;amount&#x60;) on the payment, booked to your liable balance account. * **Default**: in very specific use cases, allows you to book the specified &#x60;amount&#x60; to the specified &#x60;account&#x60;. For more information, contact Adyen support.  Possible values for the [Classic Platforms integration](https://docs.adyen.com/classic-platforms): **Commission**, **Default**, **MarketPlace**, **PaymentFee**, **VAT**.
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this Split object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Split split = (Split) o;
    return Objects.equals(this.account, split.account) &&
        Objects.equals(this.amount, split.amount) &&
        Objects.equals(this.description, split.description) &&
        Objects.equals(this.reference, split.reference) &&
        Objects.equals(this.type, split.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, amount, description, reference, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Split {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
   * Create an instance of Split given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Split
   * @throws JsonProcessingException if the JSON string is invalid with respect to Split
   */
  public static Split fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Split.class);
  }
/**
  * Convert an instance of Split to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
