// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DbNode action object.
 */
@Fluent
public final class DbNodeAction {
    /*
     * Db action
     */
    @JsonProperty(value = "action", required = true)
    private DbNodeActionEnum action;

    /**
     * Creates an instance of DbNodeAction class.
     */
    public DbNodeAction() {
    }

    /**
     * Get the action property: Db action.
     * 
     * @return the action value.
     */
    public DbNodeActionEnum action() {
        return this.action;
    }

    /**
     * Set the action property: Db action.
     * 
     * @param action the action value to set.
     * @return the DbNodeAction object itself.
     */
    public DbNodeAction withAction(DbNodeActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (action() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property action in model DbNodeAction"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DbNodeAction.class);
}
