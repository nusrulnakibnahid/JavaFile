package Practice;

import java.util.Scanner;

public class TotalMarkPersentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ban,eng,math,science,ict,persentage,total_marks=500;
        System.out.print("Bangla marks:");
        ban = input.nextInt();

        System.out.print("English marks:");
        eng = input.nextInt();

        System.out.print("Math marks:");
        math = input.nextInt();

        System.out.print("Science marks:");
        science = input.nextInt();

        System.out.print("ICT marks:");
        ict = input.nextInt();


        persentage = ((ban+eng+math+science+ict)*100)/total_marks;

        System.out.print("Total Persentage:"+persentage+ "%"); 
    }
}
