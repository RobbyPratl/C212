import java.util.Arrays;

public class Problem5 {

    public static void main(String[] args) {
        int[][] test1 = {{1, 3, 5}, {2, 4, 8}};
        System.out.println(Arrays.deepToString(swapRowCol(test1)));
    }

    private static int[][] swapRowCol(int[][] arr) {
        int[][] res = new int[arr[0].length][arr.length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = arr[j][i];
            }
        }
        return res;
    }
}
