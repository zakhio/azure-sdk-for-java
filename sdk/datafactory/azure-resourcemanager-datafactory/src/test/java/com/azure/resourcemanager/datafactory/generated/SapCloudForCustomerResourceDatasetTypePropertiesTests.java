// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.SapCloudForCustomerResourceDatasetTypeProperties;

public final class SapCloudForCustomerResourceDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapCloudForCustomerResourceDatasetTypeProperties model
            = BinaryData.fromString("{\"path\":\"datarvkgpogplbjuvl\"}")
                .toObject(SapCloudForCustomerResourceDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapCloudForCustomerResourceDatasetTypeProperties model
            = new SapCloudForCustomerResourceDatasetTypeProperties().withPath("datarvkgpogplbjuvl");
        model = BinaryData.fromObject(model).toObject(SapCloudForCustomerResourceDatasetTypeProperties.class);
    }
}
