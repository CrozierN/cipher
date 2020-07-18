package com.caesarscipher;

import junit.framework.TestCase;

public class CaesarsCipherTest extends TestCase {

    CaesarsCipher caesarsCipher = new CaesarsCipher();

    public void TestCipherMessageWithOffset12(){
        assertEquals("nai SdW kag Va[`Y faVSk", caesarsCipher.cipher("How are you doing today", 12));
    }

    public void testEmptyString() {
        assertEquals("", caesarsCipher.cipher("", 12));
    }
}