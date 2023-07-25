/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.management.Profile;
import com.adyen.model.management.Settings;
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
 * WifiProfiles
 */
@JsonPropertyOrder({
  WifiProfiles.JSON_PROPERTY_PROFILES,
  WifiProfiles.JSON_PROPERTY_SETTINGS
})

public class WifiProfiles {
  public static final String JSON_PROPERTY_PROFILES = "profiles";
  private List<Profile> profiles = null;

  public static final String JSON_PROPERTY_SETTINGS = "settings";
  private Settings settings;

  public WifiProfiles() { 
  }

  public WifiProfiles profiles(List<Profile> profiles) {
    this.profiles = profiles;
    return this;
  }

  public WifiProfiles addProfilesItem(Profile profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

   /**
   * List of remote Wi-Fi profiles.
   * @return profiles
  **/
  @ApiModelProperty(value = "List of remote Wi-Fi profiles.")
  @JsonProperty(JSON_PROPERTY_PROFILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Profile> getProfiles() {
    return profiles;
  }


  @JsonProperty(JSON_PROPERTY_PROFILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfiles(List<Profile> profiles) {
    this.profiles = profiles;
  }


  public WifiProfiles settings(Settings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Settings getSettings() {
    return settings;
  }


  @JsonProperty(JSON_PROPERTY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettings(Settings settings) {
    this.settings = settings;
  }


  /**
   * Return true if this WifiProfiles object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WifiProfiles wifiProfiles = (WifiProfiles) o;
    return Objects.equals(this.profiles, wifiProfiles.profiles) &&
        Objects.equals(this.settings, wifiProfiles.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profiles, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WifiProfiles {\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
   * Create an instance of WifiProfiles given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of WifiProfiles
   * @throws JsonProcessingException if the JSON string is invalid with respect to WifiProfiles
   */
  public static WifiProfiles fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, WifiProfiles.class);
  }
/**
  * Convert an instance of WifiProfiles to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

