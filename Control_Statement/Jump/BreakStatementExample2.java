package Control_Statement.Jump;

public class BreakStatementExample2 {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i=i+2){

            if(i==10){
                break; 
            } 
            System.out.println(i);
        }
    }
}
