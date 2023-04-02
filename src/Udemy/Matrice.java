package Udemy;

public class Matrice {
    public static void main(String args[]) {
        int[][] numbers = {{10, 20}, {-10, -20}, {30, -10}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.println(numbers[i][j]);
                int numb = numbers[i][j];
                if (numb >= 0) {
                    System.out.print(numb+" ");
                } else {
                    System.out.print("Error ");
                }
            }
            System.out.println(" ");
        }

    }
}
