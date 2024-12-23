/*
 * Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.management.AccelInfo;
import com.adyen.model.management.BcmcInfo;
import com.adyen.model.management.CartesBancairesInfo;
import com.adyen.model.management.GenericPmWithTdiInfo;
import com.adyen.model.management.NyceInfo;
import com.adyen.model.management.PulseInfo;
import com.adyen.model.management.StarInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * UpdatePaymentMethodInfo
 */
@JsonPropertyOrder({
  UpdatePaymentMethodInfo.JSON_PROPERTY_ACCEL,
  UpdatePaymentMethodInfo.JSON_PROPERTY_BCMC,
  UpdatePaymentMethodInfo.JSON_PROPERTY_CARTES_BANCAIRES,
  UpdatePaymentMethodInfo.JSON_PROPERTY_COUNTRIES,
  UpdatePaymentMethodInfo.JSON_PROPERTY_CUP,
  UpdatePaymentMethodInfo.JSON_PROPERTY_CURRENCIES,
  UpdatePaymentMethodInfo.JSON_PROPERTY_CUSTOM_ROUTING_FLAGS,
  UpdatePaymentMethodInfo.JSON_PROPERTY_DINERS,
  UpdatePaymentMethodInfo.JSON_PROPERTY_DISCOVER,
  UpdatePaymentMethodInfo.JSON_PROPERTY_EFTPOS_AUSTRALIA,
  UpdatePaymentMethodInfo.JSON_PROPERTY_ENABLED,
  UpdatePaymentMethodInfo.JSON_PROPERTY_GIROCARD,
  UpdatePaymentMethodInfo.JSON_PROPERTY_IDEAL,
  UpdatePaymentMethodInfo.JSON_PROPERTY_INTERAC_CARD,
  UpdatePaymentMethodInfo.JSON_PROPERTY_JCB,
  UpdatePaymentMethodInfo.JSON_PROPERTY_MAESTRO,
  UpdatePaymentMethodInfo.JSON_PROPERTY_MC,
  UpdatePaymentMethodInfo.JSON_PROPERTY_NYCE,
  UpdatePaymentMethodInfo.JSON_PROPERTY_PULSE,
  UpdatePaymentMethodInfo.JSON_PROPERTY_STAR,
  UpdatePaymentMethodInfo.JSON_PROPERTY_STORE_ID,
  UpdatePaymentMethodInfo.JSON_PROPERTY_STORE_IDS,
  UpdatePaymentMethodInfo.JSON_PROPERTY_VISA
})

public class UpdatePaymentMethodInfo {
  public static final String JSON_PROPERTY_ACCEL = "accel";
  private AccelInfo accel;

  public static final String JSON_PROPERTY_BCMC = "bcmc";
  private BcmcInfo bcmc;

  public static final String JSON_PROPERTY_CARTES_BANCAIRES = "cartesBancaires";
  private CartesBancairesInfo cartesBancaires;

  public static final String JSON_PROPERTY_COUNTRIES = "countries";
  private List<String> countries = null;

  public static final String JSON_PROPERTY_CUP = "cup";
  private GenericPmWithTdiInfo cup;

  public static final String JSON_PROPERTY_CURRENCIES = "currencies";
  private List<String> currencies = null;

  public static final String JSON_PROPERTY_CUSTOM_ROUTING_FLAGS = "customRoutingFlags";
  private List<String> customRoutingFlags = null;

  public static final String JSON_PROPERTY_DINERS = "diners";
  private GenericPmWithTdiInfo diners;

  public static final String JSON_PROPERTY_DISCOVER = "discover";
  private GenericPmWithTdiInfo discover;

  public static final String JSON_PROPERTY_EFTPOS_AUSTRALIA = "eftpos_australia";
  private GenericPmWithTdiInfo eftposAustralia;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_GIROCARD = "girocard";
  private GenericPmWithTdiInfo girocard;

  public static final String JSON_PROPERTY_IDEAL = "ideal";
  private GenericPmWithTdiInfo ideal;

  public static final String JSON_PROPERTY_INTERAC_CARD = "interac_card";
  private GenericPmWithTdiInfo interacCard;

  public static final String JSON_PROPERTY_JCB = "jcb";
  private GenericPmWithTdiInfo jcb;

  public static final String JSON_PROPERTY_MAESTRO = "maestro";
  private GenericPmWithTdiInfo maestro;

  public static final String JSON_PROPERTY_MC = "mc";
  private GenericPmWithTdiInfo mc;

  public static final String JSON_PROPERTY_NYCE = "nyce";
  private NyceInfo nyce;

  public static final String JSON_PROPERTY_PULSE = "pulse";
  private PulseInfo pulse;

  public static final String JSON_PROPERTY_STAR = "star";
  private StarInfo star;

  public static final String JSON_PROPERTY_STORE_ID = "storeId";
  private String storeId;

  public static final String JSON_PROPERTY_STORE_IDS = "storeIds";
  @Deprecated // deprecated since Management API v3: Use `storeId` instead. Only one store per payment method is allowed.
  private List<String> storeIds = null;

  public static final String JSON_PROPERTY_VISA = "visa";
  private GenericPmWithTdiInfo visa;

  public UpdatePaymentMethodInfo() { 
  }

  /**
   * accel
   *
   * @param accel
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo accel(AccelInfo accel) {
    this.accel = accel;
    return this;
  }

  /**
   * accel
   * @return accel
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AccelInfo getAccel() {
    return accel;
  }

  /**
   * accel
   *
   * @param accel
   */ 
  @JsonProperty(JSON_PROPERTY_ACCEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccel(AccelInfo accel) {
    this.accel = accel;
  }

  /**
   * bcmc
   *
   * @param bcmc
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo bcmc(BcmcInfo bcmc) {
    this.bcmc = bcmc;
    return this;
  }

  /**
   * bcmc
   * @return bcmc
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BCMC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BcmcInfo getBcmc() {
    return bcmc;
  }

  /**
   * bcmc
   *
   * @param bcmc
   */ 
  @JsonProperty(JSON_PROPERTY_BCMC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBcmc(BcmcInfo bcmc) {
    this.bcmc = bcmc;
  }

  /**
   * cartesBancaires
   *
   * @param cartesBancaires
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo cartesBancaires(CartesBancairesInfo cartesBancaires) {
    this.cartesBancaires = cartesBancaires;
    return this;
  }

  /**
   * cartesBancaires
   * @return cartesBancaires
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CARTES_BANCAIRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CartesBancairesInfo getCartesBancaires() {
    return cartesBancaires;
  }

  /**
   * cartesBancaires
   *
   * @param cartesBancaires
   */ 
  @JsonProperty(JSON_PROPERTY_CARTES_BANCAIRES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCartesBancaires(CartesBancairesInfo cartesBancaires) {
    this.cartesBancaires = cartesBancaires;
  }

  /**
   * The list of countries where a payment method is available. By default, all countries supported by the payment method.
   *
   * @param countries
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo countries(List<String> countries) {
    this.countries = countries;
    return this;
  }

  public UpdatePaymentMethodInfo addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

  /**
   * The list of countries where a payment method is available. By default, all countries supported by the payment method.
   * @return countries
   */
  @ApiModelProperty(value = "The list of countries where a payment method is available. By default, all countries supported by the payment method.")
  @JsonProperty(JSON_PROPERTY_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCountries() {
    return countries;
  }

  /**
   * The list of countries where a payment method is available. By default, all countries supported by the payment method.
   *
   * @param countries
   */ 
  @JsonProperty(JSON_PROPERTY_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountries(List<String> countries) {
    this.countries = countries;
  }

  /**
   * cup
   *
   * @param cup
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo cup(GenericPmWithTdiInfo cup) {
    this.cup = cup;
    return this;
  }

  /**
   * cup
   * @return cup
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GenericPmWithTdiInfo getCup() {
    return cup;
  }

  /**
   * cup
   *
   * @param cup
   */ 
  @JsonProperty(JSON_PROPERTY_CUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCup(GenericPmWithTdiInfo cup) {
    this.cup = cup;
  }

  /**
   * The list of currencies that a payment method supports. By default, all currencies supported by the payment method.
   *
   * @param currencies
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo currencies(List<String> currencies) {
    this.currencies = currencies;
    return this;
  }

  public UpdatePaymentMethodInfo addCurrenciesItem(String currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new ArrayList<>();
    }
    this.currencies.add(currenciesItem);
    return this;
  }

  /**
   * The list of currencies that a payment method supports. By default, all currencies supported by the payment method.
   * @return currencies
   */
  @ApiModelProperty(value = "The list of currencies that a payment method supports. By default, all currencies supported by the payment method.")
  @JsonProperty(JSON_PROPERTY_CURRENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCurrencies() {
    return currencies;
  }

  /**
   * The list of currencies that a payment method supports. By default, all currencies supported by the payment method.
   *
   * @param currencies
   */ 
  @JsonProperty(JSON_PROPERTY_CURRENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencies(List<String> currencies) {
    this.currencies = currencies;
  }

  /**
   * Custom routing flags for acquirer routing.
   *
   * @param customRoutingFlags
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo customRoutingFlags(List<String> customRoutingFlags) {
    this.customRoutingFlags = customRoutingFlags;
    return this;
  }

  public UpdatePaymentMethodInfo addCustomRoutingFlagsItem(String customRoutingFlagsItem) {
    if (this.customRoutingFlags == null) {
      this.customRoutingFlags = new ArrayList<>();
    }
    this.customRoutingFlags.add(customRoutingFlagsItem);
    return this;
  }

  /**
   * Custom routing flags for acquirer routing.
   * @return customRoutingFlags
   */
  @ApiModelProperty(value = "Custom routing flags for acquirer routing.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_ROUTING_FLAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCustomRoutingFlags() {
    return customRoutingFlags;
  }

  /**
   * Custom routing flags for acquirer routing.
   *
   * @param customRoutingFlags
   */ 
  @JsonProperty(JSON_PROPERTY_CUSTOM_ROUTING_FLAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomRoutingFlags(List<String> customRoutingFlags) {
    this.customRoutingFlags = customRoutingFlags;
  }

  /**
   * diners
   *
   * @param diners
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo diners(GenericPmWithTdiInfo diners) {
    this.diners = diners;
    return this;
  }

  /**
   * diners
   * @return diners
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DINERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GenericPmWithTdiInfo getDiners() {
    return diners;
  }

  /**
   * diners
   *
   * @param diners
   */ 
  @JsonProperty(JSON_PROPERTY_DINERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiners(GenericPmWithTdiInfo diners) {
    this.diners = diners;
  }

  /**
   * discover
   *
   * @param discover
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo discover(GenericPmWithTdiInfo discover) {
    this.discover = discover;
    return this;
  }

  /**
   * discover
   * @return discover
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISCOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GenericPmWithTdiInfo getDiscover() {
    return discover;
  }

  /**
   * discover
   *
   * @param discover
   */ 
  @JsonProperty(JSON_PROPERTY_DISCOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscover(GenericPmWithTdiInfo discover) {
    this.discover = discover;
  }

  /**
   * eftposAustralia
   *
   * @param eftposAustralia
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo eftposAustralia(GenericPmWithTdiInfo eftposAustralia) {
    this.eftposAustralia = eftposAustralia;
    return this;
  }

  /**
   * eftposAustralia
   * @return eftposAustralia
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EFTPOS_AUSTRALIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GenericPmWithTdiInfo getEftposAustralia() {
    return eftposAustralia;
  }

  /**
   * eftposAustralia
   *
   * @param eftposAustralia
   */ 
  @JsonProperty(JSON_PROPERTY_EFTPOS_AUSTRALIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEftposAustralia(GenericPmWithTdiInfo eftposAustralia) {
    this.eftposAustralia = eftposAustralia;
  }

  /**
   * Indicates whether the payment method is enabled (**true**) or disabled (**false**).
   *
   * @param enabled
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether the payment method is enabled (**true**) or disabled (**false**).
   * @return enabled
   */
  @ApiModelProperty(value = "Indicates whether the payment method is enabled (**true**) or disabled (**false**).")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * Indicates whether the payment method is enabled (**true**) or disabled (**false**).
   *
   * @param enabled
   */ 
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * girocard
   *
   * @param girocard
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo girocard(GenericPmWithTdiInfo girocard) {
    this.girocard = girocard;
    return this;
  }

  /**
   * girocard
   * @return girocard
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GIROCARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GenericPmWithTdiInfo getGirocard() {
    return girocard;
  }

  /**
   * girocard
   *
   * @param girocard
   */ 
  @JsonProperty(JSON_PROPERTY_GIROCARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGirocard(GenericPmWithTdiInfo girocard) {
    this.girocard = girocard;
  }

  /**
   * ideal
   *
   * @param ideal
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo ideal(GenericPmWithTdiInfo ideal) {
    this.ideal = ideal;
    return this;
  }

  /**
   * ideal
   * @return ideal
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDEAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GenericPmWithTdiInfo getIdeal() {
    return ideal;
  }

  /**
   * ideal
   *
   * @param ideal
   */ 
  @JsonProperty(JSON_PROPERTY_IDEAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdeal(GenericPmWithTdiInfo ideal) {
    this.ideal = ideal;
  }

  /**
   * interacCard
   *
   * @param interacCard
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo interacCard(GenericPmWithTdiInfo interacCard) {
    this.interacCard = interacCard;
    return this;
  }

  /**
   * interacCard
   * @return interacCard
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTERAC_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GenericPmWithTdiInfo getInteracCard() {
    return interacCard;
  }

  /**
   * interacCard
   *
   * @param interacCard
   */ 
  @JsonProperty(JSON_PROPERTY_INTERAC_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInteracCard(GenericPmWithTdiInfo interacCard) {
    this.interacCard = interacCard;
  }

  /**
   * jcb
   *
   * @param jcb
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo jcb(GenericPmWithTdiInfo jcb) {
    this.jcb = jcb;
    return this;
  }

  /**
   * jcb
   * @return jcb
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JCB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GenericPmWithTdiInfo getJcb() {
    return jcb;
  }

  /**
   * jcb
   *
   * @param jcb
   */ 
  @JsonProperty(JSON_PROPERTY_JCB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJcb(GenericPmWithTdiInfo jcb) {
    this.jcb = jcb;
  }

  /**
   * maestro
   *
   * @param maestro
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo maestro(GenericPmWithTdiInfo maestro) {
    this.maestro = maestro;
    return this;
  }

  /**
   * maestro
   * @return maestro
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAESTRO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GenericPmWithTdiInfo getMaestro() {
    return maestro;
  }

  /**
   * maestro
   *
   * @param maestro
   */ 
  @JsonProperty(JSON_PROPERTY_MAESTRO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaestro(GenericPmWithTdiInfo maestro) {
    this.maestro = maestro;
  }

  /**
   * mc
   *
   * @param mc
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo mc(GenericPmWithTdiInfo mc) {
    this.mc = mc;
    return this;
  }

  /**
   * mc
   * @return mc
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GenericPmWithTdiInfo getMc() {
    return mc;
  }

  /**
   * mc
   *
   * @param mc
   */ 
  @JsonProperty(JSON_PROPERTY_MC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMc(GenericPmWithTdiInfo mc) {
    this.mc = mc;
  }

  /**
   * nyce
   *
   * @param nyce
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo nyce(NyceInfo nyce) {
    this.nyce = nyce;
    return this;
  }

  /**
   * nyce
   * @return nyce
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NYCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public NyceInfo getNyce() {
    return nyce;
  }

  /**
   * nyce
   *
   * @param nyce
   */ 
  @JsonProperty(JSON_PROPERTY_NYCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNyce(NyceInfo nyce) {
    this.nyce = nyce;
  }

  /**
   * pulse
   *
   * @param pulse
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo pulse(PulseInfo pulse) {
    this.pulse = pulse;
    return this;
  }

  /**
   * pulse
   * @return pulse
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PULSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PulseInfo getPulse() {
    return pulse;
  }

  /**
   * pulse
   *
   * @param pulse
   */ 
  @JsonProperty(JSON_PROPERTY_PULSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPulse(PulseInfo pulse) {
    this.pulse = pulse;
  }

  /**
   * star
   *
   * @param star
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo star(StarInfo star) {
    this.star = star;
    return this;
  }

  /**
   * star
   * @return star
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StarInfo getStar() {
    return star;
  }

  /**
   * star
   *
   * @param star
   */ 
  @JsonProperty(JSON_PROPERTY_STAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStar(StarInfo star) {
    this.star = star;
  }

  /**
   * The store for this payment method
   *
   * @param storeId
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * The store for this payment method
   * @return storeId
   */
  @ApiModelProperty(value = "The store for this payment method")
  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStoreId() {
    return storeId;
  }

  /**
   * The store for this payment method
   *
   * @param storeId
   */ 
  @JsonProperty(JSON_PROPERTY_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  /**
   * The list of stores for this payment method
   *
   * @param storeIds
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   *
   * @deprecated since Management API v3
   * Use &#x60;storeId&#x60; instead. Only one store per payment method is allowed.
   */
  @Deprecated
  public UpdatePaymentMethodInfo storeIds(List<String> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public UpdatePaymentMethodInfo addStoreIdsItem(String storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

  /**
   * The list of stores for this payment method
   * @return storeIds
   *
   * @deprecated since Management API v3
   * Use &#x60;storeId&#x60; instead. Only one store per payment method is allowed.
   */
  @Deprecated
  @ApiModelProperty(value = "The list of stores for this payment method")
  @JsonProperty(JSON_PROPERTY_STORE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getStoreIds() {
    return storeIds;
  }

  /**
   * The list of stores for this payment method
   *
   * @param storeIds
   *
   * @deprecated since Management API v3
   * Use &#x60;storeId&#x60; instead. Only one store per payment method is allowed.
   */ 
  @Deprecated
  @JsonProperty(JSON_PROPERTY_STORE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreIds(List<String> storeIds) {
    this.storeIds = storeIds;
  }

  /**
   * visa
   *
   * @param visa
   * @return the current {@code UpdatePaymentMethodInfo} instance, allowing for method chaining
   */
  public UpdatePaymentMethodInfo visa(GenericPmWithTdiInfo visa) {
    this.visa = visa;
    return this;
  }

  /**
   * visa
   * @return visa
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VISA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GenericPmWithTdiInfo getVisa() {
    return visa;
  }

  /**
   * visa
   *
   * @param visa
   */ 
  @JsonProperty(JSON_PROPERTY_VISA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisa(GenericPmWithTdiInfo visa) {
    this.visa = visa;
  }

  /**
   * Return true if this UpdatePaymentMethodInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePaymentMethodInfo updatePaymentMethodInfo = (UpdatePaymentMethodInfo) o;
    return Objects.equals(this.accel, updatePaymentMethodInfo.accel) &&
        Objects.equals(this.bcmc, updatePaymentMethodInfo.bcmc) &&
        Objects.equals(this.cartesBancaires, updatePaymentMethodInfo.cartesBancaires) &&
        Objects.equals(this.countries, updatePaymentMethodInfo.countries) &&
        Objects.equals(this.cup, updatePaymentMethodInfo.cup) &&
        Objects.equals(this.currencies, updatePaymentMethodInfo.currencies) &&
        Objects.equals(this.customRoutingFlags, updatePaymentMethodInfo.customRoutingFlags) &&
        Objects.equals(this.diners, updatePaymentMethodInfo.diners) &&
        Objects.equals(this.discover, updatePaymentMethodInfo.discover) &&
        Objects.equals(this.eftposAustralia, updatePaymentMethodInfo.eftposAustralia) &&
        Objects.equals(this.enabled, updatePaymentMethodInfo.enabled) &&
        Objects.equals(this.girocard, updatePaymentMethodInfo.girocard) &&
        Objects.equals(this.ideal, updatePaymentMethodInfo.ideal) &&
        Objects.equals(this.interacCard, updatePaymentMethodInfo.interacCard) &&
        Objects.equals(this.jcb, updatePaymentMethodInfo.jcb) &&
        Objects.equals(this.maestro, updatePaymentMethodInfo.maestro) &&
        Objects.equals(this.mc, updatePaymentMethodInfo.mc) &&
        Objects.equals(this.nyce, updatePaymentMethodInfo.nyce) &&
        Objects.equals(this.pulse, updatePaymentMethodInfo.pulse) &&
        Objects.equals(this.star, updatePaymentMethodInfo.star) &&
        Objects.equals(this.storeId, updatePaymentMethodInfo.storeId) &&
        Objects.equals(this.storeIds, updatePaymentMethodInfo.storeIds) &&
        Objects.equals(this.visa, updatePaymentMethodInfo.visa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accel, bcmc, cartesBancaires, countries, cup, currencies, customRoutingFlags, diners, discover, eftposAustralia, enabled, girocard, ideal, interacCard, jcb, maestro, mc, nyce, pulse, star, storeId, storeIds, visa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentMethodInfo {\n");
    sb.append("    accel: ").append(toIndentedString(accel)).append("\n");
    sb.append("    bcmc: ").append(toIndentedString(bcmc)).append("\n");
    sb.append("    cartesBancaires: ").append(toIndentedString(cartesBancaires)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    cup: ").append(toIndentedString(cup)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    customRoutingFlags: ").append(toIndentedString(customRoutingFlags)).append("\n");
    sb.append("    diners: ").append(toIndentedString(diners)).append("\n");
    sb.append("    discover: ").append(toIndentedString(discover)).append("\n");
    sb.append("    eftposAustralia: ").append(toIndentedString(eftposAustralia)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    girocard: ").append(toIndentedString(girocard)).append("\n");
    sb.append("    ideal: ").append(toIndentedString(ideal)).append("\n");
    sb.append("    interacCard: ").append(toIndentedString(interacCard)).append("\n");
    sb.append("    jcb: ").append(toIndentedString(jcb)).append("\n");
    sb.append("    maestro: ").append(toIndentedString(maestro)).append("\n");
    sb.append("    mc: ").append(toIndentedString(mc)).append("\n");
    sb.append("    nyce: ").append(toIndentedString(nyce)).append("\n");
    sb.append("    pulse: ").append(toIndentedString(pulse)).append("\n");
    sb.append("    star: ").append(toIndentedString(star)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
    sb.append("    visa: ").append(toIndentedString(visa)).append("\n");
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
   * Create an instance of UpdatePaymentMethodInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdatePaymentMethodInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to UpdatePaymentMethodInfo
   */
  public static UpdatePaymentMethodInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, UpdatePaymentMethodInfo.class);
  }
/**
  * Convert an instance of UpdatePaymentMethodInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
