// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Xml read settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = XmlReadSettings.class, visible = true)
@JsonTypeName("XmlReadSettings")
@Fluent
public final class XmlReadSettings extends FormatReadSettings {
    /*
     * The read setting type.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "XmlReadSettings";

    /*
     * Compression settings.
     */
    @JsonProperty(value = "compressionProperties")
    private CompressionReadSettings compressionProperties;

    /*
     * Indicates what validation method is used when reading the xml files. Allowed values: 'none', 'xsd', or 'dtd'.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "validationMode")
    private Object validationMode;

    /*
     * Indicates whether type detection is enabled when reading the xml files. Type: boolean (or Expression with
     * resultType boolean).
     */
    @JsonProperty(value = "detectDataType")
    private Object detectDataType;

    /*
     * Indicates whether namespace is enabled when reading the xml files. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "namespaces")
    private Object namespaces;

    /*
     * Namespace uri to prefix mappings to override the prefixes in column names when namespace is enabled, if no prefix
     * is defined for a namespace uri, the prefix of xml element/attribute name in the xml data file will be used.
     * Example: "{"http://www.example.com/xml":"prefix"}" Type: object (or Expression with resultType object).
     */
    @JsonProperty(value = "namespacePrefixes")
    private Object namespacePrefixes;

    /**
     * Creates an instance of XmlReadSettings class.
     */
    public XmlReadSettings() {
    }

    /**
     * Get the type property: The read setting type.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the compressionProperties property: Compression settings.
     * 
     * @return the compressionProperties value.
     */
    public CompressionReadSettings compressionProperties() {
        return this.compressionProperties;
    }

    /**
     * Set the compressionProperties property: Compression settings.
     * 
     * @param compressionProperties the compressionProperties value to set.
     * @return the XmlReadSettings object itself.
     */
    public XmlReadSettings withCompressionProperties(CompressionReadSettings compressionProperties) {
        this.compressionProperties = compressionProperties;
        return this;
    }

    /**
     * Get the validationMode property: Indicates what validation method is used when reading the xml files. Allowed
     * values: 'none', 'xsd', or 'dtd'. Type: string (or Expression with resultType string).
     * 
     * @return the validationMode value.
     */
    public Object validationMode() {
        return this.validationMode;
    }

    /**
     * Set the validationMode property: Indicates what validation method is used when reading the xml files. Allowed
     * values: 'none', 'xsd', or 'dtd'. Type: string (or Expression with resultType string).
     * 
     * @param validationMode the validationMode value to set.
     * @return the XmlReadSettings object itself.
     */
    public XmlReadSettings withValidationMode(Object validationMode) {
        this.validationMode = validationMode;
        return this;
    }

    /**
     * Get the detectDataType property: Indicates whether type detection is enabled when reading the xml files. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @return the detectDataType value.
     */
    public Object detectDataType() {
        return this.detectDataType;
    }

    /**
     * Set the detectDataType property: Indicates whether type detection is enabled when reading the xml files. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @param detectDataType the detectDataType value to set.
     * @return the XmlReadSettings object itself.
     */
    public XmlReadSettings withDetectDataType(Object detectDataType) {
        this.detectDataType = detectDataType;
        return this;
    }

    /**
     * Get the namespaces property: Indicates whether namespace is enabled when reading the xml files. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @return the namespaces value.
     */
    public Object namespaces() {
        return this.namespaces;
    }

    /**
     * Set the namespaces property: Indicates whether namespace is enabled when reading the xml files. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @param namespaces the namespaces value to set.
     * @return the XmlReadSettings object itself.
     */
    public XmlReadSettings withNamespaces(Object namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    /**
     * Get the namespacePrefixes property: Namespace uri to prefix mappings to override the prefixes in column names
     * when namespace is enabled, if no prefix is defined for a namespace uri, the prefix of xml element/attribute name
     * in the xml data file will be used. Example: "{"http://www.example.com/xml":"prefix"}" Type: object (or Expression
     * with resultType object).
     * 
     * @return the namespacePrefixes value.
     */
    public Object namespacePrefixes() {
        return this.namespacePrefixes;
    }

    /**
     * Set the namespacePrefixes property: Namespace uri to prefix mappings to override the prefixes in column names
     * when namespace is enabled, if no prefix is defined for a namespace uri, the prefix of xml element/attribute name
     * in the xml data file will be used. Example: "{"http://www.example.com/xml":"prefix"}" Type: object (or Expression
     * with resultType object).
     * 
     * @param namespacePrefixes the namespacePrefixes value to set.
     * @return the XmlReadSettings object itself.
     */
    public XmlReadSettings withNamespacePrefixes(Object namespacePrefixes) {
        this.namespacePrefixes = namespacePrefixes;
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
        if (compressionProperties() != null) {
            compressionProperties().validate();
        }
    }
}
