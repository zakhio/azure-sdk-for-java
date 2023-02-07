// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.resourcemanager.reservations.fluent.CalculateRefundsClient;
import com.azure.resourcemanager.reservations.fluent.models.CalculateRefundResponseInner;
import com.azure.resourcemanager.reservations.models.CalculateRefundRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CalculateRefundsClient. */
public final class CalculateRefundsClientImpl implements CalculateRefundsClient {
    /** The proxy service used to perform REST calls. */
    private final CalculateRefundsService service;

    /** The service client containing this operation class. */
    private final AzureReservationApiImpl client;

    /**
     * Initializes an instance of CalculateRefundsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CalculateRefundsClientImpl(AzureReservationApiImpl client) {
        this.service =
            RestProxy.create(CalculateRefundsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureReservationApiCalculateRefunds to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureReservationApiC")
    public interface CalculateRefundsService {
        @Headers({"Content-Type: application/json"})
        @Post("/providers/Microsoft.Capacity/reservationOrders/{reservationOrderId}/calculateRefund")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CalculateRefundResponseInner>> post(
            @HostParam("$host") String endpoint,
            @PathParam("reservationOrderId") String reservationOrderId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CalculateRefundRequest body,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Calculate the refund amount of a reservation order.
     *
     * <p>Calculate price for returning `Reservations` if there are no policy errors.
     *
     * @param reservationOrderId Order Id of the reservation.
     * @param body Information needed for calculating refund of a reservation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of calculate refund containing refund information of reservation along with {@link Response}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CalculateRefundResponseInner>> postWithResponseAsync(
        String reservationOrderId, CalculateRefundRequest body) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (reservationOrderId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter reservationOrderId is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String apiVersion = "2022-11-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service.post(this.client.getEndpoint(), reservationOrderId, apiVersion, body, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Calculate the refund amount of a reservation order.
     *
     * <p>Calculate price for returning `Reservations` if there are no policy errors.
     *
     * @param reservationOrderId Order Id of the reservation.
     * @param body Information needed for calculating refund of a reservation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of calculate refund containing refund information of reservation along with {@link Response}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CalculateRefundResponseInner>> postWithResponseAsync(
        String reservationOrderId, CalculateRefundRequest body, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (reservationOrderId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter reservationOrderId is required and cannot be null."));
        }
        if (body == null) {
            return Mono.error(new IllegalArgumentException("Parameter body is required and cannot be null."));
        } else {
            body.validate();
        }
        final String apiVersion = "2022-11-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.post(this.client.getEndpoint(), reservationOrderId, apiVersion, body, accept, context);
    }

    /**
     * Calculate the refund amount of a reservation order.
     *
     * <p>Calculate price for returning `Reservations` if there are no policy errors.
     *
     * @param reservationOrderId Order Id of the reservation.
     * @param body Information needed for calculating refund of a reservation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of calculate refund containing refund information of reservation on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CalculateRefundResponseInner> postAsync(String reservationOrderId, CalculateRefundRequest body) {
        return postWithResponseAsync(reservationOrderId, body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Calculate the refund amount of a reservation order.
     *
     * <p>Calculate price for returning `Reservations` if there are no policy errors.
     *
     * @param reservationOrderId Order Id of the reservation.
     * @param body Information needed for calculating refund of a reservation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of calculate refund containing refund information of reservation along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CalculateRefundResponseInner> postWithResponse(
        String reservationOrderId, CalculateRefundRequest body, Context context) {
        return postWithResponseAsync(reservationOrderId, body, context).block();
    }

    /**
     * Calculate the refund amount of a reservation order.
     *
     * <p>Calculate price for returning `Reservations` if there are no policy errors.
     *
     * @param reservationOrderId Order Id of the reservation.
     * @param body Information needed for calculating refund of a reservation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of calculate refund containing refund information of reservation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CalculateRefundResponseInner post(String reservationOrderId, CalculateRefundRequest body) {
        return postWithResponse(reservationOrderId, body, Context.NONE).getValue();
    }
}