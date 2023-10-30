package Control_Statement.Looping;

import java.util.Scanner;

public class WhileVSDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //while loop
        int x = 1; 
        while(x<=5){
            System.out.println("Bangladesh");
            x++;
        }

        //do-while loop
        int y =1;

        do {
            System.out.println("Bangladesh");
            y++;
        } while(y<=5);



        //while loop with user input
        int a;
        System.out.print("Enter a:");
        a = input.nextInt();

        while(a<=10){
            System.out.println(a+" Hi Coder ");
            a++;
        }

        /*do-while loop using user input(do-while loop always print then check the condition.
        That's why if condition is false but do while loop print the output 1 time) */
        int b;
        System.out.print("Enter b:");        
        b = input.nextInt();

        do {
            System.out.println(b+" Daffodil International University ");
            b++;
        }while(b<=10);


    }
}
