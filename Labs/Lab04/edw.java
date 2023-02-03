import java.util.Scanner;

public class edw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number, or 'q' to quit: ");
        while (in.hasNextDouble()) {
            double number = in.nextDouble();
            if (number < 0) {
                if (Math.abs(number) < 1) {
                    System.out.println("Negative small");
                } else if (Math.abs(number) > 1000000) {
                    System.out.println("Negative larger");
                } else {
                    System.out.println("Negative");
                }
            } else if (number > 0) {
                if (Math.abs(number) < 1) {
                    System.out.println("Positive small");
                } else if (Math.abs(number) > 1000000) {
                    System.out.println("Postive larger");
                } else {
                    System.out.println("Positive");
                }
            }
            System.out.println("Enter a number, or 'q' to quit: ");

        }
        System.out.println("Have a good day");
    }
}
