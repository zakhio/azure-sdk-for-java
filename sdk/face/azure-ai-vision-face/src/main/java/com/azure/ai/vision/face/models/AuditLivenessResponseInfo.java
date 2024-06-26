// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Audit entry for a response in the session.
 */
@Immutable
public final class AuditLivenessResponseInfo {

    /*
     * The response body. The schema of this field will depend on the request.url and request.method used by the client.
     */
    @Generated
    @JsonProperty(value = "body")
    private final LivenessResponseBody body;

    /*
     * The HTTP status code returned to the client.
     */
    @Generated
    @JsonProperty(value = "statusCode")
    private final int statusCode;

    /*
     * The server measured latency for this request in milliseconds.
     */
    @Generated
    @JsonProperty(value = "latencyInMilliseconds")
    private final long latencyInMilliseconds;

    /**
     * Creates an instance of AuditLivenessResponseInfo class.
     *
     * @param body the body value to set.
     * @param statusCode the statusCode value to set.
     * @param latencyInMilliseconds the latencyInMilliseconds value to set.
     */
    @Generated
    @JsonCreator
    private AuditLivenessResponseInfo(@JsonProperty(value = "body") LivenessResponseBody body,
        @JsonProperty(value = "statusCode") int statusCode,
        @JsonProperty(value = "latencyInMilliseconds") long latencyInMilliseconds) {
        this.body = body;
        this.statusCode = statusCode;
        this.latencyInMilliseconds = latencyInMilliseconds;
    }

    /**
     * Get the body property: The response body. The schema of this field will depend on the request.url and
     * request.method used by the client.
     *
     * @return the body value.
     */
    @Generated
    public LivenessResponseBody getBody() {
        return this.body;
    }

    /**
     * Get the statusCode property: The HTTP status code returned to the client.
     *
     * @return the statusCode value.
     */
    @Generated
    public int getStatusCode() {
        return this.statusCode;
    }

    /**
     * Get the latencyInMilliseconds property: The server measured latency for this request in milliseconds.
     *
     * @return the latencyInMilliseconds value.
     */
    @Generated
    public long getLatencyInMilliseconds() {
        return this.latencyInMilliseconds;
    }
}
