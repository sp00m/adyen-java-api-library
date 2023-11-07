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
import java.util.Map;
import java.util.HashMap;
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
 * GetTermsOfServiceDocumentRequest
 */
@JsonPropertyOrder({
  GetTermsOfServiceDocumentRequest.JSON_PROPERTY_LANGUAGE,
  GetTermsOfServiceDocumentRequest.JSON_PROPERTY_TYPE
})

public class GetTermsOfServiceDocumentRequest {
  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  /**
   * The type of Terms of Service.  Possible values: *  **adyenForPlatformsManage** *  **adyenIssuing** *  **adyenForPlatformsAdvanced** *  **adyenCapital** *  **adyenAccount** *  **adyenCard** *  **adyenFranchisee**  
   */
  public enum TypeEnum {
    ADYENACCOUNT("adyenAccount"),
    
    ADYENCAPITAL("adyenCapital"),
    
    ADYENCARD("adyenCard"),
    
    ADYENFORPLATFORMSADVANCED("adyenForPlatformsAdvanced"),
    
    ADYENFORPLATFORMSMANAGE("adyenForPlatformsManage"),
    
    ADYENFRANCHISEE("adyenFranchisee"),
    
    ADYENISSUING("adyenIssuing");

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

  public GetTermsOfServiceDocumentRequest() { 
  }

  public GetTermsOfServiceDocumentRequest language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language to be used for the Terms of Service document, specified by the two-letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code. Possible value: **en** for English.
   * @return language
  **/
  @ApiModelProperty(required = true, value = "The language to be used for the Terms of Service document, specified by the two-letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code. Possible value: **en** for English.")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public GetTermsOfServiceDocumentRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of Terms of Service.  Possible values: *  **adyenForPlatformsManage** *  **adyenIssuing** *  **adyenForPlatformsAdvanced** *  **adyenCapital** *  **adyenAccount** *  **adyenCard** *  **adyenFranchisee**  
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of Terms of Service.  Possible values: *  **adyenForPlatformsManage** *  **adyenIssuing** *  **adyenForPlatformsAdvanced** *  **adyenCapital** *  **adyenAccount** *  **adyenCard** *  **adyenFranchisee**  ")
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
   * Return true if this GetTermsOfServiceDocumentRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTermsOfServiceDocumentRequest getTermsOfServiceDocumentRequest = (GetTermsOfServiceDocumentRequest) o;
    return Objects.equals(this.language, getTermsOfServiceDocumentRequest.language) &&
        Objects.equals(this.type, getTermsOfServiceDocumentRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTermsOfServiceDocumentRequest {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
   * Create an instance of GetTermsOfServiceDocumentRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetTermsOfServiceDocumentRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to GetTermsOfServiceDocumentRequest
   */
  public static GetTermsOfServiceDocumentRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, GetTermsOfServiceDocumentRequest.class);
  }
/**
  * Convert an instance of GetTermsOfServiceDocumentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

