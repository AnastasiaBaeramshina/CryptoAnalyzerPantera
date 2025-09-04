package com.javarush.baeramshina;

import java.util.Scanner;

public class ConsoleReader extends InputReader {
    private final Scanner console;

    public ConsoleReader(Scanner console){
        this.console=console;
    }

    @Override
    public String readInput() {
        System.out.println("Введите текст: ");
        return console.nextLine();
    }
}
