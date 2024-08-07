// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager;
import com.azure.resourcemanager.informaticadatamanagement.models.InformaticaServerlessRuntimeResourceList;
import com.azure.resourcemanager.informaticadatamanagement.models.RuntimeType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class OrganizationsGetAllServerlessRuntimesWithResponseMockTests {
    @Test
    public void testGetAllServerlessRuntimesWithResponse() throws Exception {
        String responseStr
            = "{\"informaticaRuntimeResources\":[{\"name\":\"tkfa\",\"createdTime\":\"nopqgikyzirtx\",\"updatedTime\":\"yuxzejntpsewgi\",\"createdBy\":\"ilqu\",\"updatedBy\":\"rydxtqm\",\"id\":\"eoxorggufhyao\",\"type\":\"SERVERLESS\",\"status\":\"bghhavgrvkf\",\"statusLocalized\":\"ovjzhpjbibgjmfx\",\"statusMessage\":\"mv\",\"serverlessConfigProperties\":{\"subnet\":\"luyovwxnbkfezzx\",\"applicationType\":\"yhwzdgiruj\",\"resourceGroupName\":\"bomvzzbtdcqv\",\"advancedCustomProperties\":\"iyujviylwdshfs\",\"supplementaryFileLocation\":\"rbgyefry\",\"platform\":\"gaojf\",\"tags\":\"nc\",\"vnet\":\"mrfhirctymox\",\"executionTimeout\":\"tpipiwyczuhx\",\"computeUnits\":\"pqjlihhyusps\",\"tenantId\":\"sdvlmfwdgzxulucv\",\"subscriptionId\":\"mrsreuzvxurisjnh\",\"region\":\"txifqj\",\"serverlessArmResourceId\":\"xmrhu\"},\"description\":\"wp\"},{\"name\":\"esutrgjupauutpw\",\"createdTime\":\"qhih\",\"updatedTime\":\"jqgwzp\",\"createdBy\":\"fqntcyp\",\"updatedBy\":\"xjvfoimwksl\",\"id\":\"rcizjxvyd\",\"type\":\"SERVERLESS\",\"status\":\"eacvl\",\"statusLocalized\":\"vygdyft\",\"statusMessage\":\"mrtwna\",\"serverlessConfigProperties\":{\"subnet\":\"slbi\",\"applicationType\":\"ojgcyzt\",\"resourceGroupName\":\"mznbaeqphch\",\"advancedCustomProperties\":\"rn\",\"supplementaryFileLocation\":\"x\",\"platform\":\"uwrykqgaifmvikl\",\"tags\":\"dvk\",\"vnet\":\"ejd\",\"executionTimeout\":\"xcv\",\"computeUnits\":\"rhnj\",\"tenantId\":\"olvtnovqfzge\",\"subscriptionId\":\"dftuljltduce\",\"region\":\"tmczuomejwcwwqi\",\"serverlessArmResourceId\":\"nssxmojmsvpk\"},\"description\":\"rvkwc\"},{\"name\":\"zqljyxgtczh\",\"createdTime\":\"ydbsd\",\"updatedTime\":\"hmkxmaehvbb\",\"createdBy\":\"uripltfnhtba\",\"updatedBy\":\"kgxywr\",\"id\":\"kpyklyhp\",\"type\":\"SERVERLESS\",\"status\":\"odpvruudlgzib\",\"statusLocalized\":\"hostgktstvdxecl\",\"statusMessage\":\"edqbc\",\"serverlessConfigProperties\":{\"subnet\":\"zlhp\",\"applicationType\":\"dqkdlwwqfbu\",\"resourceGroupName\":\"kxtrq\",\"advancedCustomProperties\":\"smlmbtxhwgfwsrta\",\"supplementaryFileLocation\":\"oezbrhubsk\",\"platform\":\"dyg\",\"tags\":\"okkqfqjbvleo\",\"vnet\":\"ml\",\"executionTimeout\":\"qtqzfavyv\",\"computeUnits\":\"qybaryeua\",\"tenantId\":\"kq\",\"subscriptionId\":\"qgzsles\",\"region\":\"bhernntiew\",\"serverlessArmResourceId\":\"cv\"},\"description\":\"uwrbehwagoh\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        InformaticaDataManagementManager manager = InformaticaDataManagementManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        InformaticaServerlessRuntimeResourceList response = manager.organizations()
            .getAllServerlessRuntimesWithResponse("z", "ybycnunvj", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("tkfa", response.informaticaRuntimeResources().get(0).name());
        Assertions.assertEquals("nopqgikyzirtx", response.informaticaRuntimeResources().get(0).createdTime());
        Assertions.assertEquals("yuxzejntpsewgi", response.informaticaRuntimeResources().get(0).updatedTime());
        Assertions.assertEquals("ilqu", response.informaticaRuntimeResources().get(0).createdBy());
        Assertions.assertEquals("rydxtqm", response.informaticaRuntimeResources().get(0).updatedBy());
        Assertions.assertEquals("eoxorggufhyao", response.informaticaRuntimeResources().get(0).id());
        Assertions.assertEquals(RuntimeType.SERVERLESS, response.informaticaRuntimeResources().get(0).type());
        Assertions.assertEquals("bghhavgrvkf", response.informaticaRuntimeResources().get(0).status());
        Assertions.assertEquals("ovjzhpjbibgjmfx", response.informaticaRuntimeResources().get(0).statusLocalized());
        Assertions.assertEquals("mv", response.informaticaRuntimeResources().get(0).statusMessage());
        Assertions.assertEquals("luyovwxnbkfezzx",
            response.informaticaRuntimeResources().get(0).serverlessConfigProperties().subnet());
        Assertions.assertEquals("yhwzdgiruj",
            response.informaticaRuntimeResources().get(0).serverlessConfigProperties().applicationType());
        Assertions.assertEquals("bomvzzbtdcqv",
            response.informaticaRuntimeResources().get(0).serverlessConfigProperties().resourceGroupName());
        Assertions.assertEquals("iyujviylwdshfs",
            response.informaticaRuntimeResources().get(0).serverlessConfigProperties().advancedCustomProperties());
        Assertions.assertEquals("rbgyefry",
            response.informaticaRuntimeResources().get(0).serverlessConfigProperties().supplementaryFileLocation());
        Assertions.assertEquals("gaojf",
            response.informaticaRuntimeResources().get(0).serverlessConfigProperties().platform());
        Assertions.assertEquals("nc",
            response.informaticaRuntimeResources().get(0).serverlessConfigProperties().tags());
        Assertions.assertEquals("mrfhirctymox",
            response.informaticaRuntimeResources().get(0).serverlessConfigProperties().vnet());
        Assertions.assertEquals("tpipiwyczuhx",
            response.informaticaRuntimeResources().get(0).serverlessConfigProperties().executionTimeout());
        Assertions.assertEquals("pqjlihhyusps",
            response.informaticaRuntimeResources().get(0).serverlessConfigProperties().computeUnits());
        Assertions.assertEquals("sdvlmfwdgzxulucv",
            response.informaticaRuntimeResources().get(0).serverlessConfigProperties().tenantId());
        Assertions.assertEquals("mrsreuzvxurisjnh",
            response.informaticaRuntimeResources().get(0).serverlessConfigProperties().subscriptionId());
        Assertions.assertEquals("txifqj",
            response.informaticaRuntimeResources().get(0).serverlessConfigProperties().region());
        Assertions.assertEquals("xmrhu",
            response.informaticaRuntimeResources().get(0).serverlessConfigProperties().serverlessArmResourceId());
        Assertions.assertEquals("wp", response.informaticaRuntimeResources().get(0).description());
    }
}
