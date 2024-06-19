// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.PhoenixDatasetTypeProperties;

public final class PhoenixDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PhoenixDatasetTypeProperties model = BinaryData
            .fromString("{\"tableName\":\"datahwbdpsesboynpy\",\"table\":\"dataorrvk\",\"schema\":\"datafctaneti\"}")
            .toObject(PhoenixDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PhoenixDatasetTypeProperties model = new PhoenixDatasetTypeProperties().withTableName("datahwbdpsesboynpy")
            .withTable("dataorrvk")
            .withSchema("datafctaneti");
        model = BinaryData.fromObject(model).toObject(PhoenixDatasetTypeProperties.class);
    }
}
