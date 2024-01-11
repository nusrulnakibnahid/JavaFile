package Assignment;

import java.util.Scanner; 

public class Assignment4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int PhonePrice = 1800; //1800 euros
        System.out.println("Phone price is = "+PhonePrice);

        int numberOfInstallment,installmentPerMonth;

        System.out.print("Enter Number Of Installment= ");
        numberOfInstallment = input.nextInt();
        System.out.println("Number Of Installment = "+numberOfInstallment);

        installmentPerMonth = PhonePrice/numberOfInstallment;

        System.out.println("Permonth Installment= $"+installmentPerMonth);

    }
}
