package Practice;

import java.util.Scanner;

//Min and Max between three numbers
public class MaximumMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;
        int min,max;
        System.out.print("Enter num a: ");
        a = input.nextInt();
        System.out.print("Enter num b: ");
        b = input.nextInt();
        System.out.print("Enter num c: ");
        c = input.nextInt();
        
        //maximum number
        if(a>b && a>c){
            max = a;
        }
        else if(b>a && b>c){
            max = b;
        }

        else{
            max = c;
        }
        //minimum number
        if(a<b && a<c){
            min = a;
        }

        else if(b<a && b<c){
            min = b;
        }
        else{
            min = c;
        }
        System.out.println("You entered: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Maximum Number: " + max);
        System.out.println("Minimum Number: " + min);

    }
}
