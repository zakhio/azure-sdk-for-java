// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.support.SupportManager;
import com.azure.resourcemanager.support.models.FileDetails;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class FilesCreateWithResponseMockTests {
    @Test
    public void testCreateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"createdOn\":\"2021-09-06T02:43:55Z\",\"chunkSize\":1964101220,\"fileSize\":527338272,\"numberOfChunks\":1341869205},\"id\":\"hyrpetogebjoxs\",\"name\":\"hvnh\",\"type\":\"abrqnkkzj\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 201, responseStr.getBytes(StandardCharsets.UTF_8)));
        SupportManager manager = SupportManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        FileDetails response = manager.files()
            .define("bgq")
            .withExistingFileWorkspace("fmmfblcqcu")
            .withChunkSize(1522947792)
            .withFileSize(1749229509)
            .withNumberOfChunks(1690066547)
            .create();

        Assertions.assertEquals(1964101220, response.chunkSize());
        Assertions.assertEquals(527338272, response.fileSize());
        Assertions.assertEquals(1341869205, response.numberOfChunks());
    }
}
