// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.fluent.models.CheckNameAvailabilityResultInner;
import org.junit.jupiter.api.Assertions;

public final class CheckNameAvailabilityResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CheckNameAvailabilityResultInner model
            = BinaryData.fromString("{\"nameAvailable\":true,\"reason\":\"iksqr\",\"message\":\"ssainqpjwnzll\"}")
                .toObject(CheckNameAvailabilityResultInner.class);
        Assertions.assertEquals(true, model.nameAvailable());
        Assertions.assertEquals("iksqr", model.reason());
        Assertions.assertEquals("ssainqpjwnzll", model.message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CheckNameAvailabilityResultInner model = new CheckNameAvailabilityResultInner().withNameAvailable(true)
            .withReason("iksqr")
            .withMessage("ssainqpjwnzll");
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityResultInner.class);
        Assertions.assertEquals(true, model.nameAvailable());
        Assertions.assertEquals("iksqr", model.reason());
        Assertions.assertEquals("ssainqpjwnzll", model.message());
    }
}
