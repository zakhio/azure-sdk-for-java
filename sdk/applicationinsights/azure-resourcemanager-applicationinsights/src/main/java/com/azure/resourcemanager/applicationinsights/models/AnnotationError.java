// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.exception.ManagementError;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Error associated with trying to create annotation with Id that already exist. */
@Immutable
public final class AnnotationError extends ManagementError {
    /*
     * Inner error
     */
    @JsonProperty(value = "innererror", access = JsonProperty.Access.WRITE_ONLY)
    private InnerError innererror;

    /** Creates an instance of AnnotationError class. */
    public AnnotationError() {
    }

    /**
     * Get the innererror property: Inner error.
     *
     * @return the innererror value.
     */
    public InnerError getInnererror() {
        return this.innererror;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getInnererror() != null) {
            getInnererror().validate();
        }
    }
}
