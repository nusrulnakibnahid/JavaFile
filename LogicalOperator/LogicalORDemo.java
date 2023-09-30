package LogicalOperator;

import java.util.Scanner;
//Vowel & Consonant 
public class LogicalORDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any letter: ");
        ch = input.next().charAt(0);

        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U' ) {

            System.out.print("First letter is vowel");
        }

        else {
            System.out.print("Not vowel");
        }

    }
    
}