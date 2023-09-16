package Practice;

import java.util.Scanner;

//Assignment Operator
public class Practice6 {

    public static void main(String[] args) {
        

       Scanner input = new Scanner(System.in);

       int a,b;

       System.out.print("Enter a = ");
       a = input.nextInt();

       System.out.print("Enter b = ");
       b = input.nextInt();


       a+=b;
       System.out.println("a="+a);

       a-=b;
       System.out.println("a="+a);

       a*=b;
       System.out.println("a="+a);

       a/=b;
       System.out.println("a="+a);

       a%=b;
       System.out.println("a="+a);
  
    }
    
}