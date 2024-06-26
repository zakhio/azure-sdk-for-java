// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.models.AnalysisDiagnostic;
import com.azure.resourcemanager.nginx.models.AnalysisResultData;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AnalysisResultDataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AnalysisResultData model = BinaryData.fromString(
            "{\"errors\":[{\"id\":\"kwtmutduqktapspw\",\"directive\":\"cuertu\",\"description\":\"kdosvqw\",\"file\":\"bmdg\",\"line\":14.188546,\"message\":\"jfddgmbmbe\",\"rule\":\"ppbhtqqrolfp\"},{\"id\":\"s\",\"directive\":\"lgbquxig\",\"description\":\"yjgzjaoyfhrtxiln\",\"file\":\"rkujy\",\"line\":55.834507,\"message\":\"l\",\"rule\":\"juvf\"}]}")
            .toObject(AnalysisResultData.class);
        Assertions.assertEquals("kwtmutduqktapspw", model.errors().get(0).id());
        Assertions.assertEquals("cuertu", model.errors().get(0).directive());
        Assertions.assertEquals("kdosvqw", model.errors().get(0).description());
        Assertions.assertEquals("bmdg", model.errors().get(0).file());
        Assertions.assertEquals(14.188546f, model.errors().get(0).line());
        Assertions.assertEquals("jfddgmbmbe", model.errors().get(0).message());
        Assertions.assertEquals("ppbhtqqrolfp", model.errors().get(0).rule());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AnalysisResultData model = new AnalysisResultData().withErrors(Arrays.asList(
            new AnalysisDiagnostic().withId("kwtmutduqktapspw")
                .withDirective("cuertu")
                .withDescription("kdosvqw")
                .withFile("bmdg")
                .withLine(14.188546f)
                .withMessage("jfddgmbmbe")
                .withRule("ppbhtqqrolfp"),
            new AnalysisDiagnostic().withId("s")
                .withDirective("lgbquxig")
                .withDescription("yjgzjaoyfhrtxiln")
                .withFile("rkujy")
                .withLine(55.834507f)
                .withMessage("l")
                .withRule("juvf")));
        model = BinaryData.fromObject(model).toObject(AnalysisResultData.class);
        Assertions.assertEquals("kwtmutduqktapspw", model.errors().get(0).id());
        Assertions.assertEquals("cuertu", model.errors().get(0).directive());
        Assertions.assertEquals("kdosvqw", model.errors().get(0).description());
        Assertions.assertEquals("bmdg", model.errors().get(0).file());
        Assertions.assertEquals(14.188546f, model.errors().get(0).line());
        Assertions.assertEquals("jfddgmbmbe", model.errors().get(0).message());
        Assertions.assertEquals("ppbhtqqrolfp", model.errors().get(0).rule());
    }
}
