// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.MigrationNameAvailabilityResourceInner;
import org.junit.jupiter.api.Assertions;

public final class MigrationNameAvailabilityResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigrationNameAvailabilityResourceInner model = BinaryData.fromString(
            "{\"name\":\"i\",\"type\":\"ybxarzgszu\",\"nameAvailable\":false,\"reason\":\"AlreadyExists\",\"message\":\"opidoamciodh\"}")
            .toObject(MigrationNameAvailabilityResourceInner.class);
        Assertions.assertEquals("i", model.name());
        Assertions.assertEquals("ybxarzgszu", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigrationNameAvailabilityResourceInner model
            = new MigrationNameAvailabilityResourceInner().withName("i").withType("ybxarzgszu");
        model = BinaryData.fromObject(model).toObject(MigrationNameAvailabilityResourceInner.class);
        Assertions.assertEquals("i", model.name());
        Assertions.assertEquals("ybxarzgszu", model.type());
    }
}
