package Control_Statement.Jump;

public class BreakStatementExample1 {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++){

            if(i==10){
                break;  //loop will be stop after output 9
            } 
            System.out.println(i);
        }
    }
}
