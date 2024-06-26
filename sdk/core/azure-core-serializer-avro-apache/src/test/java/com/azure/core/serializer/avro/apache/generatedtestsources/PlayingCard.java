/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.azure.core.serializer.avro.apache.generatedtestsources;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class PlayingCard extends org.apache.avro.specific.SpecificRecordBase
    implements org.apache.avro.specific.SpecificRecord {
    private static final long serialVersionUID = -6708090156096238650L;

    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse(
        "{\"type\":\"record\",\"name\":\"PlayingCard\",\"namespace\":\"com.azure.core.serializer.avro.apache.generatedtestsources\",\"fields\":[{\"name\":\"isFaceCard\",\"type\":\"boolean\"},{\"name\":\"cardValue\",\"type\":\"int\"},{\"name\":\"playingCardSuit\",\"type\":{\"type\":\"enum\",\"name\":\"PlayingCardSuit\",\"symbols\":[\"SPADES\",\"HEARTS\",\"DIAMONDS\",\"CLUBS\"]}}]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    private static final SpecificData MODEL$ = new SpecificData();

    private static final BinaryMessageEncoder<PlayingCard> ENCODER = new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

    private static final BinaryMessageDecoder<PlayingCard> DECODER = new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

    /**
     * Return the BinaryMessageEncoder instance used by this class.
     * @return the message encoder used by this class
     */
    public static BinaryMessageEncoder<PlayingCard> getEncoder() {
        return ENCODER;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     * @return the message decoder used by this class
     */
    public static BinaryMessageDecoder<PlayingCard> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
     */
    public static BinaryMessageDecoder<PlayingCard> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
    }

    /**
     * Serializes this PlayingCard to a ByteBuffer.
     * @return a buffer holding the serialized data for this instance
     * @throws java.io.IOException if this instance could not be serialized
     */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    /**
     * Deserializes a PlayingCard from a ByteBuffer.
     * @param b a byte buffer holding serialized data for an instance of this class
     * @return a PlayingCard instance decoded from the given buffer
     * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
     */
    public static PlayingCard fromByteBuffer(java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    private boolean isFaceCard;
    private int cardValue;
    private com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCardSuit playingCardSuit;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public PlayingCard() {
    }

    /**
     * All-args constructor.
     * @param isFaceCard The new value for isFaceCard
     * @param cardValue The new value for cardValue
     * @param playingCardSuit The new value for playingCardSuit
     */
    public PlayingCard(java.lang.Boolean isFaceCard, java.lang.Integer cardValue,
        com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCardSuit playingCardSuit) {
        this.isFaceCard = isFaceCard;
        this.cardValue = cardValue;
        this.playingCardSuit = playingCardSuit;
    }

    @Override
    public org.apache.avro.specific.SpecificData getSpecificData() {
        return MODEL$;
    }

    @Override
    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    @Override
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return isFaceCard;

            case 1:
                return cardValue;

            case 2:
                return playingCardSuit;

            default:
                throw new IndexOutOfBoundsException("Invalid index: " + field$);
        }
    }

    // Used by DatumReader.  Applications should not call.
    @Override
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                isFaceCard = (java.lang.Boolean) value$;
                break;

            case 1:
                cardValue = (java.lang.Integer) value$;
                break;

            case 2:
                playingCardSuit = (com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCardSuit) value$;
                break;

            default:
                throw new IndexOutOfBoundsException("Invalid index: " + field$);
        }
    }

    /**
     * Gets the value of the 'isFaceCard' field.
     * @return The value of the 'isFaceCard' field.
     */
    public boolean getIsFaceCard() {
        return isFaceCard;
    }

    /**
     * Sets the value of the 'isFaceCard' field.
     * @param value the value to set.
     */
    public void setIsFaceCard(boolean value) {
        this.isFaceCard = value;
    }

    /**
     * Gets the value of the 'cardValue' field.
     * @return The value of the 'cardValue' field.
     */
    public int getCardValue() {
        return cardValue;
    }

    /**
     * Sets the value of the 'cardValue' field.
     * @param value the value to set.
     */
    public void setCardValue(int value) {
        this.cardValue = value;
    }

    /**
     * Gets the value of the 'playingCardSuit' field.
     * @return The value of the 'playingCardSuit' field.
     */
    public com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCardSuit getPlayingCardSuit() {
        return playingCardSuit;
    }

    /**
     * Sets the value of the 'playingCardSuit' field.
     * @param value the value to set.
     */
    public void setPlayingCardSuit(com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCardSuit value) {
        this.playingCardSuit = value;
    }

    /**
     * Creates a new PlayingCard RecordBuilder.
     * @return A new PlayingCard RecordBuilder
     */
    public static com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard.Builder newBuilder() {
        return new com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard.Builder();
    }

    /**
     * Creates a new PlayingCard RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new PlayingCard RecordBuilder
     */
    public static com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard.Builder
        newBuilder(com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard.Builder other) {
        if (other == null) {
            return new com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard.Builder();
        } else {
            return new com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard.Builder(other);
        }
    }

    /**
     * Creates a new PlayingCard RecordBuilder by copying an existing PlayingCard instance.
     * @param other The existing instance to copy.
     * @return A new PlayingCard RecordBuilder
     */
    public static com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard.Builder
        newBuilder(com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard other) {
        if (other == null) {
            return new com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard.Builder();
        } else {
            return new com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard.Builder(other);
        }
    }

    /**
     * RecordBuilder for PlayingCard instances.
     */
    @org.apache.avro.specific.AvroGenerated
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PlayingCard>
        implements org.apache.avro.data.RecordBuilder<PlayingCard> {

        private boolean isFaceCard;
        private int cardValue;
        private com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCardSuit playingCardSuit;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$, MODEL$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.isFaceCard)) {
                this.isFaceCard = data().deepCopy(fields()[0].schema(), other.isFaceCard);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.cardValue)) {
                this.cardValue = data().deepCopy(fields()[1].schema(), other.cardValue);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
            if (isValidValue(fields()[2], other.playingCardSuit)) {
                this.playingCardSuit = data().deepCopy(fields()[2].schema(), other.playingCardSuit);
                fieldSetFlags()[2] = other.fieldSetFlags()[2];
            }
        }

        /**
         * Creates a Builder by copying an existing PlayingCard instance
         * @param other The existing instance to copy.
         */
        private Builder(com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard other) {
            super(SCHEMA$, MODEL$);
            if (isValidValue(fields()[0], other.isFaceCard)) {
                this.isFaceCard = data().deepCopy(fields()[0].schema(), other.isFaceCard);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.cardValue)) {
                this.cardValue = data().deepCopy(fields()[1].schema(), other.cardValue);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.playingCardSuit)) {
                this.playingCardSuit = data().deepCopy(fields()[2].schema(), other.playingCardSuit);
                fieldSetFlags()[2] = true;
            }
        }

        /**
          * Gets the value of the 'isFaceCard' field.
          * @return The value.
          */
        public boolean getIsFaceCard() {
            return isFaceCard;
        }

        /**
          * Sets the value of the 'isFaceCard' field.
          * @param value The value of 'isFaceCard'.
          * @return This builder.
          */
        public com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard.Builder
            setIsFaceCard(boolean value) {
            validate(fields()[0], value);
            this.isFaceCard = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
          * Checks whether the 'isFaceCard' field has been set.
          * @return True if the 'isFaceCard' field has been set, false otherwise.
          */
        public boolean hasIsFaceCard() {
            return fieldSetFlags()[0];
        }

        /**
          * Clears the value of the 'isFaceCard' field.
          * @return This builder.
          */
        public com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard.Builder clearIsFaceCard() {
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
          * Gets the value of the 'cardValue' field.
          * @return The value.
          */
        public int getCardValue() {
            return cardValue;
        }

        /**
          * Sets the value of the 'cardValue' field.
          * @param value The value of 'cardValue'.
          * @return This builder.
          */
        public com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard.Builder setCardValue(int value) {
            validate(fields()[1], value);
            this.cardValue = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
          * Checks whether the 'cardValue' field has been set.
          * @return True if the 'cardValue' field has been set, false otherwise.
          */
        public boolean hasCardValue() {
            return fieldSetFlags()[1];
        }

        /**
          * Clears the value of the 'cardValue' field.
          * @return This builder.
          */
        public com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard.Builder clearCardValue() {
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
          * Gets the value of the 'playingCardSuit' field.
          * @return The value.
          */
        public com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCardSuit getPlayingCardSuit() {
            return playingCardSuit;
        }

        /**
          * Sets the value of the 'playingCardSuit' field.
          * @param value The value of 'playingCardSuit'.
          * @return This builder.
          */
        public com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard.Builder
            setPlayingCardSuit(com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCardSuit value) {
            validate(fields()[2], value);
            this.playingCardSuit = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
          * Checks whether the 'playingCardSuit' field has been set.
          * @return True if the 'playingCardSuit' field has been set, false otherwise.
          */
        public boolean hasPlayingCardSuit() {
            return fieldSetFlags()[2];
        }

        /**
          * Clears the value of the 'playingCardSuit' field.
          * @return This builder.
          */
        public com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCard.Builder clearPlayingCardSuit() {
            playingCardSuit = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public PlayingCard build() {
            try {
                PlayingCard record = new PlayingCard();
                record.isFaceCard
                    = fieldSetFlags()[0] ? this.isFaceCard : (java.lang.Boolean) defaultValue(fields()[0]);
                record.cardValue = fieldSetFlags()[1] ? this.cardValue : (java.lang.Integer) defaultValue(fields()[1]);
                record.playingCardSuit = fieldSetFlags()[2]
                    ? this.playingCardSuit
                    : (com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCardSuit) defaultValue(
                        fields()[2]);
                return record;
            } catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<PlayingCard> WRITER$
        = (org.apache.avro.io.DatumWriter<PlayingCard>) MODEL$.createDatumWriter(SCHEMA$);

    @Override
    public void writeExternal(java.io.ObjectOutput out) throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<PlayingCard> READER$
        = (org.apache.avro.io.DatumReader<PlayingCard>) MODEL$.createDatumReader(SCHEMA$);

    @Override
    public void readExternal(java.io.ObjectInput in) throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    @Override
    protected boolean hasCustomCoders() {
        return true;
    }

    @Override
    public void customEncode(org.apache.avro.io.Encoder out) throws java.io.IOException {
        out.writeBoolean(this.isFaceCard);

        out.writeInt(this.cardValue);

        out.writeEnum(this.playingCardSuit.ordinal());

    }

    @Override
    public void customDecode(org.apache.avro.io.ResolvingDecoder in) throws java.io.IOException {
        org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.isFaceCard = in.readBoolean();

            this.cardValue = in.readInt();

            this.playingCardSuit
                = com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCardSuit.values()[in.readEnum()];

        } else {
            for (int i = 0; i < 3; i++) {
                switch (fieldOrder[i].pos()) {
                    case 0:
                        this.isFaceCard = in.readBoolean();
                        break;

                    case 1:
                        this.cardValue = in.readInt();
                        break;

                    case 2:
                        this.playingCardSuit
                            = com.azure.core.serializer.avro.apache.generatedtestsources.PlayingCardSuit.values()[in
                                .readEnum()];
                        break;

                    default:
                        throw new java.io.IOException("Corrupt ResolvingDecoder.");
                }
            }
        }
    }
}
