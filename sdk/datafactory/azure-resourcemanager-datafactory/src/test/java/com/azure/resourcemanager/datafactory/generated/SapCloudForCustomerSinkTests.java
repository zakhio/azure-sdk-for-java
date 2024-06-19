// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapCloudForCustomerSink;
import com.azure.resourcemanager.datafactory.models.SapCloudForCustomerSinkWriteBehavior;
import org.junit.jupiter.api.Assertions;

public final class SapCloudForCustomerSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapCloudForCustomerSink model = BinaryData.fromString(
            "{\"type\":\"SapCloudForCustomerSink\",\"writeBehavior\":\"Insert\",\"httpRequestTimeout\":\"dataty\",\"writeBatchSize\":\"dataacgukierdq\",\"writeBatchTimeout\":\"dataassiiilcmrgahsc\",\"sinkRetryCount\":\"datayxgcgbvieqonsbu\",\"sinkRetryWait\":\"datanxdivqopxunooxtk\",\"maxConcurrentConnections\":\"datanac\",\"disableMetricsCollection\":\"datazcytbhdjpagwszmw\",\"\":{\"vqg\":\"datafeyexbgdfyoszwi\",\"nvdabaodiytxq\":\"dataeacqjgedxpbpjwz\"}}")
            .toObject(SapCloudForCustomerSink.class);
        Assertions.assertEquals(SapCloudForCustomerSinkWriteBehavior.INSERT, model.writeBehavior());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapCloudForCustomerSink model = new SapCloudForCustomerSink().withWriteBatchSize("dataacgukierdq")
            .withWriteBatchTimeout("dataassiiilcmrgahsc")
            .withSinkRetryCount("datayxgcgbvieqonsbu")
            .withSinkRetryWait("datanxdivqopxunooxtk")
            .withMaxConcurrentConnections("datanac")
            .withDisableMetricsCollection("datazcytbhdjpagwszmw")
            .withWriteBehavior(SapCloudForCustomerSinkWriteBehavior.INSERT)
            .withHttpRequestTimeout("dataty");
        model = BinaryData.fromObject(model).toObject(SapCloudForCustomerSink.class);
        Assertions.assertEquals(SapCloudForCustomerSinkWriteBehavior.INSERT, model.writeBehavior());
    }
}
