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
 * UpdateMerchantApiCredentialRequest
 */
@JsonPropertyOrder({
  UpdateMerchantApiCredentialRequest.JSON_PROPERTY_ACTIVE,
  UpdateMerchantApiCredentialRequest.JSON_PROPERTY_ALLOWED_ORIGINS,
  UpdateMerchantApiCredentialRequest.JSON_PROPERTY_DESCRIPTION,
  UpdateMerchantApiCredentialRequest.JSON_PROPERTY_ROLES
})

public class UpdateMerchantApiCredentialRequest {
  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_ALLOWED_ORIGINS = "allowedOrigins";
  private List<String> allowedOrigins = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private List<String> roles = null;

  public UpdateMerchantApiCredentialRequest() { 
  }

  public UpdateMerchantApiCredentialRequest active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Indicates if the API credential is enabled.
   * @return active
  **/
  @ApiModelProperty(value = "Indicates if the API credential is enabled.")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public UpdateMerchantApiCredentialRequest allowedOrigins(List<String> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
    return this;
  }

  public UpdateMerchantApiCredentialRequest addAllowedOriginsItem(String allowedOriginsItem) {
    if (this.allowedOrigins == null) {
      this.allowedOrigins = new ArrayList<>();
    }
    this.allowedOrigins.add(allowedOriginsItem);
    return this;
  }

   /**
   * The new list of [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) for the API credential.
   * @return allowedOrigins
  **/
  @ApiModelProperty(value = "The new list of [allowed origins](https://docs.adyen.com/development-resources/client-side-authentication#allowed-origins) for the API credential.")
  @JsonProperty(JSON_PROPERTY_ALLOWED_ORIGINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAllowedOrigins() {
    return allowedOrigins;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_ORIGINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedOrigins(List<String> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
  }


  public UpdateMerchantApiCredentialRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the API credential.
   * @return description
  **/
  @ApiModelProperty(value = "Description of the API credential.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateMerchantApiCredentialRequest roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public UpdateMerchantApiCredentialRequest addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * List of [roles](https://docs.adyen.com/development-resources/api-credentials#roles-1) for the API credential. Only roles assigned to &#39;ws@Company.&lt;CompanyName&gt;&#39; can be assigned to other API credentials.
   * @return roles
  **/
  @ApiModelProperty(value = "List of [roles](https://docs.adyen.com/development-resources/api-credentials#roles-1) for the API credential. Only roles assigned to 'ws@Company.<CompanyName>' can be assigned to other API credentials.")
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRoles() {
    return roles;
  }


  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  /**
   * Return true if this UpdateMerchantApiCredentialRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMerchantApiCredentialRequest updateMerchantApiCredentialRequest = (UpdateMerchantApiCredentialRequest) o;
    return Objects.equals(this.active, updateMerchantApiCredentialRequest.active) &&
        Objects.equals(this.allowedOrigins, updateMerchantApiCredentialRequest.allowedOrigins) &&
        Objects.equals(this.description, updateMerchantApiCredentialRequest.description) &&
        Objects.equals(this.roles, updateMerchantApiCredentialRequest.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, allowedOrigins, description, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMerchantApiCredentialRequest {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    allowedOrigins: ").append(toIndentedString(allowedOrigins)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
   * Create an instance of UpdateMerchantApiCredentialRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateMerchantApiCredentialRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to UpdateMerchantApiCredentialRequest
   */
  public static UpdateMerchantApiCredentialRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, UpdateMerchantApiCredentialRequest.class);
  }
/**
  * Convert an instance of UpdateMerchantApiCredentialRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
