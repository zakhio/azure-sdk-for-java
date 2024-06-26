// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.fluent.models.IotConnectorProperties;
import com.azure.resourcemanager.healthcareapis.models.IotEventHubIngestionEndpointConfiguration;
import com.azure.resourcemanager.healthcareapis.models.IotMappingProperties;
import org.junit.jupiter.api.Assertions;

public final class IotConnectorPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IotConnectorProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"Updating\",\"ingestionEndpointConfiguration\":{\"eventHubName\":\"gwb\",\"consumerGroup\":\"beldawkzbaliourq\",\"fullyQualifiedEventHubNamespace\":\"kauhashsfwxo\"},\"deviceMapping\":{\"content\":\"dataz\"}}")
            .toObject(IotConnectorProperties.class);
        Assertions.assertEquals("gwb", model.ingestionEndpointConfiguration().eventHubName());
        Assertions.assertEquals("beldawkzbaliourq", model.ingestionEndpointConfiguration().consumerGroup());
        Assertions.assertEquals("kauhashsfwxo",
            model.ingestionEndpointConfiguration().fullyQualifiedEventHubNamespace());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IotConnectorProperties model = new IotConnectorProperties()
            .withIngestionEndpointConfiguration(new IotEventHubIngestionEndpointConfiguration().withEventHubName("gwb")
                .withConsumerGroup("beldawkzbaliourq")
                .withFullyQualifiedEventHubNamespace("kauhashsfwxo"))
            .withDeviceMapping(new IotMappingProperties().withContent("dataz"));
        model = BinaryData.fromObject(model).toObject(IotConnectorProperties.class);
        Assertions.assertEquals("gwb", model.ingestionEndpointConfiguration().eventHubName());
        Assertions.assertEquals("beldawkzbaliourq", model.ingestionEndpointConfiguration().consumerGroup());
        Assertions.assertEquals("kauhashsfwxo",
            model.ingestionEndpointConfiguration().fullyQualifiedEventHubNamespace());
    }
}
