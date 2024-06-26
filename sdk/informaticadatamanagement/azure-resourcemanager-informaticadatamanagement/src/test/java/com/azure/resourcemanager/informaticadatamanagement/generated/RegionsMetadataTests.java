// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.informaticadatamanagement.models.RegionsMetadata;
import org.junit.jupiter.api.Assertions;

public final class RegionsMetadataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegionsMetadata model = BinaryData.fromString("{\"id\":\"nftguvriuhpr\",\"name\":\"dyvxqtayriww\"}")
            .toObject(RegionsMetadata.class);
        Assertions.assertEquals("nftguvriuhpr", model.id());
        Assertions.assertEquals("dyvxqtayriww", model.name());
    }
}
