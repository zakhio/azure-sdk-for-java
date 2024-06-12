// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.models;

/**
 * Defines values for LeaseAction.
 */
public enum LeaseAction {
    /**
     * Enum value acquire.
     */
    ACQUIRE("acquire"),

    /**
     * Enum value auto-renew.
     */
    AUTO_RENEW("auto-renew"),

    /**
     * Enum value release.
     */
    RELEASE("release"),

    /**
     * Enum value acquire-release.
     */
    ACQUIRE_RELEASE("acquire-release");

    /**
     * The actual serialized value for a LeaseAction instance.
     */
    private final String value;

    LeaseAction(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a LeaseAction instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed LeaseAction object, or null if unable to parse.
     */
    public static LeaseAction fromString(String value) {
        if (value == null) {
            return null;
        }
        LeaseAction[] items = LeaseAction.values();
        for (LeaseAction item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
