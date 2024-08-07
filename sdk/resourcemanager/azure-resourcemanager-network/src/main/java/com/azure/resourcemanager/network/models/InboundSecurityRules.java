// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of the Inbound Security Rules resource.
 */
@Fluent
public final class InboundSecurityRules {
    /*
     * Name of the rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Protocol. This should be either TCP or UDP.
     */
    @JsonProperty(value = "protocol")
    private InboundSecurityRulesProtocol protocol;

    /*
     * The CIDR or source IP range.
     */
    @JsonProperty(value = "sourceAddressPrefix")
    private String sourceAddressPrefix;

    /*
     * NVA port ranges to be opened up. One needs to provide specific ports.
     */
    @JsonProperty(value = "destinationPortRange")
    private Integer destinationPortRange;

    /*
     * NVA port ranges to be opened up. One can provide a range of ports. Allowed port value between 0 and 65535.
     */
    @JsonProperty(value = "destinationPortRanges")
    private List<String> destinationPortRanges;

    /*
     * Public IP name in case of Permanent Rule type & Interface Name in case of Auto Expire Rule type
     */
    @JsonProperty(value = "appliesOn")
    private List<String> appliesOn;

    /**
     * Creates an instance of InboundSecurityRules class.
     */
    public InboundSecurityRules() {
    }

    /**
     * Get the name property: Name of the rule.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the rule.
     * 
     * @param name the name value to set.
     * @return the InboundSecurityRules object itself.
     */
    public InboundSecurityRules withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the protocol property: Protocol. This should be either TCP or UDP.
     * 
     * @return the protocol value.
     */
    public InboundSecurityRulesProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol. This should be either TCP or UDP.
     * 
     * @param protocol the protocol value to set.
     * @return the InboundSecurityRules object itself.
     */
    public InboundSecurityRules withProtocol(InboundSecurityRulesProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the sourceAddressPrefix property: The CIDR or source IP range.
     * 
     * @return the sourceAddressPrefix value.
     */
    public String sourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }

    /**
     * Set the sourceAddressPrefix property: The CIDR or source IP range.
     * 
     * @param sourceAddressPrefix the sourceAddressPrefix value to set.
     * @return the InboundSecurityRules object itself.
     */
    public InboundSecurityRules withSourceAddressPrefix(String sourceAddressPrefix) {
        this.sourceAddressPrefix = sourceAddressPrefix;
        return this;
    }

    /**
     * Get the destinationPortRange property: NVA port ranges to be opened up. One needs to provide specific ports.
     * 
     * @return the destinationPortRange value.
     */
    public Integer destinationPortRange() {
        return this.destinationPortRange;
    }

    /**
     * Set the destinationPortRange property: NVA port ranges to be opened up. One needs to provide specific ports.
     * 
     * @param destinationPortRange the destinationPortRange value to set.
     * @return the InboundSecurityRules object itself.
     */
    public InboundSecurityRules withDestinationPortRange(Integer destinationPortRange) {
        this.destinationPortRange = destinationPortRange;
        return this;
    }

    /**
     * Get the destinationPortRanges property: NVA port ranges to be opened up. One can provide a range of ports.
     * Allowed port value between 0 and 65535.
     * 
     * @return the destinationPortRanges value.
     */
    public List<String> destinationPortRanges() {
        return this.destinationPortRanges;
    }

    /**
     * Set the destinationPortRanges property: NVA port ranges to be opened up. One can provide a range of ports.
     * Allowed port value between 0 and 65535.
     * 
     * @param destinationPortRanges the destinationPortRanges value to set.
     * @return the InboundSecurityRules object itself.
     */
    public InboundSecurityRules withDestinationPortRanges(List<String> destinationPortRanges) {
        this.destinationPortRanges = destinationPortRanges;
        return this;
    }

    /**
     * Get the appliesOn property: Public IP name in case of Permanent Rule type &amp; Interface Name in case of Auto
     * Expire Rule type.
     * 
     * @return the appliesOn value.
     */
    public List<String> appliesOn() {
        return this.appliesOn;
    }

    /**
     * Set the appliesOn property: Public IP name in case of Permanent Rule type &amp; Interface Name in case of Auto
     * Expire Rule type.
     * 
     * @param appliesOn the appliesOn value to set.
     * @return the InboundSecurityRules object itself.
     */
    public InboundSecurityRules withAppliesOn(List<String> appliesOn) {
        this.appliesOn = appliesOn;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
