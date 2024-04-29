// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.EventType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class TopicTypesListEventTypesMockTests {
    @Test
    public void testListEventTypes() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"displayName\":\"ufzg\",\"description\":\"rblwalao\",\"schemaUrl\":\"nqebaotbptgc\",\"isInDefaultSet\":true},\"id\":\"nxxrwqfmd\",\"name\":\"ecvtamqwzmno\",\"type\":\"fe\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EventGridManager manager = EventGridManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<EventType> response
            = manager.topicTypes().listEventTypes("xpjhcfaaradci", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ufzg", response.iterator().next().displayName());
        Assertions.assertEquals("rblwalao", response.iterator().next().description());
        Assertions.assertEquals("nqebaotbptgc", response.iterator().next().schemaUrl());
        Assertions.assertEquals(true, response.iterator().next().isInDefaultSet());
    }
}
