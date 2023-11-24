// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.ProvisionedClusterUpgradeProfileInner;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterPoolUpgradeProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterPoolUpgradeProfileProperties;
import java.util.Arrays;

public final class ProvisionedClusterUpgradeProfileInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProvisionedClusterUpgradeProfileInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"InProgress\",\"controlPlaneProfile\":{\"kubernetesVersion\":\"u\",\"name\":\"uuvmkjozkrwfnd\",\"osType\":\"Windows\",\"upgrades\":[{\"kubernetesVersion\":\"lwejdpv\",\"isPreview\":true},{\"kubernetesVersion\":\"qpsoacctazak\",\"isPreview\":true},{\"kubernetesVersion\":\"hbcryffdfdosyge\",\"isPreview\":true}]},\"agentPoolProfiles\":[{\"kubernetesVersion\":\"akhmsbzjhcrz\",\"name\":\"dphlxaolt\",\"osType\":\"Windows\",\"upgrades\":[{\"kubernetesVersion\":\"jbp\",\"isPreview\":true},{\"kubernetesVersion\":\"inzgvfcj\",\"isPreview\":false},{\"kubernetesVersion\":\"xxjtfe\",\"isPreview\":true}]},{\"kubernetesVersion\":\"fziton\",\"name\":\"qfpjk\",\"osType\":\"Linux\",\"upgrades\":[{\"kubernetesVersion\":\"dvhpfxxypininm\",\"isPreview\":false},{\"kubernetesVersion\":\"ybb\",\"isPreview\":true},{\"kubernetesVersion\":\"epoo\",\"isPreview\":true}]},{\"kubernetesVersion\":\"vamih\",\"name\":\"gnarxzxtheo\",\"osType\":\"Windows\",\"upgrades\":[{\"kubernetesVersion\":\"evcciqihnhun\",\"isPreview\":true},{\"kubernetesVersion\":\"zrnf\",\"isPreview\":true},{\"kubernetesVersion\":\"ispe\",\"isPreview\":true}]},{\"kubernetesVersion\":\"fkufublj\",\"name\":\"xqeofjaeqjhqjba\",\"osType\":\"Linux\",\"upgrades\":[{\"kubernetesVersion\":\"qulngsntnbybkzgc\",\"isPreview\":false},{\"kubernetesVersion\":\"lxxwrljdouskc\",\"isPreview\":true},{\"kubernetesVersion\":\"cr\",\"isPreview\":false}]}]},\"id\":\"wtnhxbnjbiksqr\",\"name\":\"lssai\",\"type\":\"qpjwnzlljfm\"}")
            .toObject(ProvisionedClusterUpgradeProfileInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProvisionedClusterUpgradeProfileInner model = new ProvisionedClusterUpgradeProfileInner()
            .withControlPlaneProfile(new ProvisionedClusterPoolUpgradeProfile()
                .withUpgrades(Arrays.asList(new ProvisionedClusterPoolUpgradeProfileProperties(),
                    new ProvisionedClusterPoolUpgradeProfileProperties(),
                    new ProvisionedClusterPoolUpgradeProfileProperties())))
            .withAgentPoolProfiles(Arrays.asList(
                new ProvisionedClusterPoolUpgradeProfile()
                    .withUpgrades(Arrays.asList(new ProvisionedClusterPoolUpgradeProfileProperties(),
                        new ProvisionedClusterPoolUpgradeProfileProperties(),
                        new ProvisionedClusterPoolUpgradeProfileProperties())),
                new ProvisionedClusterPoolUpgradeProfile()
                    .withUpgrades(Arrays.asList(new ProvisionedClusterPoolUpgradeProfileProperties(),
                        new ProvisionedClusterPoolUpgradeProfileProperties(),
                        new ProvisionedClusterPoolUpgradeProfileProperties())),
                new ProvisionedClusterPoolUpgradeProfile()
                    .withUpgrades(Arrays.asList(new ProvisionedClusterPoolUpgradeProfileProperties(),
                        new ProvisionedClusterPoolUpgradeProfileProperties(),
                        new ProvisionedClusterPoolUpgradeProfileProperties())),
                new ProvisionedClusterPoolUpgradeProfile()
                    .withUpgrades(Arrays.asList(new ProvisionedClusterPoolUpgradeProfileProperties(),
                        new ProvisionedClusterPoolUpgradeProfileProperties(),
                        new ProvisionedClusterPoolUpgradeProfileProperties()))));
        model = BinaryData.fromObject(model).toObject(ProvisionedClusterUpgradeProfileInner.class);
    }
}
