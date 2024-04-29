// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

/**
 * Samples for FirewallRules ListByServer.
 */
public final class FirewallRulesListByServerSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/Firewall/preview/2023-06-01-preview/examples/FirewallRulesListByServer.json
     */
    /**
     * Sample code: List all firewall rules in a server.
     * 
     * @param manager Entry point to MySqlManager.
     */
    public static void
        listAllFirewallRulesInAServer(com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager.firewallRules().listByServer("TestGroup", "testserver", com.azure.core.util.Context.NONE);
    }
}
