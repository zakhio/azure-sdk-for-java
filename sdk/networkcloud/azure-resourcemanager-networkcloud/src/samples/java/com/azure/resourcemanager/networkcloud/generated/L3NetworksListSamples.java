// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for L3Networks List. */
public final class L3NetworksListSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/stable/2023-07-01/examples/L3Networks_ListBySubscription.json
     */
    /**
     * Sample code: List L3 networks for subscription.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void listL3NetworksForSubscription(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager.l3Networks().list(com.azure.core.util.Context.NONE);
    }
}
