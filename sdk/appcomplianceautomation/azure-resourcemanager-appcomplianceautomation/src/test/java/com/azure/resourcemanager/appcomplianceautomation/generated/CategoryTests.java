// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcomplianceautomation.models.Category;
import org.junit.jupiter.api.Test;

public final class CategoryTests {
    @Test
    public void testDeserialize() {
        Category model =
            BinaryData
                .fromString(
                    "{\"categoryName\":\"tgrhpdjpjumas\",\"categoryType\":\"FullyAutomated\",\"categoryStatus\":\"Unhealthy\",\"controlFamilies\":[{\"familyName\":\"gual\",\"familyType\":\"FullyAutomated\",\"familyStatus\":\"Healthy\",\"controls\":[]}]}")
                .toObject(Category.class);
    }

    @Test
    public void testSerialize() {
        Category model = new Category();
        model = BinaryData.fromObject(model).toObject(Category.class);
    }
}
