/*
 * Adyen BinLookup API
 * The BIN Lookup API provides endpoints for retrieving information, such as cost estimates, and 3D Secure supported version based on a given BIN.  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning The BinLookup API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/BinLookup/v54/get3dsAvailability ```## Going live  To authneticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/BinLookup/v54/get3dsAvailability ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 54
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.binlookup;

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
 * DSPublicKeyDetail
 */
@JsonPropertyOrder({
  DSPublicKeyDetail.JSON_PROPERTY_BRAND,
  DSPublicKeyDetail.JSON_PROPERTY_DIRECTORY_SERVER_ID,
  DSPublicKeyDetail.JSON_PROPERTY_FROM_S_D_K_VERSION,
  DSPublicKeyDetail.JSON_PROPERTY_PUBLIC_KEY
})

public class DSPublicKeyDetail {
  public static final String JSON_PROPERTY_BRAND = "brand";
  private String brand;

  public static final String JSON_PROPERTY_DIRECTORY_SERVER_ID = "directoryServerId";
  private String directoryServerId;

  public static final String JSON_PROPERTY_FROM_S_D_K_VERSION = "fromSDKVersion";
  private String fromSDKVersion;

  public static final String JSON_PROPERTY_PUBLIC_KEY = "publicKey";
  private byte[] publicKey;

  public DSPublicKeyDetail() { 
  }

  public DSPublicKeyDetail brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Card brand.
   * @return brand
  **/
  @ApiModelProperty(value = "Card brand.")
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrand() {
    return brand;
  }


  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrand(String brand) {
    this.brand = brand;
  }


  public DSPublicKeyDetail directoryServerId(String directoryServerId) {
    this.directoryServerId = directoryServerId;
    return this;
  }

   /**
   * Directory Server (DS) identifier.
   * @return directoryServerId
  **/
  @ApiModelProperty(value = "Directory Server (DS) identifier.")
  @JsonProperty(JSON_PROPERTY_DIRECTORY_SERVER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDirectoryServerId() {
    return directoryServerId;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTORY_SERVER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirectoryServerId(String directoryServerId) {
    this.directoryServerId = directoryServerId;
  }


  public DSPublicKeyDetail fromSDKVersion(String fromSDKVersion) {
    this.fromSDKVersion = fromSDKVersion;
    return this;
  }

   /**
   * The version of the mobile 3D Secure 2 SDK. For the possible values, refer to the versions in [Adyen 3DS2 Android](https://github.com/Adyen/adyen-3ds2-android/releases) and [Adyen 3DS2 iOS](https://github.com/Adyen/adyen-3ds2-ios/releases).
   * @return fromSDKVersion
  **/
  @ApiModelProperty(value = "The version of the mobile 3D Secure 2 SDK. For the possible values, refer to the versions in [Adyen 3DS2 Android](https://github.com/Adyen/adyen-3ds2-android/releases) and [Adyen 3DS2 iOS](https://github.com/Adyen/adyen-3ds2-ios/releases).")
  @JsonProperty(JSON_PROPERTY_FROM_S_D_K_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromSDKVersion() {
    return fromSDKVersion;
  }


  @JsonProperty(JSON_PROPERTY_FROM_S_D_K_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromSDKVersion(String fromSDKVersion) {
    this.fromSDKVersion = fromSDKVersion;
  }


  public DSPublicKeyDetail publicKey(byte[] publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Public key. The 3D Secure 2 SDK encrypts the device information by using the DS public key.
   * @return publicKey
  **/
  @ApiModelProperty(value = "Public key. The 3D Secure 2 SDK encrypts the device information by using the DS public key.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getPublicKey() {
    return publicKey;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicKey(byte[] publicKey) {
    this.publicKey = publicKey;
  }


  /**
   * Return true if this DSPublicKeyDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DSPublicKeyDetail dsPublicKeyDetail = (DSPublicKeyDetail) o;
    return Objects.equals(this.brand, dsPublicKeyDetail.brand) &&
        Objects.equals(this.directoryServerId, dsPublicKeyDetail.directoryServerId) &&
        Objects.equals(this.fromSDKVersion, dsPublicKeyDetail.fromSDKVersion) &&
        Arrays.equals(this.publicKey, dsPublicKeyDetail.publicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, directoryServerId, fromSDKVersion, Arrays.hashCode(publicKey));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSPublicKeyDetail {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    directoryServerId: ").append(toIndentedString(directoryServerId)).append("\n");
    sb.append("    fromSDKVersion: ").append(toIndentedString(fromSDKVersion)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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
   * Create an instance of DSPublicKeyDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DSPublicKeyDetail
   * @throws JsonProcessingException if the JSON string is invalid with respect to DSPublicKeyDetail
   */
  public static DSPublicKeyDetail fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DSPublicKeyDetail.class);
  }
/**
  * Convert an instance of DSPublicKeyDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

