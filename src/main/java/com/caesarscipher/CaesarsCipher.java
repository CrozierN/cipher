package com.caesarscipher;

public class CaesarsCipher {
    private static final char Letter_A = 'a';
    private static final char Letter_Z = 'z';
    private static final int ALPHABET_SIZE = 26;

    public String cipher(String message, int offset){
        offset %= ALPHABET_SIZE;

        char[] character = message.toCharArray();

        offsetBy(character, offset);

        return new String(character);
    }

    private void offsetBy(char[] character, int offset) {
        for(int i = 0; i < character.length; ++i){
            if(character[i] != ' ') {
                character[i] = offsetChar(character[i], offset, Letter_A, Letter_Z);
            }
        }

    }

    private char offsetChar(char c, int offset, char letter_a, char letter_z) {
        c += offset;
        if(c < letter_a){ // Left rotation
            return (char) (c + ALPHABET_SIZE);
        }
        if(c > letter_a){ //Right rotation
            return (char) (c - ALPHABET_SIZE);
        }
        return c;
    }
}
