// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Soft delete related settings. */
@Fluent
public final class SoftDeleteSettings {
    /*
     * State of soft delete
     */
    @JsonProperty(value = "state")
    private SoftDeleteState state;

    /*
     * Soft delete retention duration
     */
    @JsonProperty(value = "retentionDurationInDays")
    private Double retentionDurationInDays;

    /** Creates an instance of SoftDeleteSettings class. */
    public SoftDeleteSettings() {
    }

    /**
     * Get the state property: State of soft delete.
     *
     * @return the state value.
     */
    public SoftDeleteState state() {
        return this.state;
    }

    /**
     * Set the state property: State of soft delete.
     *
     * @param state the state value to set.
     * @return the SoftDeleteSettings object itself.
     */
    public SoftDeleteSettings withState(SoftDeleteState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the retentionDurationInDays property: Soft delete retention duration.
     *
     * @return the retentionDurationInDays value.
     */
    public Double retentionDurationInDays() {
        return this.retentionDurationInDays;
    }

    /**
     * Set the retentionDurationInDays property: Soft delete retention duration.
     *
     * @param retentionDurationInDays the retentionDurationInDays value to set.
     * @return the SoftDeleteSettings object itself.
     */
    public SoftDeleteSettings withRetentionDurationInDays(Double retentionDurationInDays) {
        this.retentionDurationInDays = retentionDurationInDays;
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