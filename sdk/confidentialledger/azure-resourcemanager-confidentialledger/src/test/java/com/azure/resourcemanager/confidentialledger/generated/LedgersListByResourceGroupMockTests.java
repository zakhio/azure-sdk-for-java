// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager;
import com.azure.resourcemanager.confidentialledger.models.ConfidentialLedger;
import com.azure.resourcemanager.confidentialledger.models.LedgerRoleName;
import com.azure.resourcemanager.confidentialledger.models.LedgerSku;
import com.azure.resourcemanager.confidentialledger.models.LedgerType;
import com.azure.resourcemanager.confidentialledger.models.RunningState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LedgersListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"ledgerName\":\"ctehfiqscjey\",\"ledgerUri\":\"hezrkgq\",\"identityServiceUri\":\"jrefovgmkqsle\",\"ledgerInternalNamespace\":\"vxyqjpkcattpngjc\",\"runningState\":\"Resuming\",\"ledgerType\":\"Private\",\"provisioningState\":\"Unknown\",\"ledgerSku\":\"Standard\",\"aadBasedSecurityPrincipals\":[{\"principalId\":\"ajvnysounqe\",\"tenantId\":\"noae\",\"ledgerRoleName\":\"Administrator\"},{\"principalId\":\"yhltrpmopjmcm\",\"tenantId\":\"u\",\"ledgerRoleName\":\"Reader\"}],\"certBasedSecurityPrincipals\":[{\"cert\":\"iuaod\",\"ledgerRoleName\":\"Administrator\"}]},\"location\":\"kvxod\",\"tags\":{\"axbezyiuo\":\"zmyzydagf\",\"dxwzywqsmbsurexi\":\"ktwh\",\"yocf\":\"o\"},\"id\":\"fksymddystki\",\"name\":\"uxh\",\"type\":\"yudxorrqnbp\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ConfidentialLedgerManager manager = ConfidentialLedgerManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ConfidentialLedger> response
            = manager.ledgers().listByResourceGroup("evfyexfwhybcib", "yvdcsitynnaa", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("kvxod", response.iterator().next().location());
        Assertions.assertEquals("zmyzydagf", response.iterator().next().tags().get("axbezyiuo"));
        Assertions.assertEquals(RunningState.RESUMING, response.iterator().next().properties().runningState());
        Assertions.assertEquals(LedgerType.PRIVATE, response.iterator().next().properties().ledgerType());
        Assertions.assertEquals(LedgerSku.STANDARD, response.iterator().next().properties().ledgerSku());
        Assertions.assertEquals("ajvnysounqe",
            response.iterator().next().properties().aadBasedSecurityPrincipals().get(0).principalId());
        Assertions.assertEquals("noae",
            response.iterator().next().properties().aadBasedSecurityPrincipals().get(0).tenantId());
        Assertions.assertEquals(LedgerRoleName.ADMINISTRATOR,
            response.iterator().next().properties().aadBasedSecurityPrincipals().get(0).ledgerRoleName());
        Assertions.assertEquals("iuaod",
            response.iterator().next().properties().certBasedSecurityPrincipals().get(0).cert());
        Assertions.assertEquals(LedgerRoleName.ADMINISTRATOR,
            response.iterator().next().properties().certBasedSecurityPrincipals().get(0).ledgerRoleName());
    }
}
