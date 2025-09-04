package com.javarush.baeramshina;

import java.util.Map;

public class Encrypt {
    public static String encryptText(String text, Map<Character, Character> cipherMap) {
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


//        char lowerChar = Character.toLowerCase(c);
//        char encryptedChar = cipherMap.getOrDefault(lowerChar, c);
//        if (Character.isUpperCase(c)) {
//            encryptedChar = Character.toUpperCase(encryptedChar);
//        }
//        result.append(encryptedChar);
//    }
//        return result.toString();

//}
//        }
