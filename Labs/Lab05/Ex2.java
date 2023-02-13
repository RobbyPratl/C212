import java.util.*;

public class Ex2 {

    public static int eucDistance(int[] array1, int[] array2) {
        int sum = 0, sqrtSum;
        for (int i = 0; i < array1.length; i++) {
            sum = sum + (int) Math.pow((array1[i] - array2[i]), 2);
        }
        sqrtSum = (int) Math.sqrt(sum);
        return sqrtSum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the vectors: ");
        int size = in.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        System.out.print("Enter " + size + " coefficients of the first vector: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = in.nextInt();
        }

        System.out.print("Enter " + size + " coefficients of the second vector: ");
        for (int i = 0; i < size; i++) {
            arr2[i] = in.nextInt();
        }

        System.out.println("The Euclidean distance is: " + eucDistance(arr1, arr2));
    }
}
