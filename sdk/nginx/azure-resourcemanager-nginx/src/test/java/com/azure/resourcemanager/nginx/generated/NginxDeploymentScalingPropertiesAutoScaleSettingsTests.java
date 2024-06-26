// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.fluent.models.NginxDeploymentScalingPropertiesAutoScaleSettings;
import com.azure.resourcemanager.nginx.models.ScaleProfile;
import com.azure.resourcemanager.nginx.models.ScaleProfileCapacity;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NginxDeploymentScalingPropertiesAutoScaleSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NginxDeploymentScalingPropertiesAutoScaleSettings model = BinaryData.fromString(
            "{\"profiles\":[{\"name\":\"opjmcmatuokthfui\",\"capacity\":{\"min\":94424945,\"max\":1958511129}},{\"name\":\"dsfcpkvxodpuoz\",\"capacity\":{\"min\":1621494681,\"max\":2044584540}}]}")
            .toObject(NginxDeploymentScalingPropertiesAutoScaleSettings.class);
        Assertions.assertEquals("opjmcmatuokthfui", model.profiles().get(0).name());
        Assertions.assertEquals(94424945, model.profiles().get(0).capacity().min());
        Assertions.assertEquals(1958511129, model.profiles().get(0).capacity().max());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NginxDeploymentScalingPropertiesAutoScaleSettings model
            = new NginxDeploymentScalingPropertiesAutoScaleSettings().withProfiles(Arrays.asList(
                new ScaleProfile().withName("opjmcmatuokthfui")
                    .withCapacity(new ScaleProfileCapacity().withMin(94424945).withMax(1958511129)),
                new ScaleProfile().withName("dsfcpkvxodpuoz")
                    .withCapacity(new ScaleProfileCapacity().withMin(1621494681).withMax(2044584540))));
        model = BinaryData.fromObject(model).toObject(NginxDeploymentScalingPropertiesAutoScaleSettings.class);
        Assertions.assertEquals("opjmcmatuokthfui", model.profiles().get(0).name());
        Assertions.assertEquals(94424945, model.profiles().get(0).capacity().min());
        Assertions.assertEquals(1958511129, model.profiles().get(0).capacity().max());
    }
}
