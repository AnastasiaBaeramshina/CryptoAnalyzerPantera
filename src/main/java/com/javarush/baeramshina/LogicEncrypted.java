package com.javarush.baeramshina;

import java.util.HashMap;
import java.util.Map;

public class LogicEncrypted {
    public static Map<Character, Character> createCaesarCipher(int shift) {
        Map<Character, Character> map = new HashMap<>();
        int length = Symbols.symbols.length;

        for (int i = 0; i < length; i++) {
            char original = Symbols.symbols[i];
            int shiftIndex = (i + shift) % length;
            if (shiftIndex < 0) {
                shiftIndex += length;
            }
            char encrypt = Symbols.symbols[shiftIndex];
            map.put(original, encrypt);


        }

        return map;
    }

}

