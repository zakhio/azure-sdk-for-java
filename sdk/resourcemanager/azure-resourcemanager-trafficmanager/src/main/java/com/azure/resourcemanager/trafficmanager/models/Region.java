// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Class representing a region in the Geographic hierarchy used with the Geographic traffic routing method. */
@Fluent
public final class Region {
    /*
     * The code of the region
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The name of the region
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The list of Regions grouped under this Region in the Geographic Hierarchy.
     */
    @JsonProperty(value = "regions")
    private List<Region> regions;

    /** Creates an instance of Region class. */
    public Region() {
    }

    /**
     * Get the code property: The code of the region.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The code of the region.
     *
     * @param code the code value to set.
     * @return the Region object itself.
     */
    public Region withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the name property: The name of the region.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the region.
     *
     * @param name the name value to set.
     * @return the Region object itself.
     */
    public Region withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the regions property: The list of Regions grouped under this Region in the Geographic Hierarchy.
     *
     * @return the regions value.
     */
    public List<Region> regions() {
        return this.regions;
    }

    /**
     * Set the regions property: The list of Regions grouped under this Region in the Geographic Hierarchy.
     *
     * @param regions the regions value to set.
     * @return the Region object itself.
     */
    public Region withRegions(List<Region> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (regions() != null) {
            regions().forEach(e -> e.validate());
        }
    }
}
