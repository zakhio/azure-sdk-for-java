// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.support.SupportManager;
import com.azure.resourcemanager.support.models.Consent;
import com.azure.resourcemanager.support.models.PreferredContactMethod;
import com.azure.resourcemanager.support.models.SeverityLevel;
import com.azure.resourcemanager.support.models.SupportTicketDetails;
import com.azure.resourcemanager.support.models.UserConsent;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SupportTicketsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"supportTicketId\":\"o\",\"description\":\"mkcdyhbpkkpwdre\",\"problemClassificationId\":\"novvqfovljxy\",\"problemClassificationDisplayName\":\"uwsyrsndsytgadg\",\"severity\":\"minimal\",\"enrollmentId\":\"ea\",\"require24X7Response\":false,\"advancedDiagnosticConsent\":\"Yes\",\"problemScopingQuestions\":\"zar\",\"supportPlanId\":\"lquuijfqkacewii\",\"contactDetails\":{\"firstName\":\"fpubjibwwi\",\"lastName\":\"tohqkvpuvksgp\",\"preferredContactMethod\":\"phone\",\"primaryEmailAddress\":\"aknynfsynljphuop\",\"additionalEmailAddresses\":[\"lqiyntorzihl\",\"osjswsr\",\"slyzrpzbchckqq\"],\"phoneNumber\":\"ioxiysuiizyn\",\"preferredTimeZone\":\"edyatrwyhqmibzyh\",\"country\":\"itsmypyyn\",\"preferredSupportLanguage\":\"cdpu\"},\"serviceLevelAgreement\":{\"startTime\":\"2021-01-20T04:27:27Z\",\"expirationTime\":\"2021-04-24T15:22:10Z\",\"slaMinutes\":1547081847},\"supportEngineer\":{\"emailAddress\":\"biknsorgjhxbld\"},\"supportPlanType\":\"wwrlkdmtncv\",\"supportPlanDisplayName\":\"otllxdyhgsyo\",\"title\":\"ogjltdtbnnhad\",\"problemStartTime\":\"2021-04-24T13:40:54Z\",\"serviceId\":\"rkvcikhnvpa\",\"serviceDisplayName\":\"gxqquezik\",\"status\":\"ggxkallatmelwuip\",\"createdDate\":\"2021-10-19T09:34:04Z\",\"modifiedDate\":\"2021-06-05T01:20:37Z\",\"fileWorkspaceName\":\"z\",\"isTemporaryTicket\":\"No\",\"technicalTicketDetails\":{\"resourceId\":\"c\"},\"quotaTicketDetails\":{\"quotaChangeRequestSubType\":\"rhyrnxxmueed\",\"quotaChangeRequestVersion\":\"rdvstkwqqtch\",\"quotaChangeRequests\":[{\"region\":\"fmtdaaygdvwvgp\",\"payload\":\"hgwxrtfudx\"},{\"region\":\"xg\",\"payload\":\"agvrvmnpkuk\"},{\"region\":\"i\",\"payload\":\"blxgwimf\"}]},\"secondaryConsent\":[{\"userConsent\":\"Yes\",\"type\":\"wmszkk\"}]},\"id\":\"oqreyfkzikfjawn\",\"name\":\"a\",\"type\":\"vxwc\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SupportManager manager = SupportManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<SupportTicketDetails> response
            = manager.supportTickets().list(1424566562, "hykojoxafnndlpic", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("o", response.iterator().next().supportTicketId());
        Assertions.assertEquals("mkcdyhbpkkpwdre", response.iterator().next().description());
        Assertions.assertEquals("novvqfovljxy", response.iterator().next().problemClassificationId());
        Assertions.assertEquals(SeverityLevel.MINIMAL, response.iterator().next().severity());
        Assertions.assertEquals("ea", response.iterator().next().enrollmentId());
        Assertions.assertEquals(false, response.iterator().next().require24X7Response());
        Assertions.assertEquals(Consent.YES, response.iterator().next().advancedDiagnosticConsent());
        Assertions.assertEquals("zar", response.iterator().next().problemScopingQuestions());
        Assertions.assertEquals("lquuijfqkacewii", response.iterator().next().supportPlanId());
        Assertions.assertEquals("fpubjibwwi", response.iterator().next().contactDetails().firstName());
        Assertions.assertEquals("tohqkvpuvksgp", response.iterator().next().contactDetails().lastName());
        Assertions.assertEquals(PreferredContactMethod.PHONE,
            response.iterator().next().contactDetails().preferredContactMethod());
        Assertions.assertEquals("aknynfsynljphuop", response.iterator().next().contactDetails().primaryEmailAddress());
        Assertions.assertEquals("lqiyntorzihl",
            response.iterator().next().contactDetails().additionalEmailAddresses().get(0));
        Assertions.assertEquals("ioxiysuiizyn", response.iterator().next().contactDetails().phoneNumber());
        Assertions.assertEquals("edyatrwyhqmibzyh", response.iterator().next().contactDetails().preferredTimeZone());
        Assertions.assertEquals("itsmypyyn", response.iterator().next().contactDetails().country());
        Assertions.assertEquals("cdpu", response.iterator().next().contactDetails().preferredSupportLanguage());
        Assertions.assertEquals("ogjltdtbnnhad", response.iterator().next().title());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-24T13:40:54Z"),
            response.iterator().next().problemStartTime());
        Assertions.assertEquals("rkvcikhnvpa", response.iterator().next().serviceId());
        Assertions.assertEquals("z", response.iterator().next().fileWorkspaceName());
        Assertions.assertEquals("c", response.iterator().next().technicalTicketDetails().resourceId());
        Assertions.assertEquals("rhyrnxxmueed",
            response.iterator().next().quotaTicketDetails().quotaChangeRequestSubType());
        Assertions.assertEquals("rdvstkwqqtch",
            response.iterator().next().quotaTicketDetails().quotaChangeRequestVersion());
        Assertions.assertEquals("fmtdaaygdvwvgp",
            response.iterator().next().quotaTicketDetails().quotaChangeRequests().get(0).region());
        Assertions.assertEquals("hgwxrtfudx",
            response.iterator().next().quotaTicketDetails().quotaChangeRequests().get(0).payload());
        Assertions.assertEquals(UserConsent.YES, response.iterator().next().secondaryConsent().get(0).userConsent());
        Assertions.assertEquals("wmszkk", response.iterator().next().secondaryConsent().get(0).type());
    }
}
