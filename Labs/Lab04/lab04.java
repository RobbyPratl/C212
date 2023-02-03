import java.util.Scanner;

public class lab04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Execrise 1

        System.out.print("Enter an integer: ");
        int number = in.nextInt();
        int remainder = 0;
        int binary = 0;
        int i = 1;

        while (number != 0) {
            remainder = number % 2;
            number /= 2;
            binary += remainder * i;
            i *= 10;
        }
        System.out.println(binary);

        // Exercise 2

        // Exercise 3

        // Exercise 4

    }
}
