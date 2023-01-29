import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many hours did you work?");
        double hours = in.nextDouble();
        System.out.println("What is your hourly wage?");
        double hourRate = in.nextDouble();
        double totalM;
        if (hours > 40) {
            totalM = 40 * hourRate + (((hours - 40) * hourRate) * 1.5);
            System.out.printf("%s%.2f", "You earned $", totalM);
            System.out.println(" this week");
        } else {
            totalM = hours * hourRate;
            System.out.printf("%s%.2f", "You earned $", totalM);
            System.out.println(" this week");
        }
    }
}
