// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AutomationRuleBooleanConditionSupportedOperator. */
public final class AutomationRuleBooleanConditionSupportedOperator
    extends ExpandableStringEnum<AutomationRuleBooleanConditionSupportedOperator> {
    /** Static value And for AutomationRuleBooleanConditionSupportedOperator. */
    public static final AutomationRuleBooleanConditionSupportedOperator AND = fromString("And");

    /** Static value Or for AutomationRuleBooleanConditionSupportedOperator. */
    public static final AutomationRuleBooleanConditionSupportedOperator OR = fromString("Or");

    /**
     * Creates or finds a AutomationRuleBooleanConditionSupportedOperator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutomationRuleBooleanConditionSupportedOperator.
     */
    @JsonCreator
    public static AutomationRuleBooleanConditionSupportedOperator fromString(String name) {
        return fromString(name, AutomationRuleBooleanConditionSupportedOperator.class);
    }

    /**
     * Gets known AutomationRuleBooleanConditionSupportedOperator values.
     *
     * @return known AutomationRuleBooleanConditionSupportedOperator values.
     */
    public static Collection<AutomationRuleBooleanConditionSupportedOperator> values() {
        return values(AutomationRuleBooleanConditionSupportedOperator.class);
    }
}
