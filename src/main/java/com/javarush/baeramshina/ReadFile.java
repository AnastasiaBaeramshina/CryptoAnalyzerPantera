package com.javarush.baeramshina;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static String readFile() {
    String input = "text/encrypted.txt";
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
