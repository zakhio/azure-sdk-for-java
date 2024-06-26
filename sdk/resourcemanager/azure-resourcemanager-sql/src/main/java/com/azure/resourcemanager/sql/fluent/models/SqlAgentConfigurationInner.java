// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.sql.models.SqlAgentConfigurationPropertiesState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A recoverable managed database resource. */
@Fluent
public final class SqlAgentConfigurationInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private SqlAgentConfigurationProperties innerProperties;

    /** Creates an instance of SqlAgentConfigurationInner class. */
    public SqlAgentConfigurationInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private SqlAgentConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the state property: The state of Sql Agent.
     *
     * @return the state value.
     */
    public SqlAgentConfigurationPropertiesState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: The state of Sql Agent.
     *
     * @param state the state value to set.
     * @return the SqlAgentConfigurationInner object itself.
     */
    public SqlAgentConfigurationInner withState(SqlAgentConfigurationPropertiesState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlAgentConfigurationProperties();
        }
        this.innerProperties().withState(state);
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
