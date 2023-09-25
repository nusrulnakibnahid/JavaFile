package Control_Statement;

import java.util.Scanner;

public class ElseIfLadderDemo {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in); 

    int num;
    System.out.print("Enter any integer number : ");
    num = input.nextInt();

    if(num>0){
        System.out.print("Number is positive");
    }

    else if(num<0){
        System.out.print("Number is negative");
    }

    else{
        System.out.print("Number is zero"); //if input(num = 0),than the output shows (Number is zero)
    }

    }
}
