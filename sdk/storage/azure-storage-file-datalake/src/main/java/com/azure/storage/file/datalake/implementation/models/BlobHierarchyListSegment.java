// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * The BlobHierarchyListSegment model.
 */
@Fluent
public final class BlobHierarchyListSegment implements XmlSerializable<BlobHierarchyListSegment> {

    /*
     * The BlobPrefixes property.
     */
    private List<BlobPrefix> blobPrefixes = new ArrayList<>();

    /*
     * The BlobItems property.
     */
    private List<BlobItemInternal> blobItems = new ArrayList<>();

    /**
     * Creates an instance of BlobHierarchyListSegment class.
     */
    public BlobHierarchyListSegment() {
    }

    /**
     * Get the blobPrefixes property: The BlobPrefixes property.
     *
     * @return the blobPrefixes value.
     */
    public List<BlobPrefix> getBlobPrefixes() {
        return this.blobPrefixes;
    }

    /**
     * Set the blobPrefixes property: The BlobPrefixes property.
     *
     * @param blobPrefixes the blobPrefixes value to set.
     * @return the BlobHierarchyListSegment object itself.
     */
    public BlobHierarchyListSegment setBlobPrefixes(List<BlobPrefix> blobPrefixes) {
        this.blobPrefixes = blobPrefixes;
        return this;
    }

    /**
     * Get the blobItems property: The BlobItems property.
     *
     * @return the blobItems value.
     */
    public List<BlobItemInternal> getBlobItems() {
        return this.blobItems;
    }

    /**
     * Set the blobItems property: The BlobItems property.
     *
     * @param blobItems the blobItems value to set.
     * @return the BlobHierarchyListSegment object itself.
     */
    public BlobHierarchyListSegment setBlobItems(List<BlobItemInternal> blobItems) {
        this.blobItems = blobItems;
        return this;
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Blobs" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        if (this.blobPrefixes != null) {
            for (BlobPrefix element : this.blobPrefixes) {
                xmlWriter.writeXml(element, "BlobPrefix");
            }
        }
        if (this.blobItems != null) {
            for (BlobItemInternal element : this.blobItems) {
                xmlWriter.writeXml(element, "Blob");
            }
        }
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of BlobHierarchyListSegment from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @return An instance of BlobHierarchyListSegment if the XmlReader was pointing to an instance of it, or null if it
     * was pointing to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the BlobHierarchyListSegment.
     */
    public static BlobHierarchyListSegment fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of BlobHierarchyListSegment from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of BlobHierarchyListSegment if the XmlReader was pointing to an instance of it, or null if it
     * was pointing to XML null.
     * @throws IllegalStateException If the deserialized XML object was missing any required properties.
     * @throws XMLStreamException If an error occurs while reading the BlobHierarchyListSegment.
     */
    public static BlobHierarchyListSegment fromXml(XmlReader xmlReader, String rootElementName)
        throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Blobs" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            BlobHierarchyListSegment deserializedBlobHierarchyListSegment = new BlobHierarchyListSegment();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();
                if ("BlobPrefix".equals(elementName.getLocalPart())) {
                    if (deserializedBlobHierarchyListSegment.blobPrefixes == null) {
                        deserializedBlobHierarchyListSegment.blobPrefixes = new ArrayList<>();
                    }
                    deserializedBlobHierarchyListSegment.blobPrefixes.add(BlobPrefix.fromXml(reader, "BlobPrefix"));
                } else if ("Blob".equals(elementName.getLocalPart())) {
                    if (deserializedBlobHierarchyListSegment.blobItems == null) {
                        deserializedBlobHierarchyListSegment.blobItems = new ArrayList<>();
                    }
                    deserializedBlobHierarchyListSegment.blobItems.add(BlobItemInternal.fromXml(reader, "Blob"));
                } else {
                    reader.skipElement();
                }
            }
            return deserializedBlobHierarchyListSegment;
        });
    }
}
