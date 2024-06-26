// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

/** Samples for GalleryImagesOperation Delete. */
public final class GalleryImagesOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/azurestackhci/resource-manager/Microsoft.AzureStackHCI/preview/2023-09-01-preview/examples/DeleteGalleryImage.json
     */
    /**
     * Sample code: DeleteGalleryImage.
     *
     * @param manager Entry point to AzureStackHciManager.
     */
    public static void deleteGalleryImage(com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager) {
        manager.galleryImagesOperations().delete("test-rg", "test-gallery-image", com.azure.core.util.Context.NONE);
    }
}
