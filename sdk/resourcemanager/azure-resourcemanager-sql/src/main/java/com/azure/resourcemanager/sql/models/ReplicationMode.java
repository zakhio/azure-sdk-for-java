// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The replication mode of a distributed availability group. Parameter will be ignored during link creation. */
public final class ReplicationMode extends ExpandableStringEnum<ReplicationMode> {
    /** Static value Async for ReplicationMode. */
    public static final ReplicationMode ASYNC = fromString("Async");

    /** Static value Sync for ReplicationMode. */
    public static final ReplicationMode SYNC = fromString("Sync");

    /**
     * Creates or finds a ReplicationMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReplicationMode.
     */
    @JsonCreator
    public static ReplicationMode fromString(String name) {
        return fromString(name, ReplicationMode.class);
    }

    /**
     * Gets known ReplicationMode values.
     *
     * @return known ReplicationMode values.
     */
    public static Collection<ReplicationMode> values() {
        return values(ReplicationMode.class);
    }
}
