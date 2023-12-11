/*
 * Disputes API
 * You can use the [Disputes API](https://docs.adyen.com/risk-management/disputes-api) to automate the dispute handling process so that you can respond to disputes and chargebacks as soon as they are initiated. The Disputes API lets you retrieve defense reasons, supply and delete defense documents, and accept or defend disputes.  ## Authentication Each request to the Disputes API must be signed with an API key. For this, obtain an API Key from your Customer Area, as described in [How to get the API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key). Then set this key to the `X-API-Key` header value, for example:  ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: Your_API_key\" \\ ... ``` Note that when going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning Disputes API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://ca-test.adyen.com/ca/services/DisputeService/v30/defendDispute ```
 *
 * The version of the OpenAPI document: 30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.disputes;

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
 * DefenseDocument
 */
@JsonPropertyOrder({
  DefenseDocument.JSON_PROPERTY_CONTENT,
  DefenseDocument.JSON_PROPERTY_CONTENT_TYPE,
  DefenseDocument.JSON_PROPERTY_DEFENSE_DOCUMENT_TYPE_CODE
})

public class DefenseDocument {
  public static final String JSON_PROPERTY_CONTENT = "content";
  private byte[] content;

  public static final String JSON_PROPERTY_CONTENT_TYPE = "contentType";
  private String contentType;

  public static final String JSON_PROPERTY_DEFENSE_DOCUMENT_TYPE_CODE = "defenseDocumentTypeCode";
  private String defenseDocumentTypeCode;

  public DefenseDocument() { 
  }

  public DefenseDocument content(byte[] content) {
    this.content = content;
    return this;
  }

   /**
   * The content of the defense document.
   * @return content
  **/
  @ApiModelProperty(required = true, value = "The content of the defense document.")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(byte[] content) {
    this.content = content;
  }


  public DefenseDocument contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * The content type of the defense document.
   * @return contentType
  **/
  @ApiModelProperty(required = true, value = "The content type of the defense document.")
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentType() {
    return contentType;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public DefenseDocument defenseDocumentTypeCode(String defenseDocumentTypeCode) {
    this.defenseDocumentTypeCode = defenseDocumentTypeCode;
    return this;
  }

   /**
   * The document type code of the defense document.
   * @return defenseDocumentTypeCode
  **/
  @ApiModelProperty(required = true, value = "The document type code of the defense document.")
  @JsonProperty(JSON_PROPERTY_DEFENSE_DOCUMENT_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefenseDocumentTypeCode() {
    return defenseDocumentTypeCode;
  }


  @JsonProperty(JSON_PROPERTY_DEFENSE_DOCUMENT_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefenseDocumentTypeCode(String defenseDocumentTypeCode) {
    this.defenseDocumentTypeCode = defenseDocumentTypeCode;
  }


  /**
   * Return true if this DefenseDocument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefenseDocument defenseDocument = (DefenseDocument) o;
    return Arrays.equals(this.content, defenseDocument.content) &&
        Objects.equals(this.contentType, defenseDocument.contentType) &&
        Objects.equals(this.defenseDocumentTypeCode, defenseDocument.defenseDocumentTypeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(content), contentType, defenseDocumentTypeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefenseDocument {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    defenseDocumentTypeCode: ").append(toIndentedString(defenseDocumentTypeCode)).append("\n");
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
   * Create an instance of DefenseDocument given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DefenseDocument
   * @throws JsonProcessingException if the JSON string is invalid with respect to DefenseDocument
   */
  public static DefenseDocument fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DefenseDocument.class);
  }
/**
  * Convert an instance of DefenseDocument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
