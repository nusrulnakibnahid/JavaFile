package Revision;

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        double [] number = new double[5];
        double sum = 0;
        double avg;
        System.out.print("Please enter 5 numbers: ");
        number[0] = input.nextDouble();
        number[1] = input.nextDouble();
        number[2] = input.nextDouble();
        number[3] = input.nextDouble();
        number[4] = input.nextDouble();


        for(int i =0; i<number.length; i++){
            sum = sum + number[i];
        }
        System.out.println("Total sum of 5 numbers: "+sum);

        avg = sum /number.length;
        System.out.println("Average of 5 numbers: "+avg);


        double max = number[0];
        double min = number[0]; 

        for(int i= 0; i<number.length; i++){
            if (max <number[i]) {
                max = number[i];
            }
            else if(min > number[i]){
                min = number[i];
            }
        }

        System.out.println("Maximum number is:"+max);
        System.out.println("Minimum number is:"+min);



    }
}
