// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.servicebus.fluent.models.FailoverPropertiesProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Safe failover is to indicate the service should wait for pending replication to finish before switching to the
 * secondary.
 */
@Fluent
public final class FailoverProperties {
    /*
     * Safe failover is to indicate the service should wait for pending replication to finish before switching to the
     * secondary.
     */
    @JsonProperty(value = "properties")
    private FailoverPropertiesProperties innerProperties;

    /**
     * Get the innerProperties property: Safe failover is to indicate the service should wait for pending replication to
     * finish before switching to the secondary.
     *
     * @return the innerProperties value.
     */
    private FailoverPropertiesProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the isSafeFailover property: Safe failover is to indicate the service should wait for pending replication to
     * finish before switching to the secondary.
     *
     * @return the isSafeFailover value.
     */
    public Boolean isSafeFailover() {
        return this.innerProperties() == null ? null : this.innerProperties().isSafeFailover();
    }

    /**
     * Set the isSafeFailover property: Safe failover is to indicate the service should wait for pending replication to
     * finish before switching to the secondary.
     *
     * @param isSafeFailover the isSafeFailover value to set.
     * @return the FailoverProperties object itself.
     */
    public FailoverProperties withIsSafeFailover(Boolean isSafeFailover) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FailoverPropertiesProperties();
        }
        this.innerProperties().withIsSafeFailover(isSafeFailover);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
