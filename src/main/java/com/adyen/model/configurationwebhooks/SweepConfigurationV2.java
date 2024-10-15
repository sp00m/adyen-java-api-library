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
import com.adyen.model.configurationwebhooks.Amount;
import com.adyen.model.configurationwebhooks.SweepCounterparty;
import com.adyen.model.configurationwebhooks.SweepSchedule;
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
 * SweepConfigurationV2
 */
@JsonPropertyOrder({
  SweepConfigurationV2.JSON_PROPERTY_CATEGORY,
  SweepConfigurationV2.JSON_PROPERTY_COUNTERPARTY,
  SweepConfigurationV2.JSON_PROPERTY_CURRENCY,
  SweepConfigurationV2.JSON_PROPERTY_DESCRIPTION,
  SweepConfigurationV2.JSON_PROPERTY_ID,
  SweepConfigurationV2.JSON_PROPERTY_PRIORITIES,
  SweepConfigurationV2.JSON_PROPERTY_REASON,
  SweepConfigurationV2.JSON_PROPERTY_REFERENCE,
  SweepConfigurationV2.JSON_PROPERTY_REFERENCE_FOR_BENEFICIARY,
  SweepConfigurationV2.JSON_PROPERTY_SCHEDULE,
  SweepConfigurationV2.JSON_PROPERTY_STATUS,
  SweepConfigurationV2.JSON_PROPERTY_SWEEP_AMOUNT,
  SweepConfigurationV2.JSON_PROPERTY_TARGET_AMOUNT,
  SweepConfigurationV2.JSON_PROPERTY_TRIGGER_AMOUNT,
  SweepConfigurationV2.JSON_PROPERTY_TYPE
})

public class SweepConfigurationV2 {
  /**
   * The type of transfer that results from the sweep.  Possible values:   - **bank**: Sweep to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  Required when setting &#x60;priorities&#x60;.
   */
  public enum CategoryEnum {
    BANK("bank"),
    
    INTERNAL("internal"),
    
    PLATFORMPAYMENT("platformPayment");

    private String value;

    CategoryEnum(String value) {
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
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private CategoryEnum category;

  public static final String JSON_PROPERTY_COUNTERPARTY = "counterparty";
  private SweepCounterparty counterparty;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * Gets or Sets priorities
   */
  public enum PrioritiesEnum {
    CROSSBORDER("crossBorder"),
    
    FAST("fast"),
    
    INSTANT("instant"),
    
    INTERNAL("internal"),
    
    REGULAR("regular"),
    
    WIRE("wire");

    private String value;

    PrioritiesEnum(String value) {
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
    public static PrioritiesEnum fromValue(String value) {
      for (PrioritiesEnum b : PrioritiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRIORITIES = "priorities";
  private List<PrioritiesEnum> priorities = null;

  /**
   * The reason for disabling the sweep.
   */
  public enum ReasonEnum {
    ACCOUNTHIERARCHYNOTACTIVE("accountHierarchyNotActive"),
    
    AMOUNTLIMITEXCEEDED("amountLimitExceeded"),
    
    APPROVED("approved"),
    
    BALANCEACCOUNTTEMPORARILYBLOCKEDBYTRANSACTIONRULE("balanceAccountTemporarilyBlockedByTransactionRule"),
    
    COUNTERPARTYACCOUNTBLOCKED("counterpartyAccountBlocked"),
    
    COUNTERPARTYACCOUNTCLOSED("counterpartyAccountClosed"),
    
    COUNTERPARTYACCOUNTNOTFOUND("counterpartyAccountNotFound"),
    
    COUNTERPARTYADDRESSREQUIRED("counterpartyAddressRequired"),
    
    COUNTERPARTYBANKTIMEDOUT("counterpartyBankTimedOut"),
    
    COUNTERPARTYBANKUNAVAILABLE("counterpartyBankUnavailable"),
    
    DECLINED("declined"),
    
    DECLINEDBYTRANSACTIONRULE("declinedByTransactionRule"),
    
    DIRECTDEBITNOTSUPPORTED("directDebitNotSupported"),
    
    ERROR("error"),
    
    NOTENOUGHBALANCE("notEnoughBalance"),
    
    PENDINGAPPROVAL("pendingApproval"),
    
    PENDINGEXECUTION("pendingExecution"),
    
    REFUSEDBYCOUNTERPARTYBANK("refusedByCounterpartyBank"),
    
    ROUTENOTFOUND("routeNotFound"),
    
    SCAFAILED("scaFailed"),
    
    TRANSFERINSTRUMENTDOESNOTEXIST("transferInstrumentDoesNotExist"),
    
    UNKNOWN("unknown");

    private String value;

    ReasonEnum(String value) {
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
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REASON = "reason";
  private ReasonEnum reason;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_REFERENCE_FOR_BENEFICIARY = "referenceForBeneficiary";
  private String referenceForBeneficiary;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private SweepSchedule schedule;

  /**
   * The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.   
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_SWEEP_AMOUNT = "sweepAmount";
  private Amount sweepAmount;

  public static final String JSON_PROPERTY_TARGET_AMOUNT = "targetAmount";
  private Amount targetAmount;

  public static final String JSON_PROPERTY_TRIGGER_AMOUNT = "triggerAmount";
  private Amount triggerAmount;

  /**
   * The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account.
   */
  public enum TypeEnum {
    PULL("pull"),
    
    PUSH("push");

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

  public SweepConfigurationV2() { 
  }

  /**
   * The type of transfer that results from the sweep.  Possible values:   - **bank**: Sweep to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  Required when setting &#x60;priorities&#x60;.
   *
   * @param category
   * @return the current {@code SweepConfigurationV2} instance, allowing for method chaining
   */
  public SweepConfigurationV2 category(CategoryEnum category) {
    this.category = category;
    return this;
  }

  /**
   * The type of transfer that results from the sweep.  Possible values:   - **bank**: Sweep to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  Required when setting &#x60;priorities&#x60;.
   * @return category
   */
  @ApiModelProperty(value = "The type of transfer that results from the sweep.  Possible values:   - **bank**: Sweep to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  Required when setting `priorities`.")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CategoryEnum getCategory() {
    return category;
  }

  /**
   * The type of transfer that results from the sweep.  Possible values:   - **bank**: Sweep to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  Required when setting &#x60;priorities&#x60;.
   *
   * @param category
   */ 
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  /**
   * counterparty
   *
   * @param counterparty
   * @return the current {@code SweepConfigurationV2} instance, allowing for method chaining
   */
  public SweepConfigurationV2 counterparty(SweepCounterparty counterparty) {
    this.counterparty = counterparty;
    return this;
  }

  /**
   * counterparty
   * @return counterparty
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SweepCounterparty getCounterparty() {
    return counterparty;
  }

  /**
   * counterparty
   *
   * @param counterparty
   */ 
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterparty(SweepCounterparty counterparty) {
    this.counterparty = counterparty;
  }

  /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) in uppercase. For example, **EUR**.  The sweep currency must match any of the [balances currencies](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__resParam_balances).
   *
   * @param currency
   * @return the current {@code SweepConfigurationV2} instance, allowing for method chaining
   */
  public SweepConfigurationV2 currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) in uppercase. For example, **EUR**.  The sweep currency must match any of the [balances currencies](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__resParam_balances).
   * @return currency
   */
  @ApiModelProperty(required = true, value = "The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) in uppercase. For example, **EUR**.  The sweep currency must match any of the [balances currencies](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__resParam_balances).")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCurrency() {
    return currency;
  }

  /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) in uppercase. For example, **EUR**.  The sweep currency must match any of the [balances currencies](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__resParam_balances).
   *
   * @param currency
   */ 
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The message that will be used in the sweep transfer&#39;s description body with a maximum length of 140 characters.  If the message is longer after replacing placeholders, the message will be cut off at 140 characters.
   *
   * @param description
   * @return the current {@code SweepConfigurationV2} instance, allowing for method chaining
   */
  public SweepConfigurationV2 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The message that will be used in the sweep transfer&#39;s description body with a maximum length of 140 characters.  If the message is longer after replacing placeholders, the message will be cut off at 140 characters.
   * @return description
   */
  @ApiModelProperty(value = "The message that will be used in the sweep transfer's description body with a maximum length of 140 characters.  If the message is longer after replacing placeholders, the message will be cut off at 140 characters.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  /**
   * The message that will be used in the sweep transfer&#39;s description body with a maximum length of 140 characters.  If the message is longer after replacing placeholders, the message will be cut off at 140 characters.
   *
   * @param description
   */ 
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The unique identifier of the sweep.
   *
   * @param id
   * @return the current {@code SweepConfigurationV2} instance, allowing for method chaining
   */
  public SweepConfigurationV2 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the sweep.
   * @return id
   */
  @ApiModelProperty(required = true, value = "The unique identifier of the sweep.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  /**
   * The unique identifier of the sweep.
   *
   * @param id
   */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The list of priorities for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. You can provide multiple priorities. Adyen will try to pay out using the priority you list first. If that&#39;s not possible, it moves on to the next option in the order of your provided priorities.  Possible values:  * **regular**: for normal, low-value transactions.  * **fast**: a faster way to transfer funds, but the fees are higher. Recommended for high-priority, low-value transactions.  * **wire**: the fastest way to transfer funds, but this has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: for instant funds transfers in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: for high-value transfers to a recipient in a different country.  * **internal**: for transfers to an Adyen-issued business bank account (by bank account number/IBAN).  Set &#x60;category&#x60; to **bank**. For more details, see optional priorities setup for [marketplaces](https://docs.adyen.com/marketplaces/payout-to-users/scheduled-payouts#optional-priorities-setup) or [platforms](https://docs.adyen.com/platforms/payout-to-users/scheduled-payouts#optional-priorities-setup).
   *
   * @param priorities
   * @return the current {@code SweepConfigurationV2} instance, allowing for method chaining
   */
  public SweepConfigurationV2 priorities(List<PrioritiesEnum> priorities) {
    this.priorities = priorities;
    return this;
  }

  public SweepConfigurationV2 addPrioritiesItem(PrioritiesEnum prioritiesItem) {
    if (this.priorities == null) {
      this.priorities = new ArrayList<>();
    }
    this.priorities.add(prioritiesItem);
    return this;
  }

  /**
   * The list of priorities for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. You can provide multiple priorities. Adyen will try to pay out using the priority you list first. If that&#39;s not possible, it moves on to the next option in the order of your provided priorities.  Possible values:  * **regular**: for normal, low-value transactions.  * **fast**: a faster way to transfer funds, but the fees are higher. Recommended for high-priority, low-value transactions.  * **wire**: the fastest way to transfer funds, but this has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: for instant funds transfers in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: for high-value transfers to a recipient in a different country.  * **internal**: for transfers to an Adyen-issued business bank account (by bank account number/IBAN).  Set &#x60;category&#x60; to **bank**. For more details, see optional priorities setup for [marketplaces](https://docs.adyen.com/marketplaces/payout-to-users/scheduled-payouts#optional-priorities-setup) or [platforms](https://docs.adyen.com/platforms/payout-to-users/scheduled-payouts#optional-priorities-setup).
   * @return priorities
   */
  @ApiModelProperty(value = "The list of priorities for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. You can provide multiple priorities. Adyen will try to pay out using the priority you list first. If that's not possible, it moves on to the next option in the order of your provided priorities.  Possible values:  * **regular**: for normal, low-value transactions.  * **fast**: a faster way to transfer funds, but the fees are higher. Recommended for high-priority, low-value transactions.  * **wire**: the fastest way to transfer funds, but this has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: for instant funds transfers in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: for high-value transfers to a recipient in a different country.  * **internal**: for transfers to an Adyen-issued business bank account (by bank account number/IBAN).  Set `category` to **bank**. For more details, see optional priorities setup for [marketplaces](https://docs.adyen.com/marketplaces/payout-to-users/scheduled-payouts#optional-priorities-setup) or [platforms](https://docs.adyen.com/platforms/payout-to-users/scheduled-payouts#optional-priorities-setup).")
  @JsonProperty(JSON_PROPERTY_PRIORITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<PrioritiesEnum> getPriorities() {
    return priorities;
  }

  /**
   * The list of priorities for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. You can provide multiple priorities. Adyen will try to pay out using the priority you list first. If that&#39;s not possible, it moves on to the next option in the order of your provided priorities.  Possible values:  * **regular**: for normal, low-value transactions.  * **fast**: a faster way to transfer funds, but the fees are higher. Recommended for high-priority, low-value transactions.  * **wire**: the fastest way to transfer funds, but this has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: for instant funds transfers in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: for high-value transfers to a recipient in a different country.  * **internal**: for transfers to an Adyen-issued business bank account (by bank account number/IBAN).  Set &#x60;category&#x60; to **bank**. For more details, see optional priorities setup for [marketplaces](https://docs.adyen.com/marketplaces/payout-to-users/scheduled-payouts#optional-priorities-setup) or [platforms](https://docs.adyen.com/platforms/payout-to-users/scheduled-payouts#optional-priorities-setup).
   *
   * @param priorities
   */ 
  @JsonProperty(JSON_PROPERTY_PRIORITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriorities(List<PrioritiesEnum> priorities) {
    this.priorities = priorities;
  }

  /**
   * The reason for disabling the sweep.
   *
   * @param reason
   * @return the current {@code SweepConfigurationV2} instance, allowing for method chaining
   */
  public SweepConfigurationV2 reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason for disabling the sweep.
   * @return reason
   */
  @ApiModelProperty(value = "The reason for disabling the sweep.")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ReasonEnum getReason() {
    return reason;
  }

  /**
   * The reason for disabling the sweep.
   *
   * @param reason
   */ 
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  /**
   * Your reference for the sweep configuration.
   *
   * @param reference
   * @return the current {@code SweepConfigurationV2} instance, allowing for method chaining
   */
  public SweepConfigurationV2 reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Your reference for the sweep configuration.
   * @return reference
   */
  @ApiModelProperty(value = "Your reference for the sweep configuration.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReference() {
    return reference;
  }

  /**
   * Your reference for the sweep configuration.
   *
   * @param reference
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   * The reference sent to or received from the counterparty. Only alphanumeric characters are allowed.
   *
   * @param referenceForBeneficiary
   * @return the current {@code SweepConfigurationV2} instance, allowing for method chaining
   */
  public SweepConfigurationV2 referenceForBeneficiary(String referenceForBeneficiary) {
    this.referenceForBeneficiary = referenceForBeneficiary;
    return this;
  }

  /**
   * The reference sent to or received from the counterparty. Only alphanumeric characters are allowed.
   * @return referenceForBeneficiary
   */
  @ApiModelProperty(value = "The reference sent to or received from the counterparty. Only alphanumeric characters are allowed.")
  @JsonProperty(JSON_PROPERTY_REFERENCE_FOR_BENEFICIARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReferenceForBeneficiary() {
    return referenceForBeneficiary;
  }

  /**
   * The reference sent to or received from the counterparty. Only alphanumeric characters are allowed.
   *
   * @param referenceForBeneficiary
   */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE_FOR_BENEFICIARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceForBeneficiary(String referenceForBeneficiary) {
    this.referenceForBeneficiary = referenceForBeneficiary;
  }

  /**
   * schedule
   *
   * @param schedule
   * @return the current {@code SweepConfigurationV2} instance, allowing for method chaining
   */
  public SweepConfigurationV2 schedule(SweepSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * schedule
   * @return schedule
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SweepSchedule getSchedule() {
    return schedule;
  }

  /**
   * schedule
   *
   * @param schedule
   */ 
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedule(SweepSchedule schedule) {
    this.schedule = schedule;
  }

  /**
   * The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.   
   *
   * @param status
   * @return the current {@code SweepConfigurationV2} instance, allowing for method chaining
   */
  public SweepConfigurationV2 status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.   
   * @return status
   */
  @ApiModelProperty(value = "The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.   ")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.   
   *
   * @param status
   */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * sweepAmount
   *
   * @param sweepAmount
   * @return the current {@code SweepConfigurationV2} instance, allowing for method chaining
   */
  public SweepConfigurationV2 sweepAmount(Amount sweepAmount) {
    this.sweepAmount = sweepAmount;
    return this;
  }

  /**
   * sweepAmount
   * @return sweepAmount
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SWEEP_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Amount getSweepAmount() {
    return sweepAmount;
  }

  /**
   * sweepAmount
   *
   * @param sweepAmount
   */ 
  @JsonProperty(JSON_PROPERTY_SWEEP_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSweepAmount(Amount sweepAmount) {
    this.sweepAmount = sweepAmount;
  }

  /**
   * targetAmount
   *
   * @param targetAmount
   * @return the current {@code SweepConfigurationV2} instance, allowing for method chaining
   */
  public SweepConfigurationV2 targetAmount(Amount targetAmount) {
    this.targetAmount = targetAmount;
    return this;
  }

  /**
   * targetAmount
   * @return targetAmount
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Amount getTargetAmount() {
    return targetAmount;
  }

  /**
   * targetAmount
   *
   * @param targetAmount
   */ 
  @JsonProperty(JSON_PROPERTY_TARGET_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetAmount(Amount targetAmount) {
    this.targetAmount = targetAmount;
  }

  /**
   * triggerAmount
   *
   * @param triggerAmount
   * @return the current {@code SweepConfigurationV2} instance, allowing for method chaining
   */
  public SweepConfigurationV2 triggerAmount(Amount triggerAmount) {
    this.triggerAmount = triggerAmount;
    return this;
  }

  /**
   * triggerAmount
   * @return triggerAmount
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRIGGER_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Amount getTriggerAmount() {
    return triggerAmount;
  }

  /**
   * triggerAmount
   *
   * @param triggerAmount
   */ 
  @JsonProperty(JSON_PROPERTY_TRIGGER_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTriggerAmount(Amount triggerAmount) {
    this.triggerAmount = triggerAmount;
  }

  /**
   * The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account.
   *
   * @param type
   * @return the current {@code SweepConfigurationV2} instance, allowing for method chaining
   */
  public SweepConfigurationV2 type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account.
   * @return type
   */
  @ApiModelProperty(value = "The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  /**
   * The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account.
   *
   * @param type
   */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Return true if this SweepConfigurationV2 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SweepConfigurationV2 sweepConfigurationV2 = (SweepConfigurationV2) o;
    return Objects.equals(this.category, sweepConfigurationV2.category) &&
        Objects.equals(this.counterparty, sweepConfigurationV2.counterparty) &&
        Objects.equals(this.currency, sweepConfigurationV2.currency) &&
        Objects.equals(this.description, sweepConfigurationV2.description) &&
        Objects.equals(this.id, sweepConfigurationV2.id) &&
        Objects.equals(this.priorities, sweepConfigurationV2.priorities) &&
        Objects.equals(this.reason, sweepConfigurationV2.reason) &&
        Objects.equals(this.reference, sweepConfigurationV2.reference) &&
        Objects.equals(this.referenceForBeneficiary, sweepConfigurationV2.referenceForBeneficiary) &&
        Objects.equals(this.schedule, sweepConfigurationV2.schedule) &&
        Objects.equals(this.status, sweepConfigurationV2.status) &&
        Objects.equals(this.sweepAmount, sweepConfigurationV2.sweepAmount) &&
        Objects.equals(this.targetAmount, sweepConfigurationV2.targetAmount) &&
        Objects.equals(this.triggerAmount, sweepConfigurationV2.triggerAmount) &&
        Objects.equals(this.type, sweepConfigurationV2.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, counterparty, currency, description, id, priorities, reason, reference, referenceForBeneficiary, schedule, status, sweepAmount, targetAmount, triggerAmount, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SweepConfigurationV2 {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    priorities: ").append(toIndentedString(priorities)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    referenceForBeneficiary: ").append(toIndentedString(referenceForBeneficiary)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sweepAmount: ").append(toIndentedString(sweepAmount)).append("\n");
    sb.append("    targetAmount: ").append(toIndentedString(targetAmount)).append("\n");
    sb.append("    triggerAmount: ").append(toIndentedString(triggerAmount)).append("\n");
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
   * Create an instance of SweepConfigurationV2 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SweepConfigurationV2
   * @throws JsonProcessingException if the JSON string is invalid with respect to SweepConfigurationV2
   */
  public static SweepConfigurationV2 fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, SweepConfigurationV2.class);
  }
/**
  * Convert an instance of SweepConfigurationV2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
