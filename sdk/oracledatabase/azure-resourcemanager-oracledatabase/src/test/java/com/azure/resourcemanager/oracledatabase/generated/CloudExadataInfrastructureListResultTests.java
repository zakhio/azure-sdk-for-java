// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.fluent.models.CloudExadataInfrastructureInner;
import com.azure.resourcemanager.oracledatabase.models.CloudExadataInfrastructureListResult;
import com.azure.resourcemanager.oracledatabase.models.CloudExadataInfrastructureProperties;
import com.azure.resourcemanager.oracledatabase.models.CustomerContact;
import com.azure.resourcemanager.oracledatabase.models.DayOfWeek;
import com.azure.resourcemanager.oracledatabase.models.DayOfWeekName;
import com.azure.resourcemanager.oracledatabase.models.MaintenanceWindow;
import com.azure.resourcemanager.oracledatabase.models.Month;
import com.azure.resourcemanager.oracledatabase.models.MonthName;
import com.azure.resourcemanager.oracledatabase.models.PatchingMode;
import com.azure.resourcemanager.oracledatabase.models.Preference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CloudExadataInfrastructureListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CloudExadataInfrastructureListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"ocid\":\"gxg\",\"computeCount\":2093374464,\"storageCount\":408868757,\"totalStorageSizeInGbs\":234245718,\"availableStorageSizeInGbs\":1938175770,\"timeCreated\":\"ufubl\",\"lifecycleDetails\":\"fxqeof\",\"maintenanceWindow\":{\"preference\":\"NoPreference\",\"months\":[{\"name\":\"August\"},{\"name\":\"January\"},{\"name\":\"June\"}],\"weeksOfMonth\":[91789189],\"daysOfWeek\":[{\"name\":\"Monday\"},{\"name\":\"Wednesday\"},{\"name\":\"Monday\"},{\"name\":\"Saturday\"}],\"hoursOfDay\":[1600466611,951964300,186594005],\"leadTimeInWeeks\":1111956418,\"patchingMode\":\"Rolling\",\"customActionTimeoutInMins\":105854038,\"isCustomActionTimeoutEnabled\":false,\"isMonthlyPatchingEnabled\":true},\"estimatedPatchingTime\":{\"estimatedDbServerPatchingTime\":306155012,\"estimatedNetworkSwitchesPatchingTime\":967406306,\"estimatedStorageServerPatchingTime\":283393418,\"totalEstimatedPatchingTime\":1729632043},\"customerContacts\":[{\"email\":\"ouskcqvkocrc\"},{\"email\":\"dkwt\"},{\"email\":\"hxbnjbiksqrg\"},{\"email\":\"ssainqpjwnzll\"}],\"provisioningState\":\"Canceled\",\"lifecycleState\":\"Terminating\",\"shape\":\"eebvmgxsab\",\"ociUrl\":\"qduujitcjczdz\",\"cpuCount\":1471497811,\"maxCpuCount\":700767866,\"memorySizeInGbs\":2049933545,\"maxMemoryInGbs\":1632911740,\"dbNodeStorageSizeInGbs\":881924894,\"maxDbNodeStorageSizeInGbs\":176871010,\"dataStorageSizeInTbs\":1872271759,\"maxDataStorageInTbs\":55.1979758723363,\"dbServerVersion\":\"wrwjfeu\",\"storageServerVersion\":\"hutje\",\"activatedStorageCount\":1438650135,\"additionalStorageCount\":1403309762,\"displayName\":\"dhugjzzdatqxhocd\",\"lastMaintenanceRunId\":\"ablgphuticndvk\",\"nextMaintenanceRunId\":\"zwyiftyhxhur\",\"monthlyDbServerVersion\":\"ftyxolniw\",\"monthlyStorageServerVersion\":\"cukjf\"},\"zones\":[\"iawxklry\",\"lwckbasyypnddhs\"],\"location\":\"bacphejko\",\"tags\":{\"i\":\"qgoulznd\",\"dgak\":\"wyqkgfgibm\",\"ytb\":\"qsrxybzqqed\"},\"id\":\"iqfouflmmnkz\",\"name\":\"modmglougpb\",\"type\":\"wtmutduq\"},{\"properties\":{\"ocid\":\"pspwgcuertu\",\"computeCount\":1838728472,\"storageCount\":1475833169,\"totalStorageSizeInGbs\":398629650,\"availableStorageSizeInGbs\":718975577,\"timeCreated\":\"mdgbbjfdd\",\"lifecycleDetails\":\"bmbexppbhtqqro\",\"maintenanceWindow\":{\"preference\":\"CustomPreference\",\"months\":[{\"name\":\"May\"}],\"weeksOfMonth\":[2143599393,746148107],\"daysOfWeek\":[{\"name\":\"Thursday\"},{\"name\":\"Monday\"},{\"name\":\"Saturday\"},{\"name\":\"Sunday\"}],\"hoursOfDay\":[852656000,161079646,2011636323,243879376],\"leadTimeInWeeks\":2040036621,\"patchingMode\":\"Rolling\",\"customActionTimeoutInMins\":2130650587,\"isCustomActionTimeoutEnabled\":true,\"isMonthlyPatchingEnabled\":false},\"estimatedPatchingTime\":{\"estimatedDbServerPatchingTime\":1846063928,\"estimatedNetworkSwitchesPatchingTime\":8193790,\"estimatedStorageServerPatchingTime\":250590456,\"totalEstimatedPatchingTime\":709635131},\"customerContacts\":[{\"email\":\"vfqawrlyxwjkcpr\"},{\"email\":\"nwbxgjvtbvpyssz\"},{\"email\":\"nruj\"}],\"provisioningState\":\"Provisioning\",\"lifecycleState\":\"Terminated\",\"shape\":\"uouq\",\"ociUrl\":\"rwzwbng\",\"cpuCount\":1052592180,\"maxCpuCount\":443488526,\"memorySizeInGbs\":1661646001,\"maxMemoryInGbs\":1403075438,\"dbNodeStorageSizeInGbs\":1608878856,\"maxDbNodeStorageSizeInGbs\":8203543,\"dataStorageSizeInTbs\":2117984998,\"maxDataStorageInTbs\":30.857593323830567,\"dbServerVersion\":\"y\",\"storageServerVersion\":\"hr\",\"activatedStorageCount\":778150976,\"additionalStorageCount\":1323604242,\"displayName\":\"zwdzuh\",\"lastMaintenanceRunId\":\"mwisdkfthwxmnt\",\"nextMaintenanceRunId\":\"waopvkmijcmmxd\",\"monthlyDbServerVersion\":\"fufsrpymzi\",\"monthlyStorageServerVersion\":\"sezcxtb\"},\"zones\":[\"gfycc\",\"newmdwzjeiachbo\",\"sflnrosfqp\"],\"location\":\"ehzzvypyqrim\",\"tags\":{\"dqxhcrmnohjtckwh\":\"pvswjdkirso\",\"gr\":\"soifiyipjxsqw\",\"qabnmoc\":\"bznorcjxvsnby\"},\"id\":\"cyshurzafbljjgp\",\"name\":\"toqcjmklja\",\"type\":\"bqidtqaj\"},{\"properties\":{\"ocid\":\"l\",\"computeCount\":144447336,\"storageCount\":1232172587,\"totalStorageSizeInGbs\":1505424073,\"availableStorageSizeInGbs\":623997191,\"timeCreated\":\"bzhfepgzgqexz\",\"lifecycleDetails\":\"c\",\"maintenanceWindow\":{\"preference\":\"NoPreference\",\"months\":[{\"name\":\"January\"},{\"name\":\"May\"},{\"name\":\"February\"},{\"name\":\"June\"}],\"weeksOfMonth\":[1663181785,539678864],\"daysOfWeek\":[{\"name\":\"Wednesday\"},{\"name\":\"Wednesday\"},{\"name\":\"Wednesday\"}],\"hoursOfDay\":[177005491,1273206758,1703884652],\"leadTimeInWeeks\":1291201271,\"patchingMode\":\"NonRolling\",\"customActionTimeoutInMins\":547031215,\"isCustomActionTimeoutEnabled\":false,\"isMonthlyPatchingEnabled\":false},\"estimatedPatchingTime\":{\"estimatedDbServerPatchingTime\":948601207,\"estimatedNetworkSwitchesPatchingTime\":1684749712,\"estimatedStorageServerPatchingTime\":132549399,\"totalEstimatedPatchingTime\":1116116329},\"customerContacts\":[{\"email\":\"mexgstxgcp\"},{\"email\":\"dg\"},{\"email\":\"aajrm\"},{\"email\":\"djwzrlov\"}],\"provisioningState\":\"Provisioning\",\"lifecycleState\":\"Available\",\"shape\":\"ijcoejctb\",\"ociUrl\":\"qsqsy\",\"cpuCount\":1302368966,\"maxCpuCount\":1508721218,\"memorySizeInGbs\":544085929,\"maxMemoryInGbs\":1619207085,\"dbNodeStorageSizeInGbs\":2039357898,\"maxDbNodeStorageSizeInGbs\":1707424741,\"dataStorageSizeInTbs\":1856340742,\"maxDataStorageInTbs\":24.355562351171788,\"dbServerVersion\":\"xaxcfjpgddtocjjx\",\"storageServerVersion\":\"pmouexhdz\",\"activatedStorageCount\":738311617,\"additionalStorageCount\":996013729,\"displayName\":\"ojnxqbzvdd\",\"lastMaintenanceRunId\":\"wndeicbtwnp\",\"nextMaintenanceRunId\":\"oqvuhr\",\"monthlyDbServerVersion\":\"f\",\"monthlyStorageServerVersion\":\"yd\"},\"zones\":[\"lmjthjq\",\"wpyeicxmqciwqvh\"],\"location\":\"ixuigdtopbobj\",\"tags\":{\"w\":\"m\"},\"id\":\"a\",\"name\":\"a\",\"type\":\"hrzayvvtpgvdf\"},{\"properties\":{\"ocid\":\"tkftutqxlngx\",\"computeCount\":1542158785,\"storageCount\":719588208,\"totalStorageSizeInGbs\":1113427236,\"availableStorageSizeInGbs\":929487618,\"timeCreated\":\"xdqmidtthzrvqdra\",\"lifecycleDetails\":\"jybige\",\"maintenanceWindow\":{\"preference\":\"CustomPreference\",\"months\":[{\"name\":\"May\"},{\"name\":\"March\"},{\"name\":\"November\"}],\"weeksOfMonth\":[974943815,339779256,1420716073],\"daysOfWeek\":[{\"name\":\"Saturday\"},{\"name\":\"Monday\"},{\"name\":\"Thursday\"},{\"name\":\"Thursday\"}],\"hoursOfDay\":[616844240,1787263849,1328534140],\"leadTimeInWeeks\":23718852,\"patchingMode\":\"NonRolling\",\"customActionTimeoutInMins\":1043685699,\"isCustomActionTimeoutEnabled\":true,\"isMonthlyPatchingEnabled\":true},\"estimatedPatchingTime\":{\"estimatedDbServerPatchingTime\":539523379,\"estimatedNetworkSwitchesPatchingTime\":680476327,\"estimatedStorageServerPatchingTime\":1709134012,\"totalEstimatedPatchingTime\":2077356843},\"customerContacts\":[{\"email\":\"pec\"},{\"email\":\"vmmcoofs\"},{\"email\":\"lzevgbmqjqab\"},{\"email\":\"y\"}],\"provisioningState\":\"Provisioning\",\"lifecycleState\":\"Provisioning\",\"shape\":\"w\",\"ociUrl\":\"uvcc\",\"cpuCount\":1704525857,\"maxCpuCount\":1351999022,\"memorySizeInGbs\":1015475658,\"maxMemoryInGbs\":1187016173,\"dbNodeStorageSizeInGbs\":2055969856,\"maxDbNodeStorageSizeInGbs\":198217735,\"dataStorageSizeInTbs\":1067067753,\"maxDataStorageInTbs\":68.24949348483848,\"dbServerVersion\":\"gtzxdpn\",\"storageServerVersion\":\"qqwx\",\"activatedStorageCount\":19464895,\"additionalStorageCount\":339622824,\"displayName\":\"llnwsubi\",\"lastMaintenanceRunId\":\"jampmngnzscxaqw\",\"nextMaintenanceRunId\":\"chcbonqvpkvlrxnj\",\"monthlyDbServerVersion\":\"seiphe\",\"monthlyStorageServerVersion\":\"lokeyy\"},\"zones\":[\"nj\",\"dlwtgrhpdj\",\"jumasx\"],\"location\":\"jpqyegu\",\"tags\":{\"xhejjzzvdud\":\"b\"},\"id\":\"wdslfhotwmcy\",\"name\":\"pwlbjnpg\",\"type\":\"cftadeh\"}],\"nextLink\":\"ltyfsop\"}")
            .toObject(CloudExadataInfrastructureListResult.class);
        Assertions.assertEquals("bacphejko", model.value().get(0).location());
        Assertions.assertEquals("qgoulznd", model.value().get(0).tags().get("i"));
        Assertions.assertEquals(2093374464, model.value().get(0).properties().computeCount());
        Assertions.assertEquals(408868757, model.value().get(0).properties().storageCount());
        Assertions.assertEquals(Preference.NO_PREFERENCE,
            model.value().get(0).properties().maintenanceWindow().preference());
        Assertions.assertEquals(MonthName.AUGUST,
            model.value().get(0).properties().maintenanceWindow().months().get(0).name());
        Assertions.assertEquals(91789189, model.value().get(0).properties().maintenanceWindow().weeksOfMonth().get(0));
        Assertions.assertEquals(DayOfWeekName.MONDAY,
            model.value().get(0).properties().maintenanceWindow().daysOfWeek().get(0).name());
        Assertions.assertEquals(1600466611, model.value().get(0).properties().maintenanceWindow().hoursOfDay().get(0));
        Assertions.assertEquals(1111956418, model.value().get(0).properties().maintenanceWindow().leadTimeInWeeks());
        Assertions.assertEquals(PatchingMode.ROLLING,
            model.value().get(0).properties().maintenanceWindow().patchingMode());
        Assertions.assertEquals(105854038,
            model.value().get(0).properties().maintenanceWindow().customActionTimeoutInMins());
        Assertions.assertEquals(false,
            model.value().get(0).properties().maintenanceWindow().isCustomActionTimeoutEnabled());
        Assertions.assertEquals(true, model.value().get(0).properties().maintenanceWindow().isMonthlyPatchingEnabled());
        Assertions.assertEquals("ouskcqvkocrc", model.value().get(0).properties().customerContacts().get(0).email());
        Assertions.assertEquals("eebvmgxsab", model.value().get(0).properties().shape());
        Assertions.assertEquals("dhugjzzdatqxhocd", model.value().get(0).properties().displayName());
        Assertions.assertEquals("iawxklry", model.value().get(0).zones().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CloudExadataInfrastructureListResult model = new CloudExadataInfrastructureListResult().withValue(Arrays.asList(
            new CloudExadataInfrastructureInner().withLocation("bacphejko")
                .withTags(mapOf("i", "qgoulznd", "dgak", "wyqkgfgibm", "ytb", "qsrxybzqqed"))
                .withProperties(new CloudExadataInfrastructureProperties().withComputeCount(2093374464)
                    .withStorageCount(408868757)
                    .withMaintenanceWindow(new MaintenanceWindow().withPreference(Preference.NO_PREFERENCE)
                        .withMonths(Arrays.asList(new Month().withName(MonthName.AUGUST),
                            new Month().withName(MonthName.JANUARY), new Month().withName(MonthName.JUNE)))
                        .withWeeksOfMonth(Arrays.asList(91789189))
                        .withDaysOfWeek(Arrays.asList(new DayOfWeek().withName(DayOfWeekName.MONDAY),
                            new DayOfWeek().withName(DayOfWeekName.WEDNESDAY),
                            new DayOfWeek().withName(DayOfWeekName.MONDAY),
                            new DayOfWeek().withName(DayOfWeekName.SATURDAY)))
                        .withHoursOfDay(Arrays.asList(1600466611, 951964300, 186594005))
                        .withLeadTimeInWeeks(1111956418)
                        .withPatchingMode(PatchingMode.ROLLING)
                        .withCustomActionTimeoutInMins(105854038)
                        .withIsCustomActionTimeoutEnabled(false)
                        .withIsMonthlyPatchingEnabled(true))
                    .withCustomerContacts(Arrays.asList(new CustomerContact().withEmail("ouskcqvkocrc"),
                        new CustomerContact().withEmail("dkwt"), new CustomerContact().withEmail("hxbnjbiksqrg"),
                        new CustomerContact().withEmail("ssainqpjwnzll")))
                    .withShape("eebvmgxsab")
                    .withDisplayName("dhugjzzdatqxhocd"))
                .withZones(Arrays.asList("iawxklry", "lwckbasyypnddhs")),
            new CloudExadataInfrastructureInner().withLocation("ehzzvypyqrim")
                .withTags(mapOf("dqxhcrmnohjtckwh", "pvswjdkirso", "gr", "soifiyipjxsqw", "qabnmoc", "bznorcjxvsnby"))
                .withProperties(new CloudExadataInfrastructureProperties().withComputeCount(1838728472)
                    .withStorageCount(1475833169)
                    .withMaintenanceWindow(new MaintenanceWindow().withPreference(Preference.CUSTOM_PREFERENCE)
                        .withMonths(Arrays.asList(new Month().withName(MonthName.MAY)))
                        .withWeeksOfMonth(Arrays.asList(2143599393, 746148107))
                        .withDaysOfWeek(Arrays.asList(new DayOfWeek().withName(DayOfWeekName.THURSDAY),
                            new DayOfWeek().withName(DayOfWeekName.MONDAY),
                            new DayOfWeek().withName(DayOfWeekName.SATURDAY),
                            new DayOfWeek().withName(DayOfWeekName.SUNDAY)))
                        .withHoursOfDay(Arrays.asList(852656000, 161079646, 2011636323, 243879376))
                        .withLeadTimeInWeeks(2040036621)
                        .withPatchingMode(PatchingMode.ROLLING)
                        .withCustomActionTimeoutInMins(2130650587)
                        .withIsCustomActionTimeoutEnabled(true)
                        .withIsMonthlyPatchingEnabled(false))
                    .withCustomerContacts(Arrays.asList(new CustomerContact().withEmail("vfqawrlyxwjkcpr"),
                        new CustomerContact().withEmail("nwbxgjvtbvpyssz"), new CustomerContact().withEmail("nruj")))
                    .withShape("uouq")
                    .withDisplayName("zwdzuh"))
                .withZones(Arrays.asList("gfycc", "newmdwzjeiachbo", "sflnrosfqp")),
            new CloudExadataInfrastructureInner().withLocation("ixuigdtopbobj")
                .withTags(mapOf("w", "m"))
                .withProperties(
                    new CloudExadataInfrastructureProperties().withComputeCount(144447336)
                        .withStorageCount(1232172587)
                        .withMaintenanceWindow(new MaintenanceWindow().withPreference(Preference.NO_PREFERENCE)
                            .withMonths(Arrays.asList(new Month().withName(MonthName.JANUARY),
                                new Month().withName(MonthName.MAY), new Month().withName(MonthName.FEBRUARY),
                                new Month().withName(MonthName.JUNE)))
                            .withWeeksOfMonth(Arrays.asList(1663181785, 539678864))
                            .withDaysOfWeek(Arrays.asList(new DayOfWeek().withName(DayOfWeekName.WEDNESDAY),
                                new DayOfWeek().withName(DayOfWeekName.WEDNESDAY),
                                new DayOfWeek().withName(DayOfWeekName.WEDNESDAY)))
                            .withHoursOfDay(Arrays.asList(177005491, 1273206758, 1703884652))
                            .withLeadTimeInWeeks(1291201271)
                            .withPatchingMode(PatchingMode.NON_ROLLING)
                            .withCustomActionTimeoutInMins(547031215)
                            .withIsCustomActionTimeoutEnabled(false)
                            .withIsMonthlyPatchingEnabled(false))
                        .withCustomerContacts(Arrays.asList(new CustomerContact().withEmail("mexgstxgcp"),
                            new CustomerContact().withEmail("dg"), new CustomerContact().withEmail("aajrm"),
                            new CustomerContact().withEmail("djwzrlov")))
                        .withShape("ijcoejctb")
                        .withDisplayName("ojnxqbzvdd"))
                .withZones(Arrays.asList("lmjthjq", "wpyeicxmqciwqvh")),
            new CloudExadataInfrastructureInner().withLocation("jpqyegu")
                .withTags(mapOf("xhejjzzvdud", "b"))
                .withProperties(new CloudExadataInfrastructureProperties().withComputeCount(1542158785)
                    .withStorageCount(719588208)
                    .withMaintenanceWindow(new MaintenanceWindow().withPreference(Preference.CUSTOM_PREFERENCE)
                        .withMonths(Arrays.asList(new Month().withName(MonthName.MAY),
                            new Month().withName(MonthName.MARCH), new Month().withName(MonthName.NOVEMBER)))
                        .withWeeksOfMonth(Arrays.asList(974943815, 339779256, 1420716073))
                        .withDaysOfWeek(Arrays.asList(new DayOfWeek().withName(DayOfWeekName.SATURDAY),
                            new DayOfWeek().withName(DayOfWeekName.MONDAY),
                            new DayOfWeek().withName(DayOfWeekName.THURSDAY),
                            new DayOfWeek().withName(DayOfWeekName.THURSDAY)))
                        .withHoursOfDay(Arrays.asList(616844240, 1787263849, 1328534140))
                        .withLeadTimeInWeeks(23718852)
                        .withPatchingMode(PatchingMode.NON_ROLLING)
                        .withCustomActionTimeoutInMins(1043685699)
                        .withIsCustomActionTimeoutEnabled(true)
                        .withIsMonthlyPatchingEnabled(true))
                    .withCustomerContacts(Arrays.asList(new CustomerContact().withEmail("pec"),
                        new CustomerContact().withEmail("vmmcoofs"), new CustomerContact().withEmail("lzevgbmqjqab"),
                        new CustomerContact().withEmail("y")))
                    .withShape("w")
                    .withDisplayName("llnwsubi"))
                .withZones(Arrays.asList("nj", "dlwtgrhpdj", "jumasx"))));
        model = BinaryData.fromObject(model).toObject(CloudExadataInfrastructureListResult.class);
        Assertions.assertEquals("bacphejko", model.value().get(0).location());
        Assertions.assertEquals("qgoulznd", model.value().get(0).tags().get("i"));
        Assertions.assertEquals(2093374464, model.value().get(0).properties().computeCount());
        Assertions.assertEquals(408868757, model.value().get(0).properties().storageCount());
        Assertions.assertEquals(Preference.NO_PREFERENCE,
            model.value().get(0).properties().maintenanceWindow().preference());
        Assertions.assertEquals(MonthName.AUGUST,
            model.value().get(0).properties().maintenanceWindow().months().get(0).name());
        Assertions.assertEquals(91789189, model.value().get(0).properties().maintenanceWindow().weeksOfMonth().get(0));
        Assertions.assertEquals(DayOfWeekName.MONDAY,
            model.value().get(0).properties().maintenanceWindow().daysOfWeek().get(0).name());
        Assertions.assertEquals(1600466611, model.value().get(0).properties().maintenanceWindow().hoursOfDay().get(0));
        Assertions.assertEquals(1111956418, model.value().get(0).properties().maintenanceWindow().leadTimeInWeeks());
        Assertions.assertEquals(PatchingMode.ROLLING,
            model.value().get(0).properties().maintenanceWindow().patchingMode());
        Assertions.assertEquals(105854038,
            model.value().get(0).properties().maintenanceWindow().customActionTimeoutInMins());
        Assertions.assertEquals(false,
            model.value().get(0).properties().maintenanceWindow().isCustomActionTimeoutEnabled());
        Assertions.assertEquals(true, model.value().get(0).properties().maintenanceWindow().isMonthlyPatchingEnabled());
        Assertions.assertEquals("ouskcqvkocrc", model.value().get(0).properties().customerContacts().get(0).email());
        Assertions.assertEquals("eebvmgxsab", model.value().get(0).properties().shape());
        Assertions.assertEquals("dhugjzzdatqxhocd", model.value().get(0).properties().displayName());
        Assertions.assertEquals("iawxklry", model.value().get(0).zones().get(0));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
