/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 1
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
import com.adyen.model.configurationwebhooks.SweepConfigurationSchedule;
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
 * SweepConfiguration
 */
@JsonPropertyOrder({
  SweepConfiguration.JSON_PROPERTY_BALANCE_ACCOUNT_ID,
  SweepConfiguration.JSON_PROPERTY_ID,
  SweepConfiguration.JSON_PROPERTY_MERCHANT_ACCOUNT,
  SweepConfiguration.JSON_PROPERTY_SCHEDULE,
  SweepConfiguration.JSON_PROPERTY_STATUS,
  SweepConfiguration.JSON_PROPERTY_SWEEP_AMOUNT,
  SweepConfiguration.JSON_PROPERTY_TARGET_AMOUNT,
  SweepConfiguration.JSON_PROPERTY_TRANSFER_INSTRUMENT_ID,
  SweepConfiguration.JSON_PROPERTY_TRIGGER_AMOUNT,
  SweepConfiguration.JSON_PROPERTY_TYPE
})

public class SweepConfiguration {
  public static final String JSON_PROPERTY_BALANCE_ACCOUNT_ID = "balanceAccountId";
  private String balanceAccountId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private SweepConfigurationSchedule schedule;

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

  public static final String JSON_PROPERTY_TRANSFER_INSTRUMENT_ID = "transferInstrumentId";
  private String transferInstrumentId;

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
  private TypeEnum type = TypeEnum.PUSH;

  public SweepConfiguration() { 
  }

  public SweepConfiguration balanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
    return this;
  }

   /**
   * The unique identifier of the destination or source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).   You can only use this for periodic sweep schedules such as &#x60;schedule.type&#x60; **daily** or **monthly**.
   * @return balanceAccountId
  **/
  @ApiModelProperty(value = "The unique identifier of the destination or source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).   You can only use this for periodic sweep schedules such as `schedule.type` **daily** or **monthly**.")
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceAccountId() {
    return balanceAccountId;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
  }


  public SweepConfiguration id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the sweep.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the sweep.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public SweepConfiguration merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account that will be the source of funds. You can only use this if you are processing payments with Adyen. This can only be used for sweeps of &#x60;type&#x60; **pull** and &#x60;schedule.type&#x60; **balance**.
   * @return merchantAccount
  **/
  @ApiModelProperty(value = "The merchant account that will be the source of funds. You can only use this if you are processing payments with Adyen. This can only be used for sweeps of `type` **pull** and `schedule.type` **balance**.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantAccount() {
    return merchantAccount;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public SweepConfiguration schedule(SweepConfigurationSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SweepConfigurationSchedule getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedule(SweepConfigurationSchedule schedule) {
    this.schedule = schedule;
  }


  public SweepConfiguration status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.   
   * @return status
  **/
  @ApiModelProperty(value = "The status of the sweep. If not provided, by default, this is set to **active**.  Possible values:    * **active**:  the sweep is enabled and funds will be pulled in or pushed out based on the defined configuration.    * **inactive**: the sweep is disabled and cannot be triggered.   ")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public SweepConfiguration sweepAmount(Amount sweepAmount) {
    this.sweepAmount = sweepAmount;
    return this;
  }

   /**
   * Get sweepAmount
   * @return sweepAmount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SWEEP_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getSweepAmount() {
    return sweepAmount;
  }


  @JsonProperty(JSON_PROPERTY_SWEEP_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSweepAmount(Amount sweepAmount) {
    this.sweepAmount = sweepAmount;
  }


  public SweepConfiguration targetAmount(Amount targetAmount) {
    this.targetAmount = targetAmount;
    return this;
  }

   /**
   * Get targetAmount
   * @return targetAmount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getTargetAmount() {
    return targetAmount;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetAmount(Amount targetAmount) {
    this.targetAmount = targetAmount;
  }


  public SweepConfiguration transferInstrumentId(String transferInstrumentId) {
    this.transferInstrumentId = transferInstrumentId;
    return this;
  }

   /**
   * The unique identifier of the destination or source [transfer instrument](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/transferInstruments__resParam_id).  You can also use this in combination with a &#x60;merchantAccount&#x60; and a &#x60;type&#x60; **pull** to start a direct debit request from the source transfer instrument. To use this feature, reach out to your Adyen contact.
   * @return transferInstrumentId
  **/
  @ApiModelProperty(value = "The unique identifier of the destination or source [transfer instrument](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/transferInstruments__resParam_id).  You can also use this in combination with a `merchantAccount` and a `type` **pull** to start a direct debit request from the source transfer instrument. To use this feature, reach out to your Adyen contact.")
  @JsonProperty(JSON_PROPERTY_TRANSFER_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransferInstrumentId() {
    return transferInstrumentId;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFER_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransferInstrumentId(String transferInstrumentId) {
    this.transferInstrumentId = transferInstrumentId;
  }


  public SweepConfiguration triggerAmount(Amount triggerAmount) {
    this.triggerAmount = triggerAmount;
    return this;
  }

   /**
   * Get triggerAmount
   * @return triggerAmount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRIGGER_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getTriggerAmount() {
    return triggerAmount;
  }


  @JsonProperty(JSON_PROPERTY_TRIGGER_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTriggerAmount(Amount triggerAmount) {
    this.triggerAmount = triggerAmount;
  }


  public SweepConfiguration type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account.
   * @return type
  **/
  @ApiModelProperty(value = "The direction of sweep, whether pushing out or pulling in funds to the balance account. If not provided, by default, this is set to **push**.  Possible values:   * **push**: _push out funds_ to a destination balance account or transfer instrument.   * **pull**: _pull in funds_ from a source merchant account, transfer instrument, or balance account.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this SweepConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SweepConfiguration sweepConfiguration = (SweepConfiguration) o;
    return Objects.equals(this.balanceAccountId, sweepConfiguration.balanceAccountId) &&
        Objects.equals(this.id, sweepConfiguration.id) &&
        Objects.equals(this.merchantAccount, sweepConfiguration.merchantAccount) &&
        Objects.equals(this.schedule, sweepConfiguration.schedule) &&
        Objects.equals(this.status, sweepConfiguration.status) &&
        Objects.equals(this.sweepAmount, sweepConfiguration.sweepAmount) &&
        Objects.equals(this.targetAmount, sweepConfiguration.targetAmount) &&
        Objects.equals(this.transferInstrumentId, sweepConfiguration.transferInstrumentId) &&
        Objects.equals(this.triggerAmount, sweepConfiguration.triggerAmount) &&
        Objects.equals(this.type, sweepConfiguration.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccountId, id, merchantAccount, schedule, status, sweepAmount, targetAmount, transferInstrumentId, triggerAmount, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SweepConfiguration {\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sweepAmount: ").append(toIndentedString(sweepAmount)).append("\n");
    sb.append("    targetAmount: ").append(toIndentedString(targetAmount)).append("\n");
    sb.append("    transferInstrumentId: ").append(toIndentedString(transferInstrumentId)).append("\n");
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
   * Create an instance of SweepConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SweepConfiguration
   * @throws JsonProcessingException if the JSON string is invalid with respect to SweepConfiguration
   */
  public static SweepConfiguration fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, SweepConfiguration.class);
  }
/**
  * Convert an instance of SweepConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
