// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * An alert status properties.
 */
@Fluent
public final class MetricAlertStatusProperties {
    /*
     * An object describing the type of the dimensions.
     */
    @JsonProperty(value = "dimensions")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> dimensions;

    /*
     * status value
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * UTC time when the status was checked.
     */
    @JsonProperty(value = "timestamp")
    private OffsetDateTime timestamp;

    /**
     * Creates an instance of MetricAlertStatusProperties class.
     */
    public MetricAlertStatusProperties() {
    }

    /**
     * Get the dimensions property: An object describing the type of the dimensions.
     * 
     * @return the dimensions value.
     */
    public Map<String, String> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: An object describing the type of the dimensions.
     * 
     * @param dimensions the dimensions value to set.
     * @return the MetricAlertStatusProperties object itself.
     */
    public MetricAlertStatusProperties withDimensions(Map<String, String> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the status property: status value.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: status value.
     * 
     * @param status the status value to set.
     * @return the MetricAlertStatusProperties object itself.
     */
    public MetricAlertStatusProperties withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the timestamp property: UTC time when the status was checked.
     * 
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: UTC time when the status was checked.
     * 
     * @param timestamp the timestamp value to set.
     * @return the MetricAlertStatusProperties object itself.
     */
    public MetricAlertStatusProperties withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
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
