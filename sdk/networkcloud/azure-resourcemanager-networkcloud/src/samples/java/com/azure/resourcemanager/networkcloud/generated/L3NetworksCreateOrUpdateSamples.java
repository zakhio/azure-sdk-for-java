// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.IpAllocationType;
import java.util.HashMap;
import java.util.Map;

/** Samples for L3Networks CreateOrUpdate. */
public final class L3NetworksCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/stable/2023-07-01/examples/L3Networks_Create.json
     */
    /**
     * Sample code: Create or update L3 network.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void createOrUpdateL3Network(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager
            .l3Networks()
            .define("l3NetworkName")
            .withRegion("location")
            .withExistingResourceGroup("resourceGroupName")
            .withExtendedLocation(
                new ExtendedLocation()
                    .withName(
                        "/subscriptions/123e4567-e89b-12d3-a456-426655440000/resourceGroups/resourceGroupName/providers/Microsoft.ExtendedLocation/customLocations/clusterExtendedLocationName")
                    .withType("CustomLocation"))
            .withL3IsolationDomainId(
                "/subscriptions/123e4567-e89b-12d3-a456-426655440000/resourceGroups/resourceGroupName/providers/Microsoft.ManagedNetworkFabric/l3IsolationDomains/l3IsolationDomainName")
            .withVlan(12L)
            .withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder"))
            .withInterfaceName("eth0")
            .withIpAllocationType(IpAllocationType.DUAL_STACK)
            .withIpv4ConnectedPrefix("198.51.100.0/24")
            .withIpv6ConnectedPrefix("2001:db8::/64")
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
