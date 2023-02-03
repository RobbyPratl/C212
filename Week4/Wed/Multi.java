import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Multiplication table

        // for (int i = 1; i <= 20; i++) {
        // for (int j = 0; j <= 20; j++) {
        // System.out.println(i + "x" + j + "=" + j * i);
        // }
        // }

        // Power

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.println(i + "^" + j + "=" + Math.pow(i, j));
            }

        }

    }
}