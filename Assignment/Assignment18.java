package Assignment;

import java.util.Scanner;

/*
 * Assigment 18 (Print the day name)
 * declare an array of weekdays 
 * User will give a day number you have to print the equivalent day name
 * 
 * Example 1
 * input-> Enter day number (1-7) : 1
 * output-> Sunday
 * 
 * Example 2
 * input-> Enter day number (1-7) : 3
 * output-> Monday
 */
public class Assignment18 {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);

        String[] day = new String[7];  /*
                                        if we print this line- String[] day = {"Saturday", "Sunday", "Monday",
                                        "Tuesday", "Wednesday", "Thursday",}
                                        than we can't need to print This line- day[0] = "Saturday";
                                        day[1] = "Sunday";
                                        day[2] = "Monday";
                                        day[3] = "Tuesday";
                                        day[4] = "Wednesday";
                                        day[5] = "Thursday";
                                        day[6] = "Friday";
                                       */

        day[0] = "Saturday";
        day[1] = "Sunday";
        day[2] = "Monday";
        day[3] = "Tuesday";
        day[4] = "Wednesday";
        day[5] = "Thursday";
        day[6] = "Friday";

        System.out.print("Enter day number (1-7): ");
        int n = input.nextInt();

        for (int i = 0; i < day.length; i++) {
            if (i == n)// If the loop matches the value of 'n' then each day name will be printed.
                System.out.println("The day is: " + day[i]);
        }

    }
}