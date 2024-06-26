// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Edifact one way agreement. */
@Fluent
public final class EdifactOneWayAgreement {
    /*
     * The sender business identity
     */
    @JsonProperty(value = "senderBusinessIdentity", required = true)
    private BusinessIdentity senderBusinessIdentity;

    /*
     * The receiver business identity
     */
    @JsonProperty(value = "receiverBusinessIdentity", required = true)
    private BusinessIdentity receiverBusinessIdentity;

    /*
     * The EDIFACT protocol settings.
     */
    @JsonProperty(value = "protocolSettings", required = true)
    private EdifactProtocolSettings protocolSettings;

    /** Creates an instance of EdifactOneWayAgreement class. */
    public EdifactOneWayAgreement() {
    }

    /**
     * Get the senderBusinessIdentity property: The sender business identity.
     *
     * @return the senderBusinessIdentity value.
     */
    public BusinessIdentity senderBusinessIdentity() {
        return this.senderBusinessIdentity;
    }

    /**
     * Set the senderBusinessIdentity property: The sender business identity.
     *
     * @param senderBusinessIdentity the senderBusinessIdentity value to set.
     * @return the EdifactOneWayAgreement object itself.
     */
    public EdifactOneWayAgreement withSenderBusinessIdentity(BusinessIdentity senderBusinessIdentity) {
        this.senderBusinessIdentity = senderBusinessIdentity;
        return this;
    }

    /**
     * Get the receiverBusinessIdentity property: The receiver business identity.
     *
     * @return the receiverBusinessIdentity value.
     */
    public BusinessIdentity receiverBusinessIdentity() {
        return this.receiverBusinessIdentity;
    }

    /**
     * Set the receiverBusinessIdentity property: The receiver business identity.
     *
     * @param receiverBusinessIdentity the receiverBusinessIdentity value to set.
     * @return the EdifactOneWayAgreement object itself.
     */
    public EdifactOneWayAgreement withReceiverBusinessIdentity(BusinessIdentity receiverBusinessIdentity) {
        this.receiverBusinessIdentity = receiverBusinessIdentity;
        return this;
    }

    /**
     * Get the protocolSettings property: The EDIFACT protocol settings.
     *
     * @return the protocolSettings value.
     */
    public EdifactProtocolSettings protocolSettings() {
        return this.protocolSettings;
    }

    /**
     * Set the protocolSettings property: The EDIFACT protocol settings.
     *
     * @param protocolSettings the protocolSettings value to set.
     * @return the EdifactOneWayAgreement object itself.
     */
    public EdifactOneWayAgreement withProtocolSettings(EdifactProtocolSettings protocolSettings) {
        this.protocolSettings = protocolSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (senderBusinessIdentity() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property senderBusinessIdentity in model EdifactOneWayAgreement"));
        } else {
            senderBusinessIdentity().validate();
        }
        if (receiverBusinessIdentity() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property receiverBusinessIdentity in model EdifactOneWayAgreement"));
        } else {
            receiverBusinessIdentity().validate();
        }
        if (protocolSettings() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property protocolSettings in model EdifactOneWayAgreement"));
        } else {
            protocolSettings().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EdifactOneWayAgreement.class);
}
