// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

/**
 * Samples for Machines GetByResourceGroup.
 */
public final class MachinesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2024-05-20-preview/examples/machine/
     * Machines_Get_LicenseProfileInstanceView.json
     */
    /**
     * Sample code: Get Machine with License Profile Instance View.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void
        getMachineWithLicenseProfileInstanceView(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.machines()
            .getByResourceGroupWithResponse("myResourceGroup", "myMachine", "instanceView",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2024-05-20-preview/examples/machine/
     * Machines_Get.json
     */
    /**
     * Sample code: Get Machine.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void getMachine(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.machines()
            .getByResourceGroupWithResponse("myResourceGroup", "myMachine", null, com.azure.core.util.Context.NONE);
    }
}
