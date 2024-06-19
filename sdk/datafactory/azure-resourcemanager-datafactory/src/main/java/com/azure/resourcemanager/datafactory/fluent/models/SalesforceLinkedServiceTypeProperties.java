// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce linked service properties.
 */
@Fluent
public final class SalesforceLinkedServiceTypeProperties {
    /*
     * The URL of Salesforce instance. Default is 'https://login.salesforce.com'. To copy data from sandbox, specify
     * 'https://test.salesforce.com'. To copy data from custom domain, specify, for example,
     * 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "environmentUrl")
    private Object environmentUrl;

    /*
     * The username for Basic authentication of the Salesforce instance. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "username")
    private Object username;

    /*
     * The password for Basic authentication of the Salesforce instance.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * The security token is optional to remotely access Salesforce instance.
     */
    @JsonProperty(value = "securityToken")
    private SecretBase securityToken;

    /*
     * The Salesforce API version used in ADF. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "apiVersion")
    private Object apiVersion;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of SalesforceLinkedServiceTypeProperties class.
     */
    public SalesforceLinkedServiceTypeProperties() {
    }

    /**
     * Get the environmentUrl property: The URL of Salesforce instance. Default is 'https://login.salesforce.com'. To
     * copy data from sandbox, specify 'https://test.salesforce.com'. To copy data from custom domain, specify, for
     * example, 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     * 
     * @return the environmentUrl value.
     */
    public Object environmentUrl() {
        return this.environmentUrl;
    }

    /**
     * Set the environmentUrl property: The URL of Salesforce instance. Default is 'https://login.salesforce.com'. To
     * copy data from sandbox, specify 'https://test.salesforce.com'. To copy data from custom domain, specify, for
     * example, 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     * 
     * @param environmentUrl the environmentUrl value to set.
     * @return the SalesforceLinkedServiceTypeProperties object itself.
     */
    public SalesforceLinkedServiceTypeProperties withEnvironmentUrl(Object environmentUrl) {
        this.environmentUrl = environmentUrl;
        return this;
    }

    /**
     * Get the username property: The username for Basic authentication of the Salesforce instance. Type: string (or
     * Expression with resultType string).
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The username for Basic authentication of the Salesforce instance. Type: string (or
     * Expression with resultType string).
     * 
     * @param username the username value to set.
     * @return the SalesforceLinkedServiceTypeProperties object itself.
     */
    public SalesforceLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password for Basic authentication of the Salesforce instance.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The password for Basic authentication of the Salesforce instance.
     * 
     * @param password the password value to set.
     * @return the SalesforceLinkedServiceTypeProperties object itself.
     */
    public SalesforceLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the securityToken property: The security token is optional to remotely access Salesforce instance.
     * 
     * @return the securityToken value.
     */
    public SecretBase securityToken() {
        return this.securityToken;
    }

    /**
     * Set the securityToken property: The security token is optional to remotely access Salesforce instance.
     * 
     * @param securityToken the securityToken value to set.
     * @return the SalesforceLinkedServiceTypeProperties object itself.
     */
    public SalesforceLinkedServiceTypeProperties withSecurityToken(SecretBase securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * Get the apiVersion property: The Salesforce API version used in ADF. Type: string (or Expression with resultType
     * string).
     * 
     * @return the apiVersion value.
     */
    public Object apiVersion() {
        return this.apiVersion;
    }

    /**
     * Set the apiVersion property: The Salesforce API version used in ADF. Type: string (or Expression with resultType
     * string).
     * 
     * @param apiVersion the apiVersion value to set.
     * @return the SalesforceLinkedServiceTypeProperties object itself.
     */
    public SalesforceLinkedServiceTypeProperties withApiVersion(Object apiVersion) {
        this.apiVersion = apiVersion;
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
     * @return the SalesforceLinkedServiceTypeProperties object itself.
     */
    public SalesforceLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (password() != null) {
            password().validate();
        }
        if (securityToken() != null) {
            securityToken().validate();
        }
    }
}
