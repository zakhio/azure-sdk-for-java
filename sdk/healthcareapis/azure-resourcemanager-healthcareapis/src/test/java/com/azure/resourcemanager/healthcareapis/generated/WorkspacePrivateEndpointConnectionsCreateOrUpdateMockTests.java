// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.healthcareapis.HealthcareApisManager;
import com.azure.resourcemanager.healthcareapis.fluent.models.PrivateEndpointConnectionDescriptionInner;
import com.azure.resourcemanager.healthcareapis.models.PrivateEndpoint;
import com.azure.resourcemanager.healthcareapis.models.PrivateEndpointConnectionDescription;
import com.azure.resourcemanager.healthcareapis.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.healthcareapis.models.PrivateLinkServiceConnectionState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class WorkspacePrivateEndpointConnectionsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"privateEndpoint\":{\"id\":\"h\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"zonzlrpiqywnc\",\"actionsRequired\":\"tszcofizehtdhgb\"},\"provisioningState\":\"Succeeded\"},\"id\":\"reljeamur\",\"name\":\"zmlovuanash\",\"type\":\"xlpm\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HealthcareApisManager manager = HealthcareApisManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnectionDescription response = manager.workspacePrivateEndpointConnections()
            .createOrUpdate("pibudqwyxebeybpm", "znrtffyaqit", "hheioqaqhvseuf",
                new PrivateEndpointConnectionDescriptionInner().withPrivateEndpoint(new PrivateEndpoint())
                    .withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.REJECTED)
                        .withDescription("ismjqfrddgamqu")
                        .withActionsRequired("os")),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING,
            response.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("zonzlrpiqywnc", response.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("tszcofizehtdhgb", response.privateLinkServiceConnectionState().actionsRequired());
    }
}
