package Revision;

import java.util.Scanner;

public class PalindromeNumEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 


        int sum = 0, r,temp,num;

        System.out.print("Enter the number:");
        num = input.nextInt(); 


        temp = num;

        while(temp != 0){

            r = temp%10;
            sum = sum*10 + r;
            temp = temp/10;
        }

        if (num == sum) {
            System.out.println(num + " is a palindrome number");
            
        }

        else{
            System.out.println(num + " is not a palindrome number");
        }
    }
    
}
