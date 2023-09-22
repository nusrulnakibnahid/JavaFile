package Beecrowd_Problem_Solving;

import java.util.Scanner;
/*Write a program that reads an employee's number, his/her worked hours number in a month
and the amount he received per hour. Print the employee's number and salary that he/she will
receive at end of the month, with two decimal places. */

public class Problem1008 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number ,hour;
        float amount,salary;

        System.out.print("Employees number: ");
        number = input.nextInt(); 

        System.out.print("Total Hours: "); 
        hour = input.nextInt(); 

        System.out.print("Total Amount($): ");  //USD($)
        amount = input.nextInt();  

        salary = hour * amount;
        System.out.println("Salary: "+salary);
        System.out.print("Employee Number : "+number);

    }
}
