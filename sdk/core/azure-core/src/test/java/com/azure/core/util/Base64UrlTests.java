// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.util;

import org.junit.jupiter.api.Test;

import static com.azure.core.CoreTestUtils.assertArraysEqual;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Base64UrlTests {
    @Test
    public void constructorWithNullBytes() {
        final Base64Url base64Url = new Base64Url((byte[]) null);
        assertNull(base64Url.encodedBytes());
        assertNull(base64Url.decodedBytes());
        assertEmptyString(base64Url.toString());
    }

    @Test
    public void constructorWithEmptyBytes() {
        final Base64Url base64Url = new Base64Url(new byte[0]);
        assertArraysEqual(new byte[0], base64Url.encodedBytes());
        assertArraysEqual(new byte[0], base64Url.decodedBytes());
        assertEquals("", base64Url.toString());
    }

    @Test
    public void constructorWithNonEmptyBytes() {
        final Base64Url base64Url
            = new Base64Url(new byte[] { 65, 65, 69, 67, 65, 119, 81, 70, 66, 103, 99, 73, 67, 81 });
        assertArraysEqual(new byte[] { 65, 65, 69, 67, 65, 119, 81, 70, 66, 103, 99, 73, 67, 81 },
            base64Url.encodedBytes());
        assertArraysEqual(new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, base64Url.decodedBytes());
        assertEquals("AAECAwQFBgcICQ", base64Url.toString());
    }

    @Test
    public void constructorWithNullString() {
        final Base64Url base64Url = new Base64Url((String) null);
        assertNull(base64Url.encodedBytes());
        assertNull(base64Url.decodedBytes());
        assertEmptyString(base64Url.toString());
    }

    @Test
    public void constructorWithEmptyString() {
        final Base64Url base64Url = new Base64Url("");
        assertArraysEqual(new byte[0], base64Url.encodedBytes());
        assertArraysEqual(new byte[0], base64Url.decodedBytes());
        assertEquals("", base64Url.toString());
    }

    @Test
    public void constructorWithEmptyDoubleQuotedString() {
        final Base64Url base64Url = new Base64Url("\"\"");
        assertArraysEqual(new byte[0], base64Url.encodedBytes());
        assertArraysEqual(new byte[0], base64Url.decodedBytes());
        assertEquals("", base64Url.toString());
    }

    @Test
    public void constructorWithEmptySingleQuotedString() {
        final Base64Url base64Url = new Base64Url("\'\'");
        assertArraysEqual(new byte[0], base64Url.encodedBytes());
        assertArraysEqual(new byte[0], base64Url.decodedBytes());
        assertEquals("", base64Url.toString());
    }

    @Test
    public void constructorWithNonEmptyString() {
        final Base64Url base64Url = new Base64Url("AAECAwQFBgcICQ");
        assertArraysEqual(new byte[] { 65, 65, 69, 67, 65, 119, 81, 70, 66, 103, 99, 73, 67, 81 },
            base64Url.encodedBytes());
        assertArraysEqual(new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, base64Url.decodedBytes());
        assertEquals("AAECAwQFBgcICQ", base64Url.toString());
    }

    @Test
    public void constructorWithNonEmptyDoubleQuotedString() {
        final Base64Url base64Url = new Base64Url("\"AAECAwQFBgcICQ\"");
        assertArraysEqual(new byte[] { 65, 65, 69, 67, 65, 119, 81, 70, 66, 103, 99, 73, 67, 81 },
            base64Url.encodedBytes());
        assertArraysEqual(new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, base64Url.decodedBytes());
        assertEquals("AAECAwQFBgcICQ", base64Url.toString());
    }

    @Test
    public void constructorWithNonEmptySingleQuotedString() {
        final Base64Url base64Url = new Base64Url("\'AAECAwQFBgcICQ\'");
        assertArraysEqual(new byte[] { 65, 65, 69, 67, 65, 119, 81, 70, 66, 103, 99, 73, 67, 81 },
            base64Url.encodedBytes());
        assertArraysEqual(new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, base64Url.decodedBytes());
        assertEquals("AAECAwQFBgcICQ", base64Url.toString());
    }

    @Test
    public void encodeWithNullBytes() {
        final Base64Url base64Url = Base64Url.encode(null);
        assertNull(base64Url.encodedBytes());
        assertNull(base64Url.decodedBytes());
        assertEmptyString(base64Url.toString());
    }

    @Test
    public void encodeWithEmptyBytes() {
        final Base64Url base64Url = Base64Url.encode(new byte[0]);
        assertArraysEqual(new byte[0], base64Url.encodedBytes());
        assertArraysEqual(new byte[0], base64Url.decodedBytes());
        assertEquals("", base64Url.toString());
    }

    @Test
    public void encodeWithNonEmptyBytes() {
        final Base64Url base64Url = Base64Url.encode(new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 });
        assertArraysEqual(new byte[] { 65, 65, 69, 67, 65, 119, 81, 70, 66, 103, 99, 73, 67, 81 },
            base64Url.encodedBytes());
        assertArraysEqual(new byte[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, base64Url.decodedBytes());
        assertEquals("AAECAwQFBgcICQ", base64Url.toString());
    }

    private static void assertEmptyString(String input) {
        assertEquals("", input);
    }

}
