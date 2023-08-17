// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.BareMetalMachineCommandSpecification;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineRunReadCommandsParameters;
import java.util.Arrays;

/** Samples for BareMetalMachines RunReadCommands. */
public final class BareMetalMachinesRunReadCommandsSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/stable/2023-07-01/examples/BareMetalMachines_RunReadCommands.json
     */
    /**
     * Sample code: Run and retrieve output from read only commands on bare metal machine.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void runAndRetrieveOutputFromReadOnlyCommandsOnBareMetalMachine(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .bareMetalMachines()
            .runReadCommands(
                "resourceGroupName",
                "bareMetalMachineName",
                new BareMetalMachineRunReadCommandsParameters()
                    .withCommands(
                        Arrays
                            .asList(
                                new BareMetalMachineCommandSpecification()
                                    .withArguments(Arrays.asList("pods", "-A"))
                                    .withCommand("kubectl get"),
                                new BareMetalMachineCommandSpecification()
                                    .withArguments(Arrays.asList("192.168.0.99", "-c", "3"))
                                    .withCommand("ping")))
                    .withLimitTimeSeconds(60L),
                com.azure.core.util.Context.NONE);
    }
}
