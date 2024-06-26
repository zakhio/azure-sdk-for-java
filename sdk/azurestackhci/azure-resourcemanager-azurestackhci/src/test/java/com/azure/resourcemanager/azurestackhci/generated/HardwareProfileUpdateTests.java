// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.HardwareProfileUpdate;
import com.azure.resourcemanager.azurestackhci.models.VmSizeEnum;
import org.junit.jupiter.api.Assertions;

public final class HardwareProfileUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HardwareProfileUpdate model =
            BinaryData
                .fromString(
                    "{\"vmSize\":\"Standard_K8S5_v1\",\"processors\":1792717087,\"memoryMB\":3914209859881409326}")
                .toObject(HardwareProfileUpdate.class);
        Assertions.assertEquals(VmSizeEnum.STANDARD_K8S5_V1, model.vmSize());
        Assertions.assertEquals(1792717087, model.processors());
        Assertions.assertEquals(3914209859881409326L, model.memoryMB());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HardwareProfileUpdate model =
            new HardwareProfileUpdate()
                .withVmSize(VmSizeEnum.STANDARD_K8S5_V1)
                .withProcessors(1792717087)
                .withMemoryMB(3914209859881409326L);
        model = BinaryData.fromObject(model).toObject(HardwareProfileUpdate.class);
        Assertions.assertEquals(VmSizeEnum.STANDARD_K8S5_V1, model.vmSize());
        Assertions.assertEquals(1792717087, model.processors());
        Assertions.assertEquals(3914209859881409326L, model.memoryMB());
    }
}
