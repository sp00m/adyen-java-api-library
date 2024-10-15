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
import com.adyen.model.transfers.ApproveTransfersRequest;
import com.adyen.model.transfers.CancelTransfersRequest;
import com.adyen.model.transfers.FindTransfersResponse;
import java.time.OffsetDateTime;
import com.adyen.model.transfers.ReturnTransferRequest;
import com.adyen.model.transfers.ReturnTransferResponse;
import com.adyen.model.transfers.ServiceError;
import com.adyen.model.transfers.Transfer;
import com.adyen.model.transfers.TransferData;
import com.adyen.model.transfers.TransferInfo;
import com.adyen.model.transfers.TransferServiceRestServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TransfersApi extends Service {

    public static final String API_VERSION = "4";

    protected String baseURL;

    /**
    * Transfers constructor in {@link com.adyen.service.transfers package}.
    * @param client {@link Client } (required)
    */
    public TransfersApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://balanceplatform-api-test.adyen.com/btl/v4");
    }

    /**
    * Transfers constructor in {@link com.adyen.service.transfers package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public TransfersApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Approve initiated transfers
    *
    * @param approveTransfersRequest {@link ApproveTransfersRequest }  (required)
    * @throws ApiException if fails to make API call
    */
    public void approveInitiatedTransfers(ApproveTransfersRequest approveTransfersRequest) throws ApiException, IOException {
        approveInitiatedTransfers(approveTransfersRequest, null);
    }

    /**
    * Approve initiated transfers
    *
    * @param approveTransfersRequest {@link ApproveTransfersRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @throws ApiException if fails to make API call
    */
    public void approveInitiatedTransfers(ApproveTransfersRequest approveTransfersRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = approveTransfersRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/transfers/approve", null);
        resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
    }

    /**
    * Cancel initiated transfers
    *
    * @param cancelTransfersRequest {@link CancelTransfersRequest }  (required)
    * @throws ApiException if fails to make API call
    */
    public void cancelInitiatedTransfers(CancelTransfersRequest cancelTransfersRequest) throws ApiException, IOException {
        cancelInitiatedTransfers(cancelTransfersRequest, null);
    }

    /**
    * Cancel initiated transfers
    *
    * @param cancelTransfersRequest {@link CancelTransfersRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @throws ApiException if fails to make API call
    */
    public void cancelInitiatedTransfers(CancelTransfersRequest cancelTransfersRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = cancelTransfersRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/transfers/cancel", null);
        resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
    }

    /**
    * Get all transfers
    *
    * @param createdSince {@link OffsetDateTime } Only include transfers that have been created on or after this point in time. The value must be in ISO 8601 format. For example, **2021-05-30T15:07:40Z**. (required)
    * @param createdUntil {@link OffsetDateTime } Only include transfers that have been created on or before this point in time. The value must be in ISO 8601 format. For example, **2021-05-30T15:07:40Z**. (required)
    * @return {@link FindTransfersResponse }
    * @throws ApiException if fails to make API call
    */
    public FindTransfersResponse getAllTransfers(OffsetDateTime createdSince, OffsetDateTime createdUntil) throws ApiException, IOException {
        return getAllTransfers(null,  null,  null,  null,  null,  null,  createdSince,  createdUntil,  null,  null,  null);
    }

    /**
    * Get all transfers
    *
    * @param balancePlatform {@link String } Query: The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balancePlatforms/{id}__queryParam_id).  Required if you don&#39;t provide a &#x60;balanceAccountId&#x60; or &#x60;accountHolderId&#x60;. (optional)
    * @param accountHolderId {@link String } Query: The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/accountHolders/{id}__queryParam_id).  Required if you don&#39;t provide a &#x60;balanceAccountId&#x60; or &#x60;balancePlatform&#x60;.  If you provide a &#x60;balanceAccountId&#x60;, the &#x60;accountHolderId&#x60; must be related to the &#x60;balanceAccountId&#x60;. (optional)
    * @param balanceAccountId {@link String } Query: The unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__queryParam_id).  Required if you don&#39;t provide an &#x60;accountHolderId&#x60; or &#x60;balancePlatform&#x60;.  If you provide an &#x60;accountHolderId&#x60;, the &#x60;balanceAccountId&#x60; must be related to the &#x60;accountHolderId&#x60;. (optional)
    * @param paymentInstrumentId {@link String } Query: The unique identifier of the [payment instrument](https://docs.adyen.com/api-explorer/balanceplatform/latest/get/paymentInstruments/_id_).  To use this parameter, you must also provide a &#x60;balanceAccountId&#x60;, &#x60;accountHolderId&#x60;, or &#x60;balancePlatform&#x60;.  The &#x60;paymentInstrumentId&#x60; must be related to the &#x60;balanceAccountId&#x60; or &#x60;accountHolderId&#x60; that you provide. (optional)
    * @param reference {@link String } Query: The reference you provided in the POST [/transfers](https://docs.adyen.com/api-explorer/transfers/latest/post/transfers) request (optional)
    * @param category {@link String } Query: The type of transfer.  Possible values:   - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account.  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  - **issuedCard**: Transfer initiated by a Adyen-issued card.  - **platformPayment**: Fund movements related to payments that are acquired for your users. (optional)
    * @param createdSince {@link OffsetDateTime } Query: Only include transfers that have been created on or after this point in time. The value must be in ISO 8601 format. For example, **2021-05-30T15:07:40Z**. (required)
    * @param createdUntil {@link OffsetDateTime } Query: Only include transfers that have been created on or before this point in time. The value must be in ISO 8601 format. For example, **2021-05-30T15:07:40Z**. (required)
    * @param cursor {@link String } Query: The &#x60;cursor&#x60; returned in the links of the previous response. (optional)
    * @param limit {@link Integer } Query: The number of items returned per page, maximum of 100 items. By default, the response returns 10 items per page. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link FindTransfersResponse }
    * @throws ApiException if fails to make API call
    */
    public FindTransfersResponse getAllTransfers(String balancePlatform, String accountHolderId, String balanceAccountId, String paymentInstrumentId, String reference, String category, OffsetDateTime createdSince, OffsetDateTime createdUntil, String cursor, Integer limit, RequestOptions requestOptions) throws ApiException, IOException {
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (balancePlatform != null) {
        queryParams.put("balancePlatform", balancePlatform);
        }
        if (accountHolderId != null) {
        queryParams.put("accountHolderId", accountHolderId);
        }
        if (balanceAccountId != null) {
        queryParams.put("balanceAccountId", balanceAccountId);
        }
        if (paymentInstrumentId != null) {
        queryParams.put("paymentInstrumentId", paymentInstrumentId);
        }
        if (reference != null) {
        queryParams.put("reference", reference);
        }
        if (category != null) {
        queryParams.put("category", category);
        }
        if (createdSince != null) {
        queryParams.put("createdSince", createdSince.toString());
        }
        if (createdUntil != null) {
        queryParams.put("createdUntil", createdUntil.toString());
        }
        if (cursor != null) {
        queryParams.put("cursor", cursor);
        }
        if (limit != null) {
        queryParams.put("limit", limit.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/transfers", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, null, queryParams);
        return FindTransfersResponse.fromJson(jsonResult);
    }

    /**
    * Get a transfer
    *
    * @param id {@link String } Unique identifier of the transfer. (required)
    * @return {@link TransferData }
    * @throws ApiException if fails to make API call
    */
    public TransferData getTransfer(String id) throws ApiException, IOException {
        return getTransfer(id, null);
    }

    /**
    * Get a transfer
    *
    * @param id {@link String } Unique identifier of the transfer. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link TransferData }
    * @throws ApiException if fails to make API call
    */
    public TransferData getTransfer(String id, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (id == null) {
            throw new IllegalArgumentException("Please provide the id path parameter");
        }
        pathParams.put("id", id);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/transfers/{id}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return TransferData.fromJson(jsonResult);
    }

    /**
    * Return a transfer
    *
    * @param transferId {@link String } The unique identifier of the transfer to be returned. (required)
    * @param returnTransferRequest {@link ReturnTransferRequest }  (required)
    * @return {@link ReturnTransferResponse }
    * @throws ApiException if fails to make API call
    */
    public ReturnTransferResponse returnTransfer(String transferId, ReturnTransferRequest returnTransferRequest) throws ApiException, IOException {
        return returnTransfer(transferId, returnTransferRequest, null);
    }

    /**
    * Return a transfer
    *
    * @param transferId {@link String } The unique identifier of the transfer to be returned. (required)
    * @param returnTransferRequest {@link ReturnTransferRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ReturnTransferResponse }
    * @throws ApiException if fails to make API call
    */
    public ReturnTransferResponse returnTransfer(String transferId, ReturnTransferRequest returnTransferRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (transferId == null) {
            throw new IllegalArgumentException("Please provide the transferId path parameter");
        }
        pathParams.put("transferId", transferId);

        String requestBody = returnTransferRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/transfers/{transferId}/returns", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return ReturnTransferResponse.fromJson(jsonResult);
    }

    /**
    * Transfer funds
    *
    * @param transferInfo {@link TransferInfo }  (required)
    * @return {@link Transfer }
    * @throws ApiException if fails to make API call
    */
    public Transfer transferFunds(TransferInfo transferInfo) throws ApiException, IOException {
        return transferFunds(transferInfo, null);
    }

    /**
    * Transfer funds
    *
    * @param transferInfo {@link TransferInfo }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link Transfer }
    * @throws ApiException if fails to make API call
    */
    public Transfer transferFunds(TransferInfo transferInfo, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = transferInfo.toJson();
        Resource resource = new Resource(this, this.baseURL + "/transfers", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return Transfer.fromJson(jsonResult);
    }
}
