package com.javarush.baeramshina;

public class Symbols {
    public static final char[] symbols = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя.,' '«»:!?1234567890".toCharArray();

    public static void printSymbols() {
        for (char c : symbols) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

