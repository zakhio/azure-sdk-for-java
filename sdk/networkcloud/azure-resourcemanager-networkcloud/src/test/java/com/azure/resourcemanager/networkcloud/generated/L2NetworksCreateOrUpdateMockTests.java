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
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import com.azure.resourcemanager.networkcloud.models.L2Network;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class L2NetworksCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"extendedLocation\":{\"name\":\"hoe\",\"type\":\"goiutgw\"},\"properties\":{\"associatedResourceIds\":[\"a\",\"p\",\"hazyntacihnco\"],\"clusterId\":\"ipnmliqmv\",\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"ke\",\"hybridAksClustersAssociatedIds\":[\"rvgpomxpupdtsd\",\"jyies\",\"cwiqbuout\"],\"hybridAksPluginType\":\"DPDK\",\"interfaceName\":\"gleofjsbgbw\",\"l2IsolationDomainId\":\"zvdajfwnncf\",\"provisioningState\":\"Succeeded\",\"virtualMachinesAssociatedIds\":[\"gjj\",\"l\",\"iqlwixvtbou\",\"uxtndopgjttbasua\"]},\"location\":\"pdlndbeaqbkixvv\",\"tags\":{\"fjmsp\":\"npbbfqv\",\"jmphfkyezolgj\":\"gzfeuzj\",\"uydoccnx\":\"mi\",\"batecaat\":\"hanzbuiad\"},\"id\":\"dohzniucbdaombwi\",\"name\":\"njdllwktlepowavv\",\"type\":\"xu\"}";

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

        L2Network response =
            manager
                .l2Networks()
                .define("zgczfcmfpfbode")
                .withRegion("vdgxly")
                .withExistingResourceGroup("srtmdylperpiltt")
                .withExtendedLocation(new ExtendedLocation().withName("resrgvtshuvft").withType("ai"))
                .withL2IsolationDomainId("ukklvzrlr")
                .withTags(mapOf("jovmozsaye", "itdshezsvkolru", "uykykipfsd", "razwzlpzbt", "bezacfpztga", "epfnoc"))
                .withHybridAksPluginType(HybridAksPluginType.DPDK)
                .withInterfaceName("elqxovppqi")
                .create();

        Assertions.assertEquals("pdlndbeaqbkixvv", response.location());
        Assertions.assertEquals("npbbfqv", response.tags().get("fjmsp"));
        Assertions.assertEquals("hoe", response.extendedLocation().name());
        Assertions.assertEquals("goiutgw", response.extendedLocation().type());
        Assertions.assertEquals(HybridAksPluginType.DPDK, response.hybridAksPluginType());
        Assertions.assertEquals("gleofjsbgbw", response.interfaceName());
        Assertions.assertEquals("zvdajfwnncf", response.l2IsolationDomainId());
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
