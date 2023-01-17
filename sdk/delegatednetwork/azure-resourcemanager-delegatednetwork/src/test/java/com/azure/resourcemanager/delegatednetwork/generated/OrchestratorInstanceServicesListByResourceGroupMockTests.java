// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.delegatednetwork.DelegatedNetworkManager;
import com.azure.resourcemanager.delegatednetwork.models.Orchestrator;
import com.azure.resourcemanager.delegatednetwork.models.OrchestratorKind;
import com.azure.resourcemanager.delegatednetwork.models.ResourceIdentityType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class OrchestratorInstanceServicesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"resourceGuid\":\"xy\",\"provisioningState\":\"Provisioning\",\"orchestratorAppId\":\"yrxvwfudwpznt\",\"orchestratorTenantId\":\"dzhlrq\",\"clusterRootCA\":\"hckfrlhrx\",\"apiServerEndpoint\":\"kyv\",\"privateLinkResourceId\":\"ca\",\"controllerDetails\":{\"id\":\"z\"}},\"kind\":\"Kubernetes\",\"identity\":{\"principalId\":\"afkuwb\",\"tenantId\":\"nwbmeh\",\"type\":\"None\"},\"location\":\"yvjusrtslhsp\",\"tags\":{\"elmqk\":\"emaofmxagkvt\",\"hcdhmdual\":\"hahvljuahaq\",\"vfadmws\":\"exq\",\"lf\":\"crgvxpvgom\"},\"id\":\"isgwbnbbeldawkz\",\"name\":\"ali\",\"type\":\"urqhaka\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        DelegatedNetworkManager manager =
            DelegatedNetworkManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Orchestrator> response =
            manager.orchestratorInstanceServices().listByResourceGroup("g", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("yvjusrtslhsp", response.iterator().next().location());
        Assertions.assertEquals("emaofmxagkvt", response.iterator().next().tags().get("elmqk"));
        Assertions.assertEquals(OrchestratorKind.KUBERNETES, response.iterator().next().kind());
        Assertions.assertEquals(ResourceIdentityType.NONE, response.iterator().next().identity().type());
        Assertions.assertEquals("yrxvwfudwpznt", response.iterator().next().properties().orchestratorAppId());
        Assertions.assertEquals("dzhlrq", response.iterator().next().properties().orchestratorTenantId());
        Assertions.assertEquals("hckfrlhrx", response.iterator().next().properties().clusterRootCA());
        Assertions.assertEquals("kyv", response.iterator().next().properties().apiServerEndpoint());
        Assertions.assertEquals("ca", response.iterator().next().properties().privateLinkResourceId());
        Assertions.assertEquals("z", response.iterator().next().properties().controllerDetails().id());
    }
}