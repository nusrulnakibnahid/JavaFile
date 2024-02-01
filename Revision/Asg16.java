package Revision;

import java.util.Scanner;

public class Asg16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= 3; i++) {
            String name;
            System.out.print("Enter name:");
            name = input.next();

            int pass;
            System.out.print("Enter password:");
            pass = input.nextInt();

            if ("nahid".equals(name) && pass == 12345) {

                System.out.println("Welcome to the system");
                break;

            } else {
                System.out.println("username or password is incorrect");
            }

        }
    }

}
