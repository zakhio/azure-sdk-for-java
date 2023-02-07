// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AgentPropertiesErrorDetails model. */
@Fluent
public final class AgentPropertiesErrorDetails {
    /*
     * Error code reported by Agent
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * Expanded description of reported error code
     */
    @JsonProperty(value = "message")
    private String message;

    /** Creates an instance of AgentPropertiesErrorDetails class. */
    public AgentPropertiesErrorDetails() {
    }

    /**
     * Get the code property: Error code reported by Agent.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: Error code reported by Agent.
     *
     * @param code the code value to set.
     * @return the AgentPropertiesErrorDetails object itself.
     */
    public AgentPropertiesErrorDetails withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: Expanded description of reported error code.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Expanded description of reported error code.
     *
     * @param message the message value to set.
     * @return the AgentPropertiesErrorDetails object itself.
     */
    public AgentPropertiesErrorDetails withMessage(String message) {
        this.message = message;
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