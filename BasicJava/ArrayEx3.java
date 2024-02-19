package BasicJava;

public class ArrayEx3 {
    public static void main(String[] args) {

        int[][] number = new int[4][2];

        number[0][0] = 10;
        number[0][1] = 20;
        number[1][0] = 30;
        number[1][1] = 40;
        number[2][0] = 50;
        number[2][1] = 60;
        number[3][0] = 70;
        number[3][1] = 80;

        for (int row = 0; row < 4; row++) {

            for (int col = 0; col < 2; col++) {
                System.out.print(number[row][col] + " ");
            }
        }

    }
}
