// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.billing.models.Amount;
import com.azure.resourcemanager.billing.models.AutoRenew;
import com.azure.resourcemanager.billing.models.BillingFrequency;
import com.azure.resourcemanager.billing.models.ProductStatusType;
import com.azure.resourcemanager.billing.models.Reseller;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A product. */
@Fluent
public final class ProductInner extends ProxyResource {
    /*
     * The properties of a product.
     */
    @JsonProperty(value = "properties")
    private ProductProperties innerProperties;

    /** Creates an instance of ProductInner class. */
    public ProductInner() {
    }

    /**
     * Get the innerProperties property: The properties of a product.
     *
     * @return the innerProperties value.
     */
    private ProductProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the autoRenew property: Indicates whether auto renewal is turned on or off for a product.
     *
     * @return the autoRenew value.
     */
    public AutoRenew autoRenew() {
        return this.innerProperties() == null ? null : this.innerProperties().autoRenew();
    }

    /**
     * Set the autoRenew property: Indicates whether auto renewal is turned on or off for a product.
     *
     * @param autoRenew the autoRenew value to set.
     * @return the ProductInner object itself.
     */
    public ProductInner withAutoRenew(AutoRenew autoRenew) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProductProperties();
        }
        this.innerProperties().withAutoRenew(autoRenew);
        return this;
    }

    /**
     * Get the displayName property: The display name of the product.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Get the purchaseDate property: The date when the product was purchased.
     *
     * @return the purchaseDate value.
     */
    public OffsetDateTime purchaseDate() {
        return this.innerProperties() == null ? null : this.innerProperties().purchaseDate();
    }

    /**
     * Get the productTypeId property: The ID of the type of product.
     *
     * @return the productTypeId value.
     */
    public String productTypeId() {
        return this.innerProperties() == null ? null : this.innerProperties().productTypeId();
    }

    /**
     * Get the productType property: The description of the type of product.
     *
     * @return the productType value.
     */
    public String productType() {
        return this.innerProperties() == null ? null : this.innerProperties().productType();
    }

    /**
     * Get the status property: The current status of the product.
     *
     * @return the status value.
     */
    public ProductStatusType status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: The current status of the product.
     *
     * @param status the status value to set.
     * @return the ProductInner object itself.
     */
    public ProductInner withStatus(ProductStatusType status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProductProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the endDate property: The date when the product will be renewed or canceled.
     *
     * @return the endDate value.
     */
    public OffsetDateTime endDate() {
        return this.innerProperties() == null ? null : this.innerProperties().endDate();
    }

    /**
     * Get the billingFrequency property: The frequency at which the product will be billed.
     *
     * @return the billingFrequency value.
     */
    public BillingFrequency billingFrequency() {
        return this.innerProperties() == null ? null : this.innerProperties().billingFrequency();
    }

    /**
     * Set the billingFrequency property: The frequency at which the product will be billed.
     *
     * @param billingFrequency the billingFrequency value to set.
     * @return the ProductInner object itself.
     */
    public ProductInner withBillingFrequency(BillingFrequency billingFrequency) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProductProperties();
        }
        this.innerProperties().withBillingFrequency(billingFrequency);
        return this;
    }

    /**
     * Get the lastCharge property: The last month charges.
     *
     * @return the lastCharge value.
     */
    public Amount lastCharge() {
        return this.innerProperties() == null ? null : this.innerProperties().lastCharge();
    }

    /**
     * Get the lastChargeDate property: The date of the last charge.
     *
     * @return the lastChargeDate value.
     */
    public OffsetDateTime lastChargeDate() {
        return this.innerProperties() == null ? null : this.innerProperties().lastChargeDate();
    }

    /**
     * Get the quantity property: The quantity purchased for the product.
     *
     * @return the quantity value.
     */
    public Float quantity() {
        return this.innerProperties() == null ? null : this.innerProperties().quantity();
    }

    /**
     * Get the skuId property: The sku ID of the product.
     *
     * @return the skuId value.
     */
    public String skuId() {
        return this.innerProperties() == null ? null : this.innerProperties().skuId();
    }

    /**
     * Get the skuDescription property: The sku description of the product.
     *
     * @return the skuDescription value.
     */
    public String skuDescription() {
        return this.innerProperties() == null ? null : this.innerProperties().skuDescription();
    }

    /**
     * Get the tenantId property: The id of the tenant in which the product is used.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Get the availabilityId property: The availability of the product.
     *
     * @return the availabilityId value.
     */
    public String availabilityId() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilityId();
    }

    /**
     * Get the invoiceSectionId property: The ID of the invoice section to which the product is billed.
     *
     * @return the invoiceSectionId value.
     */
    public String invoiceSectionId() {
        return this.innerProperties() == null ? null : this.innerProperties().invoiceSectionId();
    }

    /**
     * Get the invoiceSectionDisplayName property: The name of the invoice section to which the product is billed.
     *
     * @return the invoiceSectionDisplayName value.
     */
    public String invoiceSectionDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().invoiceSectionDisplayName();
    }

    /**
     * Get the billingProfileId property: The ID of the billing profile to which the product is billed.
     *
     * @return the billingProfileId value.
     */
    public String billingProfileId() {
        return this.innerProperties() == null ? null : this.innerProperties().billingProfileId();
    }

    /**
     * Get the billingProfileDisplayName property: The name of the billing profile to which the product is billed.
     *
     * @return the billingProfileDisplayName value.
     */
    public String billingProfileDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().billingProfileDisplayName();
    }

    /**
     * Get the customerId property: The ID of the customer for whom the product was purchased. The field is applicable
     * only for Microsoft Partner Agreement billing account.
     *
     * @return the customerId value.
     */
    public String customerId() {
        return this.innerProperties() == null ? null : this.innerProperties().customerId();
    }

    /**
     * Get the customerDisplayName property: The name of the customer for whom the product was purchased. The field is
     * applicable only for Microsoft Partner Agreement billing account.
     *
     * @return the customerDisplayName value.
     */
    public String customerDisplayName() {
        return this.innerProperties() == null ? null : this.innerProperties().customerDisplayName();
    }

    /**
     * Get the reseller property: Reseller for this product.
     *
     * @return the reseller value.
     */
    public Reseller reseller() {
        return this.innerProperties() == null ? null : this.innerProperties().reseller();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
