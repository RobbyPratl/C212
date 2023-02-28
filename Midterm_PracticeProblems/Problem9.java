import java.util.ArrayList;

public class Problem9 {
    public static void main(String[] args) {
        int[][] test1 = {{1, 3, 5}, {2, 4, 8}};
        int[][] test2 = {{1, 3, 10, 5}, {2, 4, 4, 8}};
        System.out.printf("Test 1: %b\n", allDistinct(test1));
        System.out.printf("Test 2: %b\n", allDistinct(test2));
    }

    private static boolean allDistinct(int[][] arr) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (nums.contains(arr[i][j])) {
                    return false;
                }
                nums.add(arr[i][j]);
            }
        }
        return true;
    }
}
