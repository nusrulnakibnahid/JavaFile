package Revision;

import java.util.Scanner;

public class ArmstrongEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 


        int sum = 0, num, r,temp;
        System.out.print("Enter number:");
        num = input.nextInt(); 

        temp = num ;

        while (temp != 0) {

            r = temp %10;
            sum = sum + r*r*r ;

            temp = temp/10;


            
        }   

        if (num == sum) {
            System.out.println("Armstrong number");
            
        }else{
            System.out.println("Not armstrong number");
        }
    
    }
}
