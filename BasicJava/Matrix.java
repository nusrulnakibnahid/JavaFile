package BasicJava;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] A = new int[3][3];
        int SumOfDiagonalElements = 0;
        int SumOfUpperElements = 0;
        int SumofLowerElements = 0;

        // Input matrix
        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();
            }
        }
        // Output Matrix(diagonal,upper,lower)
        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {

                if (row == col) {
                    SumOfDiagonalElements = SumOfDiagonalElements + A[row][col];

                }

                if (row < col) {
                    SumOfUpperElements = SumOfUpperElements + A[row][col];

                }

                if (row > col) {
                    SumofLowerElements= SumofLowerElements + A[row][col];

                }

            }

        }
        System.out.println("Sum of diagonal elements: " + SumOfDiagonalElements);
        System.out.println("Sum of upper elements: " + SumOfUpperElements);
        System.out.println("Sum of lower elements: " + SumofLowerElements);

    }
}
