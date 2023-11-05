package Control_Statement.Jump;

public class ContinueStatementExample2 {
    public static void main(String[] args) {
        for (int i =1; i<=50; i=i+3){

            if(i==10){
                continue; 
            }
            System.out.println(i);
        }
    }
}
