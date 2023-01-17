// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.DataLakeAnalyticsAccountPropertiesBasic;

public final class DataLakeAnalyticsAccountPropertiesBasicTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DataLakeAnalyticsAccountPropertiesBasic model =
            BinaryData
                .fromString(
                    "{\"accountId\":\"74d4e37a-0346-439f-9843-9dc7b3f67192\",\"provisioningState\":\"Deleted\",\"state\":\"Active\",\"creationTime\":\"2021-10-29T03:26:02Z\",\"lastModifiedTime\":\"2021-06-07T10:34:36Z\",\"endpoint\":\"s\"}")
                .toObject(DataLakeAnalyticsAccountPropertiesBasic.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DataLakeAnalyticsAccountPropertiesBasic model = new DataLakeAnalyticsAccountPropertiesBasic();
        model = BinaryData.fromObject(model).toObject(DataLakeAnalyticsAccountPropertiesBasic.class);
    }
}