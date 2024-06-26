// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * A rule providing a binding to an external web server.
 */
@Fluent
public final class WebhookRouterRule extends RouterRule {

    /*
     * The type discriminator describing a sub-type of RouterRule
     */
    @Generated
    private RouterRuleKind kind = RouterRuleKind.WEBHOOK;

    /*
     * Uri for Authorization Server.
     */
    @Generated
    private String authorizationServerUri;

    /*
     * OAuth2.0 Credentials used to Contoso's Authorization server. Reference:
     * https://www.oauth.com/oauth2-servers/access-tokens/client-credentials/
     */
    @Generated
    private OAuth2WebhookClientCredential clientCredential;

    /*
     * Uri for Contoso's Web Server.
     */
    @Generated
    private String webhookUri;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    /**
     * Creates an instance of WebhookRouterRule class.
     */
    @Generated
    public WebhookRouterRule() {
    }

    /**
     * Get the kind property: The type discriminator describing a sub-type of RouterRule.
     *
     * @return the kind value.
     */
    @Generated
    @Override
    public RouterRuleKind getKind() {
        return this.kind;
    }

    /**
     * Get the authorizationServerUri property: Uri for Authorization Server.
     *
     * @return the authorizationServerUri value.
     */
    @Generated
    public String getAuthorizationServerUri() {
        return this.authorizationServerUri;
    }

    /**
     * Set the authorizationServerUri property: Uri for Authorization Server.
     *
     * @param authorizationServerUri the authorizationServerUri value to set.
     * @return the WebhookRouterRule object itself.
     */
    @Generated
    public WebhookRouterRule setAuthorizationServerUri(String authorizationServerUri) {
        this.authorizationServerUri = authorizationServerUri;
        this.updatedProperties.add("authorizationServerUri");
        return this;
    }

    /**
     * Get the clientCredential property: OAuth2.0 Credentials used to Contoso's Authorization server. Reference:
     * https://www.oauth.com/oauth2-servers/access-tokens/client-credentials/.
     *
     * @return the clientCredential value.
     */
    @Generated
    public OAuth2WebhookClientCredential getClientCredential() {
        return this.clientCredential;
    }

    /**
     * Set the clientCredential property: OAuth2.0 Credentials used to Contoso's Authorization server. Reference:
     * https://www.oauth.com/oauth2-servers/access-tokens/client-credentials/.
     *
     * @param clientCredential the clientCredential value to set.
     * @return the WebhookRouterRule object itself.
     */
    @Generated
    public WebhookRouterRule setClientCredential(OAuth2WebhookClientCredential clientCredential) {
        this.clientCredential = clientCredential;
        this.updatedProperties.add("clientCredential");
        return this;
    }

    /**
     * Get the webhookUri property: Uri for Contoso's Web Server.
     *
     * @return the webhookUri value.
     */
    @Generated
    public String getWebhookUri() {
        return this.webhookUri;
    }

    /**
     * Set the webhookUri property: Uri for Contoso's Web Server.
     *
     * @param webhookUri the webhookUri value to set.
     * @return the WebhookRouterRule object itself.
     */
    @Generated
    public WebhookRouterRule setWebhookUri(String webhookUri) {
        this.webhookUri = webhookUri;
        this.updatedProperties.add("webhookUri");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (JsonMergePatchHelper.getRouterRuleAccessor().isJsonMergePatch(this)) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
            jsonWriter.writeStringField("authorizationServerUri", this.authorizationServerUri);
            jsonWriter.writeJsonField("clientCredential", this.clientCredential);
            jsonWriter.writeStringField("webhookUri", this.webhookUri);
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind.toString());
        if (updatedProperties.contains("authorizationServerUri")) {
            if (this.authorizationServerUri == null) {
                jsonWriter.writeNullField("authorizationServerUri");
            } else {
                jsonWriter.writeStringField("authorizationServerUri", this.authorizationServerUri);
            }
        }
        if (updatedProperties.contains("clientCredential")) {
            if (this.clientCredential == null) {
                jsonWriter.writeNullField("clientCredential");
            } else {
                JsonMergePatchHelper.getOAuth2WebhookClientCredentialAccessor()
                    .prepareModelForJsonMergePatch(this.clientCredential, true);
                jsonWriter.writeJsonField("clientCredential", this.clientCredential);
                JsonMergePatchHelper.getOAuth2WebhookClientCredentialAccessor()
                    .prepareModelForJsonMergePatch(this.clientCredential, false);
            }
        }
        if (updatedProperties.contains("webhookUri")) {
            if (this.webhookUri == null) {
                jsonWriter.writeNullField("webhookUri");
            } else {
                jsonWriter.writeStringField("webhookUri", this.webhookUri);
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WebhookRouterRule from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of WebhookRouterRule if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the WebhookRouterRule.
     */
    @Generated
    public static WebhookRouterRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WebhookRouterRule deserializedWebhookRouterRule = new WebhookRouterRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("kind".equals(fieldName)) {
                    deserializedWebhookRouterRule.kind = RouterRuleKind.fromString(reader.getString());
                } else if ("authorizationServerUri".equals(fieldName)) {
                    deserializedWebhookRouterRule.authorizationServerUri = reader.getString();
                } else if ("clientCredential".equals(fieldName)) {
                    deserializedWebhookRouterRule.clientCredential = OAuth2WebhookClientCredential.fromJson(reader);
                } else if ("webhookUri".equals(fieldName)) {
                    deserializedWebhookRouterRule.webhookUri = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedWebhookRouterRule;
        });
    }
}
