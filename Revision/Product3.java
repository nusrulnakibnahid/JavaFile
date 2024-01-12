package Revision;

import java.util.Scanner;

/*
 * Assignment-3 (User Input)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: get user input for each variables
* step 5: print the variables
 */
public class Product3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

         
        String id,price,title, description, category;
        

        System.out.print("Enter id: ");
        id = input.nextLine();

        System.out.print("Title:");
        title = input.nextLine();

        System.out.print("Enter description: ");
        description = input.nextLine();

        System.out.print("Enter category: ");
        category = input.nextLine();

        System.out.print("Price: ");
        price = input.nextLine();

    }
}
