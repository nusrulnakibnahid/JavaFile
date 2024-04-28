package BasicJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
    public static void main(String[] args) {

        Date date = new Date();

        DateFormat dateFormat = new SimpleDateFormat("DD/MM/YYYY");
        String CurrentDate = dateFormat.format(date);
        System.out.println("Current date = "+CurrentDate);
        
        
    }
}
