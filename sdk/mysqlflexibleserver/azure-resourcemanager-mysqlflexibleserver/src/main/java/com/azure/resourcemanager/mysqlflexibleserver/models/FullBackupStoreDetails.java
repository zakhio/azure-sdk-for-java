// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * FullBackupStoreDetails is used for scenarios where backup data is streamed/copied over to a storage destination.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "objectType",
    defaultImpl = FullBackupStoreDetails.class,
    visible = true)
@JsonTypeName("FullBackupStoreDetails")
@Fluent
public final class FullBackupStoreDetails extends BackupStoreDetails {
    /*
     * Type of the specific object - used for deserializing
     */
    @JsonTypeId
    @JsonProperty(value = "objectType", required = true)
    private String objectType = "FullBackupStoreDetails";

    /*
     * SASUriList of storage containers where backup data is to be streamed/copied.
     */
    @JsonProperty(value = "sasUriList", required = true)
    private List<String> sasUriList;

    /**
     * Creates an instance of FullBackupStoreDetails class.
     */
    public FullBackupStoreDetails() {
    }

    /**
     * Get the objectType property: Type of the specific object - used for deserializing.
     * 
     * @return the objectType value.
     */
    @Override
    public String objectType() {
        return this.objectType;
    }

    /**
     * Get the sasUriList property: SASUriList of storage containers where backup data is to be streamed/copied.
     * 
     * @return the sasUriList value.
     */
    public List<String> sasUriList() {
        return this.sasUriList;
    }

    /**
     * Set the sasUriList property: SASUriList of storage containers where backup data is to be streamed/copied.
     * 
     * @param sasUriList the sasUriList value to set.
     * @return the FullBackupStoreDetails object itself.
     */
    public FullBackupStoreDetails withSasUriList(List<String> sasUriList) {
        this.sasUriList = sasUriList;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (sasUriList() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sasUriList in model FullBackupStoreDetails"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FullBackupStoreDetails.class);
}
