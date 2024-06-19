// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.datafactory.models.BlobSink;
import com.azure.resourcemanager.datafactory.models.BlobSource;
import com.azure.resourcemanager.datafactory.models.CopyActivity;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.Expression;
import com.azure.resourcemanager.datafactory.models.ForEachActivity;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.PipelineElapsedTimeMetricPolicy;
import com.azure.resourcemanager.datafactory.models.PipelinePolicy;
import com.azure.resourcemanager.datafactory.models.PipelineResource;
import com.azure.resourcemanager.datafactory.models.VariableSpecification;
import com.azure.resourcemanager.datafactory.models.VariableType;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Pipelines CreateOrUpdate.
 */
public final class PipelinesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/Pipelines_Create.json
     */
    /**
     * Sample code: Pipelines_Create.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void pipelinesCreate(com.azure.resourcemanager.datafactory.DataFactoryManager manager)
        throws IOException {
        manager.pipelines()
            .define("examplePipeline")
            .withExistingFactory("exampleResourceGroup", "exampleFactoryName")
            .withActivities(Arrays.asList(new ForEachActivity().withName("ExampleForeachActivity")
                .withIsSequential(true)
                .withItems(new Expression().withValue("@pipeline().parameters.OutputBlobNameList"))
                .withActivities(Arrays.asList(new CopyActivity().withName("ExampleCopyActivity")
                    .withInputs(Arrays.asList(new DatasetReference().withReferenceName("exampleDataset")
                        .withParameters(
                            mapOf("MyFileName", "examplecontainer.csv", "MyFolderPath", "examplecontainer"))))
                    .withOutputs(Arrays.asList(new DatasetReference().withReferenceName("exampleDataset")
                        .withParameters(mapOf("MyFileName",
                            SerializerFactory.createDefaultManagementSerializerAdapter()
                                .deserialize("{\"type\":\"Expression\",\"value\":\"@item()\"}", Object.class,
                                    SerializerEncoding.JSON),
                            "MyFolderPath", "examplecontainer"))))
                    .withSource(new BlobSource())
                    .withSink(new BlobSink())
                    .withDataIntegrationUnits(32)))))
            .withParameters(mapOf("JobId", new ParameterSpecification().withType(ParameterType.STRING),
                "OutputBlobNameList", new ParameterSpecification().withType(ParameterType.ARRAY)))
            .withVariables(mapOf("TestVariableArray", new VariableSpecification().withType(VariableType.ARRAY)))
            .withRunDimensions(mapOf("JobId",
                SerializerFactory.createDefaultManagementSerializerAdapter()
                    .deserialize("{\"type\":\"Expression\",\"value\":\"@pipeline().parameters.JobId\"}", Object.class,
                        SerializerEncoding.JSON)))
            .withPolicy(new PipelinePolicy()
                .withElapsedTimeMetric(new PipelineElapsedTimeMetricPolicy().withDuration("0.00:10:00")))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/datafactory/resource-manager/Microsoft.DataFactory/stable/2018-06-01/examples/Pipelines_Update.json
     */
    /**
     * Sample code: Pipelines_Update.
     * 
     * @param manager Entry point to DataFactoryManager.
     */
    public static void pipelinesUpdate(com.azure.resourcemanager.datafactory.DataFactoryManager manager)
        throws IOException {
        PipelineResource resource = manager.pipelines()
            .getWithResponse("exampleResourceGroup", "exampleFactoryName", "examplePipeline", null,
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withDescription("Example description")
            .withActivities(Arrays.asList(new ForEachActivity().withName("ExampleForeachActivity")
                .withIsSequential(true)
                .withItems(new Expression().withValue("@pipeline().parameters.OutputBlobNameList"))
                .withActivities(Arrays.asList(new CopyActivity().withName("ExampleCopyActivity")
                    .withInputs(Arrays.asList(new DatasetReference().withReferenceName("exampleDataset")
                        .withParameters(
                            mapOf("MyFileName", "examplecontainer.csv", "MyFolderPath", "examplecontainer"))))
                    .withOutputs(Arrays.asList(new DatasetReference().withReferenceName("exampleDataset")
                        .withParameters(mapOf("MyFileName",
                            SerializerFactory.createDefaultManagementSerializerAdapter()
                                .deserialize("{\"type\":\"Expression\",\"value\":\"@item()\"}", Object.class,
                                    SerializerEncoding.JSON),
                            "MyFolderPath", "examplecontainer"))))
                    .withSource(new BlobSource())
                    .withSink(new BlobSink())
                    .withDataIntegrationUnits(32)))))
            .withParameters(mapOf("OutputBlobNameList", new ParameterSpecification().withType(ParameterType.ARRAY)))
            .withPolicy(new PipelinePolicy()
                .withElapsedTimeMetric(new PipelineElapsedTimeMetricPolicy().withDuration("0.00:10:00")))
            .apply();
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
