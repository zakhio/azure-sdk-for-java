// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.fluent.models.DeploymentInfoResponseInner;

public final class DeploymentInfoResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeploymentInfoResponseInner model =
            BinaryData
                .fromString(
                    "{\"status\":\"Unhealthy\",\"version\":\"b\",\"memoryCapacity\":\"jvtbvpyss\",\"diskCapacity\":\"nruj\",\"deploymentUrl\":\"uhmuouqfprwzwbn\",\"marketplaceSaasInfo\":{\"marketplaceSubscription\":{\"id\":\"nwui\"},\"marketplaceName\":\"a\",\"marketplaceResourceId\":\"ufizuckyf\"}}")
                .toObject(DeploymentInfoResponseInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeploymentInfoResponseInner model = new DeploymentInfoResponseInner();
        model = BinaryData.fromObject(model).toObject(DeploymentInfoResponseInner.class);
    }
}
