package Revision;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int num; 
        System.out.print("Enter how many times you want the output:");
        num = input.nextInt(); 

        int i = 1; 
        while (i<=num){
            System.out.println(i+" Nahid ");
            i++;
        }
        
    }
    
}
