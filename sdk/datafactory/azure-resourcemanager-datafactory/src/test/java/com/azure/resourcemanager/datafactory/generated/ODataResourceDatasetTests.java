// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ODataResourceDataset;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ODataResourceDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ODataResourceDataset model = BinaryData.fromString(
            "{\"type\":\"ODataResource\",\"typeProperties\":{\"path\":\"dataep\"},\"description\":\"hju\",\"structure\":\"datadgbggcjxzh\",\"schema\":\"dataivwehsudym\",\"linkedServiceName\":{\"referenceName\":\"mbhdo\",\"parameters\":{\"xexatmdmnrs\":\"datangkqlgxzduvxd\"}},\"parameters\":{\"xznntwgkvyohp\":{\"type\":\"String\",\"defaultValue\":\"datarxyddmiploisjkzs\"}},\"annotations\":[\"datazupzwwyt\",\"datadjzghximkg\"],\"folder\":{\"name\":\"pqkjnpyriwntotcx\"},\"\":{\"exwdonbexf\":\"datamtsjkyj\",\"eeggzgrn\":\"dataedaub\"}}")
            .toObject(ODataResourceDataset.class);
        Assertions.assertEquals("hju", model.description());
        Assertions.assertEquals("mbhdo", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("xznntwgkvyohp").type());
        Assertions.assertEquals("pqkjnpyriwntotcx", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ODataResourceDataset model = new ODataResourceDataset().withDescription("hju")
            .withStructure("datadgbggcjxzh")
            .withSchema("dataivwehsudym")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("mbhdo")
                .withParameters(mapOf("xexatmdmnrs", "datangkqlgxzduvxd")))
            .withParameters(mapOf("xznntwgkvyohp",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datarxyddmiploisjkzs")))
            .withAnnotations(Arrays.asList("datazupzwwyt", "datadjzghximkg"))
            .withFolder(new DatasetFolder().withName("pqkjnpyriwntotcx"))
            .withPath("dataep");
        model = BinaryData.fromObject(model).toObject(ODataResourceDataset.class);
        Assertions.assertEquals("hju", model.description());
        Assertions.assertEquals("mbhdo", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("xznntwgkvyohp").type());
        Assertions.assertEquals("pqkjnpyriwntotcx", model.folder().name());
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
