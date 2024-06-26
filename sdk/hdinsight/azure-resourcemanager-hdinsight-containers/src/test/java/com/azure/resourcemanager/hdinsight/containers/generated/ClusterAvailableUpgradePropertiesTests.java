// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterAvailableUpgradeProperties;

public final class ClusterAvailableUpgradePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterAvailableUpgradeProperties model
            = BinaryData.fromString("{\"upgradeType\":\"ClusterAvailableUpgradeProperties\"}")
                .toObject(ClusterAvailableUpgradeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterAvailableUpgradeProperties model = new ClusterAvailableUpgradeProperties();
        model = BinaryData.fromObject(model).toObject(ClusterAvailableUpgradeProperties.class);
    }
}
