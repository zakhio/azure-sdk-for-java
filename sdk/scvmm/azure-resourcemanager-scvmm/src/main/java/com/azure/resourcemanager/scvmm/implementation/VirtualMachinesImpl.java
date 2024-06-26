// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.scvmm.fluent.VirtualMachinesClient;
import com.azure.resourcemanager.scvmm.fluent.models.VirtualMachineInner;
import com.azure.resourcemanager.scvmm.models.StopVirtualMachineOptions;
import com.azure.resourcemanager.scvmm.models.VirtualMachine;
import com.azure.resourcemanager.scvmm.models.VirtualMachineCreateCheckpoint;
import com.azure.resourcemanager.scvmm.models.VirtualMachineDeleteCheckpoint;
import com.azure.resourcemanager.scvmm.models.VirtualMachineRestoreCheckpoint;
import com.azure.resourcemanager.scvmm.models.VirtualMachines;

public final class VirtualMachinesImpl implements VirtualMachines {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachinesImpl.class);

    private final VirtualMachinesClient innerClient;

    private final com.azure.resourcemanager.scvmm.ScvmmManager serviceManager;

    public VirtualMachinesImpl(
        VirtualMachinesClient innerClient, com.azure.resourcemanager.scvmm.ScvmmManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public VirtualMachine getByResourceGroup(String resourceGroupName, String virtualMachineName) {
        VirtualMachineInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, virtualMachineName);
        if (inner != null) {
            return new VirtualMachineImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachine> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualMachineName, Context context) {
        Response<VirtualMachineInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, virtualMachineName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String virtualMachineName, Boolean retain, Boolean force) {
        this.serviceClient().delete(resourceGroupName, virtualMachineName, retain, force);
    }

    public void delete(String resourceGroupName, String virtualMachineName) {
        this.serviceClient().delete(resourceGroupName, virtualMachineName);
    }

    public void delete(
        String resourceGroupName, String virtualMachineName, Boolean retain, Boolean force, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualMachineName, retain, force, context);
    }

    public void stop(String resourceGroupName, String virtualMachineName, StopVirtualMachineOptions body) {
        this.serviceClient().stop(resourceGroupName, virtualMachineName, body);
    }

    public void stop(String resourceGroupName, String virtualMachineName) {
        this.serviceClient().stop(resourceGroupName, virtualMachineName);
    }

    public void stop(
        String resourceGroupName, String virtualMachineName, StopVirtualMachineOptions body, Context context) {
        this.serviceClient().stop(resourceGroupName, virtualMachineName, body, context);
    }

    public void start(String resourceGroupName, String virtualMachineName) {
        this.serviceClient().start(resourceGroupName, virtualMachineName);
    }

    public void start(String resourceGroupName, String virtualMachineName, Context context) {
        this.serviceClient().start(resourceGroupName, virtualMachineName, context);
    }

    public void restart(String resourceGroupName, String virtualMachineName) {
        this.serviceClient().restart(resourceGroupName, virtualMachineName);
    }

    public void restart(String resourceGroupName, String virtualMachineName, Context context) {
        this.serviceClient().restart(resourceGroupName, virtualMachineName, context);
    }

    public void createCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineCreateCheckpoint body) {
        this.serviceClient().createCheckpoint(resourceGroupName, virtualMachineName, body);
    }

    public void createCheckpoint(String resourceGroupName, String virtualMachineName) {
        this.serviceClient().createCheckpoint(resourceGroupName, virtualMachineName);
    }

    public void createCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineCreateCheckpoint body, Context context) {
        this.serviceClient().createCheckpoint(resourceGroupName, virtualMachineName, body, context);
    }

    public void deleteCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineDeleteCheckpoint body) {
        this.serviceClient().deleteCheckpoint(resourceGroupName, virtualMachineName, body);
    }

    public void deleteCheckpoint(String resourceGroupName, String virtualMachineName) {
        this.serviceClient().deleteCheckpoint(resourceGroupName, virtualMachineName);
    }

    public void deleteCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineDeleteCheckpoint body, Context context) {
        this.serviceClient().deleteCheckpoint(resourceGroupName, virtualMachineName, body, context);
    }

    public void restoreCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineRestoreCheckpoint body) {
        this.serviceClient().restoreCheckpoint(resourceGroupName, virtualMachineName, body);
    }

    public void restoreCheckpoint(String resourceGroupName, String virtualMachineName) {
        this.serviceClient().restoreCheckpoint(resourceGroupName, virtualMachineName);
    }

    public void restoreCheckpoint(
        String resourceGroupName, String virtualMachineName, VirtualMachineRestoreCheckpoint body, Context context) {
        this.serviceClient().restoreCheckpoint(resourceGroupName, virtualMachineName, body, context);
    }

    public PagedIterable<VirtualMachine> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VirtualMachineInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachine> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VirtualMachineInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachine> list() {
        PagedIterable<VirtualMachineInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new VirtualMachineImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachine> list(Context context) {
        PagedIterable<VirtualMachineInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineImpl(inner1, this.manager()));
    }

    public VirtualMachine getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualMachineName = Utils.getValueFromIdByName(id, "virtualMachines");
        if (virtualMachineName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, virtualMachineName, Context.NONE).getValue();
    }

    public Response<VirtualMachine> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualMachineName = Utils.getValueFromIdByName(id, "virtualMachines");
        if (virtualMachineName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, virtualMachineName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualMachineName = Utils.getValueFromIdByName(id, "virtualMachines");
        if (virtualMachineName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        Boolean localRetain = null;
        Boolean localForce = null;
        this.delete(resourceGroupName, virtualMachineName, localRetain, localForce, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Boolean retain, Boolean force, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualMachineName = Utils.getValueFromIdByName(id, "virtualMachines");
        if (virtualMachineName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        this.delete(resourceGroupName, virtualMachineName, retain, force, context);
    }

    private VirtualMachinesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.scvmm.ScvmmManager manager() {
        return this.serviceManager;
    }

    public VirtualMachineImpl define(String name) {
        return new VirtualMachineImpl(name, this.manager());
    }
}
