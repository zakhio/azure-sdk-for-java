// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.JsonSink;
import com.azure.resourcemanager.datafactory.models.JsonWriteSettings;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import com.azure.resourcemanager.datafactory.models.StoreWriteSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class JsonSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JsonSink model = BinaryData.fromString(
            "{\"type\":\"rljmjzyadafec\",\"storeSettings\":{\"type\":\"svpmw\",\"maxConcurrentConnections\":\"dataoqypvplmyzebv\",\"disableMetricsCollection\":\"datahoydehbvbex\",\"copyBehavior\":\"dataynnladdhdklwzz\",\"metadata\":[{\"name\":\"databosacrnpscfkef\",\"value\":\"datatxe\"},{\"name\":\"datamimgjuvjvtgece\",\"value\":\"datannle\"}],\"\":{\"kctdnnqok\":\"dataukfj\",\"uywijnlpeczq\":\"dataeuzslnyj\",\"vphr\":\"datanmzkqydthfcwycm\"}},\"formatSettings\":{\"type\":\"hjdhlskeifw\",\"filePattern\":\"datae\",\"\":{\"xiwpptvbudbnujv\":\"dataow\",\"fzxkqsleokbam\":\"datallyjelnhmuzhxk\",\"gccg\":\"datahn\",\"jahlqoxwqlnxv\":\"datalepamvlbaxda\"}},\"writeBatchSize\":\"dataufldzjcp\",\"writeBatchTimeout\":\"datajbzp\",\"sinkRetryCount\":\"datafejg\",\"sinkRetryWait\":\"datafvboxvwtln\",\"maxConcurrentConnections\":\"datashtujaqpkupnr\",\"disableMetricsCollection\":\"datajeypdk\",\"\":{\"sy\":\"datax\",\"rnihgothy\":\"databdrq\",\"ovsvjxnsor\":\"databwge\"}}")
            .toObject(JsonSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JsonSink model = new JsonSink().withWriteBatchSize("dataufldzjcp")
            .withWriteBatchTimeout("datajbzp")
            .withSinkRetryCount("datafejg")
            .withSinkRetryWait("datafvboxvwtln")
            .withMaxConcurrentConnections("datashtujaqpkupnr")
            .withDisableMetricsCollection("datajeypdk")
            .withStoreSettings(new StoreWriteSettings().withMaxConcurrentConnections("dataoqypvplmyzebv")
                .withDisableMetricsCollection("datahoydehbvbex")
                .withCopyBehavior("dataynnladdhdklwzz")
                .withMetadata(Arrays.asList(new MetadataItem().withName("databosacrnpscfkef").withValue("datatxe"),
                    new MetadataItem().withName("datamimgjuvjvtgece").withValue("datannle")))
                .withAdditionalProperties(mapOf("type", "svpmw")))
            .withFormatSettings(new JsonWriteSettings().withFilePattern("datae"));
        model = BinaryData.fromObject(model).toObject(JsonSink.class);
    }

    // Use "Map.of" if available
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
