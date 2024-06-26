// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.MinimalSeverity;
import com.azure.resourcemanager.security.models.NotificationsSourceAlert;
import org.junit.jupiter.api.Assertions;

public final class NotificationsSourceAlertTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NotificationsSourceAlert model = BinaryData.fromString("{\"sourceType\":\"Alert\",\"minimalSeverity\":\"Low\"}")
            .toObject(NotificationsSourceAlert.class);
        Assertions.assertEquals(MinimalSeverity.LOW, model.minimalSeverity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NotificationsSourceAlert model = new NotificationsSourceAlert().withMinimalSeverity(MinimalSeverity.LOW);
        model = BinaryData.fromObject(model).toObject(NotificationsSourceAlert.class);
        Assertions.assertEquals(MinimalSeverity.LOW, model.minimalSeverity());
    }
}
