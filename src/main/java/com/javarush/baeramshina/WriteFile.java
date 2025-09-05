package com.javarush.baeramshina;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeToFile(String text, String filePath){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))){
            bufferedWriter.write(text);
            System.out.println("Текст успешно записан: "+filePath);
        }
        catch (IOException e){
            System.out.println("Ошибка при записи файла");
        }
    }
}
