// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.maps.fluent.models.CreatorInner;
import com.azure.resourcemanager.maps.fluent.models.CreatorProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CreatorInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreatorInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"xgcp\",\"storageUnits\":524649765},\"location\":\"gmaajrm\",\"tags\":{\"oejctbzaqsqsy\":\"wzrlovmclwhij\",\"ppofmxaxcfjpgdd\":\"bkbfkgukdkex\"},\"id\":\"ocjjxhvpmouexh\",\"name\":\"zxibqeoj\",\"type\":\"xqbzvddntwnd\"}")
                .toObject(CreatorInner.class);
        Assertions.assertEquals("gmaajrm", model.location());
        Assertions.assertEquals("wzrlovmclwhij", model.tags().get("oejctbzaqsqsy"));
        Assertions.assertEquals(524649765, model.properties().storageUnits());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreatorInner model =
            new CreatorInner()
                .withLocation("gmaajrm")
                .withTags(mapOf("oejctbzaqsqsy", "wzrlovmclwhij", "ppofmxaxcfjpgdd", "bkbfkgukdkex"))
                .withProperties(new CreatorProperties().withStorageUnits(524649765));
        model = BinaryData.fromObject(model).toObject(CreatorInner.class);
        Assertions.assertEquals("gmaajrm", model.location());
        Assertions.assertEquals("wzrlovmclwhij", model.tags().get("oejctbzaqsqsy"));
        Assertions.assertEquals(524649765, model.properties().storageUnits());
    }

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