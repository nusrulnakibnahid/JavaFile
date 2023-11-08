package BasicJava;

import java.util.Scanner;
//1*3*5*7*........*n = ??? (odd numbers multiplication)
public class Series6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, mul = 1;
        System.out.print("Enter Last Number:");
        n = input.nextInt();
         
        //use while loop here(We can also use for loop & do-while loop for this)
        int i= 1;
        while(i<=n){
            mul = mul *i;
            System.out.println(" "+i);
            i = i+2;
        }

        System.out.print("Answer: "+mul);


    }
}
