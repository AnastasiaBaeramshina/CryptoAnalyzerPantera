package com.javarush.baeramshina;

import java.util.Map;

public class Encrypt {
    public static String encryptText(String text, Map<Character, Character> cipherMap) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            char lowerChar = Character.toLowerCase(c);
            char encryptedChar = cipherMap.getOrDefault(lowerChar, c);
            result.append(encryptedChar);
        }
        return result.toString();

    }
}
