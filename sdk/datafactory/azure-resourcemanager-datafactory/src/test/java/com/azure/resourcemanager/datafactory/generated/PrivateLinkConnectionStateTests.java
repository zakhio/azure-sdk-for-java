// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PrivateLinkConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkConnectionStateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkConnectionState model = BinaryData
            .fromString("{\"status\":\"gguxhemlwyw\",\"description\":\"eczgfb\",\"actionsRequired\":\"klelssxb\"}")
            .toObject(PrivateLinkConnectionState.class);
        Assertions.assertEquals("gguxhemlwyw", model.status());
        Assertions.assertEquals("eczgfb", model.description());
        Assertions.assertEquals("klelssxb", model.actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkConnectionState model = new PrivateLinkConnectionState().withStatus("gguxhemlwyw")
            .withDescription("eczgfb")
            .withActionsRequired("klelssxb");
        model = BinaryData.fromObject(model).toObject(PrivateLinkConnectionState.class);
        Assertions.assertEquals("gguxhemlwyw", model.status());
        Assertions.assertEquals("eczgfb", model.description());
        Assertions.assertEquals("klelssxb", model.actionsRequired());
    }
}
