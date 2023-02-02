import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number, and q to quit");
        double max = in.nextDouble();
        while (in.hasNextDouble()) {
            double input = in.nextDouble();
            if (input > max) {
                max = input;
            }
        }
        System.out.println("Max is " + max);
    }
}
