// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.LoadBalancerBackendAddressPoolReference;
import org.junit.jupiter.api.Assertions;

public final class LoadBalancerBackendAddressPoolReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LoadBalancerBackendAddressPoolReference model =
            BinaryData
                .fromString("{\"name\":\"xwtctyqiklbbovpl\",\"sourceArmResourceId\":\"zbhvgyuguosv\"}")
                .toObject(LoadBalancerBackendAddressPoolReference.class);
        Assertions.assertEquals("zbhvgyuguosv", model.sourceArmResourceId());
        Assertions.assertEquals("xwtctyqiklbbovpl", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LoadBalancerBackendAddressPoolReference model =
            new LoadBalancerBackendAddressPoolReference()
                .withSourceArmResourceId("zbhvgyuguosv")
                .withName("xwtctyqiklbbovpl");
        model = BinaryData.fromObject(model).toObject(LoadBalancerBackendAddressPoolReference.class);
        Assertions.assertEquals("zbhvgyuguosv", model.sourceArmResourceId());
        Assertions.assertEquals("xwtctyqiklbbovpl", model.name());
    }
}