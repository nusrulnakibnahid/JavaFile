package Revision;

import java.util.Scanner;

public class NameRepeatEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("Please enter your name:");
        name = input.nextLine();

        for (int i = 1; i <= 100; i++) {
            System.out.println(i + "." + name);
        }

    }
}
