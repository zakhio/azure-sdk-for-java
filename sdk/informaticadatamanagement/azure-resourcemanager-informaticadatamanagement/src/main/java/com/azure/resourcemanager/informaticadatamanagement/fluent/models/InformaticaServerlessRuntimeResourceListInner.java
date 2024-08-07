// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.informaticadatamanagement.models.InfaRuntimeResourceFetchMetadata;
import java.io.IOException;
import java.util.List;

/**
 * A list of serverless runtime resources as fetched using the informatica APIs.
 */
@Immutable
public final class InformaticaServerlessRuntimeResourceListInner
    implements JsonSerializable<InformaticaServerlessRuntimeResourceListInner> {
    /*
     * List of runtime resources for the fetch all API
     */
    private List<InfaRuntimeResourceFetchMetadata> informaticaRuntimeResources;

    /**
     * Creates an instance of InformaticaServerlessRuntimeResourceListInner class.
     */
    private InformaticaServerlessRuntimeResourceListInner() {
    }

    /**
     * Get the informaticaRuntimeResources property: List of runtime resources for the fetch all API.
     * 
     * @return the informaticaRuntimeResources value.
     */
    public List<InfaRuntimeResourceFetchMetadata> informaticaRuntimeResources() {
        return this.informaticaRuntimeResources;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (informaticaRuntimeResources() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property informaticaRuntimeResources in model InformaticaServerlessRuntimeResourceListInner"));
        } else {
            informaticaRuntimeResources().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(InformaticaServerlessRuntimeResourceListInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("informaticaRuntimeResources", this.informaticaRuntimeResources,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InformaticaServerlessRuntimeResourceListInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InformaticaServerlessRuntimeResourceListInner if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the InformaticaServerlessRuntimeResourceListInner.
     */
    public static InformaticaServerlessRuntimeResourceListInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InformaticaServerlessRuntimeResourceListInner deserializedInformaticaServerlessRuntimeResourceListInner
                = new InformaticaServerlessRuntimeResourceListInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("informaticaRuntimeResources".equals(fieldName)) {
                    List<InfaRuntimeResourceFetchMetadata> informaticaRuntimeResources
                        = reader.readArray(reader1 -> InfaRuntimeResourceFetchMetadata.fromJson(reader1));
                    deserializedInformaticaServerlessRuntimeResourceListInner.informaticaRuntimeResources
                        = informaticaRuntimeResources;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInformaticaServerlessRuntimeResourceListInner;
        });
    }
}
