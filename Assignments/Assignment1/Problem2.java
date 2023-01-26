import java.util.Scanner;

public class Problem2 {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
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
                System.out.printf(
                                "%-15s%.2f\n%-15s%.2f\n%-15s%.2f\n%-15s%.2f\n%-15s%.2f\n%-15s%.2f\n%-15s%.2f\n%-15s%.2f\n",
                                "Side1:",
                                side1,
                                "Side2:",
                                side2, "Side3:", side3,
                                "Perimeter:", perimeterTri,
                                "Area:", areaTri,
                                "Angle1:", angle1, "Angle2:", angle2, "Angle3:", angle3);
                System.out.println();
        }
}
