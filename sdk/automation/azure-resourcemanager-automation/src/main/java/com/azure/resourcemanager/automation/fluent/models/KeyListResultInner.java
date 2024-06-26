// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.automation.models.Key;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The KeyListResult model. */
@Fluent
public final class KeyListResultInner {
    /*
     * Lists the automation keys.
     */
    @JsonProperty(value = "keys")
    private List<Key> keys;

    /**
     * Get the keys property: Lists the automation keys.
     *
     * @return the keys value.
     */
    public List<Key> keys() {
        return this.keys;
    }

    /**
     * Set the keys property: Lists the automation keys.
     *
     * @param keys the keys value to set.
     * @return the KeyListResultInner object itself.
     */
    public KeyListResultInner withKeys(List<Key> keys) {
        this.keys = keys;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keys() != null) {
            keys().forEach(e -> e.validate());
        }
    }
}
