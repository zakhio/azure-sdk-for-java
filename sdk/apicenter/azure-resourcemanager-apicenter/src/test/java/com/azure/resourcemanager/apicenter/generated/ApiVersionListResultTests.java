// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apicenter.models.ApiVersionListResult;

public final class ApiVersionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiVersionListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"title\":\"butr\",\"lifecycleStage\":\"design\"},\"id\":\"na\",\"name\":\"zmhjrunmp\",\"type\":\"ttdbhrbnl\"}],\"nextLink\":\"kx\"}")
            .toObject(ApiVersionListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiVersionListResult model = new ApiVersionListResult();
        model = BinaryData.fromObject(model).toObject(ApiVersionListResult.class);
    }
}
