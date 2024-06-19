// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MongoDbV2Sink;

public final class MongoDbV2SinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MongoDbV2Sink model = BinaryData.fromString(
            "{\"type\":\"MongoDbV2Sink\",\"writeBehavior\":\"dataekmgpseassdqpwhp\",\"writeBatchSize\":\"datadosfgbvsozjf\",\"writeBatchTimeout\":\"datawxcjciotlbpuemqe\",\"sinkRetryCount\":\"datao\",\"sinkRetryWait\":\"datavhhedc\",\"maxConcurrentConnections\":\"datalycrldwccas\",\"disableMetricsCollection\":\"databdvsorvhbygw\",\"\":{\"wncggamxbtq\":\"dataqlzzkb\",\"qhbnwmok\":\"datazydaiolnkkghlex\"}}")
            .toObject(MongoDbV2Sink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MongoDbV2Sink model = new MongoDbV2Sink().withWriteBatchSize("datadosfgbvsozjf")
            .withWriteBatchTimeout("datawxcjciotlbpuemqe")
            .withSinkRetryCount("datao")
            .withSinkRetryWait("datavhhedc")
            .withMaxConcurrentConnections("datalycrldwccas")
            .withDisableMetricsCollection("databdvsorvhbygw")
            .withWriteBehavior("dataekmgpseassdqpwhp");
        model = BinaryData.fromObject(model).toObject(MongoDbV2Sink.class);
    }
}
