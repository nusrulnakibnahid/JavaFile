package Practice;

import java.util.Scanner;

//take an integer as input and print it
public class Practice7 {
    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);

        int num;

        System.out.print("Enter number: ");
        num = input.nextInt(); 

        System.out.println("Number is: "+num);
    }
   
}