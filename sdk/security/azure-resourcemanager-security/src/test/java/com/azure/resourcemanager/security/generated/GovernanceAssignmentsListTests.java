// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.GovernanceAssignmentsList;

public final class GovernanceAssignmentsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GovernanceAssignmentsList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"owner\":\"ibahwflus\",\"remediationDueDate\":\"2021-01-14T17:23:07Z\",\"remediationEta\":{\"eta\":\"2021-01-31T16:25:21Z\",\"justification\":\"hrkwo\"},\"isGracePeriod\":false,\"governanceEmailNotification\":{\"disableManagerEmailNotification\":false,\"disableOwnerEmailNotification\":false},\"additionalData\":{\"ticketNumber\":1486476697,\"ticketLink\":\"pbtg\",\"ticketStatus\":\"bwoenwashrt\"}},\"id\":\"tkcnqxwb\",\"name\":\"okulpiujwa\",\"type\":\"sipqii\"}],\"nextLink\":\"yuq\"}")
            .toObject(GovernanceAssignmentsList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GovernanceAssignmentsList model = new GovernanceAssignmentsList();
        model = BinaryData.fromObject(model).toObject(GovernanceAssignmentsList.class);
    }
}
