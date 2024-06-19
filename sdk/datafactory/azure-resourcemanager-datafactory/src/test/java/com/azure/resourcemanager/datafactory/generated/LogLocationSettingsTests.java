// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.LogLocationSettings;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LogLocationSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogLocationSettings model = BinaryData.fromString(
            "{\"linkedServiceName\":{\"referenceName\":\"ocnwnjmiitlamf\",\"parameters\":{\"hjxwwqzsyetbff\":\"datak\"}},\"path\":\"dataqzvwznwcqoapdtj\"}")
            .toObject(LogLocationSettings.class);
        Assertions.assertEquals("ocnwnjmiitlamf", model.linkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogLocationSettings model = new LogLocationSettings()
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("ocnwnjmiitlamf")
                .withParameters(mapOf("hjxwwqzsyetbff", "datak")))
            .withPath("dataqzvwznwcqoapdtj");
        model = BinaryData.fromObject(model).toObject(LogLocationSettings.class);
        Assertions.assertEquals("ocnwnjmiitlamf", model.linkedServiceName().referenceName());
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
