// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.models.ElasticTrafficFilterRule;
import org.junit.jupiter.api.Assertions;

public final class ElasticTrafficFilterRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ElasticTrafficFilterRule model =
            BinaryData
                .fromString(
                    "{\"source\":\"qgtz\",\"description\":\"pnqbqqwxrjfe\",\"azureEndpointGuid\":\"lnwsubisn\",\"azureEndpointName\":\"mpmngnzscxaqwoo\",\"id\":\"cbonqvpk\"}")
                .toObject(ElasticTrafficFilterRule.class);
        Assertions.assertEquals("qgtz", model.source());
        Assertions.assertEquals("pnqbqqwxrjfe", model.description());
        Assertions.assertEquals("lnwsubisn", model.azureEndpointGuid());
        Assertions.assertEquals("mpmngnzscxaqwoo", model.azureEndpointName());
        Assertions.assertEquals("cbonqvpk", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ElasticTrafficFilterRule model =
            new ElasticTrafficFilterRule()
                .withSource("qgtz")
                .withDescription("pnqbqqwxrjfe")
                .withAzureEndpointGuid("lnwsubisn")
                .withAzureEndpointName("mpmngnzscxaqwoo")
                .withId("cbonqvpk");
        model = BinaryData.fromObject(model).toObject(ElasticTrafficFilterRule.class);
        Assertions.assertEquals("qgtz", model.source());
        Assertions.assertEquals("pnqbqqwxrjfe", model.description());
        Assertions.assertEquals("lnwsubisn", model.azureEndpointGuid());
        Assertions.assertEquals("mpmngnzscxaqwoo", model.azureEndpointName());
        Assertions.assertEquals("cbonqvpk", model.id());
    }
}
