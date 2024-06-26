// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Response payload after a job has been successfully unassigned.
 */
@Immutable
public final class UnassignJobResult implements JsonSerializable<UnassignJobResult> {

    /*
     * Id of an unassigned job.
     */
    @Generated
    private final String jobId;

    /*
     * The number of times a job is unassigned. At a maximum 3.
     */
    @Generated
    private final int unassignmentCount;

    /**
     * Creates an instance of UnassignJobResult class.
     *
     * @param jobId the jobId value to set.
     * @param unassignmentCount the unassignmentCount value to set.
     */
    @Generated
    private UnassignJobResult(String jobId, int unassignmentCount) {
        this.jobId = jobId;
        this.unassignmentCount = unassignmentCount;
    }

    /**
     * Get the jobId property: Id of an unassigned job.
     *
     * @return the jobId value.
     */
    @Generated
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Get the unassignmentCount property: The number of times a job is unassigned. At a maximum 3.
     *
     * @return the unassignmentCount value.
     */
    @Generated
    public int getUnassignmentCount() {
        return this.unassignmentCount;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("jobId", this.jobId);
        jsonWriter.writeIntField("unassignmentCount", this.unassignmentCount);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UnassignJobResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of UnassignJobResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the UnassignJobResult.
     */
    @Generated
    public static UnassignJobResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String jobId = null;
            int unassignmentCount = 0;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("jobId".equals(fieldName)) {
                    jobId = reader.getString();
                } else if ("unassignmentCount".equals(fieldName)) {
                    unassignmentCount = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }
            return new UnassignJobResult(jobId, unassignmentCount);
        });
    }
}
