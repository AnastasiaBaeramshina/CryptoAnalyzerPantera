package com.javarush.baeramshina;

import java.util.Map;
import java.util.Scanner;

import static com.javarush.baeramshina.Decrypt.decryptText;
import static com.javarush.baeramshina.Encrypt.encryptText;


public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        ReadFile readFile = new ReadFile("text/dict.txt");
        String originalFile = readFile.readInput();
        System.out.println("Оригинал "+originalFile);

        ConsoleReader consoleReader = new ConsoleReader(console);
        String readInput = consoleReader.readInput();


        Map<Character, Character> caesarCipher = LogicEncrypted.createCaesarCipher(3);
        String encrypted = encryptText(originalFile, caesarCipher);
        System.out.println("Зашифрованный текст " + encrypted);


        Map<Character, Character> deCipher = LogicDecrypted.cancelsCaesarCipher(3);
        String decrypted = decryptText(encrypted, deCipher);
        System.out.println("Расшифрованный текст " + decrypted);
console.close();

    }


}
