// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.StorageProfileUpdate;
import com.azure.resourcemanager.azurestackhci.models.StorageProfileUpdateDataDisksItem;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class StorageProfileUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageProfileUpdate model =
            BinaryData
                .fromString("{\"dataDisks\":[{\"id\":\"p\"},{\"id\":\"jyofdxluusdtto\"}]}")
                .toObject(StorageProfileUpdate.class);
        Assertions.assertEquals("p", model.dataDisks().get(0).id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageProfileUpdate model =
            new StorageProfileUpdate()
                .withDataDisks(
                    Arrays
                        .asList(
                            new StorageProfileUpdateDataDisksItem().withId("p"),
                            new StorageProfileUpdateDataDisksItem().withId("jyofdxluusdtto")));
        model = BinaryData.fromObject(model).toObject(StorageProfileUpdate.class);
        Assertions.assertEquals("p", model.dataDisks().get(0).id());
    }
}
