// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * kubernetes Cluster Backup target info for restore operation from vault.
 */
@Fluent
public final class KubernetesClusterVaultTierRestoreCriteria extends ItemLevelRestoreCriteria {
    /*
     * Type of the specific object - used for deserializing
     */
    private String objectType = "KubernetesClusterVaultTierRestoreCriteria";

    /*
     * Gets or sets the include cluster resources property. This property if enabled will include cluster scope
     * resources during restore from vault.
     */
    private boolean includeClusterScopeResources;

    /*
     * Gets or sets the include namespaces property. This property sets the namespaces to be included during restore
     * from vault.
     */
    private List<String> includedNamespaces;

    /*
     * Gets or sets the exclude namespaces property. This property sets the namespaces to be excluded during restore
     * from vault.
     */
    private List<String> excludedNamespaces;

    /*
     * Gets or sets the include resource types property. This property sets the resource types to be included during
     * restore from vault.
     */
    private List<String> includedResourceTypes;

    /*
     * Gets or sets the exclude resource types property. This property sets the resource types to be excluded during
     * restore from vault.
     */
    private List<String> excludedResourceTypes;

    /*
     * Gets or sets the LabelSelectors property. This property sets the resource with such label selectors to be
     * included during restore from vault.
     */
    private List<String> labelSelectors;

    /*
     * Gets or sets the PV (Persistent Volume) Restore Mode property. This property sets whether volumes needs to be
     * restored from vault.
     */
    private PersistentVolumeRestoreMode persistentVolumeRestoreMode;

    /*
     * Gets or sets the Conflict Policy property. This property sets policy during conflict of resources during restore
     * from vault.
     */
    private ExistingResourcePolicy conflictPolicy;

    /*
     * Gets or sets the Namespace Mappings property. This property sets if namespace needs to be change during restore
     * from vault.
     */
    private Map<String, String> namespaceMappings;

    /*
     * Gets or sets the restore hook references. This property sets the hook reference to be executed during restore
     * from vault.
     */
    private List<NamespacedNameResource> restoreHookReferences;

    /*
     * Gets or sets the staging RG Id for creating staging disks and snapshots during restore from vault.
     */
    private String stagingResourceGroupId;

    /*
     * Gets or sets the staging Storage Account Id for creating backup extension object store data during restore from
     * vault.
     */
    private String stagingStorageAccountId;

    /*
     * Gets or sets the resource modifier reference. This property sets the reference for resource modifier during
     * restore.
     */
    private NamespacedNameResource resourceModifierReference;

    /**
     * Creates an instance of KubernetesClusterVaultTierRestoreCriteria class.
     */
    public KubernetesClusterVaultTierRestoreCriteria() {
    }

    /**
     * Get the objectType property: Type of the specific object - used for deserializing.
     * 
     * @return the objectType value.
     */
    @Override
    public String objectType() {
        return this.objectType;
    }

    /**
     * Get the includeClusterScopeResources property: Gets or sets the include cluster resources property. This property
     * if enabled will include cluster scope resources during restore from vault.
     * 
     * @return the includeClusterScopeResources value.
     */
    public boolean includeClusterScopeResources() {
        return this.includeClusterScopeResources;
    }

    /**
     * Set the includeClusterScopeResources property: Gets or sets the include cluster resources property. This property
     * if enabled will include cluster scope resources during restore from vault.
     * 
     * @param includeClusterScopeResources the includeClusterScopeResources value to set.
     * @return the KubernetesClusterVaultTierRestoreCriteria object itself.
     */
    public KubernetesClusterVaultTierRestoreCriteria
        withIncludeClusterScopeResources(boolean includeClusterScopeResources) {
        this.includeClusterScopeResources = includeClusterScopeResources;
        return this;
    }

    /**
     * Get the includedNamespaces property: Gets or sets the include namespaces property. This property sets the
     * namespaces to be included during restore from vault.
     * 
     * @return the includedNamespaces value.
     */
    public List<String> includedNamespaces() {
        return this.includedNamespaces;
    }

    /**
     * Set the includedNamespaces property: Gets or sets the include namespaces property. This property sets the
     * namespaces to be included during restore from vault.
     * 
     * @param includedNamespaces the includedNamespaces value to set.
     * @return the KubernetesClusterVaultTierRestoreCriteria object itself.
     */
    public KubernetesClusterVaultTierRestoreCriteria withIncludedNamespaces(List<String> includedNamespaces) {
        this.includedNamespaces = includedNamespaces;
        return this;
    }

    /**
     * Get the excludedNamespaces property: Gets or sets the exclude namespaces property. This property sets the
     * namespaces to be excluded during restore from vault.
     * 
     * @return the excludedNamespaces value.
     */
    public List<String> excludedNamespaces() {
        return this.excludedNamespaces;
    }

    /**
     * Set the excludedNamespaces property: Gets or sets the exclude namespaces property. This property sets the
     * namespaces to be excluded during restore from vault.
     * 
     * @param excludedNamespaces the excludedNamespaces value to set.
     * @return the KubernetesClusterVaultTierRestoreCriteria object itself.
     */
    public KubernetesClusterVaultTierRestoreCriteria withExcludedNamespaces(List<String> excludedNamespaces) {
        this.excludedNamespaces = excludedNamespaces;
        return this;
    }

    /**
     * Get the includedResourceTypes property: Gets or sets the include resource types property. This property sets the
     * resource types to be included during restore from vault.
     * 
     * @return the includedResourceTypes value.
     */
    public List<String> includedResourceTypes() {
        return this.includedResourceTypes;
    }

    /**
     * Set the includedResourceTypes property: Gets or sets the include resource types property. This property sets the
     * resource types to be included during restore from vault.
     * 
     * @param includedResourceTypes the includedResourceTypes value to set.
     * @return the KubernetesClusterVaultTierRestoreCriteria object itself.
     */
    public KubernetesClusterVaultTierRestoreCriteria withIncludedResourceTypes(List<String> includedResourceTypes) {
        this.includedResourceTypes = includedResourceTypes;
        return this;
    }

    /**
     * Get the excludedResourceTypes property: Gets or sets the exclude resource types property. This property sets the
     * resource types to be excluded during restore from vault.
     * 
     * @return the excludedResourceTypes value.
     */
    public List<String> excludedResourceTypes() {
        return this.excludedResourceTypes;
    }

    /**
     * Set the excludedResourceTypes property: Gets or sets the exclude resource types property. This property sets the
     * resource types to be excluded during restore from vault.
     * 
     * @param excludedResourceTypes the excludedResourceTypes value to set.
     * @return the KubernetesClusterVaultTierRestoreCriteria object itself.
     */
    public KubernetesClusterVaultTierRestoreCriteria withExcludedResourceTypes(List<String> excludedResourceTypes) {
        this.excludedResourceTypes = excludedResourceTypes;
        return this;
    }

    /**
     * Get the labelSelectors property: Gets or sets the LabelSelectors property. This property sets the resource with
     * such label selectors to be included during restore from vault.
     * 
     * @return the labelSelectors value.
     */
    public List<String> labelSelectors() {
        return this.labelSelectors;
    }

    /**
     * Set the labelSelectors property: Gets or sets the LabelSelectors property. This property sets the resource with
     * such label selectors to be included during restore from vault.
     * 
     * @param labelSelectors the labelSelectors value to set.
     * @return the KubernetesClusterVaultTierRestoreCriteria object itself.
     */
    public KubernetesClusterVaultTierRestoreCriteria withLabelSelectors(List<String> labelSelectors) {
        this.labelSelectors = labelSelectors;
        return this;
    }

    /**
     * Get the persistentVolumeRestoreMode property: Gets or sets the PV (Persistent Volume) Restore Mode property. This
     * property sets whether volumes needs to be restored from vault.
     * 
     * @return the persistentVolumeRestoreMode value.
     */
    public PersistentVolumeRestoreMode persistentVolumeRestoreMode() {
        return this.persistentVolumeRestoreMode;
    }

    /**
     * Set the persistentVolumeRestoreMode property: Gets or sets the PV (Persistent Volume) Restore Mode property. This
     * property sets whether volumes needs to be restored from vault.
     * 
     * @param persistentVolumeRestoreMode the persistentVolumeRestoreMode value to set.
     * @return the KubernetesClusterVaultTierRestoreCriteria object itself.
     */
    public KubernetesClusterVaultTierRestoreCriteria
        withPersistentVolumeRestoreMode(PersistentVolumeRestoreMode persistentVolumeRestoreMode) {
        this.persistentVolumeRestoreMode = persistentVolumeRestoreMode;
        return this;
    }

    /**
     * Get the conflictPolicy property: Gets or sets the Conflict Policy property. This property sets policy during
     * conflict of resources during restore from vault.
     * 
     * @return the conflictPolicy value.
     */
    public ExistingResourcePolicy conflictPolicy() {
        return this.conflictPolicy;
    }

    /**
     * Set the conflictPolicy property: Gets or sets the Conflict Policy property. This property sets policy during
     * conflict of resources during restore from vault.
     * 
     * @param conflictPolicy the conflictPolicy value to set.
     * @return the KubernetesClusterVaultTierRestoreCriteria object itself.
     */
    public KubernetesClusterVaultTierRestoreCriteria withConflictPolicy(ExistingResourcePolicy conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
        return this;
    }

    /**
     * Get the namespaceMappings property: Gets or sets the Namespace Mappings property. This property sets if namespace
     * needs to be change during restore from vault.
     * 
     * @return the namespaceMappings value.
     */
    public Map<String, String> namespaceMappings() {
        return this.namespaceMappings;
    }

    /**
     * Set the namespaceMappings property: Gets or sets the Namespace Mappings property. This property sets if namespace
     * needs to be change during restore from vault.
     * 
     * @param namespaceMappings the namespaceMappings value to set.
     * @return the KubernetesClusterVaultTierRestoreCriteria object itself.
     */
    public KubernetesClusterVaultTierRestoreCriteria withNamespaceMappings(Map<String, String> namespaceMappings) {
        this.namespaceMappings = namespaceMappings;
        return this;
    }

    /**
     * Get the restoreHookReferences property: Gets or sets the restore hook references. This property sets the hook
     * reference to be executed during restore from vault.
     * 
     * @return the restoreHookReferences value.
     */
    public List<NamespacedNameResource> restoreHookReferences() {
        return this.restoreHookReferences;
    }

    /**
     * Set the restoreHookReferences property: Gets or sets the restore hook references. This property sets the hook
     * reference to be executed during restore from vault.
     * 
     * @param restoreHookReferences the restoreHookReferences value to set.
     * @return the KubernetesClusterVaultTierRestoreCriteria object itself.
     */
    public KubernetesClusterVaultTierRestoreCriteria
        withRestoreHookReferences(List<NamespacedNameResource> restoreHookReferences) {
        this.restoreHookReferences = restoreHookReferences;
        return this;
    }

    /**
     * Get the stagingResourceGroupId property: Gets or sets the staging RG Id for creating staging disks and snapshots
     * during restore from vault.
     * 
     * @return the stagingResourceGroupId value.
     */
    public String stagingResourceGroupId() {
        return this.stagingResourceGroupId;
    }

    /**
     * Set the stagingResourceGroupId property: Gets or sets the staging RG Id for creating staging disks and snapshots
     * during restore from vault.
     * 
     * @param stagingResourceGroupId the stagingResourceGroupId value to set.
     * @return the KubernetesClusterVaultTierRestoreCriteria object itself.
     */
    public KubernetesClusterVaultTierRestoreCriteria withStagingResourceGroupId(String stagingResourceGroupId) {
        this.stagingResourceGroupId = stagingResourceGroupId;
        return this;
    }

    /**
     * Get the stagingStorageAccountId property: Gets or sets the staging Storage Account Id for creating backup
     * extension object store data during restore from vault.
     * 
     * @return the stagingStorageAccountId value.
     */
    public String stagingStorageAccountId() {
        return this.stagingStorageAccountId;
    }

    /**
     * Set the stagingStorageAccountId property: Gets or sets the staging Storage Account Id for creating backup
     * extension object store data during restore from vault.
     * 
     * @param stagingStorageAccountId the stagingStorageAccountId value to set.
     * @return the KubernetesClusterVaultTierRestoreCriteria object itself.
     */
    public KubernetesClusterVaultTierRestoreCriteria withStagingStorageAccountId(String stagingStorageAccountId) {
        this.stagingStorageAccountId = stagingStorageAccountId;
        return this;
    }

    /**
     * Get the resourceModifierReference property: Gets or sets the resource modifier reference. This property sets the
     * reference for resource modifier during restore.
     * 
     * @return the resourceModifierReference value.
     */
    public NamespacedNameResource resourceModifierReference() {
        return this.resourceModifierReference;
    }

    /**
     * Set the resourceModifierReference property: Gets or sets the resource modifier reference. This property sets the
     * reference for resource modifier during restore.
     * 
     * @param resourceModifierReference the resourceModifierReference value to set.
     * @return the KubernetesClusterVaultTierRestoreCriteria object itself.
     */
    public KubernetesClusterVaultTierRestoreCriteria
        withResourceModifierReference(NamespacedNameResource resourceModifierReference) {
        this.resourceModifierReference = resourceModifierReference;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (restoreHookReferences() != null) {
            restoreHookReferences().forEach(e -> e.validate());
        }
        if (resourceModifierReference() != null) {
            resourceModifierReference().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("includeClusterScopeResources", this.includeClusterScopeResources);
        jsonWriter.writeStringField("objectType", this.objectType);
        jsonWriter.writeArrayField("includedNamespaces", this.includedNamespaces,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("excludedNamespaces", this.excludedNamespaces,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("includedResourceTypes", this.includedResourceTypes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("excludedResourceTypes", this.excludedResourceTypes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("labelSelectors", this.labelSelectors,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("persistentVolumeRestoreMode",
            this.persistentVolumeRestoreMode == null ? null : this.persistentVolumeRestoreMode.toString());
        jsonWriter.writeStringField("conflictPolicy",
            this.conflictPolicy == null ? null : this.conflictPolicy.toString());
        jsonWriter.writeMapField("namespaceMappings", this.namespaceMappings,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("restoreHookReferences", this.restoreHookReferences,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("stagingResourceGroupId", this.stagingResourceGroupId);
        jsonWriter.writeStringField("stagingStorageAccountId", this.stagingStorageAccountId);
        jsonWriter.writeJsonField("resourceModifierReference", this.resourceModifierReference);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KubernetesClusterVaultTierRestoreCriteria from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KubernetesClusterVaultTierRestoreCriteria if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the KubernetesClusterVaultTierRestoreCriteria.
     */
    public static KubernetesClusterVaultTierRestoreCriteria fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KubernetesClusterVaultTierRestoreCriteria deserializedKubernetesClusterVaultTierRestoreCriteria
                = new KubernetesClusterVaultTierRestoreCriteria();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("includeClusterScopeResources".equals(fieldName)) {
                    deserializedKubernetesClusterVaultTierRestoreCriteria.includeClusterScopeResources
                        = reader.getBoolean();
                } else if ("objectType".equals(fieldName)) {
                    deserializedKubernetesClusterVaultTierRestoreCriteria.objectType = reader.getString();
                } else if ("includedNamespaces".equals(fieldName)) {
                    List<String> includedNamespaces = reader.readArray(reader1 -> reader1.getString());
                    deserializedKubernetesClusterVaultTierRestoreCriteria.includedNamespaces = includedNamespaces;
                } else if ("excludedNamespaces".equals(fieldName)) {
                    List<String> excludedNamespaces = reader.readArray(reader1 -> reader1.getString());
                    deserializedKubernetesClusterVaultTierRestoreCriteria.excludedNamespaces = excludedNamespaces;
                } else if ("includedResourceTypes".equals(fieldName)) {
                    List<String> includedResourceTypes = reader.readArray(reader1 -> reader1.getString());
                    deserializedKubernetesClusterVaultTierRestoreCriteria.includedResourceTypes = includedResourceTypes;
                } else if ("excludedResourceTypes".equals(fieldName)) {
                    List<String> excludedResourceTypes = reader.readArray(reader1 -> reader1.getString());
                    deserializedKubernetesClusterVaultTierRestoreCriteria.excludedResourceTypes = excludedResourceTypes;
                } else if ("labelSelectors".equals(fieldName)) {
                    List<String> labelSelectors = reader.readArray(reader1 -> reader1.getString());
                    deserializedKubernetesClusterVaultTierRestoreCriteria.labelSelectors = labelSelectors;
                } else if ("persistentVolumeRestoreMode".equals(fieldName)) {
                    deserializedKubernetesClusterVaultTierRestoreCriteria.persistentVolumeRestoreMode
                        = PersistentVolumeRestoreMode.fromString(reader.getString());
                } else if ("conflictPolicy".equals(fieldName)) {
                    deserializedKubernetesClusterVaultTierRestoreCriteria.conflictPolicy
                        = ExistingResourcePolicy.fromString(reader.getString());
                } else if ("namespaceMappings".equals(fieldName)) {
                    Map<String, String> namespaceMappings = reader.readMap(reader1 -> reader1.getString());
                    deserializedKubernetesClusterVaultTierRestoreCriteria.namespaceMappings = namespaceMappings;
                } else if ("restoreHookReferences".equals(fieldName)) {
                    List<NamespacedNameResource> restoreHookReferences
                        = reader.readArray(reader1 -> NamespacedNameResource.fromJson(reader1));
                    deserializedKubernetesClusterVaultTierRestoreCriteria.restoreHookReferences = restoreHookReferences;
                } else if ("stagingResourceGroupId".equals(fieldName)) {
                    deserializedKubernetesClusterVaultTierRestoreCriteria.stagingResourceGroupId = reader.getString();
                } else if ("stagingStorageAccountId".equals(fieldName)) {
                    deserializedKubernetesClusterVaultTierRestoreCriteria.stagingStorageAccountId = reader.getString();
                } else if ("resourceModifierReference".equals(fieldName)) {
                    deserializedKubernetesClusterVaultTierRestoreCriteria.resourceModifierReference
                        = NamespacedNameResource.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKubernetesClusterVaultTierRestoreCriteria;
        });
    }
}
