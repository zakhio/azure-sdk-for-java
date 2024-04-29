// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.MySqlManagementClient;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.AdvancedThreatProtectionSettingsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.AzureADAdministratorsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.BackupAndExportsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.BackupsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.CheckNameAvailabilitiesImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.CheckNameAvailabilityWithoutLocationsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.CheckVirtualNetworkSubnetUsagesImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.ConfigurationsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.DatabasesImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.FirewallRulesImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.GetPrivateDnsZoneSuffixesImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.LocationBasedCapabilitiesImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.LocationBasedCapabilitySetsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.LogFilesImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.LongRunningBackupsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.LongRunningBackupsOperationsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.MaintenancesImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.MySqlManagementClientBuilder;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.OperationProgressImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.OperationResultsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.OperationsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.ReplicasImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.ServersImpl;
import com.azure.resourcemanager.mysqlflexibleserver.implementation.ServersMigrationsImpl;
import com.azure.resourcemanager.mysqlflexibleserver.models.AdvancedThreatProtectionSettings;
import com.azure.resourcemanager.mysqlflexibleserver.models.AzureADAdministrators;
import com.azure.resourcemanager.mysqlflexibleserver.models.BackupAndExports;
import com.azure.resourcemanager.mysqlflexibleserver.models.Backups;
import com.azure.resourcemanager.mysqlflexibleserver.models.CheckNameAvailabilities;
import com.azure.resourcemanager.mysqlflexibleserver.models.CheckNameAvailabilityWithoutLocations;
import com.azure.resourcemanager.mysqlflexibleserver.models.CheckVirtualNetworkSubnetUsages;
import com.azure.resourcemanager.mysqlflexibleserver.models.Configurations;
import com.azure.resourcemanager.mysqlflexibleserver.models.Databases;
import com.azure.resourcemanager.mysqlflexibleserver.models.FirewallRules;
import com.azure.resourcemanager.mysqlflexibleserver.models.GetPrivateDnsZoneSuffixes;
import com.azure.resourcemanager.mysqlflexibleserver.models.LocationBasedCapabilities;
import com.azure.resourcemanager.mysqlflexibleserver.models.LocationBasedCapabilitySets;
import com.azure.resourcemanager.mysqlflexibleserver.models.LogFiles;
import com.azure.resourcemanager.mysqlflexibleserver.models.LongRunningBackups;
import com.azure.resourcemanager.mysqlflexibleserver.models.LongRunningBackupsOperations;
import com.azure.resourcemanager.mysqlflexibleserver.models.Maintenances;
import com.azure.resourcemanager.mysqlflexibleserver.models.OperationProgress;
import com.azure.resourcemanager.mysqlflexibleserver.models.OperationResults;
import com.azure.resourcemanager.mysqlflexibleserver.models.Operations;
import com.azure.resourcemanager.mysqlflexibleserver.models.Replicas;
import com.azure.resourcemanager.mysqlflexibleserver.models.Servers;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServersMigrations;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to MySqlManager.
 * The Microsoft Azure management API provides create, read, update, and delete functionality for Azure MySQL resources
 * including servers, databases, firewall rules, VNET rules, log files and configurations with new business model.
 */
public final class MySqlManager {
    private AzureADAdministrators azureADAdministrators;

    private Backups backups;

    private BackupAndExports backupAndExports;

    private LongRunningBackups longRunningBackups;

    private LongRunningBackupsOperations longRunningBackupsOperations;

    private Configurations configurations;

    private Databases databases;

    private FirewallRules firewallRules;

    private Servers servers;

    private Replicas replicas;

    private ServersMigrations serversMigrations;

    private AdvancedThreatProtectionSettings advancedThreatProtectionSettings;

    private LogFiles logFiles;

    private LocationBasedCapabilities locationBasedCapabilities;

    private LocationBasedCapabilitySets locationBasedCapabilitySets;

    private CheckVirtualNetworkSubnetUsages checkVirtualNetworkSubnetUsages;

    private CheckNameAvailabilities checkNameAvailabilities;

    private CheckNameAvailabilityWithoutLocations checkNameAvailabilityWithoutLocations;

    private OperationResults operationResults;

    private OperationProgress operationProgress;

    private GetPrivateDnsZoneSuffixes getPrivateDnsZoneSuffixes;

    private Operations operations;

    private Maintenances maintenances;

    private final MySqlManagementClient clientObject;

    private MySqlManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject = new MySqlManagementClientBuilder().pipeline(httpPipeline)
            .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
            .subscriptionId(profile.getSubscriptionId())
            .defaultPollInterval(defaultPollInterval)
            .buildClient();
    }

    /**
     * Creates an instance of MySql service API entry point.
     * 
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the MySql service API instance.
     */
    public static MySqlManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of MySql service API entry point.
     * 
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the MySql service API instance.
     */
    public static MySqlManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new MySqlManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create MySqlManager with optional configuration.
     * 
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new MySqlManager.Configurable();
    }

    /**
     * The Configurable allowing configurations to be set.
     */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private RetryOptions retryOptions;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the retry options for the HTTP pipeline retry policy.
         * <p>
         * This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
         *
         * @param retryOptions the retry options for the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval
                = Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of MySql service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the MySql service API instance.
         */
        public MySqlManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder.append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.mysqlflexibleserver")
                .append("/")
                .append("1.0.0-beta.5");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder.append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                if (retryOptions != null) {
                    retryPolicy = new RetryPolicy(retryOptions);
                } else {
                    retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
                }
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new AddHeadersFromContextPolicy());
            policies.add(new RequestIdPolicy());
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline = new HttpPipelineBuilder().httpClient(httpClient)
                .policies(policies.toArray(new HttpPipelinePolicy[0]))
                .build();
            return new MySqlManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of AzureADAdministrators. It manages AzureADAdministrator.
     * 
     * @return Resource collection API of AzureADAdministrators.
     */
    public AzureADAdministrators azureADAdministrators() {
        if (this.azureADAdministrators == null) {
            this.azureADAdministrators = new AzureADAdministratorsImpl(clientObject.getAzureADAdministrators(), this);
        }
        return azureADAdministrators;
    }

    /**
     * Gets the resource collection API of Backups.
     * 
     * @return Resource collection API of Backups.
     */
    public Backups backups() {
        if (this.backups == null) {
            this.backups = new BackupsImpl(clientObject.getBackups(), this);
        }
        return backups;
    }

    /**
     * Gets the resource collection API of BackupAndExports.
     * 
     * @return Resource collection API of BackupAndExports.
     */
    public BackupAndExports backupAndExports() {
        if (this.backupAndExports == null) {
            this.backupAndExports = new BackupAndExportsImpl(clientObject.getBackupAndExports(), this);
        }
        return backupAndExports;
    }

    /**
     * Gets the resource collection API of LongRunningBackups. It manages ServerBackupV2.
     * 
     * @return Resource collection API of LongRunningBackups.
     */
    public LongRunningBackups longRunningBackups() {
        if (this.longRunningBackups == null) {
            this.longRunningBackups = new LongRunningBackupsImpl(clientObject.getLongRunningBackups(), this);
        }
        return longRunningBackups;
    }

    /**
     * Gets the resource collection API of LongRunningBackupsOperations.
     * 
     * @return Resource collection API of LongRunningBackupsOperations.
     */
    public LongRunningBackupsOperations longRunningBackupsOperations() {
        if (this.longRunningBackupsOperations == null) {
            this.longRunningBackupsOperations
                = new LongRunningBackupsOperationsImpl(clientObject.getLongRunningBackupsOperations(), this);
        }
        return longRunningBackupsOperations;
    }

    /**
     * Gets the resource collection API of Configurations. It manages Configuration.
     * 
     * @return Resource collection API of Configurations.
     */
    public Configurations configurations() {
        if (this.configurations == null) {
            this.configurations = new ConfigurationsImpl(clientObject.getConfigurations(), this);
        }
        return configurations;
    }

    /**
     * Gets the resource collection API of Databases. It manages Database.
     * 
     * @return Resource collection API of Databases.
     */
    public Databases databases() {
        if (this.databases == null) {
            this.databases = new DatabasesImpl(clientObject.getDatabases(), this);
        }
        return databases;
    }

    /**
     * Gets the resource collection API of FirewallRules. It manages FirewallRule.
     * 
     * @return Resource collection API of FirewallRules.
     */
    public FirewallRules firewallRules() {
        if (this.firewallRules == null) {
            this.firewallRules = new FirewallRulesImpl(clientObject.getFirewallRules(), this);
        }
        return firewallRules;
    }

    /**
     * Gets the resource collection API of Servers. It manages Server.
     * 
     * @return Resource collection API of Servers.
     */
    public Servers servers() {
        if (this.servers == null) {
            this.servers = new ServersImpl(clientObject.getServers(), this);
        }
        return servers;
    }

    /**
     * Gets the resource collection API of Replicas.
     * 
     * @return Resource collection API of Replicas.
     */
    public Replicas replicas() {
        if (this.replicas == null) {
            this.replicas = new ReplicasImpl(clientObject.getReplicas(), this);
        }
        return replicas;
    }

    /**
     * Gets the resource collection API of ServersMigrations.
     * 
     * @return Resource collection API of ServersMigrations.
     */
    public ServersMigrations serversMigrations() {
        if (this.serversMigrations == null) {
            this.serversMigrations = new ServersMigrationsImpl(clientObject.getServersMigrations(), this);
        }
        return serversMigrations;
    }

    /**
     * Gets the resource collection API of AdvancedThreatProtectionSettings.
     * 
     * @return Resource collection API of AdvancedThreatProtectionSettings.
     */
    public AdvancedThreatProtectionSettings advancedThreatProtectionSettings() {
        if (this.advancedThreatProtectionSettings == null) {
            this.advancedThreatProtectionSettings
                = new AdvancedThreatProtectionSettingsImpl(clientObject.getAdvancedThreatProtectionSettings(), this);
        }
        return advancedThreatProtectionSettings;
    }

    /**
     * Gets the resource collection API of LogFiles.
     * 
     * @return Resource collection API of LogFiles.
     */
    public LogFiles logFiles() {
        if (this.logFiles == null) {
            this.logFiles = new LogFilesImpl(clientObject.getLogFiles(), this);
        }
        return logFiles;
    }

    /**
     * Gets the resource collection API of LocationBasedCapabilities.
     * 
     * @return Resource collection API of LocationBasedCapabilities.
     */
    public LocationBasedCapabilities locationBasedCapabilities() {
        if (this.locationBasedCapabilities == null) {
            this.locationBasedCapabilities
                = new LocationBasedCapabilitiesImpl(clientObject.getLocationBasedCapabilities(), this);
        }
        return locationBasedCapabilities;
    }

    /**
     * Gets the resource collection API of LocationBasedCapabilitySets.
     * 
     * @return Resource collection API of LocationBasedCapabilitySets.
     */
    public LocationBasedCapabilitySets locationBasedCapabilitySets() {
        if (this.locationBasedCapabilitySets == null) {
            this.locationBasedCapabilitySets
                = new LocationBasedCapabilitySetsImpl(clientObject.getLocationBasedCapabilitySets(), this);
        }
        return locationBasedCapabilitySets;
    }

    /**
     * Gets the resource collection API of CheckVirtualNetworkSubnetUsages.
     * 
     * @return Resource collection API of CheckVirtualNetworkSubnetUsages.
     */
    public CheckVirtualNetworkSubnetUsages checkVirtualNetworkSubnetUsages() {
        if (this.checkVirtualNetworkSubnetUsages == null) {
            this.checkVirtualNetworkSubnetUsages
                = new CheckVirtualNetworkSubnetUsagesImpl(clientObject.getCheckVirtualNetworkSubnetUsages(), this);
        }
        return checkVirtualNetworkSubnetUsages;
    }

    /**
     * Gets the resource collection API of CheckNameAvailabilities.
     * 
     * @return Resource collection API of CheckNameAvailabilities.
     */
    public CheckNameAvailabilities checkNameAvailabilities() {
        if (this.checkNameAvailabilities == null) {
            this.checkNameAvailabilities
                = new CheckNameAvailabilitiesImpl(clientObject.getCheckNameAvailabilities(), this);
        }
        return checkNameAvailabilities;
    }

    /**
     * Gets the resource collection API of CheckNameAvailabilityWithoutLocations.
     * 
     * @return Resource collection API of CheckNameAvailabilityWithoutLocations.
     */
    public CheckNameAvailabilityWithoutLocations checkNameAvailabilityWithoutLocations() {
        if (this.checkNameAvailabilityWithoutLocations == null) {
            this.checkNameAvailabilityWithoutLocations = new CheckNameAvailabilityWithoutLocationsImpl(
                clientObject.getCheckNameAvailabilityWithoutLocations(), this);
        }
        return checkNameAvailabilityWithoutLocations;
    }

    /**
     * Gets the resource collection API of OperationResults.
     * 
     * @return Resource collection API of OperationResults.
     */
    public OperationResults operationResults() {
        if (this.operationResults == null) {
            this.operationResults = new OperationResultsImpl(clientObject.getOperationResults(), this);
        }
        return operationResults;
    }

    /**
     * Gets the resource collection API of OperationProgress.
     * 
     * @return Resource collection API of OperationProgress.
     */
    public OperationProgress operationProgress() {
        if (this.operationProgress == null) {
            this.operationProgress = new OperationProgressImpl(clientObject.getOperationProgress(), this);
        }
        return operationProgress;
    }

    /**
     * Gets the resource collection API of GetPrivateDnsZoneSuffixes.
     * 
     * @return Resource collection API of GetPrivateDnsZoneSuffixes.
     */
    public GetPrivateDnsZoneSuffixes getPrivateDnsZoneSuffixes() {
        if (this.getPrivateDnsZoneSuffixes == null) {
            this.getPrivateDnsZoneSuffixes
                = new GetPrivateDnsZoneSuffixesImpl(clientObject.getGetPrivateDnsZoneSuffixes(), this);
        }
        return getPrivateDnsZoneSuffixes;
    }

    /**
     * Gets the resource collection API of Operations.
     * 
     * @return Resource collection API of Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * Gets the resource collection API of Maintenances.
     * 
     * @return Resource collection API of Maintenances.
     */
    public Maintenances maintenances() {
        if (this.maintenances == null) {
            this.maintenances = new MaintenancesImpl(clientObject.getMaintenances(), this);
        }
        return maintenances;
    }

    /**
     * Gets wrapped service client MySqlManagementClient providing direct access to the underlying auto-generated API
     * implementation, based on Azure REST API.
     * 
     * @return Wrapped service client MySqlManagementClient.
     */
    public MySqlManagementClient serviceClient() {
        return this.clientObject;
    }
}
