import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter temperature value");
        double temperature = in.nextDouble();
        System.out.println("Indicate with a C for Celsius or F for Fahrenheit");
        String units = in.next();
        if (units.substring(0).equals("C") || units.substring(0).equals("c")) {
            if (temperature <= 0) {
                System.out.println("The state of water is: solid");
            } else if (temperature >= 100) {
                System.out.println("The state of water is: gaseous");
            } else {
                System.out.println("The state of water is: liquid");
            }
        } else if (units.substring(0).equals("F") || units.substring(0).equals("f")) {
            if (temperature <= 32) {
                System.out.println("The state of water is: solid");
            } else if (temperature >= 212) {
                System.out.println("The state of water is: gaseous");
            } else {
                System.out.println("The state of water is: liquid");
            }
        } else {
            System.out.println("Invalid input. Please indicate with an F (Fahreheit) or C (Celsius)");
        }
        in.close();

    }
}
