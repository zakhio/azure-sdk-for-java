// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.ClusterManager;
import java.util.HashMap;
import java.util.Map;

/** Samples for ClusterManagers Update. */
public final class ClusterManagersUpdateSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/stable/2023-07-01/examples/ClusterManagers_Patch.json
     */
    /**
     * Sample code: Patch cluster manager.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void patchClusterManager(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        ClusterManager resource =
            manager
                .clusterManagers()
                .getByResourceGroupWithResponse(
                    "resourceGroupName", "clusterManagerName", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder")).apply();
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
