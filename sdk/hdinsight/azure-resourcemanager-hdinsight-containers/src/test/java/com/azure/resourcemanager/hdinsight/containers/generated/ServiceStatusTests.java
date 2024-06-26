// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ServiceStatus;
import org.junit.jupiter.api.Assertions;

public final class ServiceStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceStatus model
            = BinaryData.fromString("{\"kind\":\"z\",\"ready\":\"wmsweypqwd\",\"message\":\"gicccnxqhuex\"}")
                .toObject(ServiceStatus.class);
        Assertions.assertEquals("z", model.kind());
        Assertions.assertEquals("wmsweypqwd", model.ready());
        Assertions.assertEquals("gicccnxqhuex", model.message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceStatus model = new ServiceStatus().withKind("z").withReady("wmsweypqwd").withMessage("gicccnxqhuex");
        model = BinaryData.fromObject(model).toObject(ServiceStatus.class);
        Assertions.assertEquals("z", model.kind());
        Assertions.assertEquals("wmsweypqwd", model.ready());
        Assertions.assertEquals("gicccnxqhuex", model.message());
    }
}
