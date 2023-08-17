// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.ControlPlaneNodePatchConfiguration;
import org.junit.jupiter.api.Assertions;

public final class ControlPlaneNodePatchConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ControlPlaneNodePatchConfiguration model =
            BinaryData.fromString("{\"count\":5157192368682854163}").toObject(ControlPlaneNodePatchConfiguration.class);
        Assertions.assertEquals(5157192368682854163L, model.count());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ControlPlaneNodePatchConfiguration model =
            new ControlPlaneNodePatchConfiguration().withCount(5157192368682854163L);
        model = BinaryData.fromObject(model).toObject(ControlPlaneNodePatchConfiguration.class);
        Assertions.assertEquals(5157192368682854163L, model.count());
    }
}
