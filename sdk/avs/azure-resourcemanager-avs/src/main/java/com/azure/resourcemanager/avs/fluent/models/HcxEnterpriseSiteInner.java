// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.avs.models.HcxEnterpriseSiteStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An HCX Enterprise Site resource. */
@Immutable
public final class HcxEnterpriseSiteInner extends ProxyResource {
    /*
     * The properties of an HCX Enterprise Site resource
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private HcxEnterpriseSiteProperties innerProperties;

    /** Creates an instance of HcxEnterpriseSiteInner class. */
    public HcxEnterpriseSiteInner() {
    }

    /**
     * Get the innerProperties property: The properties of an HCX Enterprise Site resource.
     *
     * @return the innerProperties value.
     */
    private HcxEnterpriseSiteProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the activationKey property: The activation key.
     *
     * @return the activationKey value.
     */
    public String activationKey() {
        return this.innerProperties() == null ? null : this.innerProperties().activationKey();
    }

    /**
     * Get the status property: The status of the HCX Enterprise Site.
     *
     * @return the status value.
     */
    public HcxEnterpriseSiteStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
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
