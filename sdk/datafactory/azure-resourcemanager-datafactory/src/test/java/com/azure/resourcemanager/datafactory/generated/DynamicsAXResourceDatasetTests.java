// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DynamicsAXResourceDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DynamicsAXResourceDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DynamicsAXResourceDataset model = BinaryData.fromString(
            "{\"type\":\"DynamicsAXResource\",\"typeProperties\":{\"path\":\"dataz\"},\"description\":\"qrzvuxnx\",\"structure\":\"dataohshzultdb\",\"schema\":\"datajdhypngocbdx\",\"linkedServiceName\":{\"referenceName\":\"rivptbczsu\",\"parameters\":{\"maatvogpyc\":\"datazukekytkzvt\",\"hbdxsbypl\":\"datainha\",\"sezsggdp\":\"datakhwfjudapbq\",\"iasfzrguz\":\"datatfcbrtsrdplqdyza\"}},\"parameters\":{\"abdjuljgxotu\":{\"type\":\"Int\",\"defaultValue\":\"databfsin\"},\"gspxldlnoc\":{\"type\":\"Object\",\"defaultValue\":\"datakiyaosthulzugi\"},\"wm\":{\"type\":\"Array\",\"defaultValue\":\"datagimizlukj\"},\"jtryjskdiylgzzuq\":{\"type\":\"Object\",\"defaultValue\":\"datarlmspppoeszt\"}},\"annotations\":[\"datasybqowgvmxwbo\",\"dataxdhkoex\"],\"folder\":{\"name\":\"gnaka\"},\"\":{\"ne\":\"datac\",\"yhmgq\":\"datavlumqeumz\"}}")
            .toObject(DynamicsAXResourceDataset.class);
        Assertions.assertEquals("qrzvuxnx", model.description());
        Assertions.assertEquals("rivptbczsu", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("abdjuljgxotu").type());
        Assertions.assertEquals("gnaka", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DynamicsAXResourceDataset model = new DynamicsAXResourceDataset().withDescription("qrzvuxnx")
            .withStructure("dataohshzultdb")
            .withSchema("datajdhypngocbdx")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("rivptbczsu")
                .withParameters(mapOf("maatvogpyc", "datazukekytkzvt", "hbdxsbypl", "datainha", "sezsggdp",
                    "datakhwfjudapbq", "iasfzrguz", "datatfcbrtsrdplqdyza")))
            .withParameters(mapOf("abdjuljgxotu",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("databfsin"), "gspxldlnoc",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datakiyaosthulzugi"),
                "wm", new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datagimizlukj"),
                "jtryjskdiylgzzuq",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datarlmspppoeszt")))
            .withAnnotations(Arrays.asList("datasybqowgvmxwbo", "dataxdhkoex"))
            .withFolder(new DatasetFolder().withName("gnaka"))
            .withPath("dataz");
        model = BinaryData.fromObject(model).toObject(DynamicsAXResourceDataset.class);
        Assertions.assertEquals("qrzvuxnx", model.description());
        Assertions.assertEquals("rivptbczsu", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("abdjuljgxotu").type());
        Assertions.assertEquals("gnaka", model.folder().name());
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
