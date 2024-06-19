// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzPowerShellSetupTypeProperties;
import org.junit.jupiter.api.Assertions;

public final class AzPowerShellSetupTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzPowerShellSetupTypeProperties model
            = BinaryData.fromString("{\"version\":\"sx\"}").toObject(AzPowerShellSetupTypeProperties.class);
        Assertions.assertEquals("sx", model.version());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzPowerShellSetupTypeProperties model = new AzPowerShellSetupTypeProperties().withVersion("sx");
        model = BinaryData.fromObject(model).toObject(AzPowerShellSetupTypeProperties.class);
        Assertions.assertEquals("sx", model.version());
    }
}
