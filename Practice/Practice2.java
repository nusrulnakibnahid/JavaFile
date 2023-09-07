package Practice;
//Write a program to take two integer inputs from user and print sub and product of them.
import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a,b,sub;

        System.out.print("Enter value a = ");
        a = input.nextInt();
        System.out.print("Enter value b = ");
        b =  input.nextInt();

        sub = a-b;


        System.out.print("Substraction of a-b = "+sub);


    }
    
}
