import java.util.Scanner;

public class uwd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a floating-point number, and do -1 to quit: ");
        double number = in.nextDouble();
        double sum = 0;
        double avg = 0;
        double stdDev = 0;
        int counter = 0;

        while (number != -1) {
            sum += number;
            counter++;
            number = in.nextDouble();
        }
        stdDev = Math.sqrt(sum / counter);

        avg = sum / counter;
        System.out.println("Avg is " + avg);
        System.out.println("Standard deviation is " + stdDev);
    }
}
