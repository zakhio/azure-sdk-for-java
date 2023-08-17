// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for Clusters List. */
public final class ClustersListSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/stable/2023-07-01/examples/Clusters_ListBySubscription.json
     */
    /**
     * Sample code: List clusters for subscription.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void listClustersForSubscription(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager.clusters().list(com.azure.core.util.Context.NONE);
    }
}
