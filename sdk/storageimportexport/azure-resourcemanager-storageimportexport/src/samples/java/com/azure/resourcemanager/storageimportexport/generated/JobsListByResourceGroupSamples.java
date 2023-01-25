// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.generated;

/** Samples for Jobs ListByResourceGroup. */
public final class JobsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/storageimportexport/resource-manager/Microsoft.ImportExport/preview/2021-01-01/examples/ListJobsInResourceGroup.json
     */
    /**
     * Sample code: List jobs in a resource group.
     *
     * @param manager Entry point to StorageImportExportManager.
     */
    public static void listJobsInAResourceGroup(
        com.azure.resourcemanager.storageimportexport.StorageImportExportManager manager) {
        manager.jobs().listByResourceGroup("myResourceGroup", null, null, com.azure.core.util.Context.NONE);
    }
}