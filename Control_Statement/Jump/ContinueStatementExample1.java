package Control_Statement.Jump;

public class ContinueStatementExample1 {
    public static void main(String[] args) {
        for (int a=1; a<=20; a++){

            if(a==10){
                continue; //only 10 can not be the output
            }
            System.out.println(a);
        }
    }
}
