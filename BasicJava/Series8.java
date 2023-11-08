package BasicJava;

import java.util.Scanner;
//1.5*2.5*3.5*......* n = ??? 
public class Series8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n, mul = 1;

        System.out.print("Enter lat number(n):");
        n = input.nextDouble();

        

        for(double i=1.5; i<=n; i++){
            mul = mul *i;
            System.out.print("," +i);
        }
        System.out.println();

        System.out.print("Answer:" +mul);

    }
}
