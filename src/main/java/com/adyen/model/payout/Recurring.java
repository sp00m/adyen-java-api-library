/*
 * Adyen Payout API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payout;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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

import com.adyen.model.payout.JSON;

/**
 * Recurring
 */

public class Recurring {
  /**
   * The type of recurring contract to be used. Possible values: * &#x60;ONECLICK&#x60; – Payment details can be used to initiate a one-click payment, where the shopper enters the [card security code (CVC/CVV)](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-security-code-cvc-cvv-cid). * &#x60;RECURRING&#x60; – Payment details can be used without the card security code to initiate [card-not-present transactions](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-not-present-cnp). * &#x60;ONECLICK,RECURRING&#x60; – Payment details can be used regardless of whether the shopper is on your site or not. * &#x60;PAYOUT&#x60; – Payment details can be used to [make a payout](https://docs.adyen.com/online-payments/online-payouts).
   */
  @JsonAdapter(ContractEnum.Adapter.class)
  public enum ContractEnum {
    ONECLICK("ONECLICK"),
    
    RECURRING("RECURRING"),
    
    PAYOUT("PAYOUT");

    private String value;

    ContractEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContractEnum fromValue(String value) {
      for (ContractEnum b : ContractEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ContractEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContractEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContractEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ContractEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private ContractEnum contract;

  public static final String SERIALIZED_NAME_RECURRING_DETAIL_NAME = "recurringDetailName";
  @SerializedName(SERIALIZED_NAME_RECURRING_DETAIL_NAME)
  private String recurringDetailName;

  public static final String SERIALIZED_NAME_RECURRING_EXPIRY = "recurringExpiry";
  @SerializedName(SERIALIZED_NAME_RECURRING_EXPIRY)
  private OffsetDateTime recurringExpiry;

  public static final String SERIALIZED_NAME_RECURRING_FREQUENCY = "recurringFrequency";
  @SerializedName(SERIALIZED_NAME_RECURRING_FREQUENCY)
  private String recurringFrequency;

  /**
   * The name of the token service.
   */
  @JsonAdapter(TokenServiceEnum.Adapter.class)
  public enum TokenServiceEnum {
    VISATOKENSERVICE("VISATOKENSERVICE"),
    
    MCTOKENSERVICE("MCTOKENSERVICE");

    private String value;

    TokenServiceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TokenServiceEnum fromValue(String value) {
      for (TokenServiceEnum b : TokenServiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TokenServiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TokenServiceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TokenServiceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TokenServiceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TOKEN_SERVICE = "tokenService";
  @SerializedName(SERIALIZED_NAME_TOKEN_SERVICE)
  private TokenServiceEnum tokenService;

  public Recurring() { 
  }

  public Recurring contract(ContractEnum contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * The type of recurring contract to be used. Possible values: * &#x60;ONECLICK&#x60; – Payment details can be used to initiate a one-click payment, where the shopper enters the [card security code (CVC/CVV)](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-security-code-cvc-cvv-cid). * &#x60;RECURRING&#x60; – Payment details can be used without the card security code to initiate [card-not-present transactions](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-not-present-cnp). * &#x60;ONECLICK,RECURRING&#x60; – Payment details can be used regardless of whether the shopper is on your site or not. * &#x60;PAYOUT&#x60; – Payment details can be used to [make a payout](https://docs.adyen.com/online-payments/online-payouts).
   * @return contract
  **/
  @ApiModelProperty(value = "The type of recurring contract to be used. Possible values: * `ONECLICK` – Payment details can be used to initiate a one-click payment, where the shopper enters the [card security code (CVC/CVV)](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-security-code-cvc-cvv-cid). * `RECURRING` – Payment details can be used without the card security code to initiate [card-not-present transactions](https://docs.adyen.com/payments-fundamentals/payment-glossary#card-not-present-cnp). * `ONECLICK,RECURRING` – Payment details can be used regardless of whether the shopper is on your site or not. * `PAYOUT` – Payment details can be used to [make a payout](https://docs.adyen.com/online-payments/online-payouts).")

  public ContractEnum getContract() {
    return contract;
  }


  public void setContract(ContractEnum contract) {
    this.contract = contract;
  }


  public Recurring recurringDetailName(String recurringDetailName) {
    
    this.recurringDetailName = recurringDetailName;
    return this;
  }

   /**
   * A descriptive name for this detail.
   * @return recurringDetailName
  **/
  @ApiModelProperty(value = "A descriptive name for this detail.")

  public String getRecurringDetailName() {
    return recurringDetailName;
  }


  public void setRecurringDetailName(String recurringDetailName) {
    this.recurringDetailName = recurringDetailName;
  }


  public Recurring recurringExpiry(OffsetDateTime recurringExpiry) {
    
    this.recurringExpiry = recurringExpiry;
    return this;
  }

   /**
   * Date after which no further authorisations shall be performed. Only for 3D Secure 2.
   * @return recurringExpiry
  **/
  @ApiModelProperty(value = "Date after which no further authorisations shall be performed. Only for 3D Secure 2.")

  public OffsetDateTime getRecurringExpiry() {
    return recurringExpiry;
  }


  public void setRecurringExpiry(OffsetDateTime recurringExpiry) {
    this.recurringExpiry = recurringExpiry;
  }


  public Recurring recurringFrequency(String recurringFrequency) {
    
    this.recurringFrequency = recurringFrequency;
    return this;
  }

   /**
   * Minimum number of days between authorisations. Only for 3D Secure 2.
   * @return recurringFrequency
  **/
  @ApiModelProperty(value = "Minimum number of days between authorisations. Only for 3D Secure 2.")

  public String getRecurringFrequency() {
    return recurringFrequency;
  }


  public void setRecurringFrequency(String recurringFrequency) {
    this.recurringFrequency = recurringFrequency;
  }


  public Recurring tokenService(TokenServiceEnum tokenService) {
    
    this.tokenService = tokenService;
    return this;
  }

   /**
   * The name of the token service.
   * @return tokenService
  **/
  @ApiModelProperty(value = "The name of the token service.")

  public TokenServiceEnum getTokenService() {
    return tokenService;
  }


  public void setTokenService(TokenServiceEnum tokenService) {
    this.tokenService = tokenService;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recurring recurring = (Recurring) o;
    return Objects.equals(this.contract, recurring.contract) &&
        Objects.equals(this.recurringDetailName, recurring.recurringDetailName) &&
        Objects.equals(this.recurringExpiry, recurring.recurringExpiry) &&
        Objects.equals(this.recurringFrequency, recurring.recurringFrequency) &&
        Objects.equals(this.tokenService, recurring.tokenService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, recurringDetailName, recurringExpiry, recurringFrequency, tokenService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recurring {\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    recurringDetailName: ").append(toIndentedString(recurringDetailName)).append("\n");
    sb.append("    recurringExpiry: ").append(toIndentedString(recurringExpiry)).append("\n");
    sb.append("    recurringFrequency: ").append(toIndentedString(recurringFrequency)).append("\n");
    sb.append("    tokenService: ").append(toIndentedString(tokenService)).append("\n");
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
    openapiFields.add("contract");
    openapiFields.add("recurringDetailName");
    openapiFields.add("recurringExpiry");
    openapiFields.add("recurringFrequency");
    openapiFields.add("tokenService");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(Recurring.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Recurring
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Recurring.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Recurring is not found in the empty JSON string", Recurring.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Recurring.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `Recurring` properties.", entry.getKey()));
        }
      }
      // ensure the field contract can be parsed to an enum value
      if (jsonObj.get("contract") != null) {
        if(!jsonObj.get("contract").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `contract` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract").toString()));
        }
        ContractEnum.fromValue(jsonObj.get("contract").getAsString());
      }
      // validate the optional field recurringDetailName
      if (jsonObj.get("recurringDetailName") != null && !jsonObj.get("recurringDetailName").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `recurringDetailName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurringDetailName").toString()));
      }
      // validate the optional field recurringFrequency
      if (jsonObj.get("recurringFrequency") != null && !jsonObj.get("recurringFrequency").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `recurringFrequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurringFrequency").toString()));
      }
      // ensure the field tokenService can be parsed to an enum value
      if (jsonObj.get("tokenService") != null) {
        if(!jsonObj.get("tokenService").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `tokenService` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenService").toString()));
        }
        TokenServiceEnum.fromValue(jsonObj.get("tokenService").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Recurring.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Recurring' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Recurring> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Recurring.class));

       return (TypeAdapter<T>) new TypeAdapter<Recurring>() {
           @Override
           public void write(JsonWriter out, Recurring value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Recurring read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Recurring given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Recurring
  * @throws IOException if the JSON string is invalid with respect to Recurring
  */
  public static Recurring fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Recurring.class);
  }

 /**
  * Convert an instance of Recurring to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

