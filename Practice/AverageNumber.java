package Practice;

import java.util.Scanner;
//Average Value
public class AverageNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a,b,c,average;


        System.out.print("Enter a : ");
        a = input.nextDouble(); 

        System.out.print("Enter b : ");
        b = input.nextDouble(); 

        System.out.print("Enter c : ");
        c = input.nextDouble(); 

        average = (a + b + c) / 3; 

        System.out.print("Average Number Is: "+average);

    }
}
