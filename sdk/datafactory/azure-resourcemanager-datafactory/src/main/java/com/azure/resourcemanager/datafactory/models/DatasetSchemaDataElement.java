// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Columns that define the physical type schema of the dataset.
 */
@Fluent
public final class DatasetSchemaDataElement {
    /*
     * Name of the schema column. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "name")
    private Object name;

    /*
     * Type of the schema column. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "type")
    private Object type;

    /*
     * Columns that define the physical type schema of the dataset.
     */
    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of DatasetSchemaDataElement class.
     */
    public DatasetSchemaDataElement() {
    }

    /**
     * Get the name property: Name of the schema column. Type: string (or Expression with resultType string).
     * 
     * @return the name value.
     */
    public Object name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the schema column. Type: string (or Expression with resultType string).
     * 
     * @param name the name value to set.
     * @return the DatasetSchemaDataElement object itself.
     */
    public DatasetSchemaDataElement withName(Object name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Type of the schema column. Type: string (or Expression with resultType string).
     * 
     * @return the type value.
     */
    public Object type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the schema column. Type: string (or Expression with resultType string).
     * 
     * @param type the type value to set.
     * @return the DatasetSchemaDataElement object itself.
     */
    public DatasetSchemaDataElement withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Get the additionalProperties property: Columns that define the physical type schema of the dataset.
     * 
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Columns that define the physical type schema of the dataset.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the DatasetSchemaDataElement object itself.
     */
    public DatasetSchemaDataElement withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new LinkedHashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
