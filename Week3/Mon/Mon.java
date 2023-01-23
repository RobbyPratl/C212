import java.util.Scanner;

public class Mon {
    public static void main(String[] args) {
        int floor, actualFloor;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter floor #");
        floor = in.nextInt();
        if (floor > 13) {
            actualFloor = floor - 1;
        } else {
            actualFloor = floor;
        }
        actualFloor = floor > 13 ? floor - 1 : floor;
        System.out.println("Actual floor " + actualFloor);
    }
}
