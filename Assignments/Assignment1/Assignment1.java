import java.util.Scanner;

public class Assignment1 {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                // Problem 1

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
                System.out.printf("%s%11s%10s%10s\n", "Item", "Qty", "Price", "Total");
                System.out.printf("%s%6d%12.2f%10.2f\n", "Toaster", toasterNum, priceToaster,
                                totalToaster);
                System.out.printf("%s%3d%12.2f%10.2f\n", "Hair Dryer", hairDryNum,
                                priceHairDry, totalHairDry);
                System.out.printf("%s%3d%12.2f%10.2f\n", "Car Vacuum", carVacNum,
                                priceCarVac, totalCarVac);
                System.out.print("-------------------------------------------------------");
                System.out.println();
                System.out.printf("%s%2.2f", "Amount Due: ", totalCost);
                System.out.println();
                System.out.println();

                // Problem 2

                System.out.println("Enter values for point (x1, y1)");
                int x1 = in.nextInt();
                int y1 = in.nextInt();
                System.out.println("Enter values for point (x2,y2)");
                int x2 = in.nextInt();
                int y2 = in.nextInt();
                System.out.println("Enter values for point (x3,y3)");
                int x3 = in.nextInt();
                int y3 = in.nextInt();
                double side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
                double side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
                double side3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
                double perimeterTri = side1 + side2 + side3;
                double sVar = (side1 + side2 + side3) / 2;
                double areaTri = Math.sqrt((sVar * (sVar - side1) * (sVar - side2) * (sVar -
                                side3)));
                double angle3 = (180 / Math.PI) *
                                Math.acos((Math.pow(side1, 2) - Math.pow(side2, 2) - Math.pow(side3, 2)) /
                                                (-2 * side2 * side3));
                double angle1 = (180 / Math.PI) *
                                Math.acos((Math.pow(side2, 2) - Math.pow(side1, 2) - Math.pow(side3, 2)) /
                                                (-2 * side1 * side3));
                double angle2 = (180 / Math.PI) *
                                Math.acos((Math.pow(side3, 2) - Math.pow(side2, 2) - Math.pow(side1, 2)) /
                                                (-2 * side2 * side1));
                System.out.println();
                System.out.printf("%s\n", "Property Value");
                System.out.printf("%s\n", "---------------------------------------------");
                System.out.printf("%s%13.2f\n%s%14.2f\n%s%13.2f\n%s%10.2f\n%s%14.2f\n%s%14.2f\n%s%12.2f\n%s%13.2f\n",
                                "Side1:",
                                side1,
                                "Side2:",
                                side2, "Side3:", side3,
                                "Perimeter:", perimeterTri,
                                "Area:", areaTri,
                                "Angle1:", angle1, "Angle2:", angle2, "Angle3:", angle3);
                System.out.println();

                // Problem 3

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

                // Problem 4

                System.out.println("First Name");
                String firstName = in.next();
                System.out.println("Last Name");
                String lastName = in.next();
                System.out.println("Four Digit Number");
                String fourDigit = in.next();
                char firstLetter = firstName.charAt(0);
                String firstFive = lastName.substring(0, 5);
                String lastTwo = fourDigit.substring(2, 4);
                System.out.println("Your user login name: " + firstFive + firstLetter +
                                lastTwo);
                System.out.println();

                // Problem 5

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
                double coneVolume = ((Math.PI * (Math.pow(r1, 2) + (r1 * r2) + Math.pow(r2, 2))) / 3) * h3;
                double firstVolumeCyl = Math.PI * Math.pow(r2, 2) * h1;
                double secVolumeCyl = Math.PI * Math.pow(r1, 2) * h2;
                System.out.println(coneVolume + firstVolumeCyl + secVolumeCyl);

        }
}
