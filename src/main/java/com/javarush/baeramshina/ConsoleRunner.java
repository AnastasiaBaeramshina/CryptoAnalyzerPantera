package com.javarush.baeramshina;

import java.util.Map;
import java.util.Scanner;

import static com.javarush.baeramshina.Decrypt.decryptText;
import static com.javarush.baeramshina.Encrypt.encryptText;


public class ConsoleRunner {
    private static String originalText = null;
    private static String encryptedText = null;
    private static String decryptedText = null;


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        MenuOption selectedOption;

        while (true) {
            MenuOption.printMenu();

            String input = console.nextLine();
            try {
                int optionNumber = Integer.parseInt(input);
                selectedOption = MenuOption.getOptionByNumber(optionNumber);
                if (selectedOption == null) {
                    System.out.println("Некорректный выбор, попробуйте еще.");
                    continue;
                }
                switch (selectedOption) {

                    case READ_CONSOLE:
                        handleReadConsole(console);
                        break;
                    case READ_FILE:
                        handleReadFile(console);
                        break;
                    case ENCRYPT:
                        handleEncrypt();
                        break;
                    case DECRYPT:
                        handleDecrypt();
                        break;
                    case WRITE_FILE:
                        handleWriteFile();
                        break;
                    case EXIT:
                        System.out.println("Выход");
                        break;
                    default:

                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите число.");
            }
        }
    }


    private static void handleReadFile(Scanner console) {
        InputReader readFile = new ReadFile("text/dict.txt");
        String fileContent = readFile.readInput();
        if (fileContent != null) {
            originalText = fileContent;
            System.out.println("Текст прочитан" + originalText);
        } else {
            System.out.println("Файл пуст или не найден");

        }
    }

    private static void handleReadConsole(Scanner console) {
        InputReader consoleReader = new ConsoleReader(console);
        String readInput = consoleReader.readInput();
        if (readInput != null) {
            originalText = readInput;
            System.out.println("Текс введен: " + originalText);
        } else {
            System.out.println("Текст отсутствует");
        }
    }

    private static void handleEncrypt() {

        Map<Character, Character> caesarCipher = LogicEncrypted.createCaesarCipher(5);
        encryptedText = encryptText(originalText, caesarCipher);
        System.out.println("Зашифрованный текст " + encryptedText);
    }
        private static void handleWriteFile(){
        WriteFile.writeToFile(encryptedText, "text/encrypt.txt");
            System.out.println("Зашифрованный текст записан в файл ext/encrypt.txt");}

        private static void handleDecrypt() {

                Map<Character, Character> deCipher = LogicDecrypted.cancelsCaesarCipher(5);
                decryptedText = decryptText(encryptedText, deCipher);
                System.out.println("Расшифрованный текст " + decryptedText);


    }
}



