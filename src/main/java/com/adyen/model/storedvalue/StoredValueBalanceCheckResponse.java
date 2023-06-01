/*
 * Adyen Stored Value API
 * A set of API endpoints to manage stored value products.
 *
 * The version of the OpenAPI document: 46
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.storedvalue;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.storedvalue.Amount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.adyen.model.storedvalue.JSON;

/**
 * StoredValueBalanceCheckResponse
 */

public class StoredValueBalanceCheckResponse {
  public static final String SERIALIZED_NAME_CURRENT_BALANCE = "currentBalance";
  @SerializedName(SERIALIZED_NAME_CURRENT_BALANCE)
  private Amount currentBalance;

  public static final String SERIALIZED_NAME_PSP_REFERENCE = "pspReference";
  @SerializedName(SERIALIZED_NAME_PSP_REFERENCE)
  private String pspReference;

  public static final String SERIALIZED_NAME_REFUSAL_REASON = "refusalReason";
  @SerializedName(SERIALIZED_NAME_REFUSAL_REASON)
  private String refusalReason;

  /**
   * The result of the payment. Possible values:  * **Success** – The operation has been completed successfully.  * **Refused** – The operation was refused. The reason is given in the &#x60;refusalReason&#x60; field.  * **Error** – There was an error when the operation was processed. The reason is given in the &#x60;refusalReason&#x60; field.  * **NotEnoughBalance** – The amount on the payment method is lower than the amount given in the request. Only applicable to balance checks.  
   */
  @JsonAdapter(ResultCodeEnum.Adapter.class)
  public enum ResultCodeEnum {
    SUCCESS("Success"),
    
    REFUSED("Refused"),
    
    ERROR("Error"),
    
    NOTENOUGHBALANCE("NotEnoughBalance");

    private String value;

    ResultCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultCodeEnum fromValue(String value) {
      for (ResultCodeEnum b : ResultCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResultCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResultCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESULT_CODE = "resultCode";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private ResultCodeEnum resultCode;

  public static final String SERIALIZED_NAME_THIRD_PARTY_REFUSAL_REASON = "thirdPartyRefusalReason";
  @SerializedName(SERIALIZED_NAME_THIRD_PARTY_REFUSAL_REASON)
  private String thirdPartyRefusalReason;

  public StoredValueBalanceCheckResponse() { 
  }

  public StoredValueBalanceCheckResponse currentBalance(Amount currentBalance) {
    
    this.currentBalance = currentBalance;
    return this;
  }

   /**
   * Get currentBalance
   * @return currentBalance
  **/
  @ApiModelProperty(value = "")

  public Amount getCurrentBalance() {
    return currentBalance;
  }


  public void setCurrentBalance(Amount currentBalance) {
    this.currentBalance = currentBalance;
  }


  public StoredValueBalanceCheckResponse pspReference(String pspReference) {
    
    this.pspReference = pspReference;
    return this;
  }

   /**
   * Adyen&#39;s 16-character string reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request.
   * @return pspReference
  **/
  @ApiModelProperty(value = "Adyen's 16-character string reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request.")

  public String getPspReference() {
    return pspReference;
  }


  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public StoredValueBalanceCheckResponse refusalReason(String refusalReason) {
    
    this.refusalReason = refusalReason;
    return this;
  }

   /**
   * If the transaction is refused or an error occurs, this field holds Adyen&#39;s mapped reason for the refusal or a description of the error.  When a transaction fails, the authorisation response includes &#x60;resultCode&#x60; and &#x60;refusalReason&#x60; values.
   * @return refusalReason
  **/
  @ApiModelProperty(value = "If the transaction is refused or an error occurs, this field holds Adyen's mapped reason for the refusal or a description of the error.  When a transaction fails, the authorisation response includes `resultCode` and `refusalReason` values.")

  public String getRefusalReason() {
    return refusalReason;
  }


  public void setRefusalReason(String refusalReason) {
    this.refusalReason = refusalReason;
  }


  public StoredValueBalanceCheckResponse resultCode(ResultCodeEnum resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * The result of the payment. Possible values:  * **Success** – The operation has been completed successfully.  * **Refused** – The operation was refused. The reason is given in the &#x60;refusalReason&#x60; field.  * **Error** – There was an error when the operation was processed. The reason is given in the &#x60;refusalReason&#x60; field.  * **NotEnoughBalance** – The amount on the payment method is lower than the amount given in the request. Only applicable to balance checks.  
   * @return resultCode
  **/
  @ApiModelProperty(value = "The result of the payment. Possible values:  * **Success** – The operation has been completed successfully.  * **Refused** – The operation was refused. The reason is given in the `refusalReason` field.  * **Error** – There was an error when the operation was processed. The reason is given in the `refusalReason` field.  * **NotEnoughBalance** – The amount on the payment method is lower than the amount given in the request. Only applicable to balance checks.  ")

  public ResultCodeEnum getResultCode() {
    return resultCode;
  }


  public void setResultCode(ResultCodeEnum resultCode) {
    this.resultCode = resultCode;
  }


  public StoredValueBalanceCheckResponse thirdPartyRefusalReason(String thirdPartyRefusalReason) {
    
    this.thirdPartyRefusalReason = thirdPartyRefusalReason;
    return this;
  }

   /**
   * Raw refusal reason received from the third party, where available
   * @return thirdPartyRefusalReason
  **/
  @ApiModelProperty(value = "Raw refusal reason received from the third party, where available")

  public String getThirdPartyRefusalReason() {
    return thirdPartyRefusalReason;
  }


  public void setThirdPartyRefusalReason(String thirdPartyRefusalReason) {
    this.thirdPartyRefusalReason = thirdPartyRefusalReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoredValueBalanceCheckResponse storedValueBalanceCheckResponse = (StoredValueBalanceCheckResponse) o;
    return Objects.equals(this.currentBalance, storedValueBalanceCheckResponse.currentBalance) &&
        Objects.equals(this.pspReference, storedValueBalanceCheckResponse.pspReference) &&
        Objects.equals(this.refusalReason, storedValueBalanceCheckResponse.refusalReason) &&
        Objects.equals(this.resultCode, storedValueBalanceCheckResponse.resultCode) &&
        Objects.equals(this.thirdPartyRefusalReason, storedValueBalanceCheckResponse.thirdPartyRefusalReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentBalance, pspReference, refusalReason, resultCode, thirdPartyRefusalReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredValueBalanceCheckResponse {\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    refusalReason: ").append(toIndentedString(refusalReason)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    thirdPartyRefusalReason: ").append(toIndentedString(thirdPartyRefusalReason)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("currentBalance");
    openapiFields.add("pspReference");
    openapiFields.add("refusalReason");
    openapiFields.add("resultCode");
    openapiFields.add("thirdPartyRefusalReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(StoredValueBalanceCheckResponse.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StoredValueBalanceCheckResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StoredValueBalanceCheckResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StoredValueBalanceCheckResponse is not found in the empty JSON string", StoredValueBalanceCheckResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StoredValueBalanceCheckResponse.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `StoredValueBalanceCheckResponse` properties.", entry.getKey()));
        }
      }
      // validate the optional field `currentBalance`
      if (jsonObj.getAsJsonObject("currentBalance") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("currentBalance"));
      }
      // validate the optional field pspReference
      if (jsonObj.get("pspReference") != null && !jsonObj.get("pspReference").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `pspReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pspReference").toString()));
      }
      // validate the optional field refusalReason
      if (jsonObj.get("refusalReason") != null && !jsonObj.get("refusalReason").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `refusalReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refusalReason").toString()));
      }
      // ensure the field resultCode can be parsed to an enum value
      if (jsonObj.get("resultCode") != null) {
        if(!jsonObj.get("resultCode").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `resultCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultCode").toString()));
        }
        ResultCodeEnum.fromValue(jsonObj.get("resultCode").getAsString());
      }
      // validate the optional field thirdPartyRefusalReason
      if (jsonObj.get("thirdPartyRefusalReason") != null && !jsonObj.get("thirdPartyRefusalReason").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `thirdPartyRefusalReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thirdPartyRefusalReason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StoredValueBalanceCheckResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StoredValueBalanceCheckResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StoredValueBalanceCheckResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StoredValueBalanceCheckResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<StoredValueBalanceCheckResponse>() {
           @Override
           public void write(JsonWriter out, StoredValueBalanceCheckResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StoredValueBalanceCheckResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StoredValueBalanceCheckResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StoredValueBalanceCheckResponse
  * @throws IOException if the JSON string is invalid with respect to StoredValueBalanceCheckResponse
  */
  public static StoredValueBalanceCheckResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StoredValueBalanceCheckResponse.class);
  }

 /**
  * Convert an instance of StoredValueBalanceCheckResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

