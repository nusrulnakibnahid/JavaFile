package BasicJava;

import java.util.Scanner;
//2*4*6*......*n = ???(even numbers multiplication)
public class Series7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, mul = 1;

        System.out.print("Enter last number(n):");
        n = input.nextInt(); 
        

        //use do-while loop here(We can also use for loop & while loop for this)
        int i = 2;
        do {
            System.out.print(" "+i);
            mul = mul * i;
            i = i+2;
        } while (i<=n);

        System.out.println(); //for new line

        System.out.println("Answer: "+mul);
    }
}
