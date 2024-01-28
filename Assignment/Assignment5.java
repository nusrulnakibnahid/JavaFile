package Assignment;

import java.util.Scanner;
/*
 * valid voter program using if,else 
 * step 1: ask for a person age
 * step 2: if age is equal or more than 18 than print valid voter
 * step 3: else print invalid voter
 */
public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        System.out.print("Person's age is: ");
        age = input.nextInt();

        if(age>=18){
        System.out.print("Valid voter");
        }
        else{
            System.out.print("Invalid Voter");
        }
    }
}