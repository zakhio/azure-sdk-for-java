// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.RackPatchParameters;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RackPatchParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RackPatchParameters model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"rackLocation\":\"esyds\",\"rackSerialNumber\":\"efoh\"},\"tags\":{\"mtkhlowkxxpvbr\":\"vopwndyqleallk\",\"lhikcyychunsj\":\"fjmzsyzfho\",\"hv\":\"pjrtws\"}}")
                .toObject(RackPatchParameters.class);
        Assertions.assertEquals("vopwndyqleallk", model.tags().get("mtkhlowkxxpvbr"));
        Assertions.assertEquals("esyds", model.rackLocation());
        Assertions.assertEquals("efoh", model.rackSerialNumber());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RackPatchParameters model =
            new RackPatchParameters()
                .withTags(mapOf("mtkhlowkxxpvbr", "vopwndyqleallk", "lhikcyychunsj", "fjmzsyzfho", "hv", "pjrtws"))
                .withRackLocation("esyds")
                .withRackSerialNumber("efoh");
        model = BinaryData.fromObject(model).toObject(RackPatchParameters.class);
        Assertions.assertEquals("vopwndyqleallk", model.tags().get("mtkhlowkxxpvbr"));
        Assertions.assertEquals("esyds", model.rackLocation());
        Assertions.assertEquals("efoh", model.rackSerialNumber());
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
