/*
 * Adyen Terminal API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.terminal;

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
 * GeographicCoordinates
 */
@JsonPropertyOrder({
  GeographicCoordinates.JSON_PROPERTY_LATITUDE,
  GeographicCoordinates.JSON_PROPERTY_LONGITUDE
})

public class GeographicCoordinates {
  public static final String JSON_PROPERTY_LATITUDE = "Latitude";
  private String latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "Longitude";
  private String longitude;

  public GeographicCoordinates() { 
  }

  public GeographicCoordinates latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLatitude() {
    return latitude;
  }


 /**
  * latitude
  *
  * @param latitude
  */ 
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }


  public GeographicCoordinates longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLongitude() {
    return longitude;
  }


 /**
  * longitude
  *
  * @param longitude
  */ 
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  /**
   * Return true if this GeographicCoordinates object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicCoordinates geographicCoordinates = (GeographicCoordinates) o;
    return Objects.equals(this.latitude, geographicCoordinates.latitude) &&
        Objects.equals(this.longitude, geographicCoordinates.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicCoordinates {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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
   * Create an instance of GeographicCoordinates given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GeographicCoordinates
   * @throws JsonProcessingException if the JSON string is invalid with respect to GeographicCoordinates
   */
  public static GeographicCoordinates fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, GeographicCoordinates.class);
  }
/**
  * Convert an instance of GeographicCoordinates to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
