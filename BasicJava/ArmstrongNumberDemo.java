package BasicJava;

import java.util.Scanner;

public class ArmstrongNumberDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0,num,r,temp;
        System.out.print("Enter Number: ");
        num = input.nextInt();

        temp = num;

        while(temp!=0){
            r = temp%10;
            sum = sum +r*r*r;
            temp =temp = temp/10;
        }
        System.out.println("Answer: " +sum);

        if(sum == num){
            System.out.print("Armstrong number");
        }else{
            System.out.println("Not armstrong number");
        }
    }
}
