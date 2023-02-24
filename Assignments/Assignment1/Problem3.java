import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input RH value BETWEEN 0 and 1");
        double rhVar = in.nextDouble();
        System.out.println("Please input Temperature (in degrees C)");
        double temp = in.nextDouble();
        double aVar = 17.27;
        double bVar = 237.7;
        double fTRH = (aVar * temp) / (bVar + temp) + Math.log(rhVar);
        double tDEquation = (bVar * (fTRH / (aVar - fTRH)));
        System.out.printf("%s%5.2f\n", "Dew point is ", tDEquation);
        System.out.println();
        in.close();

    }
}