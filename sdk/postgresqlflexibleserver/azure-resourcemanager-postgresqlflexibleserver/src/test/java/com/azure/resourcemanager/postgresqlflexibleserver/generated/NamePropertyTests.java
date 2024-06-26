// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.NameProperty;
import org.junit.jupiter.api.Assertions;

public final class NamePropertyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NameProperty model = BinaryData.fromString("{\"value\":\"ond\",\"localizedValue\":\"luudfdlwggytsb\"}")
            .toObject(NameProperty.class);
        Assertions.assertEquals("ond", model.value());
        Assertions.assertEquals("luudfdlwggytsb", model.localizedValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NameProperty model = new NameProperty().withValue("ond").withLocalizedValue("luudfdlwggytsb");
        model = BinaryData.fromObject(model).toObject(NameProperty.class);
        Assertions.assertEquals("ond", model.value());
        Assertions.assertEquals("luudfdlwggytsb", model.localizedValue());
    }
}
