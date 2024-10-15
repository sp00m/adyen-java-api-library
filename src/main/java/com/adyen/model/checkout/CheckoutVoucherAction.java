/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.checkout.Amount;
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
 * CheckoutVoucherAction
 */
@JsonPropertyOrder({
  CheckoutVoucherAction.JSON_PROPERTY_ALTERNATIVE_REFERENCE,
  CheckoutVoucherAction.JSON_PROPERTY_COLLECTION_INSTITUTION_NUMBER,
  CheckoutVoucherAction.JSON_PROPERTY_DOWNLOAD_URL,
  CheckoutVoucherAction.JSON_PROPERTY_ENTITY,
  CheckoutVoucherAction.JSON_PROPERTY_EXPIRES_AT,
  CheckoutVoucherAction.JSON_PROPERTY_INITIAL_AMOUNT,
  CheckoutVoucherAction.JSON_PROPERTY_INSTRUCTIONS_URL,
  CheckoutVoucherAction.JSON_PROPERTY_ISSUER,
  CheckoutVoucherAction.JSON_PROPERTY_MASKED_TELEPHONE_NUMBER,
  CheckoutVoucherAction.JSON_PROPERTY_MERCHANT_NAME,
  CheckoutVoucherAction.JSON_PROPERTY_MERCHANT_REFERENCE,
  CheckoutVoucherAction.JSON_PROPERTY_PASS_CREATION_TOKEN,
  CheckoutVoucherAction.JSON_PROPERTY_PAYMENT_DATA,
  CheckoutVoucherAction.JSON_PROPERTY_PAYMENT_METHOD_TYPE,
  CheckoutVoucherAction.JSON_PROPERTY_REFERENCE,
  CheckoutVoucherAction.JSON_PROPERTY_SHOPPER_EMAIL,
  CheckoutVoucherAction.JSON_PROPERTY_SHOPPER_NAME,
  CheckoutVoucherAction.JSON_PROPERTY_SURCHARGE,
  CheckoutVoucherAction.JSON_PROPERTY_TOTAL_AMOUNT,
  CheckoutVoucherAction.JSON_PROPERTY_TYPE,
  CheckoutVoucherAction.JSON_PROPERTY_URL
})

public class CheckoutVoucherAction {
  public static final String JSON_PROPERTY_ALTERNATIVE_REFERENCE = "alternativeReference";
  private String alternativeReference;

  public static final String JSON_PROPERTY_COLLECTION_INSTITUTION_NUMBER = "collectionInstitutionNumber";
  private String collectionInstitutionNumber;

  public static final String JSON_PROPERTY_DOWNLOAD_URL = "downloadUrl";
  private String downloadUrl;

  public static final String JSON_PROPERTY_ENTITY = "entity";
  private String entity;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expiresAt";
  private String expiresAt;

  public static final String JSON_PROPERTY_INITIAL_AMOUNT = "initialAmount";
  private Amount initialAmount;

  public static final String JSON_PROPERTY_INSTRUCTIONS_URL = "instructionsUrl";
  private String instructionsUrl;

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private String issuer;

  public static final String JSON_PROPERTY_MASKED_TELEPHONE_NUMBER = "maskedTelephoneNumber";
  private String maskedTelephoneNumber;

  public static final String JSON_PROPERTY_MERCHANT_NAME = "merchantName";
  private String merchantName;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  private String merchantReference;

  public static final String JSON_PROPERTY_PASS_CREATION_TOKEN = "passCreationToken";
  private String passCreationToken;

  public static final String JSON_PROPERTY_PAYMENT_DATA = "paymentData";
  private String paymentData;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_TYPE = "paymentMethodType";
  private String paymentMethodType;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_SHOPPER_EMAIL = "shopperEmail";
  private String shopperEmail;

  public static final String JSON_PROPERTY_SHOPPER_NAME = "shopperName";
  private String shopperName;

  public static final String JSON_PROPERTY_SURCHARGE = "surcharge";
  private Amount surcharge;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT = "totalAmount";
  private Amount totalAmount;

  /**
   * **voucher**
   */
  public enum TypeEnum {
    VOUCHER("voucher");

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

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public CheckoutVoucherAction() { 
  }

  /**
   * The voucher alternative reference code.
   *
   * @param alternativeReference
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction alternativeReference(String alternativeReference) {
    this.alternativeReference = alternativeReference;
    return this;
  }

  /**
   * The voucher alternative reference code.
   * @return alternativeReference
   */
  @ApiModelProperty(value = "The voucher alternative reference code.")
  @JsonProperty(JSON_PROPERTY_ALTERNATIVE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAlternativeReference() {
    return alternativeReference;
  }

  /**
   * The voucher alternative reference code.
   *
   * @param alternativeReference
   */ 
  @JsonProperty(JSON_PROPERTY_ALTERNATIVE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlternativeReference(String alternativeReference) {
    this.alternativeReference = alternativeReference;
  }

  /**
   * A collection institution number (store number) for Econtext Pay-Easy ATM.
   *
   * @param collectionInstitutionNumber
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction collectionInstitutionNumber(String collectionInstitutionNumber) {
    this.collectionInstitutionNumber = collectionInstitutionNumber;
    return this;
  }

  /**
   * A collection institution number (store number) for Econtext Pay-Easy ATM.
   * @return collectionInstitutionNumber
   */
  @ApiModelProperty(value = "A collection institution number (store number) for Econtext Pay-Easy ATM.")
  @JsonProperty(JSON_PROPERTY_COLLECTION_INSTITUTION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCollectionInstitutionNumber() {
    return collectionInstitutionNumber;
  }

  /**
   * A collection institution number (store number) for Econtext Pay-Easy ATM.
   *
   * @param collectionInstitutionNumber
   */ 
  @JsonProperty(JSON_PROPERTY_COLLECTION_INSTITUTION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectionInstitutionNumber(String collectionInstitutionNumber) {
    this.collectionInstitutionNumber = collectionInstitutionNumber;
  }

  /**
   * The URL to download the voucher.
   *
   * @param downloadUrl
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * The URL to download the voucher.
   * @return downloadUrl
   */
  @ApiModelProperty(value = "The URL to download the voucher.")
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDownloadUrl() {
    return downloadUrl;
  }

  /**
   * The URL to download the voucher.
   *
   * @param downloadUrl
   */ 
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  /**
   * An entity number of Multibanco.
   *
   * @param entity
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * An entity number of Multibanco.
   * @return entity
   */
  @ApiModelProperty(value = "An entity number of Multibanco.")
  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEntity() {
    return entity;
  }

  /**
   * An entity number of Multibanco.
   *
   * @param entity
   */ 
  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntity(String entity) {
    this.entity = entity;
  }

  /**
   * The date time of the voucher expiry.
   *
   * @param expiresAt
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * The date time of the voucher expiry.
   * @return expiresAt
   */
  @ApiModelProperty(value = "The date time of the voucher expiry.")
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExpiresAt() {
    return expiresAt;
  }

  /**
   * The date time of the voucher expiry.
   *
   * @param expiresAt
   */ 
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * initialAmount
   *
   * @param initialAmount
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction initialAmount(Amount initialAmount) {
    this.initialAmount = initialAmount;
    return this;
  }

  /**
   * initialAmount
   * @return initialAmount
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INITIAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Amount getInitialAmount() {
    return initialAmount;
  }

  /**
   * initialAmount
   *
   * @param initialAmount
   */ 
  @JsonProperty(JSON_PROPERTY_INITIAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitialAmount(Amount initialAmount) {
    this.initialAmount = initialAmount;
  }

  /**
   * The URL to the detailed instructions to make payment using the voucher.
   *
   * @param instructionsUrl
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction instructionsUrl(String instructionsUrl) {
    this.instructionsUrl = instructionsUrl;
    return this;
  }

  /**
   * The URL to the detailed instructions to make payment using the voucher.
   * @return instructionsUrl
   */
  @ApiModelProperty(value = "The URL to the detailed instructions to make payment using the voucher.")
  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInstructionsUrl() {
    return instructionsUrl;
  }

  /**
   * The URL to the detailed instructions to make payment using the voucher.
   *
   * @param instructionsUrl
   */ 
  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstructionsUrl(String instructionsUrl) {
    this.instructionsUrl = instructionsUrl;
  }

  /**
   * The issuer of the voucher.
   *
   * @param issuer
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * The issuer of the voucher.
   * @return issuer
   */
  @ApiModelProperty(value = "The issuer of the voucher.")
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssuer() {
    return issuer;
  }

  /**
   * The issuer of the voucher.
   *
   * @param issuer
   */ 
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  /**
   * The shopper telephone number (partially masked).
   *
   * @param maskedTelephoneNumber
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction maskedTelephoneNumber(String maskedTelephoneNumber) {
    this.maskedTelephoneNumber = maskedTelephoneNumber;
    return this;
  }

  /**
   * The shopper telephone number (partially masked).
   * @return maskedTelephoneNumber
   */
  @ApiModelProperty(value = "The shopper telephone number (partially masked).")
  @JsonProperty(JSON_PROPERTY_MASKED_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMaskedTelephoneNumber() {
    return maskedTelephoneNumber;
  }

  /**
   * The shopper telephone number (partially masked).
   *
   * @param maskedTelephoneNumber
   */ 
  @JsonProperty(JSON_PROPERTY_MASKED_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaskedTelephoneNumber(String maskedTelephoneNumber) {
    this.maskedTelephoneNumber = maskedTelephoneNumber;
  }

  /**
   * The merchant name.
   *
   * @param merchantName
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

  /**
   * The merchant name.
   * @return merchantName
   */
  @ApiModelProperty(value = "The merchant name.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantName() {
    return merchantName;
  }

  /**
   * The merchant name.
   *
   * @param merchantName
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  /**
   * The merchant reference.
   *
   * @param merchantReference
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction merchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
    return this;
  }

  /**
   * The merchant reference.
   * @return merchantReference
   */
  @ApiModelProperty(value = "The merchant reference.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantReference() {
    return merchantReference;
  }

  /**
   * The merchant reference.
   *
   * @param merchantReference
   */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }

  /**
   * A Base64-encoded token containing all properties of the voucher. For iOS, you can use this to pass a voucher to Apple Wallet.
   *
   * @param passCreationToken
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction passCreationToken(String passCreationToken) {
    this.passCreationToken = passCreationToken;
    return this;
  }

  /**
   * A Base64-encoded token containing all properties of the voucher. For iOS, you can use this to pass a voucher to Apple Wallet.
   * @return passCreationToken
   */
  @ApiModelProperty(value = "A Base64-encoded token containing all properties of the voucher. For iOS, you can use this to pass a voucher to Apple Wallet.")
  @JsonProperty(JSON_PROPERTY_PASS_CREATION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPassCreationToken() {
    return passCreationToken;
  }

  /**
   * A Base64-encoded token containing all properties of the voucher. For iOS, you can use this to pass a voucher to Apple Wallet.
   *
   * @param passCreationToken
   */ 
  @JsonProperty(JSON_PROPERTY_PASS_CREATION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassCreationToken(String passCreationToken) {
    this.passCreationToken = passCreationToken;
  }

  /**
   * Encoded payment data.
   *
   * @param paymentData
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction paymentData(String paymentData) {
    this.paymentData = paymentData;
    return this;
  }

  /**
   * Encoded payment data.
   * @return paymentData
   */
  @ApiModelProperty(value = "Encoded payment data.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPaymentData() {
    return paymentData;
  }

  /**
   * Encoded payment data.
   *
   * @param paymentData
   */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentData(String paymentData) {
    this.paymentData = paymentData;
  }

  /**
   * Specifies the payment method.
   *
   * @param paymentMethodType
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction paymentMethodType(String paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
    return this;
  }

  /**
   * Specifies the payment method.
   * @return paymentMethodType
   */
  @ApiModelProperty(value = "Specifies the payment method.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPaymentMethodType() {
    return paymentMethodType;
  }

  /**
   * Specifies the payment method.
   *
   * @param paymentMethodType
   */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethodType(String paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }

  /**
   * The voucher reference code.
   *
   * @param reference
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * The voucher reference code.
   * @return reference
   */
  @ApiModelProperty(value = "The voucher reference code.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReference() {
    return reference;
  }

  /**
   * The voucher reference code.
   *
   * @param reference
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * The shopper email.
   *
   * @param shopperEmail
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction shopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
    return this;
  }

  /**
   * The shopper email.
   * @return shopperEmail
   */
  @ApiModelProperty(value = "The shopper email.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperEmail() {
    return shopperEmail;
  }

  /**
   * The shopper email.
   *
   * @param shopperEmail
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }

  /**
   * The shopper name.
   *
   * @param shopperName
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction shopperName(String shopperName) {
    this.shopperName = shopperName;
    return this;
  }

  /**
   * The shopper name.
   * @return shopperName
   */
  @ApiModelProperty(value = "The shopper name.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShopperName() {
    return shopperName;
  }

  /**
   * The shopper name.
   *
   * @param shopperName
   */ 
  @JsonProperty(JSON_PROPERTY_SHOPPER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperName(String shopperName) {
    this.shopperName = shopperName;
  }

  /**
   * surcharge
   *
   * @param surcharge
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction surcharge(Amount surcharge) {
    this.surcharge = surcharge;
    return this;
  }

  /**
   * surcharge
   * @return surcharge
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SURCHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Amount getSurcharge() {
    return surcharge;
  }

  /**
   * surcharge
   *
   * @param surcharge
   */ 
  @JsonProperty(JSON_PROPERTY_SURCHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSurcharge(Amount surcharge) {
    this.surcharge = surcharge;
  }

  /**
   * totalAmount
   *
   * @param totalAmount
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction totalAmount(Amount totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * totalAmount
   * @return totalAmount
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Amount getTotalAmount() {
    return totalAmount;
  }

  /**
   * totalAmount
   *
   * @param totalAmount
   */ 
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAmount(Amount totalAmount) {
    this.totalAmount = totalAmount;
  }

  /**
   * **voucher**
   *
   * @param type
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * **voucher**
   * @return type
   */
  @ApiModelProperty(required = true, value = "**voucher**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * **voucher**
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Specifies the URL to redirect to.
   *
   * @param url
   * @return the current {@code CheckoutVoucherAction} instance, allowing for method chaining
   */
  public CheckoutVoucherAction url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Specifies the URL to redirect to.
   * @return url
   */
  @ApiModelProperty(value = "Specifies the URL to redirect to.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  /**
   * Specifies the URL to redirect to.
   *
   * @param url
   */ 
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Return true if this CheckoutVoucherAction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutVoucherAction checkoutVoucherAction = (CheckoutVoucherAction) o;
    return Objects.equals(this.alternativeReference, checkoutVoucherAction.alternativeReference) &&
        Objects.equals(this.collectionInstitutionNumber, checkoutVoucherAction.collectionInstitutionNumber) &&
        Objects.equals(this.downloadUrl, checkoutVoucherAction.downloadUrl) &&
        Objects.equals(this.entity, checkoutVoucherAction.entity) &&
        Objects.equals(this.expiresAt, checkoutVoucherAction.expiresAt) &&
        Objects.equals(this.initialAmount, checkoutVoucherAction.initialAmount) &&
        Objects.equals(this.instructionsUrl, checkoutVoucherAction.instructionsUrl) &&
        Objects.equals(this.issuer, checkoutVoucherAction.issuer) &&
        Objects.equals(this.maskedTelephoneNumber, checkoutVoucherAction.maskedTelephoneNumber) &&
        Objects.equals(this.merchantName, checkoutVoucherAction.merchantName) &&
        Objects.equals(this.merchantReference, checkoutVoucherAction.merchantReference) &&
        Objects.equals(this.passCreationToken, checkoutVoucherAction.passCreationToken) &&
        Objects.equals(this.paymentData, checkoutVoucherAction.paymentData) &&
        Objects.equals(this.paymentMethodType, checkoutVoucherAction.paymentMethodType) &&
        Objects.equals(this.reference, checkoutVoucherAction.reference) &&
        Objects.equals(this.shopperEmail, checkoutVoucherAction.shopperEmail) &&
        Objects.equals(this.shopperName, checkoutVoucherAction.shopperName) &&
        Objects.equals(this.surcharge, checkoutVoucherAction.surcharge) &&
        Objects.equals(this.totalAmount, checkoutVoucherAction.totalAmount) &&
        Objects.equals(this.type, checkoutVoucherAction.type) &&
        Objects.equals(this.url, checkoutVoucherAction.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternativeReference, collectionInstitutionNumber, downloadUrl, entity, expiresAt, initialAmount, instructionsUrl, issuer, maskedTelephoneNumber, merchantName, merchantReference, passCreationToken, paymentData, paymentMethodType, reference, shopperEmail, shopperName, surcharge, totalAmount, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutVoucherAction {\n");
    sb.append("    alternativeReference: ").append(toIndentedString(alternativeReference)).append("\n");
    sb.append("    collectionInstitutionNumber: ").append(toIndentedString(collectionInstitutionNumber)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    initialAmount: ").append(toIndentedString(initialAmount)).append("\n");
    sb.append("    instructionsUrl: ").append(toIndentedString(instructionsUrl)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    maskedTelephoneNumber: ").append(toIndentedString(maskedTelephoneNumber)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    passCreationToken: ").append(toIndentedString(passCreationToken)).append("\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
    sb.append("    shopperName: ").append(toIndentedString(shopperName)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
   * Create an instance of CheckoutVoucherAction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CheckoutVoucherAction
   * @throws JsonProcessingException if the JSON string is invalid with respect to CheckoutVoucherAction
   */
  public static CheckoutVoucherAction fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CheckoutVoucherAction.class);
  }
/**
  * Convert an instance of CheckoutVoucherAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
