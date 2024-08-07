// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConnectionState information.
 */
@Fluent
public final class ConnectionState {
    /*
     * Status of the connection.
     */
    @JsonProperty(value = "status")
    private PrivateLinkConnectionStatus status;

    /*
     * Description of the connection state.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Creates an instance of ConnectionState class.
     */
    public ConnectionState() {
    }

    /**
     * Get the status property: Status of the connection.
     * 
     * @return the status value.
     */
    public PrivateLinkConnectionStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the connection.
     * 
     * @param status the status value to set.
     * @return the ConnectionState object itself.
     */
    public ConnectionState withStatus(PrivateLinkConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: Description of the connection state.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the connection state.
     * 
     * @param description the description value to set.
     * @return the ConnectionState object itself.
     */
    public ConnectionState withDescription(String description) {
        this.description = description;
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
