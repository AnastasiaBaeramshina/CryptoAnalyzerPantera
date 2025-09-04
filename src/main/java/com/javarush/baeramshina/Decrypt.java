package com.javarush.baeramshina;

import java.util.Map;

public class Decrypt {
    public static String decryptText(String text,Map<Character, Character> cipherMap) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (cipherMap.containsKey(c)) {
                result.append(cipherMap.get(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}






//        StringBuilder result = new StringBuilder();
//        for (char c : encryptText.toCharArray()) {
//            char lowerChar = Character.toLowerCase(c);
//
//            char decryptedChar = otherCipherMap.getOrDefault(lowerChar, c);
//            if (Character.isUpperCase(c)) {
//                decryptedChar = Character.toUpperCase(decryptedChar);
//            }
//            result.append(decryptedChar);
//        }
//        return result.toString();


//    }
//}
