// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.resourcemanager.avs.fluent.models.ScriptPackageInner;
import com.azure.resourcemanager.avs.models.ScriptPackage;

public final class ScriptPackageImpl implements ScriptPackage {
    private ScriptPackageInner innerObject;

    private final com.azure.resourcemanager.avs.AvsManager serviceManager;

    ScriptPackageImpl(ScriptPackageInner innerObject, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String version() {
        return this.innerModel().version();
    }

    public String company() {
        return this.innerModel().company();
    }

    public String uri() {
        return this.innerModel().uri();
    }

    public ScriptPackageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.avs.AvsManager manager() {
        return this.serviceManager;
    }
}
