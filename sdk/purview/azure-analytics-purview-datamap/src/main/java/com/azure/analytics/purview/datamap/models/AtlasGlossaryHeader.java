// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The glossary header with basic information.
 */
@Fluent
public final class AtlasGlossaryHeader implements JsonSerializable<AtlasGlossaryHeader> {
    /*
     * The display text.
     */
    @Generated
    private String displayText;

    /*
     * The GUID of the glossary.
     */
    @Generated
    private String glossaryGuid;

    /*
     * The GUID of the relationship.
     */
    @Generated
    private String relationGuid;

    /**
     * Creates an instance of AtlasGlossaryHeader class.
     */
    @Generated
    public AtlasGlossaryHeader() {
    }

    /**
     * Get the displayText property: The display text.
     * 
     * @return the displayText value.
     */
    @Generated
    public String getDisplayText() {
        return this.displayText;
    }

    /**
     * Set the displayText property: The display text.
     * 
     * @param displayText the displayText value to set.
     * @return the AtlasGlossaryHeader object itself.
     */
    @Generated
    public AtlasGlossaryHeader setDisplayText(String displayText) {
        this.displayText = displayText;
        return this;
    }

    /**
     * Get the glossaryGuid property: The GUID of the glossary.
     * 
     * @return the glossaryGuid value.
     */
    @Generated
    public String getGlossaryGuid() {
        return this.glossaryGuid;
    }

    /**
     * Set the glossaryGuid property: The GUID of the glossary.
     * 
     * @param glossaryGuid the glossaryGuid value to set.
     * @return the AtlasGlossaryHeader object itself.
     */
    @Generated
    public AtlasGlossaryHeader setGlossaryGuid(String glossaryGuid) {
        this.glossaryGuid = glossaryGuid;
        return this;
    }

    /**
     * Get the relationGuid property: The GUID of the relationship.
     * 
     * @return the relationGuid value.
     */
    @Generated
    public String getRelationGuid() {
        return this.relationGuid;
    }

    /**
     * Set the relationGuid property: The GUID of the relationship.
     * 
     * @param relationGuid the relationGuid value to set.
     * @return the AtlasGlossaryHeader object itself.
     */
    @Generated
    public AtlasGlossaryHeader setRelationGuid(String relationGuid) {
        this.relationGuid = relationGuid;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("displayText", this.displayText);
        jsonWriter.writeStringField("glossaryGuid", this.glossaryGuid);
        jsonWriter.writeStringField("relationGuid", this.relationGuid);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AtlasGlossaryHeader from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AtlasGlossaryHeader if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AtlasGlossaryHeader.
     */
    @Generated
    public static AtlasGlossaryHeader fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AtlasGlossaryHeader deserializedAtlasGlossaryHeader = new AtlasGlossaryHeader();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("displayText".equals(fieldName)) {
                    deserializedAtlasGlossaryHeader.displayText = reader.getString();
                } else if ("glossaryGuid".equals(fieldName)) {
                    deserializedAtlasGlossaryHeader.glossaryGuid = reader.getString();
                } else if ("relationGuid".equals(fieldName)) {
                    deserializedAtlasGlossaryHeader.relationGuid = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAtlasGlossaryHeader;
        });
    }
}
