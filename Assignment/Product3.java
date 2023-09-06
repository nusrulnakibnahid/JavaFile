package Assignment;

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
        Scanner input_id = new Scanner(System.in);
        Scanner input_title = new Scanner(System.in);
        Scanner input_price = new Scanner(System.in);
        Scanner input_description = new Scanner(System.in);
        Scanner input_category = new Scanner(System.in);


        int id;
        String title;
        int price;
        String description;
        String category;

        System.out.print("Enter your id: ");
        id = input_id.nextInt();
        System.out.println("Id : "+id);

        System.out.print("Title is: ");
        title = input_title.nextLine();
        System.out.println("Title:"+title);

        System.out.print("Price: ");
        price = input_price.nextInt();
        System.out.println("Price is: "+price);

        System.out.print("Description: ");
        description = input_description.nextLine();
        System.out.println("Description: "+description);

        System.out.print("Category");
        category = input_category.nextLine();
        System.out.println("Category: "+category);


    }
    
}