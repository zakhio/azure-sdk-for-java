// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerTopicInner;
import com.azure.resourcemanager.eventgrid.models.EventDefinitionKind;
import com.azure.resourcemanager.eventgrid.models.EventTypeInfo;
import com.azure.resourcemanager.eventgrid.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.models.IdentityType;
import com.azure.resourcemanager.eventgrid.models.InlineEventProperties;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicActivationState;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicsListResult;
import com.azure.resourcemanager.eventgrid.models.UserIdentityProperties;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class PartnerTopicsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartnerTopicsListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"partnerRegistrationImmutableId\":\"ee177705-35c8-42fb-8f7a-a4ec9d722264\",\"source\":\"tbxqmuluxlxq\",\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"bycucrwnamikz\":{},\"brqbsmswzi\":{},\"gfuhokzrusw\":{},\"vhczznvfby\":{}}},\"expirationTimeIfNotActivatedUtc\":\"2021-12-08T17:30:41Z\",\"provisioningState\":\"Creating\",\"activationState\":\"NeverActivated\",\"partnerTopicFriendlyDescription\":\"xzv\",\"messageForActivation\":\"wmxqhndvnoamlds\"},\"identity\":{\"type\":\"SystemAssigned\",\"principalId\":\"jhhflzokxcoxpel\",\"tenantId\":\"eta\",\"userAssignedIdentities\":{\"npbs\":{\"principalId\":\"xo\",\"clientId\":\"ftgz\"},\"ozihmipgawt\":{\"principalId\":\"e\",\"clientId\":\"occsr\"},\"ztrksxwpndf\":{\"principalId\":\"pkyjcxcjxgrytfm\",\"clientId\":\"ycilrmcaykggnox\"}}},\"location\":\"pfnznthjtwkj\",\"tags\":{\"tcqiosmg\":\"rxuzvoam\",\"xqdlyrtltlapr\":\"zah\",\"atbhjmznn\":\"tz\"},\"id\":\"s\",\"name\":\"qeqala\",\"type\":\"vlagun\"}],\"nextLink\":\"gfebwlnb\"}")
            .toObject(PartnerTopicsListResult.class);
        Assertions.assertEquals("pfnznthjtwkj", model.value().get(0).location());
        Assertions.assertEquals("rxuzvoam", model.value().get(0).tags().get("tcqiosmg"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("jhhflzokxcoxpel", model.value().get(0).identity().principalId());
        Assertions.assertEquals("eta", model.value().get(0).identity().tenantId());
        Assertions.assertEquals("xo",
            model.value().get(0).identity().userAssignedIdentities().get("npbs").principalId());
        Assertions.assertEquals("ftgz",
            model.value().get(0).identity().userAssignedIdentities().get("npbs").clientId());
        Assertions.assertEquals(UUID.fromString("ee177705-35c8-42fb-8f7a-a4ec9d722264"),
            model.value().get(0).partnerRegistrationImmutableId());
        Assertions.assertEquals("tbxqmuluxlxq", model.value().get(0).source());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.value().get(0).eventTypeInfo().kind());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-08T17:30:41Z"),
            model.value().get(0).expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerTopicActivationState.NEVER_ACTIVATED, model.value().get(0).activationState());
        Assertions.assertEquals("xzv", model.value().get(0).partnerTopicFriendlyDescription());
        Assertions.assertEquals("wmxqhndvnoamlds", model.value().get(0).messageForActivation());
        Assertions.assertEquals("gfebwlnb", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartnerTopicsListResult model = new PartnerTopicsListResult().withValue(Arrays.asList(new PartnerTopicInner()
            .withLocation("pfnznthjtwkj")
            .withTags(mapOf("tcqiosmg", "rxuzvoam", "xqdlyrtltlapr", "zah", "atbhjmznn", "tz"))
            .withIdentity(new IdentityInfo().withType(IdentityType.SYSTEM_ASSIGNED)
                .withPrincipalId("jhhflzokxcoxpel")
                .withTenantId("eta")
                .withUserAssignedIdentities(mapOf("npbs",
                    new UserIdentityProperties().withPrincipalId("xo").withClientId("ftgz"), "ozihmipgawt",
                    new UserIdentityProperties().withPrincipalId("e").withClientId("occsr"), "ztrksxwpndf",
                    new UserIdentityProperties().withPrincipalId("pkyjcxcjxgrytfm").withClientId("ycilrmcaykggnox"))))
            .withPartnerRegistrationImmutableId(UUID.fromString("ee177705-35c8-42fb-8f7a-a4ec9d722264"))
            .withSource("tbxqmuluxlxq")
            .withEventTypeInfo(new EventTypeInfo().withKind(EventDefinitionKind.INLINE)
                .withInlineEventTypes(
                    mapOf("bycucrwnamikz", new InlineEventProperties(), "brqbsmswzi", new InlineEventProperties(),
                        "gfuhokzrusw", new InlineEventProperties(), "vhczznvfby", new InlineEventProperties())))
            .withExpirationTimeIfNotActivatedUtc(OffsetDateTime.parse("2021-12-08T17:30:41Z"))
            .withActivationState(PartnerTopicActivationState.NEVER_ACTIVATED)
            .withPartnerTopicFriendlyDescription("xzv")
            .withMessageForActivation("wmxqhndvnoamlds"))).withNextLink("gfebwlnb");
        model = BinaryData.fromObject(model).toObject(PartnerTopicsListResult.class);
        Assertions.assertEquals("pfnznthjtwkj", model.value().get(0).location());
        Assertions.assertEquals("rxuzvoam", model.value().get(0).tags().get("tcqiosmg"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("jhhflzokxcoxpel", model.value().get(0).identity().principalId());
        Assertions.assertEquals("eta", model.value().get(0).identity().tenantId());
        Assertions.assertEquals("xo",
            model.value().get(0).identity().userAssignedIdentities().get("npbs").principalId());
        Assertions.assertEquals("ftgz",
            model.value().get(0).identity().userAssignedIdentities().get("npbs").clientId());
        Assertions.assertEquals(UUID.fromString("ee177705-35c8-42fb-8f7a-a4ec9d722264"),
            model.value().get(0).partnerRegistrationImmutableId());
        Assertions.assertEquals("tbxqmuluxlxq", model.value().get(0).source());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.value().get(0).eventTypeInfo().kind());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-08T17:30:41Z"),
            model.value().get(0).expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(PartnerTopicActivationState.NEVER_ACTIVATED, model.value().get(0).activationState());
        Assertions.assertEquals("xzv", model.value().get(0).partnerTopicFriendlyDescription());
        Assertions.assertEquals("wmxqhndvnoamlds", model.value().get(0).messageForActivation());
        Assertions.assertEquals("gfebwlnb", model.nextLink());
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
