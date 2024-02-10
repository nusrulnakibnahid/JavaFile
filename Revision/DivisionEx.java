package Revision;

import java.util.Scanner;

public class DivisionEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, div;

        System.out.print("Enter First Number:");
        x = input.nextInt();

        System.out.print("Enter Second Number:");
        y = input.nextInt();

        div = x / y;
        System.out.print("Answer:" + div);
    }

}
