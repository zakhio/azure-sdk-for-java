// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ValidateBackupResponseProperties;
import org.junit.jupiter.api.Assertions;

public final class ValidateBackupResponsePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ValidateBackupResponseProperties model = BinaryData.fromString("{\"numberOfContainers\":757345112}")
            .toObject(ValidateBackupResponseProperties.class);
        Assertions.assertEquals(757345112, model.numberOfContainers());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ValidateBackupResponseProperties model
            = new ValidateBackupResponseProperties().withNumberOfContainers(757345112);
        model = BinaryData.fromObject(model).toObject(ValidateBackupResponseProperties.class);
        Assertions.assertEquals(757345112, model.numberOfContainers());
    }
}
