// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * AutonomousDatabaseBackupLifecycleState enum.
 */
public final class AutonomousDatabaseBackupLifecycleState
    extends ExpandableStringEnum<AutonomousDatabaseBackupLifecycleState> {
    /**
     * Static value Creating for AutonomousDatabaseBackupLifecycleState.
     */
    public static final AutonomousDatabaseBackupLifecycleState CREATING = fromString("Creating");

    /**
     * Static value Active for AutonomousDatabaseBackupLifecycleState.
     */
    public static final AutonomousDatabaseBackupLifecycleState ACTIVE = fromString("Active");

    /**
     * Static value Deleting for AutonomousDatabaseBackupLifecycleState.
     */
    public static final AutonomousDatabaseBackupLifecycleState DELETING = fromString("Deleting");

    /**
     * Static value Failed for AutonomousDatabaseBackupLifecycleState.
     */
    public static final AutonomousDatabaseBackupLifecycleState FAILED = fromString("Failed");

    /**
     * Static value Updating for AutonomousDatabaseBackupLifecycleState.
     */
    public static final AutonomousDatabaseBackupLifecycleState UPDATING = fromString("Updating");

    /**
     * Creates a new instance of AutonomousDatabaseBackupLifecycleState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AutonomousDatabaseBackupLifecycleState() {
    }

    /**
     * Creates or finds a AutonomousDatabaseBackupLifecycleState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AutonomousDatabaseBackupLifecycleState.
     */
    @JsonCreator
    public static AutonomousDatabaseBackupLifecycleState fromString(String name) {
        return fromString(name, AutonomousDatabaseBackupLifecycleState.class);
    }

    /**
     * Gets known AutonomousDatabaseBackupLifecycleState values.
     * 
     * @return known AutonomousDatabaseBackupLifecycleState values.
     */
    public static Collection<AutonomousDatabaseBackupLifecycleState> values() {
        return values(AutonomousDatabaseBackupLifecycleState.class);
    }
}
