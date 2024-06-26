/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The disk encryption configuration applied on compute nodes in the pool. Disk
 * encryption configuration is not supported on Linux pool created with Azure
 * Compute Gallery Image.
 */
public class DiskEncryptionConfiguration {
    /**
     * The list of disk targets Batch Service will encrypt on the compute node.
     * If omitted, no disks on the compute nodes in the pool will be encrypted.
     * On Linux pool, only "TemporaryDisk" is supported; on Windows pool,
     * "OsDisk" and "TemporaryDisk" must be specified.
     */
    @JsonProperty(value = "targets")
    private List<DiskEncryptionTarget> targets;

    /**
     * Get if omitted, no disks on the compute nodes in the pool will be encrypted. On Linux pool, only "TemporaryDisk" is supported; on Windows pool, "OsDisk" and "TemporaryDisk" must be specified.
     *
     * @return the targets value
     */
    public List<DiskEncryptionTarget> targets() {
        return this.targets;
    }

    /**
     * Set if omitted, no disks on the compute nodes in the pool will be encrypted. On Linux pool, only "TemporaryDisk" is supported; on Windows pool, "OsDisk" and "TemporaryDisk" must be specified.
     *
     * @param targets the targets value to set
     * @return the DiskEncryptionConfiguration object itself.
     */
    public DiskEncryptionConfiguration withTargets(List<DiskEncryptionTarget> targets) {
        this.targets = targets;
        return this;
    }

}
