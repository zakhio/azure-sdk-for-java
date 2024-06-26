// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.streamanalytics.models.UdfType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The binding retrieval properties associated with an Azure Machine learning Studio.
 */
@Fluent
public final class AzureMachineLearningStudioFunctionBindingRetrievalProperties {
    /*
     * The Request-Response execute endpoint of the Azure Machine Learning Studio. Find out more here:
     * https://docs.microsoft.com/en-us/azure/machine-learning/machine-learning-consume-web-services#request-response-
     * service-rrs
     */
    @JsonProperty(value = "executeEndpoint")
    private String executeEndpoint;

    /*
     * The function type.
     */
    @JsonProperty(value = "udfType")
    private UdfType udfType;

    /**
     * Creates an instance of AzureMachineLearningStudioFunctionBindingRetrievalProperties class.
     */
    public AzureMachineLearningStudioFunctionBindingRetrievalProperties() {
    }

    /**
     * Get the executeEndpoint property: The Request-Response execute endpoint of the Azure Machine Learning Studio.
     * Find out more here:
     * https://docs.microsoft.com/en-us/azure/machine-learning/machine-learning-consume-web-services#request-response-service-rrs.
     * 
     * @return the executeEndpoint value.
     */
    public String executeEndpoint() {
        return this.executeEndpoint;
    }

    /**
     * Set the executeEndpoint property: The Request-Response execute endpoint of the Azure Machine Learning Studio.
     * Find out more here:
     * https://docs.microsoft.com/en-us/azure/machine-learning/machine-learning-consume-web-services#request-response-service-rrs.
     * 
     * @param executeEndpoint the executeEndpoint value to set.
     * @return the AzureMachineLearningStudioFunctionBindingRetrievalProperties object itself.
     */
    public AzureMachineLearningStudioFunctionBindingRetrievalProperties withExecuteEndpoint(String executeEndpoint) {
        this.executeEndpoint = executeEndpoint;
        return this;
    }

    /**
     * Get the udfType property: The function type.
     * 
     * @return the udfType value.
     */
    public UdfType udfType() {
        return this.udfType;
    }

    /**
     * Set the udfType property: The function type.
     * 
     * @param udfType the udfType value to set.
     * @return the AzureMachineLearningStudioFunctionBindingRetrievalProperties object itself.
     */
    public AzureMachineLearningStudioFunctionBindingRetrievalProperties withUdfType(UdfType udfType) {
        this.udfType = udfType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
