// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hybridcompute.HybridComputeManager;
import com.azure.resourcemanager.hybridcompute.models.NetworkProfile;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class NetworkProfilesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"networkInterfaces\":[{\"ipAddresses\":[{\"address\":\"fbcunezz\",\"ipAddressVersion\":\"zelfwyfwl\",\"subnet\":{}},{\"address\":\"wetnpsihc\",\"ipAddressVersion\":\"fzvaylptr\",\"subnet\":{}},{\"address\":\"wztcmwqkchc\",\"ipAddressVersion\":\"axfe\",\"subnet\":{}}]},{\"ipAddresses\":[{\"address\":\"exfdeqvhpsylk\",\"ipAddressVersion\":\"hkbffmbm\",\"subnet\":{}},{\"address\":\"rgywwp\",\"ipAddressVersion\":\"xs\",\"subnet\":{}},{\"address\":\"fujg\",\"ipAddressVersion\":\"gaao\",\"subnet\":{}}]},{\"ipAddresses\":[{\"address\":\"qutdewemxs\",\"ipAddressVersion\":\"ruunzzjgehkf\",\"subnet\":{}},{\"address\":\"rtixokff\",\"ipAddressVersion\":\"inljqepqwhixmo\",\"subnet\":{}},{\"address\":\"shiy\",\"ipAddressVersion\":\"velfcldu\",\"subnet\":{}}]}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HybridComputeManager manager = HybridComputeManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        NetworkProfile response = manager.networkProfiles()
            .getWithResponse("kiwbuqnyoph", "fy", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("fbcunezz", response.networkInterfaces().get(0).ipAddresses().get(0).address());
        Assertions.assertEquals("zelfwyfwl",
            response.networkInterfaces().get(0).ipAddresses().get(0).ipAddressVersion());
    }
}
