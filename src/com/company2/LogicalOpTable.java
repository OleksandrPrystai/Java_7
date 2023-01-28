package com.company2;

public class LogicalOpTable {

    public static void main(String args[]) {

        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;
        q = true;

        if (p) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }
        if (q) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }

        if (p & q) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }

        if (p | q) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }

        if (p ^ q) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }

        if (!p) {
            System.out.println(1 + "\t");
        } else {
            System.out.println(0 + "\t");
        }



        p = true;
        q = false;

        if (p) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }
        if (q) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }

        if (p & q) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }

        if (p | q) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }

        if (p ^ q) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }

        if (!p) {
            System.out.println(1 + "\t");
        } else {
            System.out.println(0 + "\t");
        }


        p = false;
        q = true;

        if (p) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }
        if (q) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }

        if (p & q) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }

        if (p | q) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }

        if (p ^ q) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }

        if (!p) {
            System.out.println(1 + "\t");
        } else {
            System.out.println(0 + "\t");
        }



        p = false;
        q = false;

        if (p) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }
        if (q) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }

        if (p & q) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }

        if (p | q) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }

        if (p ^ q) {
            System.out.print(1 + "\t");
        } else {
            System.out.print(0 + "\t");
        }

        if (!p) {
            System.out.println(1 + "\t");
        } else {
            System.out.println(0 + "\t");
        }



    }
}
