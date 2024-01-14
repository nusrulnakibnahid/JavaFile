package Revision;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int num;
        System.out.print("How many times you want to the output:");
        num = input.nextInt(); 

        int i = 1;

        do {
            System.out.println(i+" Nahid");
            i++;
        }while(i<=num); 
    }
}
