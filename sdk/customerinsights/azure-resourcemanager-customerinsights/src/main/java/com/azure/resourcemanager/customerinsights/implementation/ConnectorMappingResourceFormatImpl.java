// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.customerinsights.fluent.models.ConnectorMappingResourceFormatInner;
import com.azure.resourcemanager.customerinsights.models.ConnectorMappingProperties;
import com.azure.resourcemanager.customerinsights.models.ConnectorMappingResourceFormat;
import com.azure.resourcemanager.customerinsights.models.ConnectorMappingStates;
import com.azure.resourcemanager.customerinsights.models.ConnectorTypes;
import com.azure.resourcemanager.customerinsights.models.EntityTypes;
import java.time.OffsetDateTime;

public final class ConnectorMappingResourceFormatImpl
    implements ConnectorMappingResourceFormat,
        ConnectorMappingResourceFormat.Definition,
        ConnectorMappingResourceFormat.Update {
    private ConnectorMappingResourceFormatInner innerObject;

    private final com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String connectorName() {
        return this.innerModel().connectorName();
    }

    public ConnectorTypes connectorType() {
        return this.innerModel().connectorType();
    }

    public OffsetDateTime created() {
        return this.innerModel().created();
    }

    public OffsetDateTime lastModified() {
        return this.innerModel().lastModified();
    }

    public EntityTypes entityType() {
        return this.innerModel().entityType();
    }

    public String entityTypeName() {
        return this.innerModel().entityTypeName();
    }

    public String connectorMappingName() {
        return this.innerModel().connectorMappingName();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String dataFormatId() {
        return this.innerModel().dataFormatId();
    }

    public ConnectorMappingProperties mappingProperties() {
        return this.innerModel().mappingProperties();
    }

    public OffsetDateTime nextRunTime() {
        return this.innerModel().nextRunTime();
    }

    public String runId() {
        return this.innerModel().runId();
    }

    public ConnectorMappingStates state() {
        return this.innerModel().state();
    }

    public String tenantId() {
        return this.innerModel().tenantId();
    }

    public ConnectorMappingResourceFormatInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String hubName;

    private String connectorName;

    private String mappingName;

    public ConnectorMappingResourceFormatImpl withExistingConnector(
        String resourceGroupName, String hubName, String connectorName) {
        this.resourceGroupName = resourceGroupName;
        this.hubName = hubName;
        this.connectorName = connectorName;
        return this;
    }

    public ConnectorMappingResourceFormat create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectorMappings()
                .createOrUpdateWithResponse(
                    resourceGroupName, hubName, connectorName, mappingName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ConnectorMappingResourceFormat create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectorMappings()
                .createOrUpdateWithResponse(
                    resourceGroupName, hubName, connectorName, mappingName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ConnectorMappingResourceFormatImpl(
        String name, com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager) {
        this.innerObject = new ConnectorMappingResourceFormatInner();
        this.serviceManager = serviceManager;
        this.mappingName = name;
    }

    public ConnectorMappingResourceFormatImpl update() {
        return this;
    }

    public ConnectorMappingResourceFormat apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectorMappings()
                .createOrUpdateWithResponse(
                    resourceGroupName, hubName, connectorName, mappingName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ConnectorMappingResourceFormat apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectorMappings()
                .createOrUpdateWithResponse(
                    resourceGroupName, hubName, connectorName, mappingName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ConnectorMappingResourceFormatImpl(
        ConnectorMappingResourceFormatInner innerObject,
        com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.hubName = Utils.getValueFromIdByName(innerObject.id(), "hubs");
        this.connectorName = Utils.getValueFromIdByName(innerObject.id(), "connectors");
        this.mappingName = Utils.getValueFromIdByName(innerObject.id(), "mappings");
    }

    public ConnectorMappingResourceFormat refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectorMappings()
                .getWithResponse(resourceGroupName, hubName, connectorName, mappingName, Context.NONE)
                .getValue();
        return this;
    }

    public ConnectorMappingResourceFormat refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectorMappings()
                .getWithResponse(resourceGroupName, hubName, connectorName, mappingName, context)
                .getValue();
        return this;
    }

    public ConnectorMappingResourceFormatImpl withConnectorType(ConnectorTypes connectorType) {
        this.innerModel().withConnectorType(connectorType);
        return this;
    }

    public ConnectorMappingResourceFormatImpl withEntityType(EntityTypes entityType) {
        this.innerModel().withEntityType(entityType);
        return this;
    }

    public ConnectorMappingResourceFormatImpl withEntityTypeName(String entityTypeName) {
        this.innerModel().withEntityTypeName(entityTypeName);
        return this;
    }

    public ConnectorMappingResourceFormatImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public ConnectorMappingResourceFormatImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public ConnectorMappingResourceFormatImpl withMappingProperties(ConnectorMappingProperties mappingProperties) {
        this.innerModel().withMappingProperties(mappingProperties);
        return this;
    }
}
