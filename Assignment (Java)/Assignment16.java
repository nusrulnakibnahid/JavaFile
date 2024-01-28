package Assignment;

import java.util.Scanner;

// validate user based on username and password
// input username and password until username=="nahid" and password=="123456"
// if username and password does not match print "username/password is incorrect. Please try again"
// if username and password does not match print "welcome to the system"
public class Assignment16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        for (int i = 0; i <=3; i++) { // 3 বার ইনপুট নেওয়ার জন্য একটি For লুপ

            System.out.print("Enter your username:");
            String name = input.next(); // ব্যবহারকারীর username String ভ্যারিয়েবলে স্টোর হয়েছে
            System.out.print("Enter password:");
            int pass = input.nextInt();

            if ("nahid".equals(name) && pass == 123456) { // যদি username "nahid" এবং password 123456 এর সমান হয়

                System.out.println("Wellcome to the system"); // স্থিতি ম্যাসেজ প্রিন্ট করে এবং লুপ থেকে বের হয়ে যায়
                break;

            } else {

                System.out.println("username or password is incorrect");  // username অথবা password ভুল হলে ত্রুটি ম্যাসেজ প্রিন্ট করা হয়

            }

        }
    }
}
