// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AvroFormat;

public final class AvroFormatTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvroFormat model = BinaryData.fromString(
            "{\"type\":\"AvroFormat\",\"serializer\":\"datanck\",\"deserializer\":\"datalblfxlupibaqzizx\",\"\":{\"qiyndveqels\":\"dataweghlwwbogvgfk\",\"ns\":\"datafvdstrkzxsgt\",\"smovpi\":\"datalr\",\"dnox\":\"datay\"}}")
            .toObject(AvroFormat.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvroFormat model = new AvroFormat().withSerializer("datanck").withDeserializer("datalblfxlupibaqzizx");
        model = BinaryData.fromObject(model).toObject(AvroFormat.class);
    }
}
