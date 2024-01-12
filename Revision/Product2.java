package Revision;
/*
 * Assignment-2 (Variable and Data type)
 * step 1: create a class called Product2
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: assign the following data in main method
101,iphone15,1895 euros,perfect product with best image quality, phone,
* step 5: print the data
 */
public class Product2 {

    public static void main(String[] args) {

        int id,price;
        String title,description,category; 

        id = 101;
        price = 1895;
        title = "title 15";
        description = "perfect product with best image quality";
        category = "Phone"; 


        System.out.println("id: " +id);
        System.out.println("price: " +price);
        System.out.println("title: " +title);
        System.out.println("description: " +description);
        System.out.println("category: " +category);
        

        
    }
    
}
