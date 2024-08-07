// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.scvmm.ScvmmManager;
import com.azure.resourcemanager.scvmm.models.VirtualMachineTemplate;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class VirtualMachineTemplatesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"inventoryItemId\":\"wbzasqbuclj\",\"uuid\":\"yexaoguy\",\"vmmServerId\":\"p\",\"osType\":\"Other\",\"osName\":\"ault\",\"computerName\":\"jjum\",\"memoryMB\":605011869,\"cpuCount\":129557013,\"limitCpuForMigration\":\"true\",\"dynamicMemoryEnabled\":\"true\",\"isCustomizable\":\"false\",\"dynamicMemoryMaxMB\":714307587,\"dynamicMemoryMinMB\":1485575169,\"isHighlyAvailable\":\"false\",\"generation\":1855012181,\"networkInterfaces\":[{\"name\":\"wgnyfusfzsvtui\",\"displayName\":\"hajqglcfh\",\"ipv4Addresses\":[\"qryxyn\",\"nzrdpsovwxz\",\"ptgoeiybbabp\"],\"ipv6Addresses\":[\"f\"],\"macAddress\":\"kvntjlrigjkskyri\",\"virtualNetworkId\":\"vzidsxwaab\",\"networkName\":\"ifrygzn\",\"ipv4AddressType\":\"Dynamic\",\"ipv6AddressType\":\"Dynamic\",\"macAddressType\":\"Static\",\"nicId\":\"zob\"},{\"name\":\"pxl\",\"displayName\":\"lnelxieixynl\",\"ipv4Addresses\":[\"cwcrojphs\",\"hcawjutifdwfmv\",\"gorqjbttzh\",\"aglkafhon\"],\"ipv6Addresses\":[\"jeick\",\"zvcpopm\"],\"macAddress\":\"lnwcltyjed\",\"virtualNetworkId\":\"xm\",\"networkName\":\"mkqscaz\",\"ipv4AddressType\":\"Static\",\"ipv6AddressType\":\"Static\",\"macAddressType\":\"Dynamic\",\"nicId\":\"uamwabzxrvxc\"},{\"name\":\"hsphaivmxyas\",\"displayName\":\"vgsgzwywakoihkn\",\"ipv4Addresses\":[\"blmljh\",\"nymzotqyr\",\"uzcbmqq\"],\"ipv6Addresses\":[\"vwf\"],\"macAddress\":\"ayxonsupeujl\",\"virtualNetworkId\":\"nh\",\"networkName\":\"sqltnzo\",\"ipv4AddressType\":\"Static\",\"ipv6AddressType\":\"Static\",\"macAddressType\":\"Dynamic\",\"nicId\":\"fyq\"}],\"disks\":[{\"name\":\"qoxwd\",\"displayName\":\"dbxiqx\",\"diskId\":\"iqbi\",\"diskSizeGB\":1213641430,\"maxDiskSizeGB\":2002140945,\"bus\":1099420861,\"lun\":152537554,\"busType\":\"hfqpofv\",\"vhdType\":\"cblembnkbwv\",\"volumeType\":\"xk\",\"vhdFormatType\":\"vqihebwtswbzuwf\",\"templateDiskId\":\"urageg\",\"storageQoSPolicy\":{\"name\":\"cjfelisdjubgg\",\"id\":\"igkxkbsazga\"},\"createDiffDisk\":\"true\"},{\"name\":\"yrcmjdmspofap\",\"displayName\":\"hryl\",\"diskId\":\"ofrzgb\",\"diskSizeGB\":726767515,\"maxDiskSizeGB\":981780547,\"bus\":1946171356,\"lun\":2142933776,\"busType\":\"l\",\"vhdType\":\"bcuiiz\",\"volumeType\":\"twfans\",\"vhdFormatType\":\"pdibmikostbzbki\",\"templateDiskId\":\"uqn\",\"storageQoSPolicy\":{\"name\":\"hzfylsgcrpfbc\",\"id\":\"ezzcez\"},\"createDiffDisk\":\"false\"}],\"provisioningState\":\"Updating\"},\"extendedLocation\":{\"type\":\"wl\",\"name\":\"jwetnpsihcla\"},\"location\":\"va\",\"tags\":{\"tcmwqkchc\":\"trsqqw\"},\"id\":\"waxfewzjkj\",\"name\":\"xfdeqvhpsyl\",\"type\":\"ksh\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ScvmmManager manager = ScvmmManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<VirtualMachineTemplate> response
            = manager.virtualMachineTemplates().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("va", response.iterator().next().location());
        Assertions.assertEquals("trsqqw", response.iterator().next().tags().get("tcmwqkchc"));
        Assertions.assertEquals("wbzasqbuclj", response.iterator().next().properties().inventoryItemId());
        Assertions.assertEquals("yexaoguy", response.iterator().next().properties().uuid());
        Assertions.assertEquals("p", response.iterator().next().properties().vmmServerId());
        Assertions.assertEquals("wl", response.iterator().next().extendedLocation().type());
        Assertions.assertEquals("jwetnpsihcla", response.iterator().next().extendedLocation().name());
    }
}
