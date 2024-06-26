// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Edifact agreement content. */
@Fluent
public final class EdifactAgreementContent {
    /*
     * The EDIFACT one-way receive agreement.
     */
    @JsonProperty(value = "receiveAgreement", required = true)
    private EdifactOneWayAgreement receiveAgreement;

    /*
     * The EDIFACT one-way send agreement.
     */
    @JsonProperty(value = "sendAgreement", required = true)
    private EdifactOneWayAgreement sendAgreement;

    /** Creates an instance of EdifactAgreementContent class. */
    public EdifactAgreementContent() {
    }

    /**
     * Get the receiveAgreement property: The EDIFACT one-way receive agreement.
     *
     * @return the receiveAgreement value.
     */
    public EdifactOneWayAgreement receiveAgreement() {
        return this.receiveAgreement;
    }

    /**
     * Set the receiveAgreement property: The EDIFACT one-way receive agreement.
     *
     * @param receiveAgreement the receiveAgreement value to set.
     * @return the EdifactAgreementContent object itself.
     */
    public EdifactAgreementContent withReceiveAgreement(EdifactOneWayAgreement receiveAgreement) {
        this.receiveAgreement = receiveAgreement;
        return this;
    }

    /**
     * Get the sendAgreement property: The EDIFACT one-way send agreement.
     *
     * @return the sendAgreement value.
     */
    public EdifactOneWayAgreement sendAgreement() {
        return this.sendAgreement;
    }

    /**
     * Set the sendAgreement property: The EDIFACT one-way send agreement.
     *
     * @param sendAgreement the sendAgreement value to set.
     * @return the EdifactAgreementContent object itself.
     */
    public EdifactAgreementContent withSendAgreement(EdifactOneWayAgreement sendAgreement) {
        this.sendAgreement = sendAgreement;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (receiveAgreement() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property receiveAgreement in model EdifactAgreementContent"));
        } else {
            receiveAgreement().validate();
        }
        if (sendAgreement() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sendAgreement in model EdifactAgreementContent"));
        } else {
            sendAgreement().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EdifactAgreementContent.class);
}
