package com.company3;

public class Help2 {

    public static void main(String args[])
            throws java.io.IOException {
        char choice, ignore;

        do {
            System.out.println("Справка:");
            System.out.println("  1. if");
            System.out.println("  2. switch");
            System.out.println("  3. for");
            System.out.println("  4. while");
            System.out.println("  5. do-while\n");
            System.out.println("Виберіть:");

            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice < '1' | choice > '5');

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
            case '3':
                System.out.println("Цикл for: \n");
                System.out.println("for(ініціалізація; умова; крок ){...}");
                break;
            case '4':
                System.out.println("Цикл while: \n");
                System.out.println("while(умова){інструкція}");
                break;
            case '5':
                System.out.println("Цикл do-while: \n");
                System.out.println("do {");
                System.out.println("інструкція");
                System.out.println("}while(умова);");
                break;
        }

    }

}
