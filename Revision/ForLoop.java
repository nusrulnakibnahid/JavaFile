package Revision;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter how many time you want the output: ");
        num = input.nextInt(); 

        for(int i=1; i<=num; i++){
            System.out.println(i+ " Assalamu-alaikum ");
        }
    }
}
