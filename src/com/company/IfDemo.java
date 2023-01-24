package com.company;

public class IfDemo {
    public static void main(String args[]) {
        int a, b, c;

        a = 3;
        b = 2;

        if (a < b) {
            System.out.println(a + " менше " + b);
        } else {
            System.out.println(a + " більше " + b);
        }

        System.out.println();

        c = b - a;
        if (c > 0){
            System.out.println("C більше нуля і = " + c);
        } else {
            System.out.println("C менше нуля і = " + c);
        }

        c = a + b;
        if (c > 0){
            System.out.println("C більше нуля і = " + c);
        } else {
            System.out.println("C менше нуля і = " + c);
        }

    }
}
