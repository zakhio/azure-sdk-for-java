// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

/** Samples for CustomImages Get. */
public final class CustomImagesGetSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2018-09-15/examples/CustomImages_Get.json
     */
    /**
     * Sample code: CustomImages_Get.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void customImagesGet(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager
            .customImages()
            .getWithResponse(
                "resourceGroupName", "{labName}", "{customImageName}", null, com.azure.core.util.Context.NONE);
    }
}