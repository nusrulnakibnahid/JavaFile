package Revision;

import java.util.Scanner;
/*
 * valid voter program using if,else 
 * step 1: ask for a person age
 * step 2: if age is equal or more than 18 than print valid voter
 * step 3: else print invalid voter
 */
public class Asg5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int age;
        System.out.print("Enter your age: "); 
        age = input.nextInt(); 


        if (age >= 18){
            System.out.println("Valid Voter");
        }
        else {
            System.out.println("Invalid Voter");
        }
    }
}
