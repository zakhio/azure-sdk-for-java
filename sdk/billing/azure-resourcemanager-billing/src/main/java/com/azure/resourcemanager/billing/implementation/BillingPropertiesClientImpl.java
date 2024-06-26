// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.billing.fluent.BillingPropertiesClient;
import com.azure.resourcemanager.billing.fluent.models.BillingPropertyInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in BillingPropertiesClient. */
public final class BillingPropertiesClientImpl implements BillingPropertiesClient {
    /** The proxy service used to perform REST calls. */
    private final BillingPropertiesService service;

    /** The service client containing this operation class. */
    private final BillingManagementClientImpl client;

    /**
     * Initializes an instance of BillingPropertiesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    BillingPropertiesClientImpl(BillingManagementClientImpl client) {
        this.service =
            RestProxy.create(BillingPropertiesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingManagementClientBillingProperties to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "BillingManagementCli")
    public interface BillingPropertiesService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingProperty/default")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<BillingPropertyInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Patch("/subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingProperty/default")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<BillingPropertyInner>> update(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") BillingPropertyInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get the billing properties for a subscription. This operation is not supported for billing accounts with
     * agreement type Enterprise Agreement.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the billing properties for a subscription along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BillingPropertyInner>> getWithResponseAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the billing properties for a subscription. This operation is not supported for billing accounts with
     * agreement type Enterprise Agreement.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the billing properties for a subscription along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BillingPropertyInner>> getWithResponseAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion, accept, context);
    }

    /**
     * Get the billing properties for a subscription. This operation is not supported for billing accounts with
     * agreement type Enterprise Agreement.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the billing properties for a subscription on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<BillingPropertyInner> getAsync() {
        return getWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get the billing properties for a subscription. This operation is not supported for billing accounts with
     * agreement type Enterprise Agreement.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the billing properties for a subscription along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BillingPropertyInner> getWithResponse(Context context) {
        return getWithResponseAsync(context).block();
    }

    /**
     * Get the billing properties for a subscription. This operation is not supported for billing accounts with
     * agreement type Enterprise Agreement.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the billing properties for a subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BillingPropertyInner get() {
        return getWithResponse(Context.NONE).getValue();
    }

    /**
     * Updates the billing property of a subscription. Currently, cost center can be updated. The operation is supported
     * only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param parameters Request parameters that are provided to the update billing property operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing property along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BillingPropertyInner>> updateWithResponseAsync(BillingPropertyInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            apiVersion,
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Updates the billing property of a subscription. Currently, cost center can be updated. The operation is supported
     * only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param parameters Request parameters that are provided to the update billing property operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing property along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<BillingPropertyInner>> updateWithResponseAsync(
        BillingPropertyInner parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2020-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .update(
                this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion, parameters, accept, context);
    }

    /**
     * Updates the billing property of a subscription. Currently, cost center can be updated. The operation is supported
     * only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param parameters Request parameters that are provided to the update billing property operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing property on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<BillingPropertyInner> updateAsync(BillingPropertyInner parameters) {
        return updateWithResponseAsync(parameters).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Updates the billing property of a subscription. Currently, cost center can be updated. The operation is supported
     * only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param parameters Request parameters that are provided to the update billing property operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing property along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BillingPropertyInner> updateWithResponse(BillingPropertyInner parameters, Context context) {
        return updateWithResponseAsync(parameters, context).block();
    }

    /**
     * Updates the billing property of a subscription. Currently, cost center can be updated. The operation is supported
     * only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param parameters Request parameters that are provided to the update billing property operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing property.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BillingPropertyInner update(BillingPropertyInner parameters) {
        return updateWithResponse(parameters, Context.NONE).getValue();
    }
}
