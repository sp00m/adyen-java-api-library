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
import com.adyen.model.terminal.AmountsResp;
import com.adyen.model.terminal.CapturedSignature;
import com.adyen.model.terminal.CurrencyConversion;
import com.adyen.model.terminal.Instalment;
import com.adyen.model.terminal.PaymentAcquirerData;
import com.adyen.model.terminal.PaymentInstrumentData;
import com.adyen.model.terminal.PaymentType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * PaymentResult
 */
@JsonPropertyOrder({
  PaymentResult.JSON_PROPERTY_PAYMENT_TYPE,
  PaymentResult.JSON_PROPERTY_PAYMENT_INSTRUMENT_DATA,
  PaymentResult.JSON_PROPERTY_AMOUNTS_RESP,
  PaymentResult.JSON_PROPERTY_INSTALMENT,
  PaymentResult.JSON_PROPERTY_CURRENCY_CONVERSION,
  PaymentResult.JSON_PROPERTY_MERCHANT_OVERRIDE_FLAG,
  PaymentResult.JSON_PROPERTY_CAPTURED_SIGNATURE,
  PaymentResult.JSON_PROPERTY_PROTECTED_SIGNATURE,
  PaymentResult.JSON_PROPERTY_CUSTOMER_LANGUAGE,
  PaymentResult.JSON_PROPERTY_ONLINE_FLAG,
  PaymentResult.JSON_PROPERTY_AUTHENTICATION_METHOD,
  PaymentResult.JSON_PROPERTY_VALIDITY_DATE,
  PaymentResult.JSON_PROPERTY_PAYMENT_ACQUIRER_DATA
})

public class PaymentResult {
  public static final String JSON_PROPERTY_PAYMENT_TYPE = "PaymentType";
  private PaymentType paymentType;

  public static final String JSON_PROPERTY_PAYMENT_INSTRUMENT_DATA = "PaymentInstrumentData";
  private PaymentInstrumentData paymentInstrumentData;

  public static final String JSON_PROPERTY_AMOUNTS_RESP = "AmountsResp";
  private AmountsResp amountsResp;

  public static final String JSON_PROPERTY_INSTALMENT = "Instalment";
  private Instalment instalment;

  public static final String JSON_PROPERTY_CURRENCY_CONVERSION = "CurrencyConversion";
  private List<CurrencyConversion> currencyConversion = null;

  public static final String JSON_PROPERTY_MERCHANT_OVERRIDE_FLAG = "MerchantOverrideFlag";
  private Boolean merchantOverrideFlag = false;

  public static final String JSON_PROPERTY_CAPTURED_SIGNATURE = "CapturedSignature";
  private CapturedSignature capturedSignature;

  public static final String JSON_PROPERTY_PROTECTED_SIGNATURE = "ProtectedSignature";
  private String protectedSignature;

  public static final String JSON_PROPERTY_CUSTOMER_LANGUAGE = "CustomerLanguage";
  private String customerLanguage;

  public static final String JSON_PROPERTY_ONLINE_FLAG = "OnlineFlag";
  private Boolean onlineFlag = true;

  /**
   * Gets or Sets authenticationMethod
   */
  public enum AuthenticationMethodEnum {
    BYPASS("Bypass"),
    
    MANUALVERIFICATION("ManualVerification"),
    
    MERCHANTAUTHENTICATION("MerchantAuthentication"),
    
    OFFLINEPIN("OfflinePIN"),
    
    ONLINEPIN("OnlinePIN"),
    
    PAPERSIGNATURE("PaperSignature"),
    
    SECURECERTIFICATE("SecureCertificate"),
    
    SECURENOCERTIFICATE("SecureNoCertificate"),
    
    SECUREDCHANNEL("SecuredChannel"),
    
    SIGNATURECAPTURE("SignatureCapture"),
    
    UNKNOWNMETHOD("UnknownMethod");

    private String value;

    AuthenticationMethodEnum(String value) {
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
    public static AuthenticationMethodEnum fromValue(String value) {
      for (AuthenticationMethodEnum b : AuthenticationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AUTHENTICATION_METHOD = "AuthenticationMethod";
  private List<AuthenticationMethodEnum> authenticationMethod = null;

  public static final String JSON_PROPERTY_VALIDITY_DATE = "ValidityDate";
  private LocalDate validityDate;

  public static final String JSON_PROPERTY_PAYMENT_ACQUIRER_DATA = "PaymentAcquirerData";
  private PaymentAcquirerData paymentAcquirerData;

  public PaymentResult() { 
  }

  public PaymentResult paymentType(PaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Get paymentType
   * @return paymentType
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentType getPaymentType() {
    return paymentType;
  }


 /**
  * paymentType
  *
  * @param paymentType
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentType(PaymentType paymentType) {
    this.paymentType = paymentType;
  }


  public PaymentResult paymentInstrumentData(PaymentInstrumentData paymentInstrumentData) {
    this.paymentInstrumentData = paymentInstrumentData;
    return this;
  }

   /**
   * Get paymentInstrumentData
   * @return paymentInstrumentData
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentInstrumentData getPaymentInstrumentData() {
    return paymentInstrumentData;
  }


 /**
  * paymentInstrumentData
  *
  * @param paymentInstrumentData
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentInstrumentData(PaymentInstrumentData paymentInstrumentData) {
    this.paymentInstrumentData = paymentInstrumentData;
  }


  public PaymentResult amountsResp(AmountsResp amountsResp) {
    this.amountsResp = amountsResp;
    return this;
  }

   /**
   * Get amountsResp
   * @return amountsResp
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNTS_RESP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AmountsResp getAmountsResp() {
    return amountsResp;
  }


 /**
  * amountsResp
  *
  * @param amountsResp
  */ 
  @JsonProperty(JSON_PROPERTY_AMOUNTS_RESP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountsResp(AmountsResp amountsResp) {
    this.amountsResp = amountsResp;
  }


  public PaymentResult instalment(Instalment instalment) {
    this.instalment = instalment;
    return this;
  }

   /**
   * Get instalment
   * @return instalment
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTALMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Instalment getInstalment() {
    return instalment;
  }


 /**
  * instalment
  *
  * @param instalment
  */ 
  @JsonProperty(JSON_PROPERTY_INSTALMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstalment(Instalment instalment) {
    this.instalment = instalment;
  }


  public PaymentResult currencyConversion(List<CurrencyConversion> currencyConversion) {
    this.currencyConversion = currencyConversion;
    return this;
  }

  public PaymentResult addCurrencyConversionItem(CurrencyConversion currencyConversionItem) {
    if (this.currencyConversion == null) {
      this.currencyConversion = new ArrayList<>();
    }
    this.currencyConversion.add(currencyConversionItem);
    return this;
  }

   /**
   * Get currencyConversion
   * @return currencyConversion
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CurrencyConversion> getCurrencyConversion() {
    return currencyConversion;
  }


 /**
  * currencyConversion
  *
  * @param currencyConversion
  */ 
  @JsonProperty(JSON_PROPERTY_CURRENCY_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyConversion(List<CurrencyConversion> currencyConversion) {
    this.currencyConversion = currencyConversion;
  }


  public PaymentResult merchantOverrideFlag(Boolean merchantOverrideFlag) {
    this.merchantOverrideFlag = merchantOverrideFlag;
    return this;
  }

   /**
   * Get merchantOverrideFlag
   * @return merchantOverrideFlag
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MERCHANT_OVERRIDE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMerchantOverrideFlag() {
    return merchantOverrideFlag;
  }


 /**
  * merchantOverrideFlag
  *
  * @param merchantOverrideFlag
  */ 
  @JsonProperty(JSON_PROPERTY_MERCHANT_OVERRIDE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantOverrideFlag(Boolean merchantOverrideFlag) {
    this.merchantOverrideFlag = merchantOverrideFlag;
  }


  public PaymentResult capturedSignature(CapturedSignature capturedSignature) {
    this.capturedSignature = capturedSignature;
    return this;
  }

   /**
   * Get capturedSignature
   * @return capturedSignature
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAPTURED_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CapturedSignature getCapturedSignature() {
    return capturedSignature;
  }


 /**
  * capturedSignature
  *
  * @param capturedSignature
  */ 
  @JsonProperty(JSON_PROPERTY_CAPTURED_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapturedSignature(CapturedSignature capturedSignature) {
    this.capturedSignature = capturedSignature;
  }


  public PaymentResult protectedSignature(String protectedSignature) {
    this.protectedSignature = protectedSignature;
    return this;
  }

   /**
   * Get protectedSignature
   * @return protectedSignature
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROTECTED_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProtectedSignature() {
    return protectedSignature;
  }


 /**
  * protectedSignature
  *
  * @param protectedSignature
  */ 
  @JsonProperty(JSON_PROPERTY_PROTECTED_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtectedSignature(String protectedSignature) {
    this.protectedSignature = protectedSignature;
  }


  public PaymentResult customerLanguage(String customerLanguage) {
    this.customerLanguage = customerLanguage;
    return this;
  }

   /**
   * Get customerLanguage
   * @return customerLanguage
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerLanguage() {
    return customerLanguage;
  }


 /**
  * customerLanguage
  *
  * @param customerLanguage
  */ 
  @JsonProperty(JSON_PROPERTY_CUSTOMER_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerLanguage(String customerLanguage) {
    this.customerLanguage = customerLanguage;
  }


  public PaymentResult onlineFlag(Boolean onlineFlag) {
    this.onlineFlag = onlineFlag;
    return this;
  }

   /**
   * Get onlineFlag
   * @return onlineFlag
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ONLINE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnlineFlag() {
    return onlineFlag;
  }


 /**
  * onlineFlag
  *
  * @param onlineFlag
  */ 
  @JsonProperty(JSON_PROPERTY_ONLINE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnlineFlag(Boolean onlineFlag) {
    this.onlineFlag = onlineFlag;
  }


  public PaymentResult authenticationMethod(List<AuthenticationMethodEnum> authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
    return this;
  }

  public PaymentResult addAuthenticationMethodItem(AuthenticationMethodEnum authenticationMethodItem) {
    if (this.authenticationMethod == null) {
      this.authenticationMethod = new ArrayList<>();
    }
    this.authenticationMethod.add(authenticationMethodItem);
    return this;
  }

   /**
   * Get authenticationMethod
   * @return authenticationMethod
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AuthenticationMethodEnum> getAuthenticationMethod() {
    return authenticationMethod;
  }


 /**
  * authenticationMethod
  *
  * @param authenticationMethod
  */ 
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticationMethod(List<AuthenticationMethodEnum> authenticationMethod) {
    this.authenticationMethod = authenticationMethod;
  }


  public PaymentResult validityDate(LocalDate validityDate) {
    this.validityDate = validityDate;
    return this;
  }

   /**
   * Get validityDate
   * @return validityDate
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALIDITY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getValidityDate() {
    return validityDate;
  }


 /**
  * validityDate
  *
  * @param validityDate
  */ 
  @JsonProperty(JSON_PROPERTY_VALIDITY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidityDate(LocalDate validityDate) {
    this.validityDate = validityDate;
  }


  public PaymentResult paymentAcquirerData(PaymentAcquirerData paymentAcquirerData) {
    this.paymentAcquirerData = paymentAcquirerData;
    return this;
  }

   /**
   * Get paymentAcquirerData
   * @return paymentAcquirerData
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_ACQUIRER_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentAcquirerData getPaymentAcquirerData() {
    return paymentAcquirerData;
  }


 /**
  * paymentAcquirerData
  *
  * @param paymentAcquirerData
  */ 
  @JsonProperty(JSON_PROPERTY_PAYMENT_ACQUIRER_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentAcquirerData(PaymentAcquirerData paymentAcquirerData) {
    this.paymentAcquirerData = paymentAcquirerData;
  }


  /**
   * Return true if this PaymentResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentResult paymentResult = (PaymentResult) o;
    return Objects.equals(this.paymentType, paymentResult.paymentType) &&
        Objects.equals(this.paymentInstrumentData, paymentResult.paymentInstrumentData) &&
        Objects.equals(this.amountsResp, paymentResult.amountsResp) &&
        Objects.equals(this.instalment, paymentResult.instalment) &&
        Objects.equals(this.currencyConversion, paymentResult.currencyConversion) &&
        Objects.equals(this.merchantOverrideFlag, paymentResult.merchantOverrideFlag) &&
        Objects.equals(this.capturedSignature, paymentResult.capturedSignature) &&
        Objects.equals(this.protectedSignature, paymentResult.protectedSignature) &&
        Objects.equals(this.customerLanguage, paymentResult.customerLanguage) &&
        Objects.equals(this.onlineFlag, paymentResult.onlineFlag) &&
        Objects.equals(this.authenticationMethod, paymentResult.authenticationMethod) &&
        Objects.equals(this.validityDate, paymentResult.validityDate) &&
        Objects.equals(this.paymentAcquirerData, paymentResult.paymentAcquirerData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentType, paymentInstrumentData, amountsResp, instalment, currencyConversion, merchantOverrideFlag, capturedSignature, protectedSignature, customerLanguage, onlineFlag, authenticationMethod, validityDate, paymentAcquirerData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentResult {\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentInstrumentData: ").append(toIndentedString(paymentInstrumentData)).append("\n");
    sb.append("    amountsResp: ").append(toIndentedString(amountsResp)).append("\n");
    sb.append("    instalment: ").append(toIndentedString(instalment)).append("\n");
    sb.append("    currencyConversion: ").append(toIndentedString(currencyConversion)).append("\n");
    sb.append("    merchantOverrideFlag: ").append(toIndentedString(merchantOverrideFlag)).append("\n");
    sb.append("    capturedSignature: ").append(toIndentedString(capturedSignature)).append("\n");
    sb.append("    protectedSignature: ").append(toIndentedString(protectedSignature)).append("\n");
    sb.append("    customerLanguage: ").append(toIndentedString(customerLanguage)).append("\n");
    sb.append("    onlineFlag: ").append(toIndentedString(onlineFlag)).append("\n");
    sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
    sb.append("    validityDate: ").append(toIndentedString(validityDate)).append("\n");
    sb.append("    paymentAcquirerData: ").append(toIndentedString(paymentAcquirerData)).append("\n");
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
   * Create an instance of PaymentResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentResult
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentResult
   */
  public static PaymentResult fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentResult.class);
  }
/**
  * Convert an instance of PaymentResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
