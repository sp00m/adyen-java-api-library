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

package com.adyen.service.balanceplatform;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.balanceplatform.RegisterSCAFinalResponse;
import com.adyen.model.balanceplatform.RegisterSCARequest;
import com.adyen.model.balanceplatform.RegisterSCAResponse;
import com.adyen.model.balanceplatform.RestServiceError;
import com.adyen.model.balanceplatform.SearchRegisteredDevicesResponse;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ManageScaDevicesApi extends Service {

    public static final String API_VERSION = "2";

    protected String baseURL;

    /**
    * Manage SCA devices constructor in {@link com.adyen.service.balanceplatform package}.
    * @param client {@link Client } (required)
    */
    public ManageScaDevicesApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://balanceplatform-api-test.adyen.com/bcl/v2");
    }

    /**
    * Manage SCA devices constructor in {@link com.adyen.service.balanceplatform package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public ManageScaDevicesApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Complete the registration of an SCA device
    *
    * @param id {@link String } The unique identifier of the SCA device. You obtain this &#x60;id&#x60; in the response of a POST&amp;nbsp;[/registeredDevices](https://docs.adyen.com/api-explorer/balanceplatform/2/post/registeredDevices#responses-200-id) request. (required)
    * @param registerSCARequest {@link RegisterSCARequest }  (required)
    * @return {@link RegisterSCAFinalResponse }
    * @throws ApiException if fails to make API call
    */
    public RegisterSCAFinalResponse completeRegistrationOfScaDevice(String id, RegisterSCARequest registerSCARequest) throws ApiException, IOException {
        return completeRegistrationOfScaDevice(id, registerSCARequest, null);
    }

    /**
    * Complete the registration of an SCA device
    *
    * @param id {@link String } The unique identifier of the SCA device. You obtain this &#x60;id&#x60; in the response of a POST&amp;nbsp;[/registeredDevices](https://docs.adyen.com/api-explorer/balanceplatform/2/post/registeredDevices#responses-200-id) request. (required)
    * @param registerSCARequest {@link RegisterSCARequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link RegisterSCAFinalResponse }
    * @throws ApiException if fails to make API call
    */
    public RegisterSCAFinalResponse completeRegistrationOfScaDevice(String id, RegisterSCARequest registerSCARequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = registerSCARequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/registeredDevices/{id}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return RegisterSCAFinalResponse.fromJson(jsonResult);
    }

    /**
    * Delete a registration of an SCA device
    *
    * @param id {@link String } The unique identifier of the SCA device. (required)
    * @param paymentInstrumentId {@link String } The unique identifier of the payment instrument linked to the SCA device. (required)
    * @throws ApiException if fails to make API call
    */
    public void deleteRegistrationOfScaDevice(String id, String paymentInstrumentId) throws ApiException, IOException {
        deleteRegistrationOfScaDevice(id, paymentInstrumentId,  null);
    }

    /**
    * Delete a registration of an SCA device
    *
    * @param id {@link String } The unique identifier of the SCA device. (required)
    * @param paymentInstrumentId {@link String } Query: The unique identifier of the payment instrument linked to the SCA device. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @throws ApiException if fails to make API call
    */
    public void deleteRegistrationOfScaDevice(String id, String paymentInstrumentId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (paymentInstrumentId != null) {
        queryParams.put("paymentInstrumentId", paymentInstrumentId);
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/registeredDevices/{id}", null);
        resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.DELETE, pathParams, queryParams);
    }

    /**
    * Initiate the registration of an SCA device
    *
    * @param registerSCARequest {@link RegisterSCARequest }  (required)
    * @return {@link RegisterSCAResponse }
    * @throws ApiException if fails to make API call
    */
    public RegisterSCAResponse initiateRegistrationOfScaDevice(RegisterSCARequest registerSCARequest) throws ApiException, IOException {
        return initiateRegistrationOfScaDevice(registerSCARequest, null);
    }

    /**
    * Initiate the registration of an SCA device
    *
    * @param registerSCARequest {@link RegisterSCARequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link RegisterSCAResponse }
    * @throws ApiException if fails to make API call
    */
    public RegisterSCAResponse initiateRegistrationOfScaDevice(RegisterSCARequest registerSCARequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = registerSCARequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/registeredDevices", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return RegisterSCAResponse.fromJson(jsonResult);
    }

    /**
    * Get a list of registered SCA devices
    *
    * @param paymentInstrumentId {@link String } The unique identifier of a payment instrument. It limits the returned list to SCA devices associated to this payment instrument. (required)
    * @return {@link SearchRegisteredDevicesResponse }
    * @throws ApiException if fails to make API call
    */
    public SearchRegisteredDevicesResponse listRegisteredScaDevices(String paymentInstrumentId) throws ApiException, IOException {
        return listRegisteredScaDevices(paymentInstrumentId,  null,  null,  null);
    }

    /**
    * Get a list of registered SCA devices
    *
    * @param paymentInstrumentId {@link String } Query: The unique identifier of a payment instrument. It limits the returned list to SCA devices associated to this payment instrument. (required)
    * @param pageNumber {@link Integer } Query: The index of the page to retrieve. The index of the first page is 0 (zero).  Default: 0. (optional)
    * @param pageSize {@link Integer } Query: The number of items to have on a page.  Default: 20. Maximum: 100. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link SearchRegisteredDevicesResponse }
    * @throws ApiException if fails to make API call
    */
    public SearchRegisteredDevicesResponse listRegisteredScaDevices(String paymentInstrumentId, Integer pageNumber, Integer pageSize, RequestOptions requestOptions) throws ApiException, IOException {
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (paymentInstrumentId != null) {
        queryParams.put("paymentInstrumentId", paymentInstrumentId);
        }
        if (pageNumber != null) {
        queryParams.put("pageNumber", pageNumber.toString());
        }
        if (pageSize != null) {
        queryParams.put("pageSize", pageSize.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/registeredDevices", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, null, queryParams);
        return SearchRegisteredDevicesResponse.fromJson(jsonResult);
    }
}