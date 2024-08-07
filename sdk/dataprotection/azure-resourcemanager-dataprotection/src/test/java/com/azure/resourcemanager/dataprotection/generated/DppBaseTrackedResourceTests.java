// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.DppBaseTrackedResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DppBaseTrackedResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DppBaseTrackedResource model = BinaryData.fromString(
            "{\"eTag\":\"huyb\",\"location\":\"podepoo\",\"tags\":{\"eotusivyevc\":\"uvamiheognarxzxt\",\"un\":\"iqihn\",\"fygxgispemvtzfk\":\"bwjzr\"},\"id\":\"fublj\",\"name\":\"fxqeof\",\"type\":\"aeqjhqjbasvms\"}")
            .toObject(DppBaseTrackedResource.class);
        Assertions.assertEquals("podepoo", model.location());
        Assertions.assertEquals("uvamiheognarxzxt", model.tags().get("eotusivyevc"));
        Assertions.assertEquals("huyb", model.etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DppBaseTrackedResource model = new DppBaseTrackedResource().withLocation("podepoo")
            .withTags(mapOf("eotusivyevc", "uvamiheognarxzxt", "un", "iqihn", "fygxgispemvtzfk", "bwjzr"))
            .withEtag("huyb");
        model = BinaryData.fromObject(model).toObject(DppBaseTrackedResource.class);
        Assertions.assertEquals("podepoo", model.location());
        Assertions.assertEquals("uvamiheognarxzxt", model.tags().get("eotusivyevc"));
        Assertions.assertEquals("huyb", model.etag());
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
