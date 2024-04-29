// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.models.IdentityType;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicUpdateParameters;
import com.azure.resourcemanager.eventgrid.models.UserIdentityProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PartnerTopicUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartnerTopicUpdateParameters model = BinaryData.fromString(
            "{\"tags\":{\"qwztcmwqkc\":\"hclafzvaylptrs\",\"kjexfdeqvhp\":\"cxwaxfewz\"},\"identity\":{\"type\":\"UserAssigned\",\"principalId\":\"shk\",\"tenantId\":\"f\",\"userAssignedIdentities\":{\"nptfujgi\":{\"principalId\":\"zjrgyww\",\"clientId\":\"jx\"},\"gehkfkimrtixokff\":{\"principalId\":\"aaoepttaqut\",\"clientId\":\"wemxswvruunzz\"},\"xgvelfclduccbird\":{\"principalId\":\"inljqepqwhixmo\",\"clientId\":\"tshi\"},\"inwjizcilngh\":{\"principalId\":\"uwc\",\"clientId\":\"iegstm\"}}}}")
            .toObject(PartnerTopicUpdateParameters.class);
        Assertions.assertEquals("hclafzvaylptrs", model.tags().get("qwztcmwqkc"));
        Assertions.assertEquals(IdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("shk", model.identity().principalId());
        Assertions.assertEquals("f", model.identity().tenantId());
        Assertions.assertEquals("zjrgyww", model.identity().userAssignedIdentities().get("nptfujgi").principalId());
        Assertions.assertEquals("jx", model.identity().userAssignedIdentities().get("nptfujgi").clientId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartnerTopicUpdateParameters model = new PartnerTopicUpdateParameters()
            .withTags(mapOf("qwztcmwqkc", "hclafzvaylptrs", "kjexfdeqvhp", "cxwaxfewz"))
            .withIdentity(new IdentityInfo().withType(IdentityType.USER_ASSIGNED)
                .withPrincipalId("shk")
                .withTenantId("f")
                .withUserAssignedIdentities(mapOf("nptfujgi",
                    new UserIdentityProperties().withPrincipalId("zjrgyww").withClientId("jx"), "gehkfkimrtixokff",
                    new UserIdentityProperties().withPrincipalId("aaoepttaqut").withClientId("wemxswvruunzz"),
                    "xgvelfclduccbird",
                    new UserIdentityProperties().withPrincipalId("inljqepqwhixmo").withClientId("tshi"), "inwjizcilngh",
                    new UserIdentityProperties().withPrincipalId("uwc").withClientId("iegstm"))));
        model = BinaryData.fromObject(model).toObject(PartnerTopicUpdateParameters.class);
        Assertions.assertEquals("hclafzvaylptrs", model.tags().get("qwztcmwqkc"));
        Assertions.assertEquals(IdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("shk", model.identity().principalId());
        Assertions.assertEquals("f", model.identity().tenantId());
        Assertions.assertEquals("zjrgyww", model.identity().userAssignedIdentities().get("nptfujgi").principalId());
        Assertions.assertEquals("jx", model.identity().userAssignedIdentities().get("nptfujgi").clientId());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
