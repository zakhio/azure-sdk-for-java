// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for StorageMoverClient class. */
public interface StorageMoverClient {
    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the StorageMoversClient object to access its operations.
     *
     * @return the StorageMoversClient object.
     */
    StorageMoversClient getStorageMovers();

    /**
     * Gets the AgentsClient object to access its operations.
     *
     * @return the AgentsClient object.
     */
    AgentsClient getAgents();

    /**
     * Gets the EndpointsClient object to access its operations.
     *
     * @return the EndpointsClient object.
     */
    EndpointsClient getEndpoints();

    /**
     * Gets the ProjectsClient object to access its operations.
     *
     * @return the ProjectsClient object.
     */
    ProjectsClient getProjects();

    /**
     * Gets the JobDefinitionsClient object to access its operations.
     *
     * @return the JobDefinitionsClient object.
     */
    JobDefinitionsClient getJobDefinitions();

    /**
     * Gets the JobRunsClient object to access its operations.
     *
     * @return the JobRunsClient object.
     */
    JobRunsClient getJobRuns();
}