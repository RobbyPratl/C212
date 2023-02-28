import java.util.Arrays;

public class Problem6 {

    public static void main(String[] args) {
        int[] test1 = {1, 5, 9, 10, 2, 4};
        int[] test2 = {2, 6, 1, 10, 2, 10};
        System.out.printf("Test 1: %s\n", Arrays.toString(findKLargest(test1, 3)));
        System.out.printf("Test 2: %s\n", Arrays.toString(findKLargest(test2, 2)));
    }

    private static int[] findKLargest(int[] arr, int k) {
        int[] res = new int[k];
        int[] copy = Arrays.copyOf(arr, arr.length);

        // Sort the array using BubbleSort. Perhaps using Arrays.sort() is easier.
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (copy[i] > copy[j]) {
                    int tmp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = tmp;
                }
            }
        }

        // Populate w/ k largest.
        for (int i = 0; i < k; i++) {
            res[res.length - i - 1] = copy[copy.length - i - 1];
        }
        
        return res;
    }
}
