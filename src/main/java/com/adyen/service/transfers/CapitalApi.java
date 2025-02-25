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

package com.adyen.service.transfers;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.transfers.CapitalGrant;
import com.adyen.model.transfers.CapitalGrantInfo;
import com.adyen.model.transfers.CapitalGrants;
import com.adyen.model.transfers.RestServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CapitalApi extends Service {

    public static final String API_VERSION = "4";

    protected String baseURL;

    /**
    * Capital constructor in {@link com.adyen.service.transfers package}.
    * @param client {@link Client } (required)
    */
    public CapitalApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://balanceplatform-api-test.adyen.com/btl/v4");
    }

    /**
    * Capital constructor in {@link com.adyen.service.transfers package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public CapitalApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Get a capital account
    *
    * @return {@link CapitalGrants }
    * @throws ApiException if fails to make API call
    * @deprecated since Transfers API v4
    * Use the `/grants` endpoint from the [Capital API](https://docs.adyen.com/api-explorer/capital/latest/get/grants) instead.
    */
    @Deprecated
    public CapitalGrants getCapitalAccount() throws ApiException, IOException {
        return getCapitalAccount(null,  null);
    }

    /**
    * Get a capital account
    *
    * @param counterpartyAccountHolderId {@link String } Query: The counterparty account holder id. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link CapitalGrants }
    * @throws ApiException if fails to make API call
    * @deprecated since Transfers API v4
    * Use the `/grants` endpoint from the [Capital API](https://docs.adyen.com/api-explorer/capital/latest/get/grants) instead.
    */
   @Deprecated
    public CapitalGrants getCapitalAccount(String counterpartyAccountHolderId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (counterpartyAccountHolderId != null) {
        queryParams.put("counterpartyAccountHolderId", counterpartyAccountHolderId);
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/grants", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, null, queryParams);
        return CapitalGrants.fromJson(jsonResult);
    }

    /**
    * Get grant reference details
    *
    * @param id {@link String } The unique identifier of the grant. (required)
    * @return {@link CapitalGrant }
    * @throws ApiException if fails to make API call
    * @deprecated since Transfers API v4
    * Use the `/grants/{grantId}` endpoint from the [Capital API](https://docs.adyen.com/api-explorer/capital/latest/get/grants/(grantId)) instead.
    */
    @Deprecated
    public CapitalGrant getGrantReferenceDetails(String id) throws ApiException, IOException {
        return getGrantReferenceDetails(id, null);
    }

    /**
    * Get grant reference details
    *
    * @param id {@link String } The unique identifier of the grant. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link CapitalGrant }
    * @throws ApiException if fails to make API call
    * @deprecated since Transfers API v4
    * Use the `/grants/{grantId}` endpoint from the [Capital API](https://docs.adyen.com/api-explorer/capital/latest/get/grants/(grantId)) instead.
    */
   @Deprecated
    public CapitalGrant getGrantReferenceDetails(String id, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/grants/{id}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return CapitalGrant.fromJson(jsonResult);
    }

    /**
    * Request a grant payout
    *
    * @param capitalGrantInfo {@link CapitalGrantInfo }  (required)
    * @return {@link CapitalGrant }
    * @throws ApiException if fails to make API call
    * @deprecated since Transfers API v4
    * Use the `/grants` endpoint from the [Capital API](https://docs.adyen.com/api-explorer/capital/latest/post/grants) instead.
    */
    @Deprecated
    public CapitalGrant requestGrantPayout(CapitalGrantInfo capitalGrantInfo) throws ApiException, IOException {
        return requestGrantPayout(capitalGrantInfo, null);
    }

    /**
    * Request a grant payout
    *
    * @param capitalGrantInfo {@link CapitalGrantInfo }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link CapitalGrant }
    * @throws ApiException if fails to make API call
    * @deprecated since Transfers API v4
    * Use the `/grants` endpoint from the [Capital API](https://docs.adyen.com/api-explorer/capital/latest/post/grants) instead.
    */
   @Deprecated
    public CapitalGrant requestGrantPayout(CapitalGrantInfo capitalGrantInfo, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = capitalGrantInfo.toJson();
        Resource resource = new Resource(this, this.baseURL + "/grants", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return CapitalGrant.fromJson(jsonResult);
    }
}
