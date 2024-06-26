// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.maintenance.fluent.models.ConfigurationAssignmentInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response for ConfigurationAssignments list.
 */
@Fluent
public final class ListConfigurationAssignmentsResult {
    /*
     * The list of configuration Assignments
     */
    @JsonProperty(value = "value")
    private List<ConfigurationAssignmentInner> value;

    /**
     * Creates an instance of ListConfigurationAssignmentsResult class.
     */
    public ListConfigurationAssignmentsResult() {
    }

    /**
     * Get the value property: The list of configuration Assignments.
     * 
     * @return the value value.
     */
    public List<ConfigurationAssignmentInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of configuration Assignments.
     * 
     * @param value the value value to set.
     * @return the ListConfigurationAssignmentsResult object itself.
     */
    public ListConfigurationAssignmentsResult withValue(List<ConfigurationAssignmentInner> value) {
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
