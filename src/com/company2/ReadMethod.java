package com.company2;

public class ReadMethod {


    public static void main(String args[])
            throws java.io.IOException {
        char ch;

        System.out.println("Enter your number : ");

        ch = (char) System.in.read();

        System.out.println(ch);

    }

}
