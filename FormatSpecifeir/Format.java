package FormatSpecifeir;

public class Format {
    public static void main(String[] args){

        boolean b = true;
        char c = 'a';
        short s = 32677;
        int i = 12657;
        float f = 10.2f; 
        double d = 57.9;
    

        System.out.printf("boolean b = %b\n",b );
        System.out.printf("char c = %c\n",c);
        System.out.printf("short s = %d\n",s);
        System.out.printf("int i = %d\n",i);
        System.out.printf("float = %.3f\n",f);
        System.out.printf("double d = %.4f\n",d);
    }
    
}
