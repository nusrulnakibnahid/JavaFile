package Practice;

import java.util.Scanner;
//Write a program to check whether a number is divisible by 5 and 11 or not
public class DivisibleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int num;
        System.out.print("Enter number: ");
        num = input.nextInt();

        if(num%5==0  && num%11==0){
            System.out.print("This number is divisible by 5 and 11");
        }

        else {
            System.out.print("This number is not divisible by 5 and 11");
        }
    }
}
