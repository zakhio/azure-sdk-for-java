// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.avs.fluent.models.AddonInner;

/** An instance of this class provides access to all the operations defined in AddonsClient. */
public interface AddonsClient {
    /**
     * List addons in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paged list of addons as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AddonInner> list(String resourceGroupName, String privateCloudName);

    /**
     * List addons in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paged list of addons as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AddonInner> list(String resourceGroupName, String privateCloudName, Context context);

    /**
     * Get an addon by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param addonName Name of the addon for the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an addon by name in a private cloud along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AddonInner> getWithResponse(
        String resourceGroupName, String privateCloudName, String addonName, Context context);

    /**
     * Get an addon by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param addonName Name of the addon for the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an addon by name in a private cloud.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AddonInner get(String resourceGroupName, String privateCloudName, String addonName);

    /**
     * Create or update a addon in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param addonName Name of the addon for the private cloud.
     * @param addon A addon in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an addon resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AddonInner>, AddonInner> beginCreateOrUpdate(
        String resourceGroupName, String privateCloudName, String addonName, AddonInner addon);

    /**
     * Create or update a addon in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param addonName Name of the addon for the private cloud.
     * @param addon A addon in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an addon resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AddonInner>, AddonInner> beginCreateOrUpdate(
        String resourceGroupName, String privateCloudName, String addonName, AddonInner addon, Context context);

    /**
     * Create or update a addon in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param addonName Name of the addon for the private cloud.
     * @param addon A addon in the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an addon resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AddonInner createOrUpdate(String resourceGroupName, String privateCloudName, String addonName, AddonInner addon);

    /**
     * Create or update a addon in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param addonName Name of the addon for the private cloud.
     * @param addon A addon in the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an addon resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AddonInner createOrUpdate(
        String resourceGroupName, String privateCloudName, String addonName, AddonInner addon, Context context);

    /**
     * Delete a addon in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param addonName Name of the addon for the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String privateCloudName, String addonName);

    /**
     * Delete a addon in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param addonName Name of the addon for the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String privateCloudName, String addonName, Context context);

    /**
     * Delete a addon in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param addonName Name of the addon for the private cloud.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String privateCloudName, String addonName);

    /**
     * Delete a addon in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud.
     * @param addonName Name of the addon for the private cloud.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String privateCloudName, String addonName, Context context);
}
