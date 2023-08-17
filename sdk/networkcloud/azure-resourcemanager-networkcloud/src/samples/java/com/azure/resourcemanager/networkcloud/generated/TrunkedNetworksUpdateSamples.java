// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.TrunkedNetwork;
import java.util.HashMap;
import java.util.Map;

/** Samples for TrunkedNetworks Update. */
public final class TrunkedNetworksUpdateSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/stable/2023-07-01/examples/TrunkedNetworks_Patch.json
     */
    /**
     * Sample code: Patch trunked network.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void patchTrunkedNetwork(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        TrunkedNetwork resource =
            manager
                .trunkedNetworks()
                .getByResourceGroupWithResponse(
                    "resourceGroupName", "trunkedNetworkName", com.azure.core.util.Context.NONE)
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
