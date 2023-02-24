import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Radius of the bottom of bottle (r1)");
        double r1 = in.nextDouble();
        System.out.println("Radius of the cap of bottle (r2)");
        double r2 = in.nextDouble();
        System.out.println("Height of cylinder first (h1)");
        double h1 = in.nextDouble();
        System.out.println("Second cylinder height (h2)");
        double h2 = in.nextDouble();
        System.out.println("height of cone section of the bottle (h3)");
        double h3 = in.nextDouble();
        double topeq = (Math.pow(r1, 2) + (r1 * r2) + Math.pow(r2, 2)) * h3;
        double coneVolume = Math.PI * (topeq / 3);
        double firstVolumeCyl = Math.PI * Math.pow(r1, 2) * h1;
        double secVolumeCyl = Math.PI * Math.pow(r2, 2) * h2;
        double totalVolume = coneVolume + firstVolumeCyl + secVolumeCyl;
        System.out.printf("%s%5.2f\n", "Total volume of the bottle is ", totalVolume);
        in.close();

    }
}
