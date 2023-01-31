package com.company3;

public class Help {

    public static void main(String args[])
            throws java.io.IOException {
        char choice;

        System.out.println("Справка:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("Виберіть:");

        choice = (char) System.in.read();

        switch (choice) {
            case '1':
                System.out.println("Функція if: \n");
                System.out.println("if(умова){Виконання}");
                System.out.println("else {Виконання}");
                break;
            case '2':
                System.out.println("Функція Switch: \n");
                System.out.println("Switch(Вираз){}");
                System.out.println("case 'константа': ");
                System.out.println("break");
                break;
            default:
                System.out.println("Запит не знайдено!");
        }

    }

}
