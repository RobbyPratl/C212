import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of years: ");
        int years = in.nextInt();
        double prey = 1000;
        double predator = 20;
        double A = 0.1;
        double B = 0.01;
        double C = 0.01;
        double D = 0.00002;
        for (int i = 0; i < years; i++) {
            double prey1 = prey * (1 + A - B * predator);
            double predator1 = predator * (1 - C + D * prey);
            prey = prey1;
            predator = predator1;

        }

        System.out.printf("Prey population: %.2f%n", prey);
        System.out.printf("Predator population: %.2f%n", predator);

    }
}