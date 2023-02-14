// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.KustoPoolInner;
import com.azure.resourcemanager.synapse.fluent.models.KustoPoolListResultInner;
import com.azure.resourcemanager.synapse.models.AzureSku;
import com.azure.resourcemanager.synapse.models.SkuName;
import com.azure.resourcemanager.synapse.models.SkuSize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class KustoPoolListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KustoPoolListResultInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"sku\":{\"name\":\"Storage"
                        + " optimized\",\"capacity\":949193893,\"size\":\"Medium\"},\"properties\":{\"state\":\"Deleted\",\"provisioningState\":\"Moving\",\"uri\":\"jcitdigsxcdglj\",\"dataIngestionUri\":\"keuachtomf\",\"stateReason\":\"ytswfp\",\"enableStreamingIngest\":true,\"enablePurge\":true,\"workspaceUID\":\"mskwhqjjysl\"},\"etag\":\"lpshhkvpedwqslsr\",\"location\":\"pq\",\"tags\":{\"qejo\":\"skondcbrwimu\",\"tljqobbpih\":\"ovyrrleaesinu\",\"bbmpxdlvykfre\":\"hcecybmrqbr\",\"wjksghudgzhxo\":\"crse\"},\"id\":\"jggsvo\",\"name\":\"jkxibda\",\"type\":\"hrkmdyomkxfbvfbh\"},{\"sku\":{\"name\":\"Compute"
                        + " optimized\",\"capacity\":1026762793,\"size\":\"Large\"},\"properties\":{\"state\":\"Stopped\",\"provisioningState\":\"Deleting\",\"uri\":\"eimawzovgkkumui\",\"dataIngestionUri\":\"cjc\",\"stateReason\":\"tbw\",\"enableStreamingIngest\":false,\"enablePurge\":false,\"workspaceUID\":\"comlikytwvczc\"},\"etag\":\"k\",\"location\":\"ve\",\"tags\":{\"qthe\":\"dvlvhbwrnfxtgdd\"},\"id\":\"n\",\"name\":\"naoyank\",\"type\":\"oe\"},{\"sku\":{\"name\":\"Storage"
                        + " optimized\",\"capacity\":1901940761,\"size\":\"Small\"},\"properties\":{\"state\":\"Deleting\",\"provisioningState\":\"Moving\",\"uri\":\"hdroznnh\",\"dataIngestionUri\":\"lktgjc\",\"stateReason\":\"guxhem\",\"enableStreamingIngest\":true,\"enablePurge\":false,\"workspaceUID\":\"zgfbukklelssx\"},\"etag\":\"ycsxzu\",\"location\":\"srlsmd\",\"tags\":{\"cdoewbidyv\":\"plpvm\",\"deugf\":\"eowxvgpi\"},\"id\":\"xzecpaxwkufykhvu\",\"name\":\"xepmrut\",\"type\":\"nabaobnslujd\"},{\"sku\":{\"name\":\"Storage"
                        + " optimized\",\"capacity\":571478298,\"size\":\"Large\"},\"properties\":{\"state\":\"Stopped\",\"provisioningState\":\"Running\",\"uri\":\"hywartspph\",\"dataIngestionUri\":\"xkykxdssjp\",\"stateReason\":\"mucfxhikkf\",\"enableStreamingIngest\":true,\"enablePurge\":false,\"workspaceUID\":\"cqlh\"},\"etag\":\"s\",\"location\":\"lmiiiovg\",\"tags\":{\"otiowlxteqd\":\"xuugqkc\",\"anblwphqlkccu\":\"tjgwdtguk\",\"iul\":\"gygqwah\",\"wzdufypivlsbb\":\"gniiprglvaw\"},\"id\":\"pmcubkmifoxxkub\",\"name\":\"phavpmhbrb\",\"type\":\"gvgovpbbttefjo\"}]}")
                .toObject(KustoPoolListResultInner.class);
        Assertions.assertEquals("pq", model.value().get(0).location());
        Assertions.assertEquals("skondcbrwimu", model.value().get(0).tags().get("qejo"));
        Assertions.assertEquals(SkuName.STORAGE_OPTIMIZED, model.value().get(0).sku().name());
        Assertions.assertEquals(949193893, model.value().get(0).sku().capacity());
        Assertions.assertEquals(SkuSize.MEDIUM, model.value().get(0).sku().size());
        Assertions.assertEquals(true, model.value().get(0).enableStreamingIngest());
        Assertions.assertEquals(true, model.value().get(0).enablePurge());
        Assertions.assertEquals("mskwhqjjysl", model.value().get(0).workspaceUid());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KustoPoolListResultInner model =
            new KustoPoolListResultInner()
                .withValue(
                    Arrays
                        .asList(
                            new KustoPoolInner()
                                .withLocation("pq")
                                .withTags(
                                    mapOf(
                                        "qejo",
                                        "skondcbrwimu",
                                        "tljqobbpih",
                                        "ovyrrleaesinu",
                                        "bbmpxdlvykfre",
                                        "hcecybmrqbr",
                                        "wjksghudgzhxo",
                                        "crse"))
                                .withSku(
                                    new AzureSku()
                                        .withName(SkuName.STORAGE_OPTIMIZED)
                                        .withCapacity(949193893)
                                        .withSize(SkuSize.MEDIUM))
                                .withEnableStreamingIngest(true)
                                .withEnablePurge(true)
                                .withWorkspaceUid("mskwhqjjysl"),
                            new KustoPoolInner()
                                .withLocation("ve")
                                .withTags(mapOf("qthe", "dvlvhbwrnfxtgdd"))
                                .withSku(
                                    new AzureSku()
                                        .withName(SkuName.COMPUTE_OPTIMIZED)
                                        .withCapacity(1026762793)
                                        .withSize(SkuSize.LARGE))
                                .withEnableStreamingIngest(false)
                                .withEnablePurge(false)
                                .withWorkspaceUid("comlikytwvczc"),
                            new KustoPoolInner()
                                .withLocation("srlsmd")
                                .withTags(mapOf("cdoewbidyv", "plpvm", "deugf", "eowxvgpi"))
                                .withSku(
                                    new AzureSku()
                                        .withName(SkuName.STORAGE_OPTIMIZED)
                                        .withCapacity(1901940761)
                                        .withSize(SkuSize.SMALL))
                                .withEnableStreamingIngest(true)
                                .withEnablePurge(false)
                                .withWorkspaceUid("zgfbukklelssx"),
                            new KustoPoolInner()
                                .withLocation("lmiiiovg")
                                .withTags(
                                    mapOf(
                                        "otiowlxteqd",
                                        "xuugqkc",
                                        "anblwphqlkccu",
                                        "tjgwdtguk",
                                        "iul",
                                        "gygqwah",
                                        "wzdufypivlsbb",
                                        "gniiprglvaw"))
                                .withSku(
                                    new AzureSku()
                                        .withName(SkuName.STORAGE_OPTIMIZED)
                                        .withCapacity(571478298)
                                        .withSize(SkuSize.LARGE))
                                .withEnableStreamingIngest(true)
                                .withEnablePurge(false)
                                .withWorkspaceUid("cqlh")));
        model = BinaryData.fromObject(model).toObject(KustoPoolListResultInner.class);
        Assertions.assertEquals("pq", model.value().get(0).location());
        Assertions.assertEquals("skondcbrwimu", model.value().get(0).tags().get("qejo"));
        Assertions.assertEquals(SkuName.STORAGE_OPTIMIZED, model.value().get(0).sku().name());
        Assertions.assertEquals(949193893, model.value().get(0).sku().capacity());
        Assertions.assertEquals(SkuSize.MEDIUM, model.value().get(0).sku().size());
        Assertions.assertEquals(true, model.value().get(0).enableStreamingIngest());
        Assertions.assertEquals(true, model.value().get(0).enablePurge());
        Assertions.assertEquals("mskwhqjjysl", model.value().get(0).workspaceUid());
    }

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