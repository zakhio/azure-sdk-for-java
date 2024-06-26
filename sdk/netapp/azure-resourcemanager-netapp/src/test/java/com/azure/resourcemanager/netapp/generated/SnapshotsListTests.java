// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotInner;
import com.azure.resourcemanager.netapp.models.SnapshotsList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SnapshotsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnapshotsList model = BinaryData.fromString(
            "{\"value\":[{\"location\":\"ykojoxafnndlpic\",\"properties\":{\"snapshotId\":\"ymkcdyhb\",\"created\":\"2021-01-04T13:26:20Z\",\"provisioningState\":\"wdreqnovvqfovl\"},\"id\":\"ywsuwsy\",\"name\":\"s\",\"type\":\"dsytgadgvr\"},{\"location\":\"ea\",\"properties\":{\"snapshotId\":\"qnzarrwl\",\"created\":\"2021-09-03T09:11:52Z\",\"provisioningState\":\"jfqka\"},\"id\":\"wiipfpub\",\"name\":\"ibwwiftohqkv\",\"type\":\"uvksgplsaknynfsy\"},{\"location\":\"ljphuopxodl\",\"properties\":{\"snapshotId\":\"ntorzihleosjswsr\",\"created\":\"2021-01-12T15:56:27Z\",\"provisioningState\":\"rpzbchckqqzqi\"},\"id\":\"iysui\",\"name\":\"zynkedya\",\"type\":\"rwyhqmibzyhwitsm\"},{\"location\":\"pyy\",\"properties\":{\"snapshotId\":\"dpumnzgmw\",\"created\":\"2021-05-04T13:21:35Z\",\"provisioningState\":\"biknsorgjhxbld\"},\"id\":\"wwrlkdmtncv\",\"name\":\"kotl\",\"type\":\"xdy\"}]}")
            .toObject(SnapshotsList.class);
        Assertions.assertEquals("ykojoxafnndlpic", model.value().get(0).location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnapshotsList model = new SnapshotsList().withValue(
            Arrays.asList(new SnapshotInner().withLocation("ykojoxafnndlpic"), new SnapshotInner().withLocation("ea"),
                new SnapshotInner().withLocation("ljphuopxodl"), new SnapshotInner().withLocation("pyy")));
        model = BinaryData.fromObject(model).toObject(SnapshotsList.class);
        Assertions.assertEquals("ykojoxafnndlpic", model.value().get(0).location());
    }
}
