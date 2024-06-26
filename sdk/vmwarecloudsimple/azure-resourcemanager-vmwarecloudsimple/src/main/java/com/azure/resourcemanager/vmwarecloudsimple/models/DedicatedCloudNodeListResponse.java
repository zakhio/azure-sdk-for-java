// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.DedicatedCloudNodeInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of dedicated nodes response model. */
@Fluent
public final class DedicatedCloudNodeListResponse {
    /*
     * Link for next list of DedicatedCloudNode
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Results of the DedicatedCloudNode list
     */
    @JsonProperty(value = "value")
    private List<DedicatedCloudNodeInner> value;

    /** Creates an instance of DedicatedCloudNodeListResponse class. */
    public DedicatedCloudNodeListResponse() {
    }

    /**
     * Get the nextLink property: Link for next list of DedicatedCloudNode.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link for next list of DedicatedCloudNode.
     *
     * @param nextLink the nextLink value to set.
     * @return the DedicatedCloudNodeListResponse object itself.
     */
    public DedicatedCloudNodeListResponse withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: Results of the DedicatedCloudNode list.
     *
     * @return the value value.
     */
    public List<DedicatedCloudNodeInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Results of the DedicatedCloudNode list.
     *
     * @param value the value value to set.
     * @return the DedicatedCloudNodeListResponse object itself.
     */
    public DedicatedCloudNodeListResponse withValue(List<DedicatedCloudNodeInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
