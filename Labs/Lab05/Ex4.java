import java.util.Arrays;

public class Ex4 {
    public static int[] sumOfArrays(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            ans[i] = arr1[i] + arr2[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 13, 4, 50 };
        int[] resultArr = sumOfArrays(arr1, arr2);
        System.out.println("Array1: " + Arrays.toString(arr1));
        System.out.println("Array2: " + Arrays.toString(arr2));
        System.out.println("Result Array: " + Arrays.toString(resultArr));
    }

}