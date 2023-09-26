package BasicJava;

import java.util.Scanner;
//Bangladesh board exam grading system
public class GradingSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int marks;
        System.out.println("Enter Student Marks: ");
        marks = input.nextInt();

        if(marks>=80){

            System.out.print("Student Get A+");
        }

        else if (marks >=70 && marks <=79) {

            System.out.print("Student Get A");
        }

        else if (marks>=60 && marks<=69){

            System.out.print("Student Get A-");
        }

        else if (marks>=50 && marks<=59){

            System.out.print("Student Get B");
        }

        else if (marks>=40 && marks<=49) {

            System.out.print("Student Get C");
        } 

        else if (marks>=33 && marks<=39){

            System.out.print("Student Get D");
        }

        else {
            System.out.print("Student are fail");
        }

    }
}