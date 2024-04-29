// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.TopicTypeAdditionalEnforcedPermission;
import org.junit.jupiter.api.Assertions;

public final class TopicTypeAdditionalEnforcedPermissionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TopicTypeAdditionalEnforcedPermission model
            = BinaryData.fromString("{\"permissionName\":\"wakywalhjymxcgq\",\"isDataAction\":true}")
                .toObject(TopicTypeAdditionalEnforcedPermission.class);
        Assertions.assertEquals("wakywalhjymxcgq", model.permissionName());
        Assertions.assertEquals(true, model.isDataAction());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TopicTypeAdditionalEnforcedPermission model
            = new TopicTypeAdditionalEnforcedPermission().withPermissionName("wakywalhjymxcgq").withIsDataAction(true);
        model = BinaryData.fromObject(model).toObject(TopicTypeAdditionalEnforcedPermission.class);
        Assertions.assertEquals("wakywalhjymxcgq", model.permissionName());
        Assertions.assertEquals(true, model.isDataAction());
    }
}
