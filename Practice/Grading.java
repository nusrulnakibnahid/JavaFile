package Practice;

import java.util.Scanner;
/*A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade */
public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int marks;
        System.out.print("Enter Student marks:");
        marks = input.nextInt();

        if(marks<25){
        System.out.print("Grade:F");
        }

        else if(marks>=25 && marks<45){
        System.out.print("Grade:E");
        }

        else if(marks>= 45 && marks<50){
        System.out.println("Grade:D");
        }

        else if(marks>=50 && marks<60){
        System.out.println("Grade:C"); 
        }

        else if(marks>=60 && marks<80){
            System.out.print("Grade:B");
        }

        else {
            System.out.print("Grade: A");
        }


    }
}
