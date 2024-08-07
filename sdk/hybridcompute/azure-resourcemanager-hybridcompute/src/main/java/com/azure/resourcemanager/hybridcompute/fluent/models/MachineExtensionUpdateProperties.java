// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Describes the properties of a Machine Extension.
 */
@Fluent
public final class MachineExtensionUpdateProperties implements JsonSerializable<MachineExtensionUpdateProperties> {
    /*
     * How the extension handler should be forced to update even if the extension configuration has not changed.
     */
    private String forceUpdateTag;

    /*
     * The name of the extension handler publisher.
     */
    private String publisher;

    /*
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     */
    private String type;

    /*
     * Specifies the version of the script handler.
     */
    private String typeHandlerVersion;

    /*
     * Indicates whether the extension should be automatically upgraded by the platform if there is a newer version
     * available.
     */
    private Boolean enableAutomaticUpgrade;

    /*
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once
     * deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set
     * to true.
     */
    private Boolean autoUpgradeMinorVersion;

    /*
     * Json formatted public settings for the extension.
     */
    private Map<String, Object> settings;

    /*
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at
     * all.
     */
    private Map<String, Object> protectedSettings;

    /**
     * Creates an instance of MachineExtensionUpdateProperties class.
     */
    public MachineExtensionUpdateProperties() {
    }

    /**
     * Get the forceUpdateTag property: How the extension handler should be forced to update even if the extension
     * configuration has not changed.
     * 
     * @return the forceUpdateTag value.
     */
    public String forceUpdateTag() {
        return this.forceUpdateTag;
    }

    /**
     * Set the forceUpdateTag property: How the extension handler should be forced to update even if the extension
     * configuration has not changed.
     * 
     * @param forceUpdateTag the forceUpdateTag value to set.
     * @return the MachineExtensionUpdateProperties object itself.
     */
    public MachineExtensionUpdateProperties withForceUpdateTag(String forceUpdateTag) {
        this.forceUpdateTag = forceUpdateTag;
        return this;
    }

    /**
     * Get the publisher property: The name of the extension handler publisher.
     * 
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The name of the extension handler publisher.
     * 
     * @param publisher the publisher value to set.
     * @return the MachineExtensionUpdateProperties object itself.
     */
    public MachineExtensionUpdateProperties withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     * @param type the type value to set.
     * @return the MachineExtensionUpdateProperties object itself.
     */
    public MachineExtensionUpdateProperties withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the typeHandlerVersion property: Specifies the version of the script handler.
     * 
     * @return the typeHandlerVersion value.
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion property: Specifies the version of the script handler.
     * 
     * @param typeHandlerVersion the typeHandlerVersion value to set.
     * @return the MachineExtensionUpdateProperties object itself.
     */
    public MachineExtensionUpdateProperties withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version available.
     * 
     * @return the enableAutomaticUpgrade value.
     */
    public Boolean enableAutomaticUpgrade() {
        return this.enableAutomaticUpgrade;
    }

    /**
     * Set the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version available.
     * 
     * @param enableAutomaticUpgrade the enableAutomaticUpgrade value to set.
     * @return the MachineExtensionUpdateProperties object itself.
     */
    public MachineExtensionUpdateProperties withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade) {
        this.enableAutomaticUpgrade = enableAutomaticUpgrade;
        return this;
    }

    /**
     * Get the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     * 
     * @return the autoUpgradeMinorVersion value.
     */
    public Boolean autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     * 
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set.
     * @return the MachineExtensionUpdateProperties object itself.
     */
    public MachineExtensionUpdateProperties withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }

    /**
     * Get the settings property: Json formatted public settings for the extension.
     * 
     * @return the settings value.
     */
    public Map<String, Object> settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Json formatted public settings for the extension.
     * 
     * @param settings the settings value to set.
     * @return the MachineExtensionUpdateProperties object itself.
     */
    public MachineExtensionUpdateProperties withSettings(Map<String, Object> settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     * 
     * @return the protectedSettings value.
     */
    public Map<String, Object> protectedSettings() {
        return this.protectedSettings;
    }

    /**
     * Set the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     * 
     * @param protectedSettings the protectedSettings value to set.
     * @return the MachineExtensionUpdateProperties object itself.
     */
    public MachineExtensionUpdateProperties withProtectedSettings(Map<String, Object> protectedSettings) {
        this.protectedSettings = protectedSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("forceUpdateTag", this.forceUpdateTag);
        jsonWriter.writeStringField("publisher", this.publisher);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("typeHandlerVersion", this.typeHandlerVersion);
        jsonWriter.writeBooleanField("enableAutomaticUpgrade", this.enableAutomaticUpgrade);
        jsonWriter.writeBooleanField("autoUpgradeMinorVersion", this.autoUpgradeMinorVersion);
        jsonWriter.writeMapField("settings", this.settings, (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeMapField("protectedSettings", this.protectedSettings,
            (writer, element) -> writer.writeUntyped(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MachineExtensionUpdateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MachineExtensionUpdateProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MachineExtensionUpdateProperties.
     */
    public static MachineExtensionUpdateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MachineExtensionUpdateProperties deserializedMachineExtensionUpdateProperties
                = new MachineExtensionUpdateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("forceUpdateTag".equals(fieldName)) {
                    deserializedMachineExtensionUpdateProperties.forceUpdateTag = reader.getString();
                } else if ("publisher".equals(fieldName)) {
                    deserializedMachineExtensionUpdateProperties.publisher = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMachineExtensionUpdateProperties.type = reader.getString();
                } else if ("typeHandlerVersion".equals(fieldName)) {
                    deserializedMachineExtensionUpdateProperties.typeHandlerVersion = reader.getString();
                } else if ("enableAutomaticUpgrade".equals(fieldName)) {
                    deserializedMachineExtensionUpdateProperties.enableAutomaticUpgrade
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("autoUpgradeMinorVersion".equals(fieldName)) {
                    deserializedMachineExtensionUpdateProperties.autoUpgradeMinorVersion
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("settings".equals(fieldName)) {
                    Map<String, Object> settings = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedMachineExtensionUpdateProperties.settings = settings;
                } else if ("protectedSettings".equals(fieldName)) {
                    Map<String, Object> protectedSettings = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedMachineExtensionUpdateProperties.protectedSettings = protectedSettings;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMachineExtensionUpdateProperties;
        });
    }
}
