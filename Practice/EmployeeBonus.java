package Practice;

import java.util.Scanner;
/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount. */
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;
        double salary,bonus=0.5;

        System.out.print("Enter employee total working years:");
        year = input.nextInt();

        System.out.print("Enter employee salary: ");
        salary = input.nextDouble();

        if(year>5){
            bonus = 0.5 * salary; //5%= 0.5
            System.out.print("Employee bonus: "+bonus);
        }
        else{
            System.out.print("Employee not getting bonus");
        }

    }
}
