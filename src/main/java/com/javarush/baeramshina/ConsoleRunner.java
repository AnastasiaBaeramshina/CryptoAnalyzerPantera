package com.javarush.baeramshina;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
readFile();

//        readFile();
    }
    public static class LogicEncrypted{
        public static Map<Character, Character> createCaesarCipher(int shift){
            Map<Character,Character> map = new HashMap<>();
            int length=Symbols.ALPHABET.length;

            for (int i = 0; i <length ; i++) {
                char original=Symbols.ALPHABET[i];
                char encrypt=Symbols.ALPHABET[(i+shift)%33];
                System.out.println( original+" ------ "+encrypt);

            }

            return map;
        }

    }






    public static class Symbols {
        private static final char[] ALPHABET = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
                'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
                'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};

        public static void printAlphabet() {
            for (char c : ALPHABET) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }





    private static void readFile() {
        String input = "C:\\Users\\Microsoft\\IdeaProjects\\CryptoAnalyzerPantera\\text\\dict.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(input))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла!!!");
            e.getMessage();
        }
    }
}
