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

import com.adyen.model.posterminalmanagement.JSON;

/**
 * GetTerminalDetailsRequest
 */

public class GetTerminalDetailsRequest {
  public static final String SERIALIZED_NAME_TERMINAL = "terminal";
  @SerializedName(SERIALIZED_NAME_TERMINAL)
  private String terminal;

  public GetTerminalDetailsRequest() { 
  }

  public GetTerminalDetailsRequest terminal(String terminal) {
    
    this.terminal = terminal;
    return this;
  }

   /**
   * The unique terminal ID in the format &#x60;[Device model]-[Serial number]&#x60;.   For example, **V400m-324689776**.
   * @return terminal
  **/
  @ApiModelProperty(required = true, value = "The unique terminal ID in the format `[Device model]-[Serial number]`.   For example, **V400m-324689776**.")

  public String getTerminal() {
    return terminal;
  }


  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTerminalDetailsRequest getTerminalDetailsRequest = (GetTerminalDetailsRequest) o;
    return Objects.equals(this.terminal, getTerminalDetailsRequest.terminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTerminalDetailsRequest {\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
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
    openapiFields.add("terminal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("terminal");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(GetTerminalDetailsRequest.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetTerminalDetailsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetTerminalDetailsRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTerminalDetailsRequest is not found in the empty JSON string", GetTerminalDetailsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetTerminalDetailsRequest.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `GetTerminalDetailsRequest` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetTerminalDetailsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field terminal
      if (jsonObj.get("terminal") != null && !jsonObj.get("terminal").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `terminal` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTerminalDetailsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTerminalDetailsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTerminalDetailsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTerminalDetailsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTerminalDetailsRequest>() {
           @Override
           public void write(JsonWriter out, GetTerminalDetailsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTerminalDetailsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetTerminalDetailsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTerminalDetailsRequest
  * @throws IOException if the JSON string is invalid with respect to GetTerminalDetailsRequest
  */
  public static GetTerminalDetailsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTerminalDetailsRequest.class);
  }

 /**
  * Convert an instance of GetTerminalDetailsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

