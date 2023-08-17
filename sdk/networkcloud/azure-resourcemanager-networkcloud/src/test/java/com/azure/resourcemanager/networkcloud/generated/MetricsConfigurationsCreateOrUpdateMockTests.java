// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.ClusterMetricsConfiguration;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class MetricsConfigurationsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"extendedLocation\":{\"name\":\"w\",\"type\":\"ch\"},\"properties\":{\"collectionInterval\":5033961721581707117,\"detailedStatus\":\"Applied\",\"detailedStatusMessage\":\"kshfy\",\"disabledMetrics\":[\"ibjepzwhj\"],\"enabledMetrics\":[\"dgbggcjxzh\",\"livwehsud\",\"mymbhdosmbng\",\"q\"],\"provisioningState\":\"Succeeded\"},\"location\":\"duvxd\",\"tags\":{\"mnrs\":\"xatm\",\"dmiplois\":\"nxoirxy\",\"ntwgkvyo\":\"kzsoxz\"},\"id\":\"psapzu\",\"name\":\"zwwy\",\"type\":\"bdjzghximkg\"}";

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

        NetworkCloudManager manager =
            NetworkCloudManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ClusterMetricsConfiguration response =
            manager
                .metricsConfigurations()
                .define("gwn")
                .withRegion("svkkjbjolpyokl")
                .withExistingCluster("udayprldidwmtf", "bvtzldzchub")
                .withExtendedLocation(new ExtendedLocation().withName("zuvigvl").withType("hfrbzakpjt"))
                .withCollectionInterval(735504182529978592L)
                .withTags(mapOf("hmlieoigowxxb", "znad", "qe", "tpsyi", "wanvmwdvgjqcrbko", "qwtqszzgyksik"))
                .withEnabledMetrics(Arrays.asList("bgngcrusxhirc"))
                .create();

        Assertions.assertEquals("duvxd", response.location());
        Assertions.assertEquals("xatm", response.tags().get("mnrs"));
        Assertions.assertEquals("w", response.extendedLocation().name());
        Assertions.assertEquals("ch", response.extendedLocation().type());
        Assertions.assertEquals(5033961721581707117L, response.collectionInterval());
        Assertions.assertEquals("dgbggcjxzh", response.enabledMetrics().get(0));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
