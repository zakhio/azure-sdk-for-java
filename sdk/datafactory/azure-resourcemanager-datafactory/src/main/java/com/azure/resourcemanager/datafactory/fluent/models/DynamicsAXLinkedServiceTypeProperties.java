// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Dynamics AX linked service properties.
 */
@Fluent
public final class DynamicsAXLinkedServiceTypeProperties {
    /*
     * The Dynamics AX (or Dynamics 365 Finance and Operations) instance OData endpoint.
     */
    @JsonProperty(value = "url", required = true)
    private Object url;

    /*
     * Specify the application's client ID. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "servicePrincipalId", required = true)
    private Object servicePrincipalId;

    /*
     * Specify the application's key. Mark this field as a SecureString to store it securely in Data Factory, or
     * reference a secret stored in Azure Key Vault. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "servicePrincipalKey", required = true)
    private SecretBase servicePrincipalKey;

    /*
     * Specify the tenant information (domain name or tenant ID) under which your application resides. Retrieve it by
     * hovering the mouse in the top-right corner of the Azure portal. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "tenant", required = true)
    private Object tenant;

    /*
     * Specify the resource you are requesting authorization. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "aadResourceId", required = true)
    private Object aadResourceId;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of DynamicsAXLinkedServiceTypeProperties class.
     */
    public DynamicsAXLinkedServiceTypeProperties() {
    }

    /**
     * Get the url property: The Dynamics AX (or Dynamics 365 Finance and Operations) instance OData endpoint.
     * 
     * @return the url value.
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the url property: The Dynamics AX (or Dynamics 365 Finance and Operations) instance OData endpoint.
     * 
     * @param url the url value to set.
     * @return the DynamicsAXLinkedServiceTypeProperties object itself.
     */
    public DynamicsAXLinkedServiceTypeProperties withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get the servicePrincipalId property: Specify the application's client ID. Type: string (or Expression with
     * resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: Specify the application's client ID. Type: string (or Expression with
     * resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the DynamicsAXLinkedServiceTypeProperties object itself.
     */
    public DynamicsAXLinkedServiceTypeProperties withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: Specify the application's key. Mark this field as a SecureString to store
     * it securely in Data Factory, or reference a secret stored in Azure Key Vault. Type: string (or Expression with
     * resultType string).
     * 
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: Specify the application's key. Mark this field as a SecureString to store
     * it securely in Data Factory, or reference a secret stored in Azure Key Vault. Type: string (or Expression with
     * resultType string).
     * 
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the DynamicsAXLinkedServiceTypeProperties object itself.
     */
    public DynamicsAXLinkedServiceTypeProperties withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: Specify the tenant information (domain name or tenant ID) under which your application
     * resides. Retrieve it by hovering the mouse in the top-right corner of the Azure portal. Type: string (or
     * Expression with resultType string).
     * 
     * @return the tenant value.
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: Specify the tenant information (domain name or tenant ID) under which your application
     * resides. Retrieve it by hovering the mouse in the top-right corner of the Azure portal. Type: string (or
     * Expression with resultType string).
     * 
     * @param tenant the tenant value to set.
     * @return the DynamicsAXLinkedServiceTypeProperties object itself.
     */
    public DynamicsAXLinkedServiceTypeProperties withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the aadResourceId property: Specify the resource you are requesting authorization. Type: string (or
     * Expression with resultType string).
     * 
     * @return the aadResourceId value.
     */
    public Object aadResourceId() {
        return this.aadResourceId;
    }

    /**
     * Set the aadResourceId property: Specify the resource you are requesting authorization. Type: string (or
     * Expression with resultType string).
     * 
     * @param aadResourceId the aadResourceId value to set.
     * @return the DynamicsAXLinkedServiceTypeProperties object itself.
     */
    public DynamicsAXLinkedServiceTypeProperties withAadResourceId(Object aadResourceId) {
        this.aadResourceId = aadResourceId;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the DynamicsAXLinkedServiceTypeProperties object itself.
     */
    public DynamicsAXLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (url() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property url in model DynamicsAXLinkedServiceTypeProperties"));
        }
        if (servicePrincipalId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property servicePrincipalId in model DynamicsAXLinkedServiceTypeProperties"));
        }
        if (servicePrincipalKey() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property servicePrincipalKey in model DynamicsAXLinkedServiceTypeProperties"));
        } else {
            servicePrincipalKey().validate();
        }
        if (tenant() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property tenant in model DynamicsAXLinkedServiceTypeProperties"));
        }
        if (aadResourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property aadResourceId in model DynamicsAXLinkedServiceTypeProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DynamicsAXLinkedServiceTypeProperties.class);
}
