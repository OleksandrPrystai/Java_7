package Udemy;

public class Methods {
    public static void main(String[] args) {
        Test number1 = new Test();
        number1.numb = 10;
        number1.string = "loh";
        number1.str();
    }
}

class Test {
    int numb;
    String string;

    void str() {
        for (int i = 0; i < 100; i +=11) {
            if (i % 2 != 0) {
                System.out.println(numb + " " + string + i);
            }
        }
    }
}
