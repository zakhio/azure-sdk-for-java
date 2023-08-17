// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.ConsoleEnabled;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.SshPublicKey;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** Samples for Consoles CreateOrUpdate. */
public final class ConsolesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/stable/2023-07-01/examples/Consoles_Create.json
     */
    /**
     * Sample code: Create or update virtual machine console.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void createOrUpdateVirtualMachineConsole(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .consoles()
            .define("default")
            .withRegion("location")
            .withExistingVirtualMachine("resourceGroupName", "virtualMachineName")
            .withExtendedLocation(
                new ExtendedLocation()
                    .withName(
                        "/subscriptions/123e4567-e89b-12d3-a456-426655440000/resourceGroups/resourceGroupName/providers/Microsoft.ExtendedLocation/customLocations/clusterManagerExtendedLocationName")
                    .withType("CustomLocation"))
            .withEnabled(ConsoleEnabled.TRUE)
            .withSshPublicKey(new SshPublicKey().withKeyData("fakeTokenPlaceholder"))
            .withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder"))
            .withExpiration(OffsetDateTime.parse("2022-06-01T01:27:03.008Z"))
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
