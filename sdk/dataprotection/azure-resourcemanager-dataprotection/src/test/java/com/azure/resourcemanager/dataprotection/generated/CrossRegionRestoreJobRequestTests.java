// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreJobRequest;
import org.junit.jupiter.api.Assertions;

public final class CrossRegionRestoreJobRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CrossRegionRestoreJobRequest model = BinaryData
            .fromString(
                "{\"sourceRegion\":\"ie\",\"sourceBackupVaultId\":\"tfhvpesapskrdqmh\",\"jobId\":\"jdhtldwkyzxu\"}")
            .toObject(CrossRegionRestoreJobRequest.class);
        Assertions.assertEquals("ie", model.sourceRegion());
        Assertions.assertEquals("tfhvpesapskrdqmh", model.sourceBackupVaultId());
        Assertions.assertEquals("jdhtldwkyzxu", model.jobId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CrossRegionRestoreJobRequest model = new CrossRegionRestoreJobRequest().withSourceRegion("ie")
            .withSourceBackupVaultId("tfhvpesapskrdqmh")
            .withJobId("jdhtldwkyzxu");
        model = BinaryData.fromObject(model).toObject(CrossRegionRestoreJobRequest.class);
        Assertions.assertEquals("ie", model.sourceRegion());
        Assertions.assertEquals("tfhvpesapskrdqmh", model.sourceBackupVaultId());
        Assertions.assertEquals("jdhtldwkyzxu", model.jobId());
    }
}
