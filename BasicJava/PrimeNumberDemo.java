package BasicJava;

import java.util.Scanner;
//2,3,5,7,11,13,.........(prime number)
public class PrimeNumberDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,count=0;
        System.out.print("Enter an integer number:");
        num = input.nextInt();

        for(int i = 2; i<num; i++){
            if(num%i==0){
                count++;
                break;
        }
    }

        if(count==0){
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }

}

}
