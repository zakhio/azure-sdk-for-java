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
import com.azure.resourcemanager.networkcloud.models.Rack;
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

public final class RacksCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"extendedLocation\":{\"name\":\"gsmgb\",\"type\":\"mt\"},\"properties\":{\"availabilityZone\":\"wrqbebjnfv\",\"clusterId\":\"labt\",\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"wznhtfgfic\",\"provisioningState\":\"Succeeded\",\"rackLocation\":\"hizpaczmuh\",\"rackSerialNumber\":\"cakznhokhoitwhrj\",\"rackSkuId\":\"dmmazdnc\"},\"location\":\"dbjp\",\"tags\":{\"fhbssdpjeyoqxded\":\"zqpxzbawkikcd\",\"shzz\":\"cfiwhagxsurejq\",\"ll\":\"g\",\"gl\":\"xiqqzjkoxdupna\"},\"id\":\"ouigdmfivjqte\",\"name\":\"dqqigdydkghpc\",\"type\":\"rwqirvtktyhhmvf\"}";

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

        Rack response =
            manager
                .racks()
                .define("ahfsgb")
                .withRegion("tfshksnyzm")
                .withExistingResourceGroup("qzusitoq")
                .withExtendedLocation(new ExtendedLocation().withName("mlree").withType("rfwss"))
                .withAvailabilityZone("vlcwlisolntfxxc")
                .withRackLocation("bulnvgskjtoxjdz")
                .withRackSerialNumber("sjznvhx")
                .withRackSkuId("qmqipaydhfnzoc")
                .withTags(
                    mapOf(
                        "iqdktwtkvih", "mwbwmbnlslce", "nguuzhwvla", "pfliwo", "mhjhaus", "p", "ekymffztsilscvqs", "b"))
                .create();

        Assertions.assertEquals("dbjp", response.location());
        Assertions.assertEquals("zqpxzbawkikcd", response.tags().get("fhbssdpjeyoqxded"));
        Assertions.assertEquals("gsmgb", response.extendedLocation().name());
        Assertions.assertEquals("mt", response.extendedLocation().type());
        Assertions.assertEquals("wrqbebjnfv", response.availabilityZone());
        Assertions.assertEquals("hizpaczmuh", response.rackLocation());
        Assertions.assertEquals("cakznhokhoitwhrj", response.rackSerialNumber());
        Assertions.assertEquals("dmmazdnc", response.rackSkuId());
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
