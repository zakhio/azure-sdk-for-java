// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.MigrateMISyncCompleteCommandInput;
import org.junit.jupiter.api.Assertions;

public final class MigrateMISyncCompleteCommandInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigrateMISyncCompleteCommandInput model =
            BinaryData
                .fromString("{\"sourceDatabaseName\":\"whonowk\"}")
                .toObject(MigrateMISyncCompleteCommandInput.class);
        Assertions.assertEquals("whonowk", model.sourceDatabaseName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigrateMISyncCompleteCommandInput model =
            new MigrateMISyncCompleteCommandInput().withSourceDatabaseName("whonowk");
        model = BinaryData.fromObject(model).toObject(MigrateMISyncCompleteCommandInput.class);
        Assertions.assertEquals("whonowk", model.sourceDatabaseName());
    }
}