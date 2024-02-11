package BasicJava.Array;

import java.util.Scanner;
//Array ( finding sum and average )
public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];
        double sum = 0;
        double avg;

        System.out.print("Please enter 5 numbers: ");
        number[0] = input.nextDouble();
        number[1] = input.nextDouble();
        number[2] = input.nextDouble();
        number[3] = input.nextDouble();
        number[4] = input.nextDouble();

        sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println("Total: " + sum);

        avg = sum / 5;
        System.out.print("Average: " + avg);

    }
}
