// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.OperationInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.OperationDisplay;
import com.azure.resourcemanager.mysqlflexibleserver.models.OperationListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"tlpdn\",\"display\":{\"provider\":\"vgbmhr\",\"resource\":\"kw\",\"operation\":\"ijejvegrhbpn\",\"description\":\"xexccbdreaxhcexd\"},\"origin\":\"vqahqkghtpwi\",\"properties\":{\"z\":\"datayjsvfyc\",\"rvmtgjq\":\"datafvoow\",\"nsxkmcwaekrrjr\":\"datapyostronzmyhgfi\"}},{\"name\":\"fxtsgum\",\"display\":{\"provider\":\"lik\",\"resource\":\"wslolbqp\",\"operation\":\"zlmvfelfktgp\",\"description\":\"rpw\"},\"origin\":\"eznoig\",\"properties\":{\"zejjoqk\":\"datajwmwkpnbs\",\"aa\":\"datagfhsxttaugzxn\",\"jlwuenvrkp\":\"datapxdtnkdmkq\",\"ibreb\":\"dataou\"}},{\"name\":\"aysjkixqtnqttez\",\"display\":{\"provider\":\"ffiakp\",\"resource\":\"qqmtedltmmji\",\"operation\":\"eozphv\",\"description\":\"uyqncygupkvipmd\"},\"origin\":\"wx\",\"properties\":{\"xhojuj\":\"dataevzhfsto\",\"hixbjxyfwnyl\":\"dataypelmcu\"}}],\"nextLink\":\"ool\"}")
            .toObject(OperationListResult.class);
        Assertions.assertEquals("tlpdn", model.value().get(0).name());
        Assertions.assertEquals("vgbmhr", model.value().get(0).display().provider());
        Assertions.assertEquals("kw", model.value().get(0).display().resource());
        Assertions.assertEquals("ijejvegrhbpn", model.value().get(0).display().operation());
        Assertions.assertEquals("xexccbdreaxhcexd", model.value().get(0).display().description());
        Assertions.assertEquals("vqahqkghtpwi", model.value().get(0).origin());
        Assertions.assertEquals("ool", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResult model
            = new OperationListResult()
                .withValue(
                    Arrays.asList(
                        new OperationInner().withName("tlpdn")
                            .withDisplay(new OperationDisplay().withProvider("vgbmhr")
                                .withResource("kw")
                                .withOperation("ijejvegrhbpn")
                                .withDescription("xexccbdreaxhcexd"))
                            .withOrigin("vqahqkghtpwi")
                            .withProperties(mapOf("z", "datayjsvfyc", "rvmtgjq", "datafvoow", "nsxkmcwaekrrjr",
                                "datapyostronzmyhgfi")),
                        new OperationInner().withName("fxtsgum")
                            .withDisplay(new OperationDisplay().withProvider("lik")
                                .withResource("wslolbqp")
                                .withOperation("zlmvfelfktgp")
                                .withDescription("rpw"))
                            .withOrigin("eznoig")
                            .withProperties(mapOf("zejjoqk", "datajwmwkpnbs", "aa", "datagfhsxttaugzxn", "jlwuenvrkp",
                                "datapxdtnkdmkq", "ibreb", "dataou")),
                        new OperationInner().withName("aysjkixqtnqttez")
                            .withDisplay(new OperationDisplay().withProvider("ffiakp")
                                .withResource("qqmtedltmmji")
                                .withOperation("eozphv")
                                .withDescription("uyqncygupkvipmd"))
                            .withOrigin("wx")
                            .withProperties(mapOf("xhojuj", "dataevzhfsto", "hixbjxyfwnyl", "dataypelmcu"))))
                .withNextLink("ool");
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
        Assertions.assertEquals("tlpdn", model.value().get(0).name());
        Assertions.assertEquals("vgbmhr", model.value().get(0).display().provider());
        Assertions.assertEquals("kw", model.value().get(0).display().resource());
        Assertions.assertEquals("ijejvegrhbpn", model.value().get(0).display().operation());
        Assertions.assertEquals("xexccbdreaxhcexd", model.value().get(0).display().description());
        Assertions.assertEquals("vqahqkghtpwi", model.value().get(0).origin());
        Assertions.assertEquals("ool", model.nextLink());
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
