// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.AgreementListResult;

public final class AgreementListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AgreementListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"agreementLink\":\"ibthostgktstvd\",\"category\":\"MicrosoftCustomerAgreement\",\"acceptanceMode\":\"ESignEmbedded\",\"effectiveDate\":\"2021-03-03T03:15:27Z\",\"expirationDate\":\"2021-06-23T00:26:33Z\",\"participants\":[],\"status\":\"zlhp\"},\"id\":\"odqkdlwwqfb\",\"name\":\"mlkxtrqjfs\",\"type\":\"lmbtxhwgfwsrt\"}],\"nextLink\":\"coezbrhubskh\"}")
                .toObject(AgreementListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AgreementListResult model = new AgreementListResult();
        model = BinaryData.fromObject(model).toObject(AgreementListResult.class);
    }
}
