// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

/** Samples for WebTests Delete. */
public final class WebTestsDeleteSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2022-06-15/examples/WebTestDelete.json
     */
    /**
     * Sample code: webTestDelete.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void webTestDelete(com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager
            .webTests()
            .deleteByResourceGroupWithResponse(
                "my-resource-group", "my-webtest-01-mywebservice", com.azure.core.util.Context.NONE);
    }
}
