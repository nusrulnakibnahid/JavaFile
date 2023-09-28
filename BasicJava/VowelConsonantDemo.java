package BasicJava;

import java.util.Scanner;

public class VowelConsonantDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch;
        System.out.print("Enter any letter: ");
        ch = input.next().charAt(0); /*here,charAt(0) means if first letter is vowel than output shows "vowel"
                                            if here,charAt(1) that means if second letter is vowel than output shows "vowel*/
        if(ch == 'a'){
            System.out.print("Vowel ");
        }

        else if(ch == 'e'){
        System.out.print("Vowel ");
        }

        else if(ch == 'i'){
            System.out.print("Vowel ");
        }

        else if(ch == 'o') {
            System.out.print("Vowel");
        }
        else if(ch == 'u') {
            System.out.print("Vowel ");
        }

        else{
            System.out.print("Not Vowel ");
        }

    }
}
