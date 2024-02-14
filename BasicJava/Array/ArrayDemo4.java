package BasicJava.Array;

import java.util.Scanner;
//finding Maximum and minimum
public class ArrayDemo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];

        System.out.print("Enter 5 numbers: ");
        number[0] = input.nextDouble();
        number[1] = input.nextDouble();
        number[2] = input.nextDouble();
        number[3] = input.nextDouble();
        number[4] = input.nextDouble();

        double max = number[0];
        double min = number[0];

        //finding maximum 
        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];

            }

        }
        System.out.println("Maximum number is:"+max);


        //finding minimum
        for (int i = 0; i < number.length; i++) {
            if (min > number[i]) {
                min = number[i];
            }

        }
        System.out.print("Minimum number is:"+min);
    }
}
