// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.DiagnosticsCollectionInner;
import com.azure.resourcemanager.appcontainers.fluent.models.DiagnosticsInner;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataProviderMetadata;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataProviderMetadataPropertyBagItem;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataTableResponseObject;
import com.azure.resourcemanager.appcontainers.models.DiagnosticRendering;
import com.azure.resourcemanager.appcontainers.models.DiagnosticSupportTopic;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsDataApiResponse;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsDefinition;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsProperties;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsStatus;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DiagnosticsCollectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiagnosticsCollectionInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"metadata\":{\"id\":\"nzqodfvpg\",\"name\":\"oxgsgbpfgzdjtx\",\"description\":\"flbqvgaq\",\"author\":\"gafcqu\",\"category\":\"dvetnws\",\"supportTopicList\":[{}],\"analysisTypes\":[\"wlduyc\",\"uzhyrmewipmvekdx\",\"kuqgsjjxundxgket\",\"zhhzjhfjmhvvmu\"],\"type\":\"pmuneqsx\",\"score\":97.42455},\"dataset\":[{\"table\":{},\"renderingProperties\":{}},{\"table\":{},\"renderingProperties\":{}}],\"status\":{\"message\":\"sasbhu\",\"statusId\":1639205644},\"dataProviderMetadata\":{\"providerName\":\"yue\",\"propertyBag\":[{},{},{}]}},\"id\":\"nsqyrpfoobrltt\",\"name\":\"msjnygqdnfw\",\"type\":\"zdzgtilaxhnfhqly\"},{\"properties\":{\"metadata\":{\"id\":\"uwivkxoy\",\"name\":\"nbixxrti\",\"description\":\"cpwpg\",\"author\":\"rc\",\"category\":\"tso\",\"supportTopicList\":[{},{}],\"analysisTypes\":[\"nxpmyyefrpmpdnq\",\"skawaoqvmmb\",\"pqfrtqlkz\"],\"type\":\"gnitgvkxlzyq\",\"score\":34.082},\"dataset\":[{\"table\":{},\"renderingProperties\":{}},{\"table\":{},\"renderingProperties\":{}},{\"table\":{},\"renderingProperties\":{}}],\"status\":{\"message\":\"cansymoyqhlwigd\",\"statusId\":247334898},\"dataProviderMetadata\":{\"providerName\":\"xgomfajuwa\",\"propertyBag\":[{},{},{},{}]}},\"id\":\"aeyyg\",\"name\":\"xakjsqzhzb\",\"type\":\"zkgimsid\"},{\"properties\":{\"metadata\":{\"id\":\"cddyvvjsk\",\"name\":\"mocwa\",\"description\":\"qgatjeaahhvjhhn\",\"author\":\"zybbj\",\"category\":\"dj\",\"supportTopicList\":[{},{}],\"analysisTypes\":[\"yxvxevblbjed\",\"ljlageuaulxu\",\"smjbnkppxyn\",\"nlsvxeiz\"],\"type\":\"wklnsrmffeyc\",\"score\":18.504536},\"dataset\":[{\"table\":{},\"renderingProperties\":{}},{\"table\":{},\"renderingProperties\":{}},{\"table\":{},\"renderingProperties\":{}}],\"status\":{\"message\":\"ammxqi\",\"statusId\":1876834385},\"dataProviderMetadata\":{\"providerName\":\"ddrtkgdojb\",\"propertyBag\":[{},{},{}]}},\"id\":\"vrefdeesv\",\"name\":\"cuijpxt\",\"type\":\"s\"},{\"properties\":{\"metadata\":{\"id\":\"tujwsawdd\",\"name\":\"babxvitit\",\"description\":\"zeexavoxtfgle\",\"author\":\"m\",\"category\":\"bwpypqtgsfjacb\",\"supportTopicList\":[{},{}],\"analysisTypes\":[\"udbxv\"],\"type\":\"htnsi\",\"score\":69.404366},\"dataset\":[{\"table\":{},\"renderingProperties\":{}}],\"status\":{\"message\":\"ckdlpag\",\"statusId\":1885722966},\"dataProviderMetadata\":{\"providerName\":\"a\",\"propertyBag\":[{},{},{}]}},\"id\":\"xwmdboxd\",\"name\":\"gsftufqobrjlnacg\",\"type\":\"ckknhxkizvy\"}],\"nextLink\":\"rzvul\"}")
            .toObject(DiagnosticsCollectionInner.class);
        Assertions.assertEquals("wlduyc", model.value().get(0).properties().metadata().analysisTypes().get(0));
        Assertions.assertEquals("sasbhu", model.value().get(0).properties().status().message());
        Assertions.assertEquals(1639205644, model.value().get(0).properties().status().statusId());
        Assertions.assertEquals("yue", model.value().get(0).properties().dataProviderMetadata().providerName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiagnosticsCollectionInner model
            = new DiagnosticsCollectionInner()
                .withValue(Arrays.asList(
                    new DiagnosticsInner()
                        .withProperties(
                            new DiagnosticsProperties()
                                .withMetadata(new DiagnosticsDefinition()
                                    .withSupportTopicList(Arrays.asList(new DiagnosticSupportTopic()))
                                    .withAnalysisTypes(Arrays.asList("wlduyc", "uzhyrmewipmvekdx", "kuqgsjjxundxgket",
                                        "zhhzjhfjmhvvmu")))
                                .withDataset(Arrays.asList(
                                    new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                                        .withRenderingProperties(new DiagnosticRendering()),
                                    new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                                        .withRenderingProperties(new DiagnosticRendering())))
                                .withStatus(new DiagnosticsStatus().withMessage("sasbhu").withStatusId(1639205644))
                                .withDataProviderMetadata(
                                    new DiagnosticDataProviderMetadata().withProviderName(
                                        "yue").withPropertyBag(
                                            Arrays.asList(new DiagnosticDataProviderMetadataPropertyBagItem(),
                                                new DiagnosticDataProviderMetadataPropertyBagItem(),
                                                new DiagnosticDataProviderMetadataPropertyBagItem())))),
                    new DiagnosticsInner()
                        .withProperties(
                            new DiagnosticsProperties()
                                .withMetadata(new DiagnosticsDefinition()
                                    .withSupportTopicList(
                                        Arrays.asList(new DiagnosticSupportTopic(), new DiagnosticSupportTopic()))
                                    .withAnalysisTypes(Arrays.asList("nxpmyyefrpmpdnq", "skawaoqvmmb", "pqfrtqlkz")))
                                .withDataset(Arrays.asList(
                                    new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                                        .withRenderingProperties(new DiagnosticRendering()),
                                    new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                                        .withRenderingProperties(new DiagnosticRendering()),
                                    new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                                        .withRenderingProperties(new DiagnosticRendering())))
                                .withStatus(new DiagnosticsStatus().withMessage("cansymoyqhlwigd").withStatusId(
                                    247334898))
                                .withDataProviderMetadata(new DiagnosticDataProviderMetadata()
                                    .withProviderName("xgomfajuwa")
                                    .withPropertyBag(Arrays.asList(new DiagnosticDataProviderMetadataPropertyBagItem(),
                                        new DiagnosticDataProviderMetadataPropertyBagItem(),
                                        new DiagnosticDataProviderMetadataPropertyBagItem(),
                                        new DiagnosticDataProviderMetadataPropertyBagItem())))),
                    new DiagnosticsInner()
                        .withProperties(new DiagnosticsProperties()
                            .withMetadata(new DiagnosticsDefinition()
                                .withSupportTopicList(
                                    Arrays.asList(new DiagnosticSupportTopic(), new DiagnosticSupportTopic()))
                                .withAnalysisTypes(
                                    Arrays.asList("yxvxevblbjed", "ljlageuaulxu", "smjbnkppxyn", "nlsvxeiz")))
                            .withDataset(Arrays.asList(
                                new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                                    .withRenderingProperties(new DiagnosticRendering()),
                                new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                                    .withRenderingProperties(new DiagnosticRendering()),
                                new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                                    .withRenderingProperties(new DiagnosticRendering())))
                            .withStatus(new DiagnosticsStatus().withMessage("ammxqi").withStatusId(1876834385))
                            .withDataProviderMetadata(
                                new DiagnosticDataProviderMetadata().withProviderName("ddrtkgdojb")
                                    .withPropertyBag(Arrays.asList(new DiagnosticDataProviderMetadataPropertyBagItem(),
                                        new DiagnosticDataProviderMetadataPropertyBagItem(),
                                        new DiagnosticDataProviderMetadataPropertyBagItem())))),
                    new DiagnosticsInner().withProperties(new DiagnosticsProperties()
                        .withMetadata(new DiagnosticsDefinition()
                            .withSupportTopicList(
                                Arrays.asList(new DiagnosticSupportTopic(), new DiagnosticSupportTopic()))
                            .withAnalysisTypes(Arrays.asList("udbxv")))
                        .withDataset(Arrays
                            .asList(new DiagnosticsDataApiResponse().withTable(new DiagnosticDataTableResponseObject())
                                .withRenderingProperties(new DiagnosticRendering())))
                        .withStatus(new DiagnosticsStatus().withMessage("ckdlpag").withStatusId(1885722966))
                        .withDataProviderMetadata(new DiagnosticDataProviderMetadata().withProviderName("a")
                            .withPropertyBag(Arrays.asList(new DiagnosticDataProviderMetadataPropertyBagItem(),
                                new DiagnosticDataProviderMetadataPropertyBagItem(),
                                new DiagnosticDataProviderMetadataPropertyBagItem()))))));
        model = BinaryData.fromObject(model).toObject(DiagnosticsCollectionInner.class);
        Assertions.assertEquals("wlduyc", model.value().get(0).properties().metadata().analysisTypes().get(0));
        Assertions.assertEquals("sasbhu", model.value().get(0).properties().status().message());
        Assertions.assertEquals(1639205644, model.value().get(0).properties().status().statusId());
        Assertions.assertEquals("yue", model.value().get(0).properties().dataProviderMetadata().providerName());
    }
}
