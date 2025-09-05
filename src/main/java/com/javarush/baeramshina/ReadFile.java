package com.javarush.baeramshina;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile extends InputReader {
    private final String filePath;

    public ReadFile(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String readInput() {

        StringBuilder info = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
        while((line =reader.readLine())!=null)

            {
                info.append(line).append("\n");

                System.out.println(line);
            }
        } catch(IOException e) {
            System.out.println("Ошибка при чтении файла!!!");

            e.printStackTrace();
        }
        return info.toString().trim();
    }
}
