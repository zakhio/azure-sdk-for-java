// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.kusto.KustoManager;
import com.azure.resourcemanager.kusto.fluent.models.DatabasePrincipalInner;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalListRequest;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalListResult;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalRole;
import com.azure.resourcemanager.kusto.models.DatabasePrincipalType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DatabasesRemovePrincipalsWithResponseMockTests {
    @Test
    public void testRemovePrincipalsWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"role\":\"Monitor\",\"name\":\"yue\",\"type\":\"Group\",\"fqn\":\"ynsqyrpfoobr\",\"email\":\"tyms\",\"appId\":\"ygqdnfwqzdz\",\"tenantName\":\"ilaxhn\"},{\"role\":\"Viewer\",\"name\":\"qlyvijo\",\"type\":\"User\",\"fqn\":\"vk\",\"email\":\"yzunbixxrtikv\",\"appId\":\"wpgclrcivt\",\"tenantName\":\"xfrk\"},{\"role\":\"Monitor\",\"name\":\"xpmyyefrpmpdnq\",\"type\":\"User\",\"fqn\":\"awaoqvmmbnpqfrt\",\"email\":\"kzmegnitgvkxlz\",\"appId\":\"drf\",\"tenantName\":\"cealzxwh\"}]}";

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

        KustoManager manager =
            KustoManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        DatabasePrincipalListResult response =
            manager
                .databases()
                .removePrincipalsWithResponse(
                    "vyi",
                    "zqodfvpgshox",
                    "sgbpfgzdjtx",
                    new DatabasePrincipalListRequest()
                        .withValue(
                            Arrays
                                .asList(
                                    new DatabasePrincipalInner()
                                        .withRole(DatabasePrincipalRole.USER)
                                        .withName("bqvgaqv")
                                        .withType(DatabasePrincipalType.GROUP)
                                        .withFqn("fcq")
                                        .withEmail("rdve")
                                        .withAppId("wsdtutnwl"),
                                    new DatabasePrincipalInner()
                                        .withRole(DatabasePrincipalRole.UNRESTRICTED_VIEWER)
                                        .withName("dxukuqgsjjxundxg")
                                        .withType(DatabasePrincipalType.APP)
                                        .withFqn("wzhhzjhfjmhvvmuv")
                                        .withEmail("mun")
                                        .withAppId("sx"))),
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals(DatabasePrincipalRole.MONITOR, response.value().get(0).role());
        Assertions.assertEquals("yue", response.value().get(0).name());
        Assertions.assertEquals(DatabasePrincipalType.GROUP, response.value().get(0).type());
        Assertions.assertEquals("ynsqyrpfoobr", response.value().get(0).fqn());
        Assertions.assertEquals("tyms", response.value().get(0).email());
        Assertions.assertEquals("ygqdnfwqzdz", response.value().get(0).appId());
    }
}