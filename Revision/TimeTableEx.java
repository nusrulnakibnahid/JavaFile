package Revision;

import java.util.Scanner;

public class TimeTableEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int num;
        System.out.print("Enter number:");
        num = input.nextInt(); 

        System.out.println("Time table for " +num+ " is:");


        for(int i = 1; i<=10; i++){
            
            System.out.println(num + "X" +i+ ":" +num*i);
        }
    }
}
