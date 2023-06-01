/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.legalentitymanagement.CapabilityProblem;
import com.adyen.model.legalentitymanagement.SourceOfFunds;
import com.adyen.model.legalentitymanagement.WebData;
import com.adyen.model.legalentitymanagement.WebDataExemption;
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

import com.adyen.model.legalentitymanagement.JSON;

/**
 * BusinessLine
 */

public class BusinessLine {
  /**
   * The capability for which you are creating the business line.  Possible values: **receivePayments**, **receiveFromPlatformPayments**, **issueBankAccount**
   */
  @JsonAdapter(CapabilityEnum.Adapter.class)
  public enum CapabilityEnum {
    RECEIVEPAYMENTS("receivePayments"),
    
    RECEIVEFROMPLATFORMPAYMENTS("receiveFromPlatformPayments"),
    
    ISSUEBANKACCOUNT("issueBankAccount");

    private String value;

    CapabilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CapabilityEnum fromValue(String value) {
      for (CapabilityEnum b : CapabilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CapabilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CapabilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CapabilityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CapabilityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CAPABILITY = "capability";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_CAPABILITY)
  private CapabilityEnum capability;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INDUSTRY_CODE = "industryCode";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_CODE)
  private String industryCode;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY_ID = "legalEntityId";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY_ID)
  private String legalEntityId;

  public static final String SERIALIZED_NAME_PROBLEMS = "problems";
  @SerializedName(SERIALIZED_NAME_PROBLEMS)
  private List<CapabilityProblem> problems = null;

  public static final String SERIALIZED_NAME_SALES_CHANNELS = "salesChannels";
  @SerializedName(SERIALIZED_NAME_SALES_CHANNELS)
  private List<String> salesChannels = null;

  /**
   * The service for which you are creating the business line.  Possible values: **paymentProcessing**, **issuing**, **banking**
   */
  @JsonAdapter(ServiceEnum.Adapter.class)
  public enum ServiceEnum {
    PAYMENTPROCESSING("paymentProcessing"),
    
    ISSUING("issuing"),
    
    BANKING("banking");

    private String value;

    ServiceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceEnum fromValue(String value) {
      for (ServiceEnum b : ServiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ServiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ServiceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private ServiceEnum service;

  public static final String SERIALIZED_NAME_SOURCE_OF_FUNDS = "sourceOfFunds";
  @SerializedName(SERIALIZED_NAME_SOURCE_OF_FUNDS)
  private SourceOfFunds sourceOfFunds;

  public static final String SERIALIZED_NAME_WEB_DATA = "webData";
  @SerializedName(SERIALIZED_NAME_WEB_DATA)
  private List<WebData> webData = null;

  public static final String SERIALIZED_NAME_WEB_DATA_EXEMPTION = "webDataExemption";
  @SerializedName(SERIALIZED_NAME_WEB_DATA_EXEMPTION)
  private WebDataExemption webDataExemption;

  public BusinessLine() { 
  }

  
  public BusinessLine(
     String id
  ) {
    this();
    this.id = id;
  }

  @Deprecated
  public BusinessLine capability(CapabilityEnum capability) {
    
    this.capability = capability;
    return this;
  }

   /**
   * The capability for which you are creating the business line.  Possible values: **receivePayments**, **receiveFromPlatformPayments**, **issueBankAccount**
   * @return capability
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "The capability for which you are creating the business line.  Possible values: **receivePayments**, **receiveFromPlatformPayments**, **issueBankAccount**")

  public CapabilityEnum getCapability() {
    return capability;
  }


  @Deprecated
  public void setCapability(CapabilityEnum capability) {
    this.capability = capability;
  }


   /**
   * The unique identifier of the business line.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the business line.")

  public String getId() {
    return id;
  }




  public BusinessLine industryCode(String industryCode) {
    
    this.industryCode = industryCode;
    return this;
  }

   /**
   * A code that represents the industry of the legal entity. For example, **4431A** for computer software stores.
   * @return industryCode
  **/
  @ApiModelProperty(required = true, value = "A code that represents the industry of the legal entity. For example, **4431A** for computer software stores.")

  public String getIndustryCode() {
    return industryCode;
  }


  public void setIndustryCode(String industryCode) {
    this.industryCode = industryCode;
  }


  public BusinessLine legalEntityId(String legalEntityId) {
    
    this.legalEntityId = legalEntityId;
    return this;
  }

   /**
   * Unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the business line.
   * @return legalEntityId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the business line.")

  public String getLegalEntityId() {
    return legalEntityId;
  }


  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
  }


  public BusinessLine problems(List<CapabilityProblem> problems) {
    
    this.problems = problems;
    return this;
  }

  public BusinessLine addProblemsItem(CapabilityProblem problemsItem) {
    if (this.problems == null) {
      this.problems = new ArrayList<>();
    }
    this.problems.add(problemsItem);
    return this;
  }

   /**
   * List of the verification errors from capabilities for this supporting entity.
   * @return problems
  **/
  @ApiModelProperty(value = "List of the verification errors from capabilities for this supporting entity.")

  public List<CapabilityProblem> getProblems() {
    return problems;
  }


  public void setProblems(List<CapabilityProblem> problems) {
    this.problems = problems;
  }


  public BusinessLine salesChannels(List<String> salesChannels) {
    
    this.salesChannels = salesChannels;
    return this;
  }

  public BusinessLine addSalesChannelsItem(String salesChannelsItem) {
    if (this.salesChannels == null) {
      this.salesChannels = new ArrayList<>();
    }
    this.salesChannels.add(salesChannelsItem);
    return this;
  }

   /**
   * A list of channels where goods or services are sold.  Possible values: **pos**, **posMoto**, **eCommerce**, **ecomMoto**, **payByLink**.  Required only in combination with the &#x60;service&#x60; **paymentProcessing**.
   * @return salesChannels
  **/
  @ApiModelProperty(value = "A list of channels where goods or services are sold.  Possible values: **pos**, **posMoto**, **eCommerce**, **ecomMoto**, **payByLink**.  Required only in combination with the `service` **paymentProcessing**.")

  public List<String> getSalesChannels() {
    return salesChannels;
  }


  public void setSalesChannels(List<String> salesChannels) {
    this.salesChannels = salesChannels;
  }


  public BusinessLine service(ServiceEnum service) {
    
    this.service = service;
    return this;
  }

   /**
   * The service for which you are creating the business line.  Possible values: **paymentProcessing**, **issuing**, **banking**
   * @return service
  **/
  @ApiModelProperty(required = true, value = "The service for which you are creating the business line.  Possible values: **paymentProcessing**, **issuing**, **banking**")

  public ServiceEnum getService() {
    return service;
  }


  public void setService(ServiceEnum service) {
    this.service = service;
  }


  public BusinessLine sourceOfFunds(SourceOfFunds sourceOfFunds) {
    
    this.sourceOfFunds = sourceOfFunds;
    return this;
  }

   /**
   * Get sourceOfFunds
   * @return sourceOfFunds
  **/
  @ApiModelProperty(value = "")

  public SourceOfFunds getSourceOfFunds() {
    return sourceOfFunds;
  }


  public void setSourceOfFunds(SourceOfFunds sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
  }


  public BusinessLine webData(List<WebData> webData) {
    
    this.webData = webData;
    return this;
  }

  public BusinessLine addWebDataItem(WebData webDataItem) {
    if (this.webData == null) {
      this.webData = new ArrayList<>();
    }
    this.webData.add(webDataItem);
    return this;
  }

   /**
   * List of website URLs where your user&#39;s goods or services are sold. When this is required for a service but your user does not have an online presence, provide the reason in the &#x60;webDataExemption&#x60; object.
   * @return webData
  **/
  @ApiModelProperty(value = "List of website URLs where your user's goods or services are sold. When this is required for a service but your user does not have an online presence, provide the reason in the `webDataExemption` object.")

  public List<WebData> getWebData() {
    return webData;
  }


  public void setWebData(List<WebData> webData) {
    this.webData = webData;
  }


  public BusinessLine webDataExemption(WebDataExemption webDataExemption) {
    
    this.webDataExemption = webDataExemption;
    return this;
  }

   /**
   * Get webDataExemption
   * @return webDataExemption
  **/
  @ApiModelProperty(value = "")

  public WebDataExemption getWebDataExemption() {
    return webDataExemption;
  }


  public void setWebDataExemption(WebDataExemption webDataExemption) {
    this.webDataExemption = webDataExemption;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessLine businessLine = (BusinessLine) o;
    return Objects.equals(this.capability, businessLine.capability) &&
        Objects.equals(this.id, businessLine.id) &&
        Objects.equals(this.industryCode, businessLine.industryCode) &&
        Objects.equals(this.legalEntityId, businessLine.legalEntityId) &&
        Objects.equals(this.problems, businessLine.problems) &&
        Objects.equals(this.salesChannels, businessLine.salesChannels) &&
        Objects.equals(this.service, businessLine.service) &&
        Objects.equals(this.sourceOfFunds, businessLine.sourceOfFunds) &&
        Objects.equals(this.webData, businessLine.webData) &&
        Objects.equals(this.webDataExemption, businessLine.webDataExemption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capability, id, industryCode, legalEntityId, problems, salesChannels, service, sourceOfFunds, webData, webDataExemption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessLine {\n");
    sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    industryCode: ").append(toIndentedString(industryCode)).append("\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    problems: ").append(toIndentedString(problems)).append("\n");
    sb.append("    salesChannels: ").append(toIndentedString(salesChannels)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    sourceOfFunds: ").append(toIndentedString(sourceOfFunds)).append("\n");
    sb.append("    webData: ").append(toIndentedString(webData)).append("\n");
    sb.append("    webDataExemption: ").append(toIndentedString(webDataExemption)).append("\n");
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
    openapiFields.add("capability");
    openapiFields.add("id");
    openapiFields.add("industryCode");
    openapiFields.add("legalEntityId");
    openapiFields.add("problems");
    openapiFields.add("salesChannels");
    openapiFields.add("service");
    openapiFields.add("sourceOfFunds");
    openapiFields.add("webData");
    openapiFields.add("webDataExemption");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("industryCode");
    openapiRequiredFields.add("legalEntityId");
    openapiRequiredFields.add("service");
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(BusinessLine.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessLine
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BusinessLine.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessLine is not found in the empty JSON string", BusinessLine.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessLine.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `BusinessLine` properties.", entry.getKey()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BusinessLine.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the field capability can be parsed to an enum value
      if (jsonObj.get("capability") != null) {
        if(!jsonObj.get("capability").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `capability` to be a primitive type in the JSON string but got `%s`", jsonObj.get("capability").toString()));
        }
        CapabilityEnum.fromValue(jsonObj.get("capability").getAsString());
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field industryCode
      if (jsonObj.get("industryCode") != null && !jsonObj.get("industryCode").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `industryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("industryCode").toString()));
      }
      // validate the optional field legalEntityId
      if (jsonObj.get("legalEntityId") != null && !jsonObj.get("legalEntityId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `legalEntityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalEntityId").toString()));
      }
      JsonArray jsonArrayproblems = jsonObj.getAsJsonArray("problems");
      if (jsonArrayproblems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("problems").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `problems` to be an array in the JSON string but got `%s`", jsonObj.get("problems").toString()));
        }

        // validate the optional field `problems` (array)
        for (int i = 0; i < jsonArrayproblems.size(); i++) {
          CapabilityProblem.validateJsonObject(jsonArrayproblems.get(i).getAsJsonObject());
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("salesChannels") != null && !jsonObj.get("salesChannels").isJsonArray()) {
        log.log(Level.WARNING, String.format("Expected the field `salesChannels` to be an array in the JSON string but got `%s`", jsonObj.get("salesChannels").toString()));
      }
      // ensure the field service can be parsed to an enum value
      if (jsonObj.get("service") != null) {
        if(!jsonObj.get("service").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service").toString()));
        }
        ServiceEnum.fromValue(jsonObj.get("service").getAsString());
      }
      // validate the optional field `sourceOfFunds`
      if (jsonObj.getAsJsonObject("sourceOfFunds") != null) {
        SourceOfFunds.validateJsonObject(jsonObj.getAsJsonObject("sourceOfFunds"));
      }
      JsonArray jsonArraywebData = jsonObj.getAsJsonArray("webData");
      if (jsonArraywebData != null) {
        // ensure the json data is an array
        if (!jsonObj.get("webData").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `webData` to be an array in the JSON string but got `%s`", jsonObj.get("webData").toString()));
        }

        // validate the optional field `webData` (array)
        for (int i = 0; i < jsonArraywebData.size(); i++) {
          WebData.validateJsonObject(jsonArraywebData.get(i).getAsJsonObject());
        }
      }
      // validate the optional field `webDataExemption`
      if (jsonObj.getAsJsonObject("webDataExemption") != null) {
        WebDataExemption.validateJsonObject(jsonObj.getAsJsonObject("webDataExemption"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessLine.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessLine' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessLine> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessLine.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessLine>() {
           @Override
           public void write(JsonWriter out, BusinessLine value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessLine read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessLine given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessLine
  * @throws IOException if the JSON string is invalid with respect to BusinessLine
  */
  public static BusinessLine fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessLine.class);
  }

 /**
  * Convert an instance of BusinessLine to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

