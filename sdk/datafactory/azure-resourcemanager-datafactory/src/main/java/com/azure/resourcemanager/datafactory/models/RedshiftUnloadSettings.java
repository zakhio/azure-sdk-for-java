// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Amazon S3 settings needed for the interim Amazon S3 when copying from Amazon Redshift with unload. With this,
 * data from Amazon Redshift source will be unloaded into S3 first and then copied into the targeted sink from the
 * interim S3.
 */
@Fluent
public final class RedshiftUnloadSettings {
    /*
     * The name of the Amazon S3 linked service which will be used for the unload operation when copying from the Amazon
     * Redshift source.
     */
    @JsonProperty(value = "s3LinkedServiceName", required = true)
    private LinkedServiceReference s3LinkedServiceName;

    /*
     * The bucket of the interim Amazon S3 which will be used to store the unloaded data from Amazon Redshift source.
     * The bucket must be in the same region as the Amazon Redshift source. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "bucketName", required = true)
    private Object bucketName;

    /**
     * Creates an instance of RedshiftUnloadSettings class.
     */
    public RedshiftUnloadSettings() {
    }

    /**
     * Get the s3LinkedServiceName property: The name of the Amazon S3 linked service which will be used for the unload
     * operation when copying from the Amazon Redshift source.
     * 
     * @return the s3LinkedServiceName value.
     */
    public LinkedServiceReference s3LinkedServiceName() {
        return this.s3LinkedServiceName;
    }

    /**
     * Set the s3LinkedServiceName property: The name of the Amazon S3 linked service which will be used for the unload
     * operation when copying from the Amazon Redshift source.
     * 
     * @param s3LinkedServiceName the s3LinkedServiceName value to set.
     * @return the RedshiftUnloadSettings object itself.
     */
    public RedshiftUnloadSettings withS3LinkedServiceName(LinkedServiceReference s3LinkedServiceName) {
        this.s3LinkedServiceName = s3LinkedServiceName;
        return this;
    }

    /**
     * Get the bucketName property: The bucket of the interim Amazon S3 which will be used to store the unloaded data
     * from Amazon Redshift source. The bucket must be in the same region as the Amazon Redshift source. Type: string
     * (or Expression with resultType string).
     * 
     * @return the bucketName value.
     */
    public Object bucketName() {
        return this.bucketName;
    }

    /**
     * Set the bucketName property: The bucket of the interim Amazon S3 which will be used to store the unloaded data
     * from Amazon Redshift source. The bucket must be in the same region as the Amazon Redshift source. Type: string
     * (or Expression with resultType string).
     * 
     * @param bucketName the bucketName value to set.
     * @return the RedshiftUnloadSettings object itself.
     */
    public RedshiftUnloadSettings withBucketName(Object bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (s3LinkedServiceName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property s3LinkedServiceName in model RedshiftUnloadSettings"));
        } else {
            s3LinkedServiceName().validate();
        }
        if (bucketName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property bucketName in model RedshiftUnloadSettings"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RedshiftUnloadSettings.class);
}
