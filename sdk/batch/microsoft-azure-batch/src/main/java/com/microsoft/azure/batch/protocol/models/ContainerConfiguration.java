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
 * The configuration for container-enabled Pools.
 */
public class ContainerConfiguration {
    /**
     * The container technology to be used.
     * Possible values include: 'dockerCompatible', 'criCompatible'.
     */
    @JsonProperty(value = "type", required = true)
    private ContainerType type;

    /**
     * The collection of container Image names.
     * This is the full Image reference, as would be specified to "docker
     * pull". An Image will be sourced from the default Docker registry unless
     * the Image is fully qualified with an alternative registry.
     */
    @JsonProperty(value = "containerImageNames")
    private List<String> containerImageNames;

    /**
     * Additional private registries from which containers can be pulled.
     * If any Images must be downloaded from a private registry which requires
     * credentials, then those credentials must be provided here.
     */
    @JsonProperty(value = "containerRegistries")
    private List<ContainerRegistry> containerRegistries;

    /**
     * Get possible values include: 'dockerCompatible', 'criCompatible'.
     *
     * @return the type value
     */
    public ContainerType type() {
        return this.type;
    }

    /**
     * Set possible values include: 'dockerCompatible', 'criCompatible'.
     *
     * @param type the type value to set
     * @return the ContainerConfiguration object itself.
     */
    public ContainerConfiguration withType(ContainerType type) {
        this.type = type;
        return this;
    }

    /**
     * Get this is the full Image reference, as would be specified to "docker pull". An Image will be sourced from the default Docker registry unless the Image is fully qualified with an alternative registry.
     *
     * @return the containerImageNames value
     */
    public List<String> containerImageNames() {
        return this.containerImageNames;
    }

    /**
     * Set this is the full Image reference, as would be specified to "docker pull". An Image will be sourced from the default Docker registry unless the Image is fully qualified with an alternative registry.
     *
     * @param containerImageNames the containerImageNames value to set
     * @return the ContainerConfiguration object itself.
     */
    public ContainerConfiguration withContainerImageNames(List<String> containerImageNames) {
        this.containerImageNames = containerImageNames;
        return this;
    }

    /**
     * Get if any Images must be downloaded from a private registry which requires credentials, then those credentials must be provided here.
     *
     * @return the containerRegistries value
     */
    public List<ContainerRegistry> containerRegistries() {
        return this.containerRegistries;
    }

    /**
     * Set if any Images must be downloaded from a private registry which requires credentials, then those credentials must be provided here.
     *
     * @param containerRegistries the containerRegistries value to set
     * @return the ContainerConfiguration object itself.
     */
    public ContainerConfiguration withContainerRegistries(List<ContainerRegistry> containerRegistries) {
        this.containerRegistries = containerRegistries;
        return this;
    }

}
