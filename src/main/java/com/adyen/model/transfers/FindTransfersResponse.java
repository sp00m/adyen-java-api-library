/*
 * Transfers API
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.transfers.Links;
import com.adyen.model.transfers.TransferData;
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
 * FindTransfersResponse
 */
@JsonPropertyOrder({
  FindTransfersResponse.JSON_PROPERTY_LINKS,
  FindTransfersResponse.JSON_PROPERTY_DATA
})

public class FindTransfersResponse {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private Links links;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<TransferData> data = null;

  public FindTransfersResponse() { 
  }

  /**
   * links
   *
   * @param links
   * @return the current {@code FindTransfersResponse} instance, allowing for method chaining
   */
  public FindTransfersResponse links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * links
   * @return links
   */
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Links getLinks() {
    return links;
  }

  /**
   * links
   *
   * @param links
   */ 
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(Links links) {
    this.links = links;
  }

  /**
   * Contains the transfers that match the query parameters.
   *
   * @param data
   * @return the current {@code FindTransfersResponse} instance, allowing for method chaining
   */
  public FindTransfersResponse data(List<TransferData> data) {
    this.data = data;
    return this;
  }

  public FindTransfersResponse addDataItem(TransferData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Contains the transfers that match the query parameters.
   * @return data
   */
  @ApiModelProperty(value = "Contains the transfers that match the query parameters.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TransferData> getData() {
    return data;
  }

  /**
   * Contains the transfers that match the query parameters.
   *
   * @param data
   */ 
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<TransferData> data) {
    this.data = data;
  }

  /**
   * Return true if this FindTransfersResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindTransfersResponse findTransfersResponse = (FindTransfersResponse) o;
    return Objects.equals(this.links, findTransfersResponse.links) &&
        Objects.equals(this.data, findTransfersResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindTransfersResponse {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
   * Create an instance of FindTransfersResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FindTransfersResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to FindTransfersResponse
   */
  public static FindTransfersResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, FindTransfersResponse.class);
  }
/**
  * Convert an instance of FindTransfersResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
