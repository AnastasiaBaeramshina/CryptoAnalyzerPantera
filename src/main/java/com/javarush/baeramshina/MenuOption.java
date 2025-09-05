package com.javarush.baeramshina;

public enum MenuOption {
    READ_CONSOLE("Прочитать с консоли"),
    READ_FILE("Прочитать файл"),
    ENCRYPT("Зашифровать текст"),
    DECRYPT("Расшифровать текст"),
    WRITE_FILE("Записать зашифрованный текст в отдельный файл"),
    EXIT("Выход");

    private final String description;

    MenuOption(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void printMenu() {
        System.out.println("\nВыберите действие:");
        for (MenuOption value : MenuOption.values()) {
            System.out.println((value.ordinal() + 1) + ". " + value.getDescription());
        }
        System.out.println("Вы выбрали: ");

        }
        public static MenuOption getOptionByNumber(int number){
            MenuOption[] options = MenuOption.values();
            if (number > 0 && number <= options.length) {
            return options[number-1];
            }
            return null;
            }
        }

