// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The cost analysis configuration for the cluster.
 */
@Fluent
public final class ManagedClusterCostAnalysis {
    /*
     * The Managed Cluster sku.tier must be set to 'Standard' or 'Premium' to enable this feature. Enabling this will
     * add Kubernetes Namespace and Deployment details to the Cost Analysis views in the Azure portal. If not specified,
     * the default is false. For more information see aka.ms/aks/docs/cost-analysis.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Creates an instance of ManagedClusterCostAnalysis class.
     */
    public ManagedClusterCostAnalysis() {
    }

    /**
     * Get the enabled property: The Managed Cluster sku.tier must be set to 'Standard' or 'Premium' to enable this
     * feature. Enabling this will add Kubernetes Namespace and Deployment details to the Cost Analysis views in the
     * Azure portal. If not specified, the default is false. For more information see aka.ms/aks/docs/cost-analysis.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: The Managed Cluster sku.tier must be set to 'Standard' or 'Premium' to enable this
     * feature. Enabling this will add Kubernetes Namespace and Deployment details to the Cost Analysis views in the
     * Azure portal. If not specified, the default is false. For more information see aka.ms/aks/docs/cost-analysis.
     * 
     * @param enabled the enabled value to set.
     * @return the ManagedClusterCostAnalysis object itself.
     */
    public ManagedClusterCostAnalysis withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
