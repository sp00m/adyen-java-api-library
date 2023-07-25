/*
 * Adyen Payout API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.payout;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.payout.PayoutRequest;
import com.adyen.model.payout.PayoutResponse;
import com.adyen.model.payout.ServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class InstantPayoutsApi extends Service {
    private final String baseURL;

    public InstantPayoutsApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://pal-test.adyen.com/pal/servlet/Payout/v68");
    }

    /**
    * Make an instant card payout
    *
    * @param payoutRequest {@link PayoutRequest }  (required)
    * @return {@link PayoutResponse }
    * @throws ApiException if fails to make API call
    */
    public PayoutResponse payout(PayoutRequest payoutRequest) throws ApiException, IOException {
        return payout(payoutRequest, null);
    }

    /**
    * Make an instant card payout
    *
    * @param payoutRequest {@link PayoutRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PayoutResponse }
    * @throws ApiException if fails to make API call
    */
    public PayoutResponse payout(PayoutRequest payoutRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = payoutRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/payout", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return PayoutResponse.fromJson(jsonResult);
    }
}
