// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ConnectionType;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.MapperConnection;
import com.azure.resourcemanager.datafactory.models.MapperDslConnectorProperties;
import com.azure.resourcemanager.datafactory.models.MapperSourceConnectionsInfo;
import com.azure.resourcemanager.datafactory.models.MapperTable;
import com.azure.resourcemanager.datafactory.models.MapperTableSchema;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MapperSourceConnectionsInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MapperSourceConnectionsInfo model = BinaryData.fromString(
            "{\"sourceEntities\":[{\"name\":\"tjqvqyvweht\",\"properties\":{\"schema\":[{\"name\":\"zzy\",\"dataType\":\"vusxiv\"},{\"name\":\"rryveimipskdy\",\"dataType\":\"tv\"}],\"dslConnectorProperties\":[{\"name\":\"aftjvvruxwigsy\",\"value\":\"datapq\"},{\"name\":\"mjtgrqg\",\"value\":\"datakkileplkc\"},{\"name\":\"knh\",\"value\":\"databbaedorvvm\"}]}}],\"connection\":{\"linkedService\":{\"referenceName\":\"oygbdgwumgxd\",\"parameters\":{\"tm\":\"datapabgdexjddvjsaqw\",\"xaptefhexcgjok\":\"datawllcolsr\",\"ek\":\"dataljnhvlqj\",\"xeslkhhustcpoqm\":\"dataeeksnbksdqhjvyk\"}},\"linkedServiceType\":\"nwqjwgokn\",\"type\":\"linkedservicetype\",\"isInlineDataset\":false,\"commonDslConnectorProperties\":[{\"name\":\"ybwfdbkjb\",\"value\":\"dataensvkzykjtj\"},{\"name\":\"sxfwushcdp\",\"value\":\"datapn\"},{\"name\":\"mgjfbpkuwxeoio\",\"value\":\"dataizfavkjzwf\"}]}}")
            .toObject(MapperSourceConnectionsInfo.class);
        Assertions.assertEquals("tjqvqyvweht", model.sourceEntities().get(0).name());
        Assertions.assertEquals("zzy", model.sourceEntities().get(0).schema().get(0).name());
        Assertions.assertEquals("vusxiv", model.sourceEntities().get(0).schema().get(0).dataType());
        Assertions.assertEquals("aftjvvruxwigsy", model.sourceEntities().get(0).dslConnectorProperties().get(0).name());
        Assertions.assertEquals("oygbdgwumgxd", model.connection().linkedService().referenceName());
        Assertions.assertEquals("nwqjwgokn", model.connection().linkedServiceType());
        Assertions.assertEquals(ConnectionType.LINKEDSERVICETYPE, model.connection().type());
        Assertions.assertEquals(false, model.connection().isInlineDataset());
        Assertions.assertEquals("ybwfdbkjb", model.connection().commonDslConnectorProperties().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MapperSourceConnectionsInfo model = new MapperSourceConnectionsInfo()
            .withSourceEntities(Arrays.asList(new MapperTable().withName("tjqvqyvweht")
                .withSchema(Arrays.asList(new MapperTableSchema().withName("zzy").withDataType("vusxiv"),
                    new MapperTableSchema().withName("rryveimipskdy").withDataType("tv")))
                .withDslConnectorProperties(
                    Arrays.asList(new MapperDslConnectorProperties().withName("aftjvvruxwigsy").withValue("datapq"),
                        new MapperDslConnectorProperties().withName("mjtgrqg").withValue("datakkileplkc"),
                        new MapperDslConnectorProperties().withName("knh").withValue("databbaedorvvm")))))
            .withConnection(
                new MapperConnection()
                    .withLinkedService(new LinkedServiceReference().withReferenceName("oygbdgwumgxd")
                        .withParameters(mapOf("tm", "datapabgdexjddvjsaqw", "xaptefhexcgjok", "datawllcolsr", "ek",
                            "dataljnhvlqj", "xeslkhhustcpoqm", "dataeeksnbksdqhjvyk")))
                    .withLinkedServiceType("nwqjwgokn")
                    .withType(ConnectionType.LINKEDSERVICETYPE)
                    .withIsInlineDataset(false)
                    .withCommonDslConnectorProperties(Arrays.asList(
                        new MapperDslConnectorProperties().withName("ybwfdbkjb").withValue("dataensvkzykjtj"),
                        new MapperDslConnectorProperties().withName("sxfwushcdp").withValue("datapn"),
                        new MapperDslConnectorProperties().withName("mgjfbpkuwxeoio").withValue("dataizfavkjzwf"))));
        model = BinaryData.fromObject(model).toObject(MapperSourceConnectionsInfo.class);
        Assertions.assertEquals("tjqvqyvweht", model.sourceEntities().get(0).name());
        Assertions.assertEquals("zzy", model.sourceEntities().get(0).schema().get(0).name());
        Assertions.assertEquals("vusxiv", model.sourceEntities().get(0).schema().get(0).dataType());
        Assertions.assertEquals("aftjvvruxwigsy", model.sourceEntities().get(0).dslConnectorProperties().get(0).name());
        Assertions.assertEquals("oygbdgwumgxd", model.connection().linkedService().referenceName());
        Assertions.assertEquals("nwqjwgokn", model.connection().linkedServiceType());
        Assertions.assertEquals(ConnectionType.LINKEDSERVICETYPE, model.connection().type());
        Assertions.assertEquals(false, model.connection().isInlineDataset());
        Assertions.assertEquals("ybwfdbkjb", model.connection().commonDslConnectorProperties().get(0).name());
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
