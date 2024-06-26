// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.implementation.models;

import com.azure.ai.openai.assistants.models.MessageRole;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The CreateMessageRequest model.
 */
@Fluent
public final class CreateMessageRequest implements JsonSerializable<CreateMessageRequest> {

    /*
     * The role to associate with the new message.
     */
    @Generated
    private final MessageRole role;

    /*
     * The textual content for the new message.
     */
    @Generated
    private final String content;

    /*
     * A list of up to 10 file IDs to associate with the message, as used by tools like 'code_interpreter' or
     * 'retrieval' that can read files.
     */
    @Generated
    private List<String> fileIds;

    /*
     * A set of up to 16 key/value pairs that can be attached to an object, used for storing additional information
     * about that object in a structured format. Keys may be up to 64 characters in length and values may be up to 512
     * characters in length.
     */
    @Generated
    private Map<String, String> metadata;

    /**
     * Creates an instance of CreateMessageRequest class.
     *
     * @param role the role value to set.
     * @param content the content value to set.
     */
    @Generated
    public CreateMessageRequest(MessageRole role, String content) {
        this.role = role;
        this.content = content;
    }

    /**
     * Get the role property: The role to associate with the new message.
     *
     * @return the role value.
     */
    @Generated
    public MessageRole getRole() {
        return this.role;
    }

    /**
     * Get the content property: The textual content for the new message.
     *
     * @return the content value.
     */
    @Generated
    public String getContent() {
        return this.content;
    }

    /**
     * Get the fileIds property: A list of up to 10 file IDs to associate with the message, as used by tools like
     * 'code_interpreter' or 'retrieval' that can read files.
     *
     * @return the fileIds value.
     */
    @Generated
    public List<String> getFileIds() {
        return this.fileIds;
    }

    /**
     * Set the fileIds property: A list of up to 10 file IDs to associate with the message, as used by tools like
     * 'code_interpreter' or 'retrieval' that can read files.
     *
     * @param fileIds the fileIds value to set.
     * @return the CreateMessageRequest object itself.
     */
    @Generated
    public CreateMessageRequest setFileIds(List<String> fileIds) {
        this.fileIds = fileIds;
        return this;
    }

    /**
     * Get the metadata property: A set of up to 16 key/value pairs that can be attached to an object, used for storing
     * additional information about that object in a structured format. Keys may be up to 64 characters in length and
     * values may be up to 512 characters in length.
     *
     * @return the metadata value.
     */
    @Generated
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: A set of up to 16 key/value pairs that can be attached to an object, used for storing
     * additional information about that object in a structured format. Keys may be up to 64 characters in length and
     * values may be up to 512 characters in length.
     *
     * @param metadata the metadata value to set.
     * @return the CreateMessageRequest object itself.
     */
    @Generated
    public CreateMessageRequest setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("role", this.role == null ? null : this.role.toString());
        jsonWriter.writeStringField("content", this.content);
        jsonWriter.writeArrayField("file_ids", this.fileIds, (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("metadata", this.metadata, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateMessageRequest from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateMessageRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateMessageRequest.
     */
    @Generated
    public static CreateMessageRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MessageRole role = null;
            String content = null;
            List<String> fileIds = null;
            Map<String, String> metadata = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("role".equals(fieldName)) {
                    role = MessageRole.fromString(reader.getString());
                } else if ("content".equals(fieldName)) {
                    content = reader.getString();
                } else if ("file_ids".equals(fieldName)) {
                    fileIds = reader.readArray(reader1 -> reader1.getString());
                } else if ("metadata".equals(fieldName)) {
                    metadata = reader.readMap(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            CreateMessageRequest deserializedCreateMessageRequest = new CreateMessageRequest(role, content);
            deserializedCreateMessageRequest.fileIds = fileIds;
            deserializedCreateMessageRequest.metadata = metadata;
            return deserializedCreateMessageRequest;
        });
    }
}
