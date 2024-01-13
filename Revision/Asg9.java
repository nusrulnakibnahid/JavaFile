package Revision;

import java.util.Scanner;

// switch assignment: call center
// if user select option 1 then set language bengali
// if user select option 2 then set language hindi
// if user select option 3 then set language urdu
// for any other option set language english
public class Asg9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opt;
        System.out.print("Enter language: ");
        opt = input.nextInt();

        switch (opt) {
            case 1:
                System.out.println("Bengali");

                break;

            case 2:
                System.out.println("Hindi");
                break;

            case 3:
                System.out.println("Urdu");
                break;

            default:
                System.out.println("English");
                break;
        }

    }
}
