// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.PartnerRegistration;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PartnerRegistrationsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Succeeded\",\"partnerRegistrationImmutableId\":\"c93fd16e-8054-4011-b133-3f05b727f25c\"},\"location\":\"ahuq\",\"tags\":{\"wvmqxi\":\"zucwwmejjqhd\",\"bn\":\"ookyfoz\"},\"id\":\"x\",\"name\":\"ypfqpgaixw\",\"type\":\"grkkderfrswq\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EventGridManager manager = EventGridManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PartnerRegistration> response
            = manager.partnerRegistrations().list("yqpdwadeghztld", 1838673940, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ahuq", response.iterator().next().location());
        Assertions.assertEquals("zucwwmejjqhd", response.iterator().next().tags().get("wvmqxi"));
        Assertions.assertEquals(UUID.fromString("c93fd16e-8054-4011-b133-3f05b727f25c"),
            response.iterator().next().partnerRegistrationImmutableId());
    }
}
