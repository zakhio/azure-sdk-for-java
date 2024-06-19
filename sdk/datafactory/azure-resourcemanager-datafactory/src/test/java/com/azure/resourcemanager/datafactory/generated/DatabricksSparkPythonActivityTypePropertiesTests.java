// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.DatabricksSparkPythonActivityTypeProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class DatabricksSparkPythonActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabricksSparkPythonActivityTypeProperties model = BinaryData.fromString(
            "{\"pythonFile\":\"datan\",\"parameters\":[\"datanjzaaoxwcptoihoy\",\"datauaxfjuzgslqpzdx\"],\"libraries\":[{\"zscepogg\":\"datalgczvfb\",\"exyiuhjqd\":\"datappufueiaie\",\"udai\":\"datalxabtlmszq\",\"jbpt\":\"datafqnxjkopivsz\"},{\"bqsj\":\"datahabzjemqvlouucax\",\"jimussvur\":\"datancgqhpqgivyx\",\"valvkdaql\":\"datalwdxnx\",\"whtws\":\"datasoqrhwla\"},{\"rvtrwswbm\":\"dataiwpzucetzis\",\"btthzfgpzy\":\"dataubh\",\"jecajtuo\":\"dataivusehyvqxjbqfcl\"},{\"xn\":\"datadlzxuakbavpk\",\"vsgx\":\"datarbckfzb\"}]}")
            .toObject(DatabricksSparkPythonActivityTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabricksSparkPythonActivityTypeProperties model
            = new DatabricksSparkPythonActivityTypeProperties().withPythonFile("datan")
                .withParameters(Arrays.asList("datanjzaaoxwcptoihoy", "datauaxfjuzgslqpzdx"))
                .withLibraries(Arrays.asList(
                    mapOf("zscepogg", "datalgczvfb", "exyiuhjqd", "datappufueiaie", "udai", "datalxabtlmszq", "jbpt",
                        "datafqnxjkopivsz"),
                    mapOf("bqsj", "datahabzjemqvlouucax", "jimussvur", "datancgqhpqgivyx", "valvkdaql", "datalwdxnx",
                        "whtws", "datasoqrhwla"),
                    mapOf("rvtrwswbm", "dataiwpzucetzis", "btthzfgpzy", "dataubh", "jecajtuo", "dataivusehyvqxjbqfcl"),
                    mapOf("xn", "datadlzxuakbavpk", "vsgx", "datarbckfzb")));
        model = BinaryData.fromObject(model).toObject(DatabricksSparkPythonActivityTypeProperties.class);
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
