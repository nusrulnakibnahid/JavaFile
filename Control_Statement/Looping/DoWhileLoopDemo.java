package Control_Statement.Looping;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        
        int i =1;

        do {
            System.out.println(" Bangladesh ");
            i++;
        } while(i<=10); 


        int j =1;
        do {
            System.out.println(j+ " Hi Coder "); //j+ use for show the serial number 
            j++;
        }while(j<=20);

        int k=1;
        do {
            System.out.println(k); // k use for only show the serial number
            k++;
        }while(k<=50);

        int a =0; //find even number 
        do {
            System.out.println(a);
            a=a+2;
        } while (a<=100);

        int b =1;//find odd number
        do {
            System.out.println(b);
            b = b+2;
        } while(b<=100);


    }
}
