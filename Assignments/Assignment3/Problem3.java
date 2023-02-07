import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        double preyPopulation = 1000;
        double predatorPopulation = 20;
        double a = 0.1;
        double b = 0.01;
        double c = b;
        double d = 0.00002;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of years: ");
        int years = in.nextInt();
        for (int i = 0; i <= years; i++) {
            // preyPopulation = preyPopulation * (1 + a - b * predatorPopulation);
            // predatorPopulation = predatorPopulation * (1 - c + d * preyPopulation);
            preyPopulation = preyPopulation * (1 + a) - b * preyPopulation * predatorPopulation;
            predatorPopulation = predatorPopulation * (1 - c) + d * preyPopulation * predatorPopulation;

        }
        System.out.println("The number of prey is: " + preyPopulation);
        System.out.println("The number of predators is: " + predatorPopulation);

    }
}
