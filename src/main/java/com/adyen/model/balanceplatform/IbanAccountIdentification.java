/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

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

import com.adyen.model.balanceplatform.JSON;

/**
 * IbanAccountIdentification
 */

public class IbanAccountIdentification {
  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  /**
   * **iban**
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    IBAN("iban");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.IBAN;

  public IbanAccountIdentification() { 
  }

  public IbanAccountIdentification iban(String iban) {
    
    this.iban = iban;
    return this;
  }

   /**
   * The international bank account number as defined in the [ISO-13616](https://www.iso.org/standard/81090.html) standard.
   * @return iban
  **/
  @ApiModelProperty(required = true, value = "The international bank account number as defined in the [ISO-13616](https://www.iso.org/standard/81090.html) standard.")

  public String getIban() {
    return iban;
  }


  public void setIban(String iban) {
    this.iban = iban;
  }


  public IbanAccountIdentification type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * **iban**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**iban**")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IbanAccountIdentification ibanAccountIdentification = (IbanAccountIdentification) o;
    return Objects.equals(this.iban, ibanAccountIdentification.iban) &&
        Objects.equals(this.type, ibanAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IbanAccountIdentification {\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("iban");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("iban");
    openapiRequiredFields.add("type");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(IbanAccountIdentification.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IbanAccountIdentification
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IbanAccountIdentification.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IbanAccountIdentification is not found in the empty JSON string", IbanAccountIdentification.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IbanAccountIdentification.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `IbanAccountIdentification` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IbanAccountIdentification.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field iban
      if (jsonObj.get("iban") != null && !jsonObj.get("iban").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `iban` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iban").toString()));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IbanAccountIdentification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IbanAccountIdentification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IbanAccountIdentification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IbanAccountIdentification.class));

       return (TypeAdapter<T>) new TypeAdapter<IbanAccountIdentification>() {
           @Override
           public void write(JsonWriter out, IbanAccountIdentification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IbanAccountIdentification read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IbanAccountIdentification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IbanAccountIdentification
  * @throws IOException if the JSON string is invalid with respect to IbanAccountIdentification
  */
  public static IbanAccountIdentification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IbanAccountIdentification.class);
  }

 /**
  * Convert an instance of IbanAccountIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

