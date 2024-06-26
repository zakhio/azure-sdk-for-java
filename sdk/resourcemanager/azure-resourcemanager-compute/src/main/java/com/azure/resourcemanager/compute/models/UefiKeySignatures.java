// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Additional UEFI key signatures that will be added to the image in addition to the signature templates.
 */
@Fluent
public final class UefiKeySignatures {
    /*
     * The Platform Key of this image version.
     */
    @JsonProperty(value = "pk")
    private UefiKey pk;

    /*
     * The Key Encryption Keys of this image version.
     */
    @JsonProperty(value = "kek")
    private List<UefiKey> kek;

    /*
     * The database of UEFI keys for this image version.
     */
    @JsonProperty(value = "db")
    private List<UefiKey> db;

    /*
     * The database of revoked UEFI keys for this image version.
     */
    @JsonProperty(value = "dbx")
    private List<UefiKey> dbx;

    /**
     * Creates an instance of UefiKeySignatures class.
     */
    public UefiKeySignatures() {
    }

    /**
     * Get the pk property: The Platform Key of this image version.
     * 
     * @return the pk value.
     */
    public UefiKey pk() {
        return this.pk;
    }

    /**
     * Set the pk property: The Platform Key of this image version.
     * 
     * @param pk the pk value to set.
     * @return the UefiKeySignatures object itself.
     */
    public UefiKeySignatures withPk(UefiKey pk) {
        this.pk = pk;
        return this;
    }

    /**
     * Get the kek property: The Key Encryption Keys of this image version.
     * 
     * @return the kek value.
     */
    public List<UefiKey> kek() {
        return this.kek;
    }

    /**
     * Set the kek property: The Key Encryption Keys of this image version.
     * 
     * @param kek the kek value to set.
     * @return the UefiKeySignatures object itself.
     */
    public UefiKeySignatures withKek(List<UefiKey> kek) {
        this.kek = kek;
        return this;
    }

    /**
     * Get the db property: The database of UEFI keys for this image version.
     * 
     * @return the db value.
     */
    public List<UefiKey> db() {
        return this.db;
    }

    /**
     * Set the db property: The database of UEFI keys for this image version.
     * 
     * @param db the db value to set.
     * @return the UefiKeySignatures object itself.
     */
    public UefiKeySignatures withDb(List<UefiKey> db) {
        this.db = db;
        return this;
    }

    /**
     * Get the dbx property: The database of revoked UEFI keys for this image version.
     * 
     * @return the dbx value.
     */
    public List<UefiKey> dbx() {
        return this.dbx;
    }

    /**
     * Set the dbx property: The database of revoked UEFI keys for this image version.
     * 
     * @param dbx the dbx value to set.
     * @return the UefiKeySignatures object itself.
     */
    public UefiKeySignatures withDbx(List<UefiKey> dbx) {
        this.dbx = dbx;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pk() != null) {
            pk().validate();
        }
        if (kek() != null) {
            kek().forEach(e -> e.validate());
        }
        if (db() != null) {
            db().forEach(e -> e.validate());
        }
        if (dbx() != null) {
            dbx().forEach(e -> e.validate());
        }
    }
}
