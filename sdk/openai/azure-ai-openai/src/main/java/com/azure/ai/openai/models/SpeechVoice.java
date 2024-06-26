// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The available voices for text-to-speech.
 */
public final class SpeechVoice extends ExpandableStringEnum<SpeechVoice> {

    /**
     * The Alloy voice.
     */
    @Generated
    public static final SpeechVoice ALLOY = fromString("alloy");

    /**
     * The Echo voice.
     */
    @Generated
    public static final SpeechVoice ECHO = fromString("echo");

    /**
     * The Fable voice.
     */
    @Generated
    public static final SpeechVoice FABLE = fromString("fable");

    /**
     * The Onyx voice.
     */
    @Generated
    public static final SpeechVoice ONYX = fromString("onyx");

    /**
     * The Nova voice.
     */
    @Generated
    public static final SpeechVoice NOVA = fromString("nova");

    /**
     * The Shimmer voice.
     */
    @Generated
    public static final SpeechVoice SHIMMER = fromString("shimmer");

    /**
     * Creates a new instance of SpeechVoice value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public SpeechVoice() {
    }

    /**
     * Creates or finds a SpeechVoice from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SpeechVoice.
     */
    @Generated
    public static SpeechVoice fromString(String name) {
        return fromString(name, SpeechVoice.class);
    }

    /**
     * Gets known SpeechVoice values.
     *
     * @return known SpeechVoice values.
     */
    @Generated
    public static Collection<SpeechVoice> values() {
        return values(SpeechVoice.class);
    }
}
