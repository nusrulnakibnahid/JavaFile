package Practice;

import java.util.Scanner;
// validate user based on username and password
// input username and password until username=="nahid" and password=="978"
// if username and password does not match print "username/password is incorrect. Please try again"
// if username and password does not match print "welcome to the system"
public class UserPassCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i =0; i<=3; i++){
            int pass;
            String name;
            System.out.print("Enter Username:");
            name = input.nextLine();
            System.out.print("Enter Password:");
            pass = input.nextInt();


            if("nahid".equals(name) && pass == 978){
                System.out.println("Welcome");
            }else{
                System.out.println("Usernam or password is incorrect"); 
                System.out.println(); //for newline
            
            }
        }
    }
    
}
