/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.configurationwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.configurationwebhooks.BulkAddress;
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
 * CardConfiguration
 */
@JsonPropertyOrder({
  CardConfiguration.JSON_PROPERTY_ACTIVATION,
  CardConfiguration.JSON_PROPERTY_ACTIVATION_URL,
  CardConfiguration.JSON_PROPERTY_BULK_ADDRESS,
  CardConfiguration.JSON_PROPERTY_CARD_IMAGE_ID,
  CardConfiguration.JSON_PROPERTY_CARRIER,
  CardConfiguration.JSON_PROPERTY_CARRIER_IMAGE_ID,
  CardConfiguration.JSON_PROPERTY_CONFIGURATION_PROFILE_ID,
  CardConfiguration.JSON_PROPERTY_CURRENCY,
  CardConfiguration.JSON_PROPERTY_ENVELOPE,
  CardConfiguration.JSON_PROPERTY_INSERT,
  CardConfiguration.JSON_PROPERTY_LANGUAGE,
  CardConfiguration.JSON_PROPERTY_LOGO_IMAGE_ID,
  CardConfiguration.JSON_PROPERTY_PIN_MAILER,
  CardConfiguration.JSON_PROPERTY_SHIPMENT_METHOD
})

public class CardConfiguration {
  public static final String JSON_PROPERTY_ACTIVATION = "activation";
  private String activation;

  public static final String JSON_PROPERTY_ACTIVATION_URL = "activationUrl";
  private String activationUrl;

  public static final String JSON_PROPERTY_BULK_ADDRESS = "bulkAddress";
  private BulkAddress bulkAddress;

  public static final String JSON_PROPERTY_CARD_IMAGE_ID = "cardImageId";
  private String cardImageId;

  public static final String JSON_PROPERTY_CARRIER = "carrier";
  private String carrier;

  public static final String JSON_PROPERTY_CARRIER_IMAGE_ID = "carrierImageId";
  private String carrierImageId;

  public static final String JSON_PROPERTY_CONFIGURATION_PROFILE_ID = "configurationProfileId";
  private String configurationProfileId;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_ENVELOPE = "envelope";
  private String envelope;

  public static final String JSON_PROPERTY_INSERT = "insert";
  private String insert;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_LOGO_IMAGE_ID = "logoImageId";
  private String logoImageId;

  public static final String JSON_PROPERTY_PIN_MAILER = "pinMailer";
  private String pinMailer;

  public static final String JSON_PROPERTY_SHIPMENT_METHOD = "shipmentMethod";
  private String shipmentMethod;

  public CardConfiguration() { 
  }

  /**
   * Overrides the activation label design ID defined in the &#x60;configurationProfileId&#x60;. The activation label is attached to the card and contains the activation instructions.
   *
   * @param activation
   * @return the current {@code CardConfiguration} instance, allowing for method chaining
   */
  public CardConfiguration activation(String activation) {
    this.activation = activation;
    return this;
  }

  /**
   * Overrides the activation label design ID defined in the &#x60;configurationProfileId&#x60;. The activation label is attached to the card and contains the activation instructions.
   * @return activation
   */
  @ApiModelProperty(value = "Overrides the activation label design ID defined in the `configurationProfileId`. The activation label is attached to the card and contains the activation instructions.")
  @JsonProperty(JSON_PROPERTY_ACTIVATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getActivation() {
    return activation;
  }

  /**
   * Overrides the activation label design ID defined in the &#x60;configurationProfileId&#x60;. The activation label is attached to the card and contains the activation instructions.
   *
   * @param activation
   */ 
  @JsonProperty(JSON_PROPERTY_ACTIVATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActivation(String activation) {
    this.activation = activation;
  }

  /**
   * Your app&#39;s URL, if you want to activate cards through your app. For example, **my-app://ref1236a7d**. A QR code is created based on this URL, and is included in the carrier. Before you use this field, reach out to your Adyen contact to set up the QR code process.   Maximum length: 255 characters.
   *
   * @param activationUrl
   * @return the current {@code CardConfiguration} instance, allowing for method chaining
   */
  public CardConfiguration activationUrl(String activationUrl) {
    this.activationUrl = activationUrl;
    return this;
  }

  /**
   * Your app&#39;s URL, if you want to activate cards through your app. For example, **my-app://ref1236a7d**. A QR code is created based on this URL, and is included in the carrier. Before you use this field, reach out to your Adyen contact to set up the QR code process.   Maximum length: 255 characters.
   * @return activationUrl
   */
  @ApiModelProperty(value = "Your app's URL, if you want to activate cards through your app. For example, **my-app://ref1236a7d**. A QR code is created based on this URL, and is included in the carrier. Before you use this field, reach out to your Adyen contact to set up the QR code process.   Maximum length: 255 characters.")
  @JsonProperty(JSON_PROPERTY_ACTIVATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getActivationUrl() {
    return activationUrl;
  }

  /**
   * Your app&#39;s URL, if you want to activate cards through your app. For example, **my-app://ref1236a7d**. A QR code is created based on this URL, and is included in the carrier. Before you use this field, reach out to your Adyen contact to set up the QR code process.   Maximum length: 255 characters.
   *
   * @param activationUrl
   */ 
  @JsonProperty(JSON_PROPERTY_ACTIVATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActivationUrl(String activationUrl) {
    this.activationUrl = activationUrl;
  }

  /**
   * bulkAddress
   *
   * @param bulkAddress
   * @return the current {@code CardConfiguration} instance, allowing for method chaining
   */
  public CardConfiguration bulkAddress(BulkAddress bulkAddress) {
    this.bulkAddress = bulkAddress;
    return this;
  }

  /**
   * bulkAddress
   * @return bulkAddress
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BULK_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BulkAddress getBulkAddress() {
    return bulkAddress;
  }

  /**
   * bulkAddress
   *
   * @param bulkAddress
   */ 
  @JsonProperty(JSON_PROPERTY_BULK_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBulkAddress(BulkAddress bulkAddress) {
    this.bulkAddress = bulkAddress;
  }

  /**
   * The ID of the card image. This is the image that will be printed on the full front of the card.
   *
   * @param cardImageId
   * @return the current {@code CardConfiguration} instance, allowing for method chaining
   */
  public CardConfiguration cardImageId(String cardImageId) {
    this.cardImageId = cardImageId;
    return this;
  }

  /**
   * The ID of the card image. This is the image that will be printed on the full front of the card.
   * @return cardImageId
   */
  @ApiModelProperty(value = "The ID of the card image. This is the image that will be printed on the full front of the card.")
  @JsonProperty(JSON_PROPERTY_CARD_IMAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCardImageId() {
    return cardImageId;
  }

  /**
   * The ID of the card image. This is the image that will be printed on the full front of the card.
   *
   * @param cardImageId
   */ 
  @JsonProperty(JSON_PROPERTY_CARD_IMAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardImageId(String cardImageId) {
    this.cardImageId = cardImageId;
  }

  /**
   * Overrides the carrier design ID defined in the &#x60;configurationProfileId&#x60;. The carrier is the letter or packaging to which the card is attached.
   *
   * @param carrier
   * @return the current {@code CardConfiguration} instance, allowing for method chaining
   */
  public CardConfiguration carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * Overrides the carrier design ID defined in the &#x60;configurationProfileId&#x60;. The carrier is the letter or packaging to which the card is attached.
   * @return carrier
   */
  @ApiModelProperty(value = "Overrides the carrier design ID defined in the `configurationProfileId`. The carrier is the letter or packaging to which the card is attached.")
  @JsonProperty(JSON_PROPERTY_CARRIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCarrier() {
    return carrier;
  }

  /**
   * Overrides the carrier design ID defined in the &#x60;configurationProfileId&#x60;. The carrier is the letter or packaging to which the card is attached.
   *
   * @param carrier
   */ 
  @JsonProperty(JSON_PROPERTY_CARRIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  /**
   * The ID of the carrier image. This is the image that will printed on the letter to which the card is attached.
   *
   * @param carrierImageId
   * @return the current {@code CardConfiguration} instance, allowing for method chaining
   */
  public CardConfiguration carrierImageId(String carrierImageId) {
    this.carrierImageId = carrierImageId;
    return this;
  }

  /**
   * The ID of the carrier image. This is the image that will printed on the letter to which the card is attached.
   * @return carrierImageId
   */
  @ApiModelProperty(value = "The ID of the carrier image. This is the image that will printed on the letter to which the card is attached.")
  @JsonProperty(JSON_PROPERTY_CARRIER_IMAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCarrierImageId() {
    return carrierImageId;
  }

  /**
   * The ID of the carrier image. This is the image that will printed on the letter to which the card is attached.
   *
   * @param carrierImageId
   */ 
  @JsonProperty(JSON_PROPERTY_CARRIER_IMAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarrierImageId(String carrierImageId) {
    this.carrierImageId = carrierImageId;
  }

  /**
   * The ID of the card configuration profile that contains the settings of the card. For example, the envelope and PIN mailer designs or the logistics company handling the shipment. All the settings in the profile are applied to the card, unless you provide other fields to override them.  For example, send the &#x60;shipmentMethod&#x60; to override the logistics company defined in the card configuration profile.
   *
   * @param configurationProfileId
   * @return the current {@code CardConfiguration} instance, allowing for method chaining
   */
  public CardConfiguration configurationProfileId(String configurationProfileId) {
    this.configurationProfileId = configurationProfileId;
    return this;
  }

  /**
   * The ID of the card configuration profile that contains the settings of the card. For example, the envelope and PIN mailer designs or the logistics company handling the shipment. All the settings in the profile are applied to the card, unless you provide other fields to override them.  For example, send the &#x60;shipmentMethod&#x60; to override the logistics company defined in the card configuration profile.
   * @return configurationProfileId
   */
  @ApiModelProperty(required = true, value = "The ID of the card configuration profile that contains the settings of the card. For example, the envelope and PIN mailer designs or the logistics company handling the shipment. All the settings in the profile are applied to the card, unless you provide other fields to override them.  For example, send the `shipmentMethod` to override the logistics company defined in the card configuration profile.")
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getConfigurationProfileId() {
    return configurationProfileId;
  }

  /**
   * The ID of the card configuration profile that contains the settings of the card. For example, the envelope and PIN mailer designs or the logistics company handling the shipment. All the settings in the profile are applied to the card, unless you provide other fields to override them.  For example, send the &#x60;shipmentMethod&#x60; to override the logistics company defined in the card configuration profile.
   *
   * @param configurationProfileId
   */ 
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigurationProfileId(String configurationProfileId) {
    this.configurationProfileId = configurationProfileId;
  }

  /**
   * The three-letter [ISO-4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the card. For example, **EUR**.
   *
   * @param currency
   * @return the current {@code CardConfiguration} instance, allowing for method chaining
   */
  public CardConfiguration currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The three-letter [ISO-4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the card. For example, **EUR**.
   * @return currency
   */
  @ApiModelProperty(value = "The three-letter [ISO-4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the card. For example, **EUR**.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCurrency() {
    return currency;
  }

  /**
   * The three-letter [ISO-4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the card. For example, **EUR**.
   *
   * @param currency
   */ 
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * Overrides the envelope design ID defined in the &#x60;configurationProfileId&#x60;. 
   *
   * @param envelope
   * @return the current {@code CardConfiguration} instance, allowing for method chaining
   */
  public CardConfiguration envelope(String envelope) {
    this.envelope = envelope;
    return this;
  }

  /**
   * Overrides the envelope design ID defined in the &#x60;configurationProfileId&#x60;. 
   * @return envelope
   */
  @ApiModelProperty(value = "Overrides the envelope design ID defined in the `configurationProfileId`. ")
  @JsonProperty(JSON_PROPERTY_ENVELOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnvelope() {
    return envelope;
  }

  /**
   * Overrides the envelope design ID defined in the &#x60;configurationProfileId&#x60;. 
   *
   * @param envelope
   */ 
  @JsonProperty(JSON_PROPERTY_ENVELOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvelope(String envelope) {
    this.envelope = envelope;
  }

  /**
   * Overrides the insert design ID defined in the &#x60;configurationProfileId&#x60;. An insert is any additional material, such as marketing materials, that are shipped together with the card.
   *
   * @param insert
   * @return the current {@code CardConfiguration} instance, allowing for method chaining
   */
  public CardConfiguration insert(String insert) {
    this.insert = insert;
    return this;
  }

  /**
   * Overrides the insert design ID defined in the &#x60;configurationProfileId&#x60;. An insert is any additional material, such as marketing materials, that are shipped together with the card.
   * @return insert
   */
  @ApiModelProperty(value = "Overrides the insert design ID defined in the `configurationProfileId`. An insert is any additional material, such as marketing materials, that are shipped together with the card.")
  @JsonProperty(JSON_PROPERTY_INSERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getInsert() {
    return insert;
  }

  /**
   * Overrides the insert design ID defined in the &#x60;configurationProfileId&#x60;. An insert is any additional material, such as marketing materials, that are shipped together with the card.
   *
   * @param insert
   */ 
  @JsonProperty(JSON_PROPERTY_INSERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsert(String insert) {
    this.insert = insert;
  }

  /**
   * The two-letter [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code of the card. For example, **en**.
   *
   * @param language
   * @return the current {@code CardConfiguration} instance, allowing for method chaining
   */
  public CardConfiguration language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The two-letter [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code of the card. For example, **en**.
   * @return language
   */
  @ApiModelProperty(value = "The two-letter [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code of the card. For example, **en**.")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLanguage() {
    return language;
  }

  /**
   * The two-letter [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code of the card. For example, **en**.
   *
   * @param language
   */ 
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * The ID of the logo image. This is the image that will be printed on the partial front of the card, such as a logo on the upper right corner.
   *
   * @param logoImageId
   * @return the current {@code CardConfiguration} instance, allowing for method chaining
   */
  public CardConfiguration logoImageId(String logoImageId) {
    this.logoImageId = logoImageId;
    return this;
  }

  /**
   * The ID of the logo image. This is the image that will be printed on the partial front of the card, such as a logo on the upper right corner.
   * @return logoImageId
   */
  @ApiModelProperty(value = "The ID of the logo image. This is the image that will be printed on the partial front of the card, such as a logo on the upper right corner.")
  @JsonProperty(JSON_PROPERTY_LOGO_IMAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLogoImageId() {
    return logoImageId;
  }

  /**
   * The ID of the logo image. This is the image that will be printed on the partial front of the card, such as a logo on the upper right corner.
   *
   * @param logoImageId
   */ 
  @JsonProperty(JSON_PROPERTY_LOGO_IMAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoImageId(String logoImageId) {
    this.logoImageId = logoImageId;
  }

  /**
   * Overrides the PIN mailer design ID defined in the &#x60;configurationProfileId&#x60;. The PIN mailer is the letter on which the PIN is printed.
   *
   * @param pinMailer
   * @return the current {@code CardConfiguration} instance, allowing for method chaining
   */
  public CardConfiguration pinMailer(String pinMailer) {
    this.pinMailer = pinMailer;
    return this;
  }

  /**
   * Overrides the PIN mailer design ID defined in the &#x60;configurationProfileId&#x60;. The PIN mailer is the letter on which the PIN is printed.
   * @return pinMailer
   */
  @ApiModelProperty(value = "Overrides the PIN mailer design ID defined in the `configurationProfileId`. The PIN mailer is the letter on which the PIN is printed.")
  @JsonProperty(JSON_PROPERTY_PIN_MAILER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPinMailer() {
    return pinMailer;
  }

  /**
   * Overrides the PIN mailer design ID defined in the &#x60;configurationProfileId&#x60;. The PIN mailer is the letter on which the PIN is printed.
   *
   * @param pinMailer
   */ 
  @JsonProperty(JSON_PROPERTY_PIN_MAILER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPinMailer(String pinMailer) {
    this.pinMailer = pinMailer;
  }

  /**
   * Overrides the logistics company defined in the &#x60;configurationProfileId&#x60;.
   *
   * @param shipmentMethod
   * @return the current {@code CardConfiguration} instance, allowing for method chaining
   */
  public CardConfiguration shipmentMethod(String shipmentMethod) {
    this.shipmentMethod = shipmentMethod;
    return this;
  }

  /**
   * Overrides the logistics company defined in the &#x60;configurationProfileId&#x60;.
   * @return shipmentMethod
   */
  @ApiModelProperty(value = "Overrides the logistics company defined in the `configurationProfileId`.")
  @JsonProperty(JSON_PROPERTY_SHIPMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getShipmentMethod() {
    return shipmentMethod;
  }

  /**
   * Overrides the logistics company defined in the &#x60;configurationProfileId&#x60;.
   *
   * @param shipmentMethod
   */ 
  @JsonProperty(JSON_PROPERTY_SHIPMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShipmentMethod(String shipmentMethod) {
    this.shipmentMethod = shipmentMethod;
  }

  /**
   * Return true if this CardConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardConfiguration cardConfiguration = (CardConfiguration) o;
    return Objects.equals(this.activation, cardConfiguration.activation) &&
        Objects.equals(this.activationUrl, cardConfiguration.activationUrl) &&
        Objects.equals(this.bulkAddress, cardConfiguration.bulkAddress) &&
        Objects.equals(this.cardImageId, cardConfiguration.cardImageId) &&
        Objects.equals(this.carrier, cardConfiguration.carrier) &&
        Objects.equals(this.carrierImageId, cardConfiguration.carrierImageId) &&
        Objects.equals(this.configurationProfileId, cardConfiguration.configurationProfileId) &&
        Objects.equals(this.currency, cardConfiguration.currency) &&
        Objects.equals(this.envelope, cardConfiguration.envelope) &&
        Objects.equals(this.insert, cardConfiguration.insert) &&
        Objects.equals(this.language, cardConfiguration.language) &&
        Objects.equals(this.logoImageId, cardConfiguration.logoImageId) &&
        Objects.equals(this.pinMailer, cardConfiguration.pinMailer) &&
        Objects.equals(this.shipmentMethod, cardConfiguration.shipmentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activation, activationUrl, bulkAddress, cardImageId, carrier, carrierImageId, configurationProfileId, currency, envelope, insert, language, logoImageId, pinMailer, shipmentMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardConfiguration {\n");
    sb.append("    activation: ").append(toIndentedString(activation)).append("\n");
    sb.append("    activationUrl: ").append(toIndentedString(activationUrl)).append("\n");
    sb.append("    bulkAddress: ").append(toIndentedString(bulkAddress)).append("\n");
    sb.append("    cardImageId: ").append(toIndentedString(cardImageId)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    carrierImageId: ").append(toIndentedString(carrierImageId)).append("\n");
    sb.append("    configurationProfileId: ").append(toIndentedString(configurationProfileId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    envelope: ").append(toIndentedString(envelope)).append("\n");
    sb.append("    insert: ").append(toIndentedString(insert)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    logoImageId: ").append(toIndentedString(logoImageId)).append("\n");
    sb.append("    pinMailer: ").append(toIndentedString(pinMailer)).append("\n");
    sb.append("    shipmentMethod: ").append(toIndentedString(shipmentMethod)).append("\n");
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
   * Create an instance of CardConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CardConfiguration
   * @throws JsonProcessingException if the JSON string is invalid with respect to CardConfiguration
   */
  public static CardConfiguration fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CardConfiguration.class);
  }
/**
  * Convert an instance of CardConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
