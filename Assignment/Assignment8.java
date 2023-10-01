package Assignment;

import java.util.Scanner;
/* Logical AND assignment
 Check eligible candidate
 Step 1: Ask the candidate have you completed your masters? y/n 
 Step 2: Ask the candidate are you fulent in English? y/n 
 Step 3: if the candidate has passed masters and also have fluent english skill then print you are eligible to for the job interview
 Step 4: else print Sorry. you are not eligible to for the job interview */

public class Assignment8 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        char ans1,ans2;
        System.out.print("Have you completed your masters?\nAns:");
        ans1 = input.next().charAt(0);
        System.out.print("Are you fulent in English?\nAns:");
        ans2 = input.next().charAt(0);

        if(ans1 == 'y' && ans2 == 'y'){ //y means yes
            System.out.print("you are eligible to for the job interview");
        }

        else if(ans2 == 'n' && ans2 == 'n'){ //n means no
            System.out.print("Congratulation!\nYou are not eligible to for the job");
        }

        else {
            System.out.print("Sorry!\nYou are not eligible to for the job");
        }

    }

}
