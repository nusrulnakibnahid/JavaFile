package BasicJava.Array;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int[] number = new int[5];

        number[0] = 10; // 10,20,30,40,10 are example numbers
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 10;

        System.out.println(number[4]);

        int sum;
        sum = number[0] + number[1] + number[2] + number[3] + number[4]; //Total sum of array
        System.out.println("Total = " + sum);

        int length;
        length = number.length; //Total length array 
        System.out.println("Array length = " + length);

    }

}
