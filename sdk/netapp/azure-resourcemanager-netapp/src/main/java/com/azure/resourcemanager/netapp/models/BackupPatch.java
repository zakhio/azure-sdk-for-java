// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.netapp.fluent.models.BackupPatchProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Backup patch.
 */
@Fluent
public final class BackupPatch {
    /*
     * Backup Patch Properties
     */
    @JsonProperty(value = "properties")
    private BackupPatchProperties innerProperties;

    /**
     * Creates an instance of BackupPatch class.
     */
    public BackupPatch() {
    }

    /**
     * Get the innerProperties property: Backup Patch Properties.
     * 
     * @return the innerProperties value.
     */
    private BackupPatchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the label property: Label for backup.
     * 
     * @return the label value.
     */
    public String label() {
        return this.innerProperties() == null ? null : this.innerProperties().label();
    }

    /**
     * Set the label property: Label for backup.
     * 
     * @param label the label value to set.
     * @return the BackupPatch object itself.
     */
    public BackupPatch withLabel(String label) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupPatchProperties();
        }
        this.innerProperties().withLabel(label);
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
