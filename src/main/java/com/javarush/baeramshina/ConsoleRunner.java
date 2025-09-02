package com.javarush.baeramshina;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ConsoleRunner {
    public static void main(String[] args) {
        String infoFile = readFile();

        Map<Character, Character> caesarCipher = LogicEncrypted.createCaesarCipher(5);

        String encrypted = encryptText(infoFile, caesarCipher);
        System.out.println("Зашифрованный текст " + encrypted);
    }


    private static String encryptText(String text, Map<Character, Character> cipherMap) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            char lowerChar = Character.toLowerCase(c);
            char encryptedChar = cipherMap.getOrDefault(lowerChar, c);
            result.append(encryptedChar);
        }
        return result.toString();

    }

    public static class LogicEncrypted {
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
                System.out.println(original + " ------>" + encrypt);

            }

            return map;
        }

    }


    public static class Symbols {
        private static final char[] symbols = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
                'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
                'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};

        public static void printSymbols() {
            for (char c : symbols) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }


    private static String readFile() {
        String input = "text/dict.txt";
        StringBuilder info = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(input))) {

            String line;
            while ((line = reader.readLine()) != null) {
                info.append(line).append("\n");

                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла!!!");

            e.printStackTrace();
        }
        return info.toString().trim();
    }
}
