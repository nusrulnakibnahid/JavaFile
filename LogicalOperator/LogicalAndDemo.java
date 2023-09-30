package LogicalOperator;

import java.util.Scanner;
//Capital Small 
public class LogicalAndDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch;
        System.out.print("Enter any letter:");
        ch = input.next().charAt(0);   /*char(0) means if first letter is capital or 
                                             smaller output shows capital letter/small letter  */

        if(ch >= 'A' && ch <=  'Z') { //(A-Z)
            System.out.print("Capital Leter");
        }
        else if (ch>= 'a' && ch<= 'z'){ //(a-z)
            System.out.print("Small Letter");
        }

        else {
            System.out.print("Not a letter");
        }
    }
}
