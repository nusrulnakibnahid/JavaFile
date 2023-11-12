package BasicJava;

import java.util.Scanner;

public class PalindromeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int sum=0, num,r,temp;

        System.out.print("Enter a number:");
        num = input.nextInt(); 

        temp = num;

        while(temp!= 0){
            r = temp % 10;
            sum = sum*10 +r;
            temp = temp/10;
        }

        System.out.println("Reverse Number:"+sum);

        if(num == sum){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a palindrome number"); 
        }
    }
}