package BasicJava.Array;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

        // Geting input for A matrix
        System.out.println("Enter elements for A matrix");
        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d]:",row,col);
                A[row][col] = input.nextInt();
            }

        }

        // Geting output for A matrix
        System.out.println("A=");
        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 3; col++) {
                System.out.print(A[row][col] + " ");
            }
            System.out.println();

        }

        // Geting input for B matrix
        System.out.println("Enter elements for B matrix");
        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d]:",row,col);
                A[row][col] = input.nextInt();
            }

        }

        // Geting output for B matrix
        System.out.println("B=");
        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 3; col++) {
                System.out.print(A[row][col] + " ");
            }
            System.out.println();

        }

    }
}
