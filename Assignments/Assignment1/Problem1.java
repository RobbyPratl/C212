import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of Toaster");
        int toasterNum = in.nextInt();
        System.out.println("Please enter the number of Hair Dryer");
        int hairDryNum = in.nextInt();
        System.out.println("Please enter the number of Car Vacuum");
        int carVacNum = in.nextInt();
        final double priceToaster = 29.95;
        final double priceHairDry = 24.95;
        final double priceCarVac = 19.99;
        double totalToaster = priceToaster * (double) toasterNum;
        double totalHairDry = priceHairDry * (double) hairDryNum;
        double totalCarVac = priceCarVac * (double) carVacNum;
        double totalCost = totalCarVac + totalHairDry + totalToaster;
        System.out.println();
        System.out.println("Invoice");
        System.out.println();
        System.out.printf("%-15s%s%14s%15s\n", "Item", "Qty", "Price", "Total");
        System.out.printf("%-15s%d%16.2f%15.2f\n", "Toaster", toasterNum, priceToaster,
                totalToaster);
        System.out.printf("%-15s%d%16.2f%15.2f\n", "Hair Dryer", hairDryNum,
                priceHairDry, totalHairDry);
        System.out.printf("%-15s%d%16.2f%15.2f\n", "Car Vacuum", carVacNum,
                priceCarVac, totalCarVac);
        System.out.print("-------------------------------------------------------");
        System.out.println();
        System.out.printf("%s%2.2f", "Amount Due: ", totalCost);
        System.out.println();
        System.out.println();
    }
}
