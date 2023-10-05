package Practice;

import java.util.Scanner;
/*Modify the above question to allow student to sit if he/she has medical cause.
Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/
public class MedicalCaseOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char medical_cause;
        System.out.print("Do you have a medical cause for sitting the exam? (Y/N):");
        medical_cause = input.next().charAt(0);

        if(medical_cause == 'Y' || medical_cause == 'y') {
            System.out.print("You are allowed to sit the exam!");
        }

        else if(medical_cause == 'N' || medical_cause == 'n' ){
            System.out.print("You are not allowed to sit the exam");

        }

        else {
            System.out.println("Invalid.Please enter Y/N or y/n");
        }
    }
}
