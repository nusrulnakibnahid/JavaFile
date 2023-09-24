package Beecrowd_Problem_Solving;

import java.util.Scanner;

/*Make a program that reads a seller's name, his/her fixed salary and the sale's total
made by himself/herself in the month (in money). Considering that this seller receives
15% over all products sold, write the final salary (total) of this seller at the end
of the month , with two decimal places. */

public class Problem1009 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salary,value,total;
        String name;
        

        System.out.print("Enter Seller's Name: ");
        name = input.nextLine();

        System.out.print("Enter Salary($): ");
        salary = input.nextDouble();

        System.out.print("Enter value: ");
        value = input.nextDouble();

        total = salary + value * 0.15; //Here, 15% = 0.15
        System.out.print("Total Salary($):" + total);
    }
}
