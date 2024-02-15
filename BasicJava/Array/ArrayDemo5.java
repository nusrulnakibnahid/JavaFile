package BasicJava.Array;
//for each loop using in array
public class ArrayDemo5 {
    public static void main(String[] args) {
        String [] name = {"Md", " Nusrul", " Nakib", " Nahid"};

        System.out.println("Array size: " +name.length);

        //for each loop
        for (String x : name) {
            System.out.print(x);
        }
        System.out.println();

        
        //another example for each loop
        int [] number = {10, 20, 30, 40, 50, 60, 70,80,90};
        int sum =0;

        System.out.println("Array size of numbers: "+number.length);

        for (int x : number) {
            System.out.println(x);
            sum = x+sum;
        }
        System.out.println("Sum is:"+sum);
    }
}
