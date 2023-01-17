// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deploymentmanager.models.ServiceTopologyProperties;
import org.junit.jupiter.api.Assertions;

public final class ServiceTopologyPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceTopologyProperties model =
            BinaryData.fromString("{\"artifactSourceId\":\"ifsqesaagdfmg\"}").toObject(ServiceTopologyProperties.class);
        Assertions.assertEquals("ifsqesaagdfmg", model.artifactSourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceTopologyProperties model = new ServiceTopologyProperties().withArtifactSourceId("ifsqesaagdfmg");
        model = BinaryData.fromObject(model).toObject(ServiceTopologyProperties.class);
        Assertions.assertEquals("ifsqesaagdfmg", model.artifactSourceId());
    }
}