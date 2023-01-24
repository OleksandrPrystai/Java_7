package homework;

public class hw_g1_2 {

    public static void main(String args[]) {
        double inch, meter;
        int count = 0;

        for (inch = 1; inch <= 120; inch++) {

            meter = inch / 39.37;
            count++;

            System.out.println(inch + " дюйм = " + meter + " метрів");

            if (count == 12) {
                System.out.println();
                count = 0;
            }

        }

    }

}
