package Practice;

import java.util.Scanner;
//Write a program to find the sum of n natural numbers
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,sum=0;
        System.out.print("Enter a natural number: ");
        n = input.nextInt();

        sum = (n*(n+1))/2;
        System.out.print("Answer:"+sum);



    }
}
