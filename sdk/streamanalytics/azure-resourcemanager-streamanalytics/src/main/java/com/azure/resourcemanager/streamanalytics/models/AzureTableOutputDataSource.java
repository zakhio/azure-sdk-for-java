// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.streamanalytics.fluent.models.AzureTableOutputDataSourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Describes an Azure Table output data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Microsoft.Storage/Table")
@Fluent
public final class AzureTableOutputDataSource extends OutputDataSource {
    /*
     * The properties that are associated with an Azure Table output. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties")
    private AzureTableOutputDataSourceProperties innerProperties;

    /**
     * Creates an instance of AzureTableOutputDataSource class.
     */
    public AzureTableOutputDataSource() {
    }

    /**
     * Get the innerProperties property: The properties that are associated with an Azure Table output. Required on PUT
     * (CreateOrReplace) requests.
     * 
     * @return the innerProperties value.
     */
    private AzureTableOutputDataSourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the accountName property: The name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the accountName value.
     */
    public String accountName() {
        return this.innerProperties() == null ? null : this.innerProperties().accountName();
    }

    /**
     * Set the accountName property: The name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
     * @param accountName the accountName value to set.
     * @return the AzureTableOutputDataSource object itself.
     */
    public AzureTableOutputDataSource withAccountName(String accountName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureTableOutputDataSourceProperties();
        }
        this.innerProperties().withAccountName(accountName);
        return this;
    }

    /**
     * Get the accountKey property: The account key for the Azure Storage account. Required on PUT (CreateOrReplace)
     * requests.
     * 
     * @return the accountKey value.
     */
    public String accountKey() {
        return this.innerProperties() == null ? null : this.innerProperties().accountKey();
    }

    /**
     * Set the accountKey property: The account key for the Azure Storage account. Required on PUT (CreateOrReplace)
     * requests.
     * 
     * @param accountKey the accountKey value to set.
     * @return the AzureTableOutputDataSource object itself.
     */
    public AzureTableOutputDataSource withAccountKey(String accountKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureTableOutputDataSourceProperties();
        }
        this.innerProperties().withAccountKey(accountKey);
        return this;
    }

    /**
     * Get the table property: The name of the Azure Table. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the table value.
     */
    public String table() {
        return this.innerProperties() == null ? null : this.innerProperties().table();
    }

    /**
     * Set the table property: The name of the Azure Table. Required on PUT (CreateOrReplace) requests.
     * 
     * @param table the table value to set.
     * @return the AzureTableOutputDataSource object itself.
     */
    public AzureTableOutputDataSource withTable(String table) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureTableOutputDataSourceProperties();
        }
        this.innerProperties().withTable(table);
        return this;
    }

    /**
     * Get the partitionKey property: This element indicates the name of a column from the SELECT statement in the
     * query that will be used as the partition key for the Azure Table. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the partitionKey value.
     */
    public String partitionKey() {
        return this.innerProperties() == null ? null : this.innerProperties().partitionKey();
    }

    /**
     * Set the partitionKey property: This element indicates the name of a column from the SELECT statement in the
     * query that will be used as the partition key for the Azure Table. Required on PUT (CreateOrReplace) requests.
     * 
     * @param partitionKey the partitionKey value to set.
     * @return the AzureTableOutputDataSource object itself.
     */
    public AzureTableOutputDataSource withPartitionKey(String partitionKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureTableOutputDataSourceProperties();
        }
        this.innerProperties().withPartitionKey(partitionKey);
        return this;
    }

    /**
     * Get the rowKey property: This element indicates the name of a column from the SELECT statement in the query that
     * will be used as the row key for the Azure Table. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the rowKey value.
     */
    public String rowKey() {
        return this.innerProperties() == null ? null : this.innerProperties().rowKey();
    }

    /**
     * Set the rowKey property: This element indicates the name of a column from the SELECT statement in the query that
     * will be used as the row key for the Azure Table. Required on PUT (CreateOrReplace) requests.
     * 
     * @param rowKey the rowKey value to set.
     * @return the AzureTableOutputDataSource object itself.
     */
    public AzureTableOutputDataSource withRowKey(String rowKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureTableOutputDataSourceProperties();
        }
        this.innerProperties().withRowKey(rowKey);
        return this;
    }

    /**
     * Get the columnsToRemove property: If specified, each item in the array is the name of a column to remove (if
     * present) from output event entities.
     * 
     * @return the columnsToRemove value.
     */
    public List<String> columnsToRemove() {
        return this.innerProperties() == null ? null : this.innerProperties().columnsToRemove();
    }

    /**
     * Set the columnsToRemove property: If specified, each item in the array is the name of a column to remove (if
     * present) from output event entities.
     * 
     * @param columnsToRemove the columnsToRemove value to set.
     * @return the AzureTableOutputDataSource object itself.
     */
    public AzureTableOutputDataSource withColumnsToRemove(List<String> columnsToRemove) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureTableOutputDataSourceProperties();
        }
        this.innerProperties().withColumnsToRemove(columnsToRemove);
        return this;
    }

    /**
     * Get the batchSize property: The number of rows to write to the Azure Table at a time.
     * 
     * @return the batchSize value.
     */
    public Integer batchSize() {
        return this.innerProperties() == null ? null : this.innerProperties().batchSize();
    }

    /**
     * Set the batchSize property: The number of rows to write to the Azure Table at a time.
     * 
     * @param batchSize the batchSize value to set.
     * @return the AzureTableOutputDataSource object itself.
     */
    public AzureTableOutputDataSource withBatchSize(Integer batchSize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureTableOutputDataSourceProperties();
        }
        this.innerProperties().withBatchSize(batchSize);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
