// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.DateTimeRfc1123;
import java.time.OffsetDateTime;

/**
 * The FileSystemsCreateHeaders model.
 */
@Fluent
public final class FileSystemsCreateHeaders {
    /*
     * The x-ms-namespace-enabled property.
     */
    private String xMsNamespaceEnabled;

    /*
     * The x-ms-version property.
     */
    private String xMsVersion;

    /*
     * The ETag property.
     */
    private String eTag;

    /*
     * The Last-Modified property.
     */
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-request-id property.
     */
    private String xMsRequestId;

    /*
     * The Date property.
     */
    private DateTimeRfc1123 date;

    private static final HttpHeaderName X_MS_NAMESPACE_ENABLED = HttpHeaderName.fromString("x-ms-namespace-enabled");

    private static final HttpHeaderName X_MS_VERSION = HttpHeaderName.fromString("x-ms-version");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of FileSystemsCreateHeaders class.
     * 
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public FileSystemsCreateHeaders(HttpHeaders rawHeaders) {
        this.xMsNamespaceEnabled = rawHeaders.getValue(X_MS_NAMESPACE_ENABLED);
        this.xMsVersion = rawHeaders.getValue(X_MS_VERSION);
        this.eTag = rawHeaders.getValue(HttpHeaderName.ETAG);
        String lastModified = rawHeaders.getValue(HttpHeaderName.LAST_MODIFIED);
        if (lastModified != null) {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        this.xMsRequestId = rawHeaders.getValue(HttpHeaderName.X_MS_REQUEST_ID);
        String date = rawHeaders.getValue(HttpHeaderName.DATE);
        if (date != null) {
            this.date = new DateTimeRfc1123(date);
        }
    }

    /**
     * Get the xMsNamespaceEnabled property: The x-ms-namespace-enabled property.
     * 
     * @return the xMsNamespaceEnabled value.
     */
    public String getXMsNamespaceEnabled() {
        return this.xMsNamespaceEnabled;
    }

    /**
     * Set the xMsNamespaceEnabled property: The x-ms-namespace-enabled property.
     * 
     * @param xMsNamespaceEnabled the xMsNamespaceEnabled value to set.
     * @return the FileSystemsCreateHeaders object itself.
     */
    public FileSystemsCreateHeaders setXMsNamespaceEnabled(String xMsNamespaceEnabled) {
        this.xMsNamespaceEnabled = xMsNamespaceEnabled;
        return this;
    }

    /**
     * Get the xMsVersion property: The x-ms-version property.
     * 
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     * 
     * @param xMsVersion the xMsVersion value to set.
     * @return the FileSystemsCreateHeaders object itself.
     */
    public FileSystemsCreateHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     * 
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     * 
     * @param eTag the eTag value to set.
     * @return the FileSystemsCreateHeaders object itself.
     */
    public FileSystemsCreateHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified property: The Last-Modified property.
     * 
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     * 
     * @param lastModified the lastModified value to set.
     * @return the FileSystemsCreateHeaders object itself.
     */
    public FileSystemsCreateHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     * 
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     * 
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the FileSystemsCreateHeaders object itself.
     */
    public FileSystemsCreateHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the date property: The Date property.
     * 
     * @return the date value.
     */
    public OffsetDateTime getDate() {
        if (this.date == null) {
            return null;
        }
        return this.date.getDateTime();
    }

    /**
     * Set the date property: The Date property.
     * 
     * @param date the date value to set.
     * @return the FileSystemsCreateHeaders object itself.
     */
    public FileSystemsCreateHeaders setDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }
}
