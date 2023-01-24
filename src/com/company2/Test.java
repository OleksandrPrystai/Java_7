package com.company2;

public class Test {

    static public void main(String args[]) {

        int numb = 9;
        boolean divisibleBy7 = false;
        while (!divisibleBy7){
            System.out.print(numb);
            if (numb % 7 == 0)
                divisibleBy7 = true;
            --numb;
        }

    }

}
