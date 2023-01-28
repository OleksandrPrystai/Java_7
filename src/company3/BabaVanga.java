package company3;

public class BabaVanga {

    public static void main(String args[])
            throws java.io.IOException {

        char ch, answer = 'O';

        System.out.println("Загадана буква від A до Z");
        System.out.println("Яка буква загадана");

        ch = (char) System.in.read();

        if (ch == answer) {
            System.out.println("Правильно!!!");
        } else {
            System.out.print("Спробуйте знову, ваша буква ");
            if (ch > answer) {
                System.out.print("Ваша буква вище за алфавітом");
            } else {
                System.out.print("Ваша буква нище за алфавітом");
            }
        }
    }


}
