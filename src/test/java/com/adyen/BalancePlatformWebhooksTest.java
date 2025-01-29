package com.adyen;

import com.adyen.model.acswebhooks.AuthenticationNotificationRequest;
import com.adyen.model.configurationwebhooks.AccountHolder;
import com.adyen.model.configurationwebhooks.AccountHolderCapability;
import com.adyen.model.configurationwebhooks.AccountHolderNotificationRequest;
import com.adyen.model.configurationwebhooks.VerificationDeadline;
import com.adyen.model.negativebalancewarningwebhooks.NegativeBalanceCompensationWarningNotificationData;
import com.adyen.model.negativebalancewarningwebhooks.NegativeBalanceCompensationWarningNotificationRequest;
import com.adyen.model.reportwebhooks.ReportNotificationRequest;
import com.adyen.model.transactionwebhooks.TransactionNotificationRequestV4;
import com.adyen.notification.BankingWebhookHandler;
import com.adyen.util.HMACValidator;
import org.junit.Assert;
import org.junit.Test;

import java.security.SignatureException;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Unit testing for all AfP/Bank related webhooks
 */
public class BalancePlatformWebhooksTest extends BaseTest {


    // Test AccountHolder created with LEM API v1, v2
    @Test
    public void testAccountHolderCreatedLemV2() throws Exception {
        String json = getFileContents("mocks/balancePlatform-webhooks/configuration-accountHolder-created-lemv2.json");

        Optional<AccountHolderNotificationRequest> notificationRequest = new  BankingWebhookHandler(json).getAccountHolderNotificationRequest();
        assertTrue(notificationRequest.isPresent());

        AccountHolderNotificationRequest accountHolderNotificationRequest = notificationRequest.get();
        assertEquals(AccountHolderNotificationRequest.TypeEnum.CREATED, accountHolderNotificationRequest.getType());
        assertEquals("test", accountHolderNotificationRequest.getEnvironment());
        assertNotNull(accountHolderNotificationRequest.getTimestamp());

        assertNotNull(accountHolderNotificationRequest.getData());
        assertEquals("YOUR_BALANCE_PLATFORM", accountHolderNotificationRequest.getData().getBalancePlatform());
        assertEquals("AH00000000000000000001", accountHolderNotificationRequest.getData().getAccountHolder().getId());
        assertEquals(AccountHolder.StatusEnum.ACTIVE, accountHolderNotificationRequest.getData().getAccountHolder().getStatus());
        assertEquals(5, accountHolderNotificationRequest.getData().getAccountHolder().getCapabilities().size());

    }

    // Test AccountHolder created with LEM API v3+
    @Test
    public void testAccountHolderCreated() throws Exception {
        String json = getFileContents("mocks/balancePlatform-webhooks/configuration-accountHolder-created.json");

        Optional<AccountHolderNotificationRequest> notificationRequest = new  BankingWebhookHandler(json).getAccountHolderNotificationRequest();
        assertTrue(notificationRequest.isPresent());

        AccountHolderNotificationRequest accountHolderNotificationRequest = notificationRequest.get();
        assertEquals(AccountHolderNotificationRequest.TypeEnum.CREATED, accountHolderNotificationRequest.getType());
        assertEquals("test", accountHolderNotificationRequest.getEnvironment());
        assertNotNull(accountHolderNotificationRequest.getTimestamp());

        assertNotNull(accountHolderNotificationRequest.getData());
        assertEquals("YOUR_BALANCE_PLATFORM", accountHolderNotificationRequest.getData().getBalancePlatform());
        assertEquals("AH00000000000000000001", accountHolderNotificationRequest.getData().getAccountHolder().getId());
        assertEquals("YOUR_REFERENCE-2412C", accountHolderNotificationRequest.getData().getAccountHolder().getReference());
        assertEquals(AccountHolder.StatusEnum.ACTIVE, accountHolderNotificationRequest.getData().getAccountHolder().getStatus());
        assertEquals(1, accountHolderNotificationRequest.getData().getAccountHolder().getCapabilities().size());

        AccountHolderCapability accountHolderCapability = accountHolderNotificationRequest.getData().getAccountHolder().getCapabilities().get("sendToTransferInstrument");
        assertNotNull(accountHolderCapability);
        assertNotNull(accountHolderCapability.getProblems());
        assertNotNull(accountHolderCapability.getTransferInstruments());
    }

    @Test
    public void testAccountHolderUpdated() throws Exception {
        String json = getFileContents("mocks/balancePlatform-webhooks/configuration-accountHolder-updated.json");

        Optional<AccountHolderNotificationRequest> notificationRequest = new  BankingWebhookHandler(json).getAccountHolderNotificationRequest();
        assertTrue(notificationRequest.isPresent());

        AccountHolderNotificationRequest accountHolderNotificationRequest = notificationRequest.get();
        assertEquals(AccountHolderNotificationRequest.TypeEnum.UPDATED, accountHolderNotificationRequest.getType());
        assertEquals("test", accountHolderNotificationRequest.getEnvironment());
        assertNotNull(accountHolderNotificationRequest.getTimestamp());

        AccountHolder accountHolder = accountHolderNotificationRequest.getData().getAccountHolder();
        assertEquals("YOUR_BALANCE_PLATFORM", accountHolderNotificationRequest.getData().getBalancePlatform());
        assertEquals("AH00000000000000000001", accountHolderNotificationRequest.getData().getAccountHolder().getId());

        assertNotNull(accountHolderNotificationRequest.getData().getAccountHolder().getVerificationDeadlines());
        assertNotNull(accountHolderNotificationRequest.getData().getAccountHolder().getVerificationDeadlines()
                .get(0).getCapabilities().get(0));
        assertEquals(VerificationDeadline.CapabilitiesEnum.ISSUECHARGECARDCOMMERCIAL, accountHolderNotificationRequest.getData().getAccountHolder().getVerificationDeadlines()
                .get(0).getCapabilities().get(0));

    }

    @Test
    public void testReportCreated() throws Exception {
        String json = getFileContents("mocks/balancePlatform-webhooks/balanceplatform-report-created.json");

        Optional<ReportNotificationRequest> notificationRequest = new  BankingWebhookHandler(json).getReportNotificationRequest();
        assertTrue(notificationRequest.isPresent());

        ReportNotificationRequest reportNotificationRequest = notificationRequest.get();
        assertEquals(ReportNotificationRequest.TypeEnum.BALANCEPLATFORM_REPORT_CREATED, reportNotificationRequest.getType());
        assertEquals("test", reportNotificationRequest.getEnvironment());
        assertNotNull(reportNotificationRequest.getTimestamp());

        assertNotNull(reportNotificationRequest.getData());
        assertEquals("YOUR_BALANCE_PLATFORM", reportNotificationRequest.getData().getBalancePlatform());
        assertEquals("balanceplatform_accounting_report_2024_07_01.csv", reportNotificationRequest.getData().getId());
        assertEquals("2024-07-02T02:01:08+02:00", reportNotificationRequest.getData().getCreationDate().toString());
        assertEquals("balanceplatform_accounting_report", reportNotificationRequest.getData().getReportType());

    }

    @Test
    public void testBankingWebhook() {
        String jsonRequest = "{ \"data\": {\"balancePlatform\": \"YOUR_BALANCE_PLATFORM\",\"accountHolder\": {\"contactDetails\": {\"address\": {\"country\": \"NL\",\"houseNumberOrName\": \"274\",\"postalCode\": \"1020CD\",\"street\": \"Brannan Street\"},\"email\": \"s.hopper@example.com\",\"phone\": {\"number\": \"+315551231234\",\"type\": \"mobile\"}},\"description\": \"S.Hopper - Staff 123\",\"id\": \"AH00000000000000000000001\",\"status\": \"active\"}},\"environment\": \"test\",\"type\": \"balancePlatform.accountHolder.created\"}";
        BankingWebhookHandler webhookHandler = new BankingWebhookHandler(jsonRequest);
        AccountHolderNotificationRequest accountHolderNotificationRequest = webhookHandler.getAccountHolderNotificationRequest().get();
        Assert.assertEquals("AH00000000000000000000001", accountHolderNotificationRequest.getData().getAccountHolder().getId());
    }

    @Test
    public void testBankingWebhookCastException() {
        String json = getFileContents("mocks/balancePlatform-webhooks/configuration-accountHolder-created-castexception.json");
        BankingWebhookHandler webhookHandler = new BankingWebhookHandler(json);
        Assert.assertTrue(webhookHandler.getAccountHolderNotificationRequest().isPresent());
        // access missing object causes deserialization error
        Assert.assertFalse(webhookHandler.getCardOrderNotificationRequest().isPresent());
        // access missing object causes deserialization error
        Assert.assertFalse(webhookHandler.getBalanceAccountNotificationRequest().isPresent());
    }

    @Test
    public void testBankingWebhookHmacValidator() throws SignatureException {
        String notification = "{\"data\":{\"balancePlatform\":\"Integration_tools_test\",\"accountId\":\"BA32272223222H5HVKTBK4MLB\",\"sweep\":{\"id\":\"SWPC42272223222H5HVKV6H8C64DP5\",\"schedule\":{\"type\":\"balance\"},\"status\":\"active\",\"targetAmount\":{\"currency\":\"EUR\",\"value\":0},\"triggerAmount\":{\"currency\":\"EUR\",\"value\":0},\"type\":\"pull\",\"counterparty\":{\"balanceAccountId\":\"BA3227C223222H5HVKT3H9WLC\"},\"currency\":\"EUR\"}},\"environment\":\"test\",\"type\":\"balancePlatform.balanceAccountSweep.updated\"}";
        String signKey = "D7DD5BA6146493707BF0BE7496F6404EC7A63616B7158EC927B9F54BB436765F";
        String hmacKey = "9Qz9S/0xpar1klkniKdshxpAhRKbiSAewPpWoxKefQA=";
        HMACValidator hmacValidator = new HMACValidator();
        boolean response = hmacValidator.validateHMAC(hmacKey, signKey, notification);
        Assert.assertTrue(response);
    }

    @Test
    public void testBankingWebhookAcsParsing() throws Exception {
        String json = getFileContents("mocks/balancePlatform-webhooks/balanceplatform-authentication-created.json");

        Optional<AuthenticationNotificationRequest> notificationRequest = new  BankingWebhookHandler(json).getAuthenticationNotificationRequest();
        assertTrue(notificationRequest.isPresent());

        AuthenticationNotificationRequest authenticationNotificationRequest = notificationRequest.get();
        assertEquals(AuthenticationNotificationRequest.TypeEnum.BALANCEPLATFORM_AUTHENTICATION_CREATED, authenticationNotificationRequest.getType());
        assertEquals("test", authenticationNotificationRequest.getEnvironment());
        assertNotNull(authenticationNotificationRequest.getTimestamp());
        assertEquals("497f6eca-6276-4993-bfeb-53cbbbba6f08", authenticationNotificationRequest.getData().getId());
        assertEquals("6a4c1709-a42e-4c7f-96c7-1043adacfc97", authenticationNotificationRequest.getData().getAuthentication().getAcsTransId());
    }

    @Test
    public void testTransactionWebhookParsing() {
        String json = getFileContents("mocks/notification/balancePlatform-transaction-created.json");
        BankingWebhookHandler webhookHandler = new BankingWebhookHandler(json);
        Assert.assertTrue(webhookHandler.getTransactionNotificationRequest().isPresent());
        TransactionNotificationRequestV4 request = webhookHandler.getTransactionNotificationRequest().get();
        Assert.assertEquals("EVJN42272224222B5JB8BRC84N686ZEUR", request.getData().getId());
        Assert.assertFalse(webhookHandler.getBalanceAccountNotificationRequest().isPresent());
    }

    @Test
    public void testNegativeBalanceCompensationWarning() throws Exception {
        String json = getFileContents("mocks/balancePlatform-webhooks/balanceplatform-negativeBalanceCompensationWarning-scheduled.json");

        Optional<NegativeBalanceCompensationWarningNotificationRequest> notificationRequest = new  BankingWebhookHandler(json).getNegativeBalanceCompensationWarningNotificationRequest();
        assertTrue(notificationRequest.isPresent());

        NegativeBalanceCompensationWarningNotificationRequest negativeBalanceCompensationWarningNotificationRequest = notificationRequest.get();
        assertEquals(NegativeBalanceCompensationWarningNotificationRequest.TypeEnum.BALANCEPLATFORM_NEGATIVEBALANCECOMPENSATIONWARNING_SCHEDULED, negativeBalanceCompensationWarningNotificationRequest.getType());
        assertEquals("test", negativeBalanceCompensationWarningNotificationRequest.getEnvironment());
        assertNotNull(negativeBalanceCompensationWarningNotificationRequest.getTimestamp());

        assertNotNull(negativeBalanceCompensationWarningNotificationRequest.getData());
        assertEquals("YOUR_BALANCE_PLATFORM", negativeBalanceCompensationWarningNotificationRequest.getData().getBalancePlatform());
        assertEquals("BA00000000000000000001", negativeBalanceCompensationWarningNotificationRequest.getData().getId());
        assertEquals("2024-07-02T02:01:08+02:00", negativeBalanceCompensationWarningNotificationRequest.getData().getCreationDate().toString());
    }

}
