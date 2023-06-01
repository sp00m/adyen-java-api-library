/*
 * POS Terminal Management API
 * This API provides endpoints for managing your point-of-sale (POS) payment terminals. You can use the API to obtain information about a specific terminal, retrieve overviews of your terminals and stores, and assign terminals to a merchant account or store.  For more information, refer to [Assign terminals](https://docs.adyen.com/point-of-sale/automating-terminal-management/assign-terminals-api).  ## Authentication Each request to the Terminal Management API must be signed with an API key. For this, obtain an API Key from your Customer Area, as described in [How to get the API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key). Then set this key to the `X-API-Key` header value, for example:  ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: Your_API_key\" \\ ... ``` Note that when going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning Terminal Management API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://postfmapi-test.adyen.com/postfmapi/terminal/v1/getTerminalsUnderAccount ``` When using versioned endpoints, Boolean response values are returned in string format: `\"true\"` or `\"false\"`. If you omit the version from the endpoint URL, Boolean response values are returned like this: `true` or `false`.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.posterminalmanagement;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.posterminalmanagement.MerchantAccount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import com.adyen.model.posterminalmanagement.JSON;

/**
 * GetTerminalsUnderAccountResponse
 */

public class GetTerminalsUnderAccountResponse {
  public static final String SERIALIZED_NAME_COMPANY_ACCOUNT = "companyAccount";
  @SerializedName(SERIALIZED_NAME_COMPANY_ACCOUNT)
  private String companyAccount;

  public static final String SERIALIZED_NAME_INVENTORY_TERMINALS = "inventoryTerminals";
  @SerializedName(SERIALIZED_NAME_INVENTORY_TERMINALS)
  private List<String> inventoryTerminals = null;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNTS = "merchantAccounts";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNTS)
  private List<MerchantAccount> merchantAccounts = null;

  public GetTerminalsUnderAccountResponse() { 
  }

  public GetTerminalsUnderAccountResponse companyAccount(String companyAccount) {
    
    this.companyAccount = companyAccount;
    return this;
  }

   /**
   * Your company account.
   * @return companyAccount
  **/
  @ApiModelProperty(required = true, value = "Your company account.")

  public String getCompanyAccount() {
    return companyAccount;
  }


  public void setCompanyAccount(String companyAccount) {
    this.companyAccount = companyAccount;
  }


  public GetTerminalsUnderAccountResponse inventoryTerminals(List<String> inventoryTerminals) {
    
    this.inventoryTerminals = inventoryTerminals;
    return this;
  }

  public GetTerminalsUnderAccountResponse addInventoryTerminalsItem(String inventoryTerminalsItem) {
    if (this.inventoryTerminals == null) {
      this.inventoryTerminals = new ArrayList<>();
    }
    this.inventoryTerminals.add(inventoryTerminalsItem);
    return this;
  }

   /**
   * Array that returns a list of all terminals that are in the inventory of the company account.
   * @return inventoryTerminals
  **/
  @ApiModelProperty(value = "Array that returns a list of all terminals that are in the inventory of the company account.")

  public List<String> getInventoryTerminals() {
    return inventoryTerminals;
  }


  public void setInventoryTerminals(List<String> inventoryTerminals) {
    this.inventoryTerminals = inventoryTerminals;
  }


  public GetTerminalsUnderAccountResponse merchantAccounts(List<MerchantAccount> merchantAccounts) {
    
    this.merchantAccounts = merchantAccounts;
    return this;
  }

  public GetTerminalsUnderAccountResponse addMerchantAccountsItem(MerchantAccount merchantAccountsItem) {
    if (this.merchantAccounts == null) {
      this.merchantAccounts = new ArrayList<>();
    }
    this.merchantAccounts.add(merchantAccountsItem);
    return this;
  }

   /**
   * Array that returns a list of all merchant accounts belonging to the company account.
   * @return merchantAccounts
  **/
  @ApiModelProperty(value = "Array that returns a list of all merchant accounts belonging to the company account.")

  public List<MerchantAccount> getMerchantAccounts() {
    return merchantAccounts;
  }


  public void setMerchantAccounts(List<MerchantAccount> merchantAccounts) {
    this.merchantAccounts = merchantAccounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTerminalsUnderAccountResponse getTerminalsUnderAccountResponse = (GetTerminalsUnderAccountResponse) o;
    return Objects.equals(this.companyAccount, getTerminalsUnderAccountResponse.companyAccount) &&
        Objects.equals(this.inventoryTerminals, getTerminalsUnderAccountResponse.inventoryTerminals) &&
        Objects.equals(this.merchantAccounts, getTerminalsUnderAccountResponse.merchantAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyAccount, inventoryTerminals, merchantAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTerminalsUnderAccountResponse {\n");
    sb.append("    companyAccount: ").append(toIndentedString(companyAccount)).append("\n");
    sb.append("    inventoryTerminals: ").append(toIndentedString(inventoryTerminals)).append("\n");
    sb.append("    merchantAccounts: ").append(toIndentedString(merchantAccounts)).append("\n");
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
    openapiFields.add("companyAccount");
    openapiFields.add("inventoryTerminals");
    openapiFields.add("merchantAccounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("companyAccount");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(GetTerminalsUnderAccountResponse.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetTerminalsUnderAccountResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetTerminalsUnderAccountResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTerminalsUnderAccountResponse is not found in the empty JSON string", GetTerminalsUnderAccountResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetTerminalsUnderAccountResponse.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `GetTerminalsUnderAccountResponse` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTerminalsUnderAccountResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field companyAccount
      if (jsonObj.get("companyAccount") != null && !jsonObj.get("companyAccount").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `companyAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyAccount").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("inventoryTerminals") != null && !jsonObj.get("inventoryTerminals").isJsonArray()) {
        log.log(Level.WARNING, String.format("Expected the field `inventoryTerminals` to be an array in the JSON string but got `%s`", jsonObj.get("inventoryTerminals").toString()));
      }
      JsonArray jsonArraymerchantAccounts = jsonObj.getAsJsonArray("merchantAccounts");
      if (jsonArraymerchantAccounts != null) {
        // ensure the json data is an array
        if (!jsonObj.get("merchantAccounts").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `merchantAccounts` to be an array in the JSON string but got `%s`", jsonObj.get("merchantAccounts").toString()));
        }

        // validate the optional field `merchantAccounts` (array)
        for (int i = 0; i < jsonArraymerchantAccounts.size(); i++) {
          MerchantAccount.validateJsonObject(jsonArraymerchantAccounts.get(i).getAsJsonObject());
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTerminalsUnderAccountResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTerminalsUnderAccountResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTerminalsUnderAccountResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTerminalsUnderAccountResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTerminalsUnderAccountResponse>() {
           @Override
           public void write(JsonWriter out, GetTerminalsUnderAccountResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTerminalsUnderAccountResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetTerminalsUnderAccountResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTerminalsUnderAccountResponse
  * @throws IOException if the JSON string is invalid with respect to GetTerminalsUnderAccountResponse
  */
  public static GetTerminalsUnderAccountResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTerminalsUnderAccountResponse.class);
  }

 /**
  * Convert an instance of GetTerminalsUnderAccountResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

