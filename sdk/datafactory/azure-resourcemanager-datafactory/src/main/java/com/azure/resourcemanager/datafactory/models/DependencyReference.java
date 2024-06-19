// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Referenced dependency.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = DependencyReference.class, visible = true)
@JsonTypeName("DependencyReference")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "TriggerDependencyReference", value = TriggerDependencyReference.class),
    @JsonSubTypes.Type(
        name = "SelfDependencyTumblingWindowTriggerReference",
        value = SelfDependencyTumblingWindowTriggerReference.class) })
@Immutable
public class DependencyReference {
    /*
     * The type of dependency reference.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "DependencyReference";

    /**
     * Creates an instance of DependencyReference class.
     */
    public DependencyReference() {
    }

    /**
     * Get the type property: The type of dependency reference.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
