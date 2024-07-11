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
 * PaymentDetails
 */
@JsonPropertyOrder({
  PaymentDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  PaymentDetails.JSON_PROPERTY_TYPE
})

public class PaymentDetails {
  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  /**
   * The payment method type.
   */
  public enum TypeEnum {
    ALIPAY("alipay"),
    
    MULTIBANCO("multibanco"),
    
    PAYBRIGHT("paybright"),
    
    PAYNOW("paynow"),
    
    AFFIRM("affirm"),
    
    AFFIRM_POS("affirm_pos"),
    
    TRUSTLY("trustly"),
    
    TRUSTLYVECTOR("trustlyvector"),
    
    ONEY("oney"),
    
    FACILYPAY("facilypay"),
    
    FACILYPAY_3X("facilypay_3x"),
    
    FACILYPAY_4X("facilypay_4x"),
    
    FACILYPAY_6X("facilypay_6x"),
    
    FACILYPAY_10X("facilypay_10x"),
    
    FACILYPAY_12X("facilypay_12x"),
    
    UNIONPAY("unionpay"),
    
    KCP_BANKTRANSFER("kcp_banktransfer"),
    
    KCP_PAYCO("kcp_payco"),
    
    KCP_CREDITCARD("kcp_creditcard"),
    
    WECHATPAYSDK("wechatpaySDK"),
    
    WECHATPAYQR("wechatpayQR"),
    
    WECHATPAYWEB("wechatpayWeb"),
    
    MOLPAY_BOOST("molpay_boost"),
    
    WALLET_IN("wallet_IN"),
    
    PAYU_IN_CASHCARD("payu_IN_cashcard"),
    
    PAYU_IN_NB("payu_IN_nb"),
    
    UPI_QR("upi_qr"),
    
    PAYTM("paytm"),
    
    MOLPAY_EBANKING_VN("molpay_ebanking_VN"),
    
    EBANKING_FI("ebanking_FI"),
    
    MOLPAY_EBANKING_MY("molpay_ebanking_MY"),
    
    MOLPAY_EBANKING_DIRECT_MY("molpay_ebanking_direct_MY"),
    
    SWISH("swish"),
    
    PIX("pix"),
    
    WALLEY("walley"),
    
    WALLEY_B2B("walley_b2b"),
    
    ALMA("alma"),
    
    PAYPO("paypo"),
    
    SCALAPAY("scalapay"),
    
    SCALAPAY_3X("scalapay_3x"),
    
    SCALAPAY_4X("scalapay_4x"),
    
    MOLPAY_FPX("molpay_fpx"),
    
    KONBINI("konbini"),
    
    DIRECTEBANKING("directEbanking"),
    
    BOLETOBANCARIO("boletobancario"),
    
    NETELLER("neteller"),
    
    PAYSAFECARD("paysafecard"),
    
    CASHTICKET("cashticket"),
    
    IKANO("ikano"),
    
    KARENMILLEN("karenmillen"),
    
    OASIS("oasis"),
    
    WAREHOUSE("warehouse"),
    
    PRIMEIROPAY_BOLETO("primeiropay_boleto"),
    
    MADA("mada"),
    
    BENEFIT("benefit"),
    
    KNET("knet"),
    
    OMANNET("omannet"),
    
    GOPAY_WALLET("gopay_wallet"),
    
    KCP_NAVERPAY("kcp_naverpay"),
    
    ONLINEBANKING_IN("onlinebanking_IN"),
    
    FAWRY("fawry"),
    
    ATOME("atome"),
    
    MONEYBOOKERS("moneybookers"),
    
    NAPS("naps"),
    
    NORDEA("nordea"),
    
    BOLETOBANCARIO_BRADESCO("boletobancario_bradesco"),
    
    BOLETOBANCARIO_ITAU("boletobancario_itau"),
    
    BOLETOBANCARIO_SANTANDER("boletobancario_santander"),
    
    BOLETOBANCARIO_BANCODOBRASIL("boletobancario_bancodobrasil"),
    
    BOLETOBANCARIO_HSBC("boletobancario_hsbc"),
    
    MOLPAY_MAYBANK2U("molpay_maybank2u"),
    
    MOLPAY_CIMB("molpay_cimb"),
    
    MOLPAY_RHB("molpay_rhb"),
    
    MOLPAY_AMB("molpay_amb"),
    
    MOLPAY_HLB("molpay_hlb"),
    
    MOLPAY_AFFIN_EPG("molpay_affin_epg"),
    
    MOLPAY_BANKISLAM("molpay_bankislam"),
    
    MOLPAY_PUBLICBANK("molpay_publicbank"),
    
    FPX_AGROBANK("fpx_agrobank"),
    
    TOUCHNGO("touchngo"),
    
    MAYBANK2U_MAE("maybank2u_mae"),
    
    DUITNOW("duitnow"),
    
    PROMPTPAY("promptpay"),
    
    TWINT_POS("twint_pos"),
    
    ALIPAY_HK("alipay_hk"),
    
    ALIPAY_HK_WEB("alipay_hk_web"),
    
    ALIPAY_HK_WAP("alipay_hk_wap"),
    
    ALIPAY_WAP("alipay_wap"),
    
    BALANCEPLATFORM("balanceplatform");

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

  public PaymentDetails() { 
  }

  public PaymentDetails checkoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

   /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
  **/
  @ApiModelProperty(value = "The checkout attempt identifier.")
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }


 /**
  * The checkout attempt identifier.
  *
  * @param checkoutAttemptId
  */ 
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }


  public PaymentDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The payment method type.
   * @return type
  **/
  @ApiModelProperty(value = "The payment method type.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


 /**
  * The payment method type.
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this PaymentDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDetails paymentDetails = (PaymentDetails) o;
    return Objects.equals(this.checkoutAttemptId, paymentDetails.checkoutAttemptId) &&
        Objects.equals(this.type, paymentDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutAttemptId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetails {\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
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
   * Create an instance of PaymentDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentDetails
   */
  public static PaymentDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentDetails.class);
  }
/**
  * Convert an instance of PaymentDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

