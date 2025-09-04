package com.javarush.baeramshina;

import java.util.HashMap;
import java.util.Map;

public class LogicDecrypted {
    public static Map<Character, Character> cancelsCaesarCipher(int shift) {
        Map<Character, Character> map = new HashMap<>();
        int length = Symbols.symbols.length;

        for (int i = 0; i < length; i++) {
            char original = Symbols.symbols[i];
            int shiftIndex = (i - shift + length) % length;

            char decrypt = Symbols.symbols[shiftIndex];
            map.put(original, decrypt);


        }

        return map;
    }


}
