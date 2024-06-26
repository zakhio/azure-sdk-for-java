// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.management.SubResource;
import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.fluent.models.BackendPoolProperties;
import com.azure.resourcemanager.frontdoor.models.Backend;
import com.azure.resourcemanager.frontdoor.models.BackendEnabledState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class BackendPoolPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackendPoolProperties model = BinaryData.fromString(
            "{\"resourceState\":\"Deleting\",\"backends\":[{\"address\":\"brhu\",\"privateLinkAlias\":\"kh\",\"privateLinkResourceId\":\"ygo\",\"privateLinkLocation\":\"kkqfqjbvle\",\"privateEndpointStatus\":\"Approved\",\"privateLinkApprovalMessage\":\"luiqtqzfavyvnqq\",\"httpPort\":1266667587,\"httpsPort\":1053197687,\"enabledState\":\"Enabled\",\"priority\":1922609600,\"weight\":462603095,\"backendHostHeader\":\"abqgzslesjcbh\"},{\"address\":\"n\",\"privateLinkAlias\":\"iew\",\"privateLinkResourceId\":\"cv\",\"privateLinkLocation\":\"uwrbehwagoh\",\"privateEndpointStatus\":\"Approved\",\"privateLinkApprovalMessage\":\"kmr\",\"httpPort\":1538670364,\"httpsPort\":295447223,\"enabledState\":\"Enabled\",\"priority\":1109693907,\"weight\":1330196147,\"backendHostHeader\":\"futacoebjvewzc\"},{\"address\":\"nmwcpmgu\",\"privateLinkAlias\":\"draufactkah\",\"privateLinkResourceId\":\"v\",\"privateLinkLocation\":\"j\",\"privateEndpointStatus\":\"Approved\",\"privateLinkApprovalMessage\":\"xps\",\"httpPort\":1820009051,\"httpsPort\":1193345721,\"enabledState\":\"Enabled\",\"priority\":504931711,\"weight\":382484088,\"backendHostHeader\":\"ubkwdle\"}],\"loadBalancingSettings\":{\"id\":\"sutujba\"},\"healthProbeSettings\":{\"id\":\"uo\"}}")
            .toObject(BackendPoolProperties.class);
        Assertions.assertEquals("brhu", model.backends().get(0).address());
        Assertions.assertEquals("kh", model.backends().get(0).privateLinkAlias());
        Assertions.assertEquals("ygo", model.backends().get(0).privateLinkResourceId());
        Assertions.assertEquals("kkqfqjbvle", model.backends().get(0).privateLinkLocation());
        Assertions.assertEquals("luiqtqzfavyvnqq", model.backends().get(0).privateLinkApprovalMessage());
        Assertions.assertEquals(1266667587, model.backends().get(0).httpPort());
        Assertions.assertEquals(1053197687, model.backends().get(0).httpsPort());
        Assertions.assertEquals(BackendEnabledState.ENABLED, model.backends().get(0).enabledState());
        Assertions.assertEquals(1922609600, model.backends().get(0).priority());
        Assertions.assertEquals(462603095, model.backends().get(0).weight());
        Assertions.assertEquals("abqgzslesjcbh", model.backends().get(0).backendHostHeader());
        Assertions.assertEquals("sutujba", model.loadBalancingSettings().id());
        Assertions.assertEquals("uo", model.healthProbeSettings().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackendPoolProperties model = new BackendPoolProperties()
            .withBackends(Arrays.asList(
                new Backend().withAddress("brhu")
                    .withPrivateLinkAlias("kh")
                    .withPrivateLinkResourceId("ygo")
                    .withPrivateLinkLocation("kkqfqjbvle")
                    .withPrivateLinkApprovalMessage("luiqtqzfavyvnqq")
                    .withHttpPort(1266667587)
                    .withHttpsPort(1053197687)
                    .withEnabledState(BackendEnabledState.ENABLED)
                    .withPriority(1922609600)
                    .withWeight(462603095)
                    .withBackendHostHeader("abqgzslesjcbh"),
                new Backend().withAddress("n")
                    .withPrivateLinkAlias("iew")
                    .withPrivateLinkResourceId("cv")
                    .withPrivateLinkLocation("uwrbehwagoh")
                    .withPrivateLinkApprovalMessage("kmr")
                    .withHttpPort(1538670364)
                    .withHttpsPort(295447223)
                    .withEnabledState(BackendEnabledState.ENABLED)
                    .withPriority(1109693907)
                    .withWeight(1330196147)
                    .withBackendHostHeader("futacoebjvewzc"),
                new Backend().withAddress("nmwcpmgu")
                    .withPrivateLinkAlias("draufactkah")
                    .withPrivateLinkResourceId("v")
                    .withPrivateLinkLocation("j")
                    .withPrivateLinkApprovalMessage("xps")
                    .withHttpPort(1820009051)
                    .withHttpsPort(1193345721)
                    .withEnabledState(BackendEnabledState.ENABLED)
                    .withPriority(504931711)
                    .withWeight(382484088)
                    .withBackendHostHeader("ubkwdle")))
            .withLoadBalancingSettings(new SubResource().withId("sutujba"))
            .withHealthProbeSettings(new SubResource().withId("uo"));
        model = BinaryData.fromObject(model).toObject(BackendPoolProperties.class);
        Assertions.assertEquals("brhu", model.backends().get(0).address());
        Assertions.assertEquals("kh", model.backends().get(0).privateLinkAlias());
        Assertions.assertEquals("ygo", model.backends().get(0).privateLinkResourceId());
        Assertions.assertEquals("kkqfqjbvle", model.backends().get(0).privateLinkLocation());
        Assertions.assertEquals("luiqtqzfavyvnqq", model.backends().get(0).privateLinkApprovalMessage());
        Assertions.assertEquals(1266667587, model.backends().get(0).httpPort());
        Assertions.assertEquals(1053197687, model.backends().get(0).httpsPort());
        Assertions.assertEquals(BackendEnabledState.ENABLED, model.backends().get(0).enabledState());
        Assertions.assertEquals(1922609600, model.backends().get(0).priority());
        Assertions.assertEquals(462603095, model.backends().get(0).weight());
        Assertions.assertEquals("abqgzslesjcbh", model.backends().get(0).backendHostHeader());
        Assertions.assertEquals("sutujba", model.loadBalancingSettings().id());
        Assertions.assertEquals("uo", model.healthProbeSettings().id());
    }
}
