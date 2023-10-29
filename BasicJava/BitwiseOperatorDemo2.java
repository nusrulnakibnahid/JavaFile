package BasicJava;
//Bitwise Shift Right(>>),Shift Left(<<) demo
import java.util.Scanner;

public class BitwiseOperatorDemo2 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int a,b;
        System.out.print("Enter a: ");
        a = input.nextInt();

        b = a>>3;
        System.out.println("a>> = "+b); 

        b = a<<3;
        System.out.println("a<< = "+b);
    }
}
