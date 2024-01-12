package Revision;

import java.util.Scanner;

public class Asg5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int phone_price = 1800; // 1800 euros

        int numberOfInstallment, installmentPerMonth;


        System.out.print("Number of Installment: ");
        numberOfInstallment = input.nextInt();

        System.out.print("Installment Per Month: ");
        installmentPerMonth = input.nextInt(); 

        installmentPerMonth = phone_price / numberOfInstallment; 

        System.out.print("Monthly installment amount: "+installmentPerMonth);


    }
    
}
