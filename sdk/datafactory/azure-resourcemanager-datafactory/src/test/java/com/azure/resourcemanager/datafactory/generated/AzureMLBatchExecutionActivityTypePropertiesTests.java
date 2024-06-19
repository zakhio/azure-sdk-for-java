// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzureMLBatchExecutionActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.AzureMLWebServiceFile;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureMLBatchExecutionActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMLBatchExecutionActivityTypeProperties model = BinaryData.fromString(
            "{\"globalParameters\":{\"zwbb\":\"datajsju\",\"vfukuhtd\":\"datavx\",\"jc\":\"dataxidmit\"},\"webServiceOutputs\":{\"iadygoad\":{\"filePath\":\"datav\",\"linkedServiceName\":{\"referenceName\":\"ftmpjinrq\",\"parameters\":{\"sscngduew\":\"dataqxahp\",\"qires\":\"datavhcwt\",\"equocawcb\":\"dataxigpmc\",\"btxzaaav\":\"datanyljycpwh\"}}},\"uscdnneofta\":{\"filePath\":\"datadxdxrkrvmhhgvrxv\",\"linkedServiceName\":{\"referenceName\":\"uwbvrbwafw\",\"parameters\":{\"gwfgvpftbwmuxcpy\":\"datatnc\",\"mghhzm\":\"databvf\",\"pywvgfdsrng\":\"dataptkbe\",\"ksnnykss\":\"dataqvxzqwcmmolpfcv\"}}}},\"webServiceInputs\":{\"mgvqthlimvyzrdq\":{\"filePath\":\"datahttj\",\"linkedServiceName\":{\"referenceName\":\"qwwlaxhsjwpcjtw\",\"parameters\":{\"avxi\":\"datarzntmzz\",\"ukytteai\":\"datakexspoiq\",\"igdvcbyldsmy\":\"dataywopkovlwm\"}}},\"acjoaixhmaokkgvw\":{\"filePath\":\"datagyon\",\"linkedServiceName\":{\"referenceName\":\"rpxwldktphnis\",\"parameters\":{\"fitpxpkba\":\"datajnbt\",\"bbyqvbd\":\"datagj\",\"ghalmscoggam\":\"datafzkujgeppxiyo\"}}},\"p\":{\"filePath\":\"datalqqnfdwrwscyblw\",\"linkedServiceName\":{\"referenceName\":\"hpibgalefjsgn\",\"parameters\":{\"nshnb\":\"datamvzcibqyp\",\"s\":\"datadw\"}}}}}")
            .toObject(AzureMLBatchExecutionActivityTypeProperties.class);
        Assertions.assertEquals("ftmpjinrq",
            model.webServiceOutputs().get("iadygoad").linkedServiceName().referenceName());
        Assertions.assertEquals("qwwlaxhsjwpcjtw",
            model.webServiceInputs().get("mgvqthlimvyzrdq").linkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMLBatchExecutionActivityTypeProperties model
            = new AzureMLBatchExecutionActivityTypeProperties()
                .withGlobalParameters(mapOf("zwbb", "datajsju", "vfukuhtd", "datavx", "jc", "dataxidmit"))
                .withWebServiceOutputs(mapOf("iadygoad",
                    new AzureMLWebServiceFile().withFilePath("datav")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("ftmpjinrq")
                            .withParameters(mapOf("sscngduew", "dataqxahp", "qires", "datavhcwt", "equocawcb",
                                "dataxigpmc", "btxzaaav", "datanyljycpwh"))),
                    "uscdnneofta",
                    new AzureMLWebServiceFile().withFilePath("datadxdxrkrvmhhgvrxv")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("uwbvrbwafw")
                            .withParameters(mapOf("gwfgvpftbwmuxcpy", "datatnc", "mghhzm", "databvf", "pywvgfdsrng",
                                "dataptkbe", "ksnnykss", "dataqvxzqwcmmolpfcv")))))
                .withWebServiceInputs(mapOf("mgvqthlimvyzrdq",
                    new AzureMLWebServiceFile().withFilePath("datahttj")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("qwwlaxhsjwpcjtw")
                            .withParameters(mapOf("avxi", "datarzntmzz", "ukytteai", "datakexspoiq", "igdvcbyldsmy",
                                "dataywopkovlwm"))),
                    "acjoaixhmaokkgvw",
                    new AzureMLWebServiceFile().withFilePath("datagyon")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("rpxwldktphnis")
                            .withParameters(mapOf("fitpxpkba", "datajnbt", "bbyqvbd", "datagj", "ghalmscoggam",
                                "datafzkujgeppxiyo"))),
                    "p",
                    new AzureMLWebServiceFile().withFilePath("datalqqnfdwrwscyblw")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("hpibgalefjsgn")
                            .withParameters(mapOf("nshnb", "datamvzcibqyp", "s", "datadw")))));
        model = BinaryData.fromObject(model).toObject(AzureMLBatchExecutionActivityTypeProperties.class);
        Assertions.assertEquals("ftmpjinrq",
            model.webServiceOutputs().get("iadygoad").linkedServiceName().referenceName());
        Assertions.assertEquals("qwwlaxhsjwpcjtw",
            model.webServiceInputs().get("mgvqthlimvyzrdq").linkedServiceName().referenceName());
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
