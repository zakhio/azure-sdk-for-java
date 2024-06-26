// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.maintenance.MaintenanceManager;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignment;
import com.azure.resourcemanager.maintenance.models.TagOperators;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ConfigurationAssignmentsDeleteParentWithResponseMockTests {
    @Test
    public void testDeleteParentWithResponse() throws Exception {
        String responseStr
            = "{\"location\":\"cwsobqwcs\",\"properties\":{\"maintenanceConfigurationId\":\"wdcfhucqdpfuv\",\"resourceId\":\"sbjjc\",\"filter\":{\"resourceTypes\":[\"bvtvudutncormr\",\"xqtvcofu\"],\"resourceGroups\":[\"vkg\",\"u\"],\"osTypes\":[\"knnqvsaznq\",\"tor\",\"dsg\"],\"locations\":[\"mkycgra\"],\"tagSettings\":{\"tags\":{\"q\":[\"taeburuvdm\",\"vsmzlxwab\"],\"gkfbtndoaong\":[\"fkifr\",\"tpuqujmq\"]},\"filterOperator\":\"All\"}}},\"id\":\"tujitcjedft\",\"name\":\"waezkojvd\",\"type\":\"pzfoqoui\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MaintenanceManager manager = MaintenanceManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ConfigurationAssignment response = manager.configurationAssignments()
            .deleteParentWithResponse("fn", "ckw", "fz", "whxxbuyqax", "feqztppriol", "or", "altol",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("cwsobqwcs", response.location());
        Assertions.assertEquals("wdcfhucqdpfuv", response.maintenanceConfigurationId());
        Assertions.assertEquals("sbjjc", response.resourceId());
        Assertions.assertEquals("bvtvudutncormr", response.filter().resourceTypes().get(0));
        Assertions.assertEquals("vkg", response.filter().resourceGroups().get(0));
        Assertions.assertEquals("knnqvsaznq", response.filter().osTypes().get(0));
        Assertions.assertEquals("mkycgra", response.filter().locations().get(0));
        Assertions.assertEquals("taeburuvdm", response.filter().tagSettings().tags().get("q").get(0));
        Assertions.assertEquals(TagOperators.ALL, response.filter().tagSettings().filterOperator());
    }
}
