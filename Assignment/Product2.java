package Assignment;
/*
 * Assignment-2 (Variable and Data type)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: assign the following data in main method
101,iphone15,1895 euros,perfect product with best image quality, phone,
* step 5: print the data
 */
public class Product2 {
    public static void main(String[] args){
        int id = 101;
        String title = "iphone 15";
        String price = "1895 euros";
        String description = "perfect product with best image quality"; 
        String category = "phone";


        System.out.println("ID is = "+id);
        System.out.println("Title is ="+title);
        System.out.println("Price is = "+price);
        System.out.println("Description = "+description);
        System.out.println("Category = "+category);
    }
    
}