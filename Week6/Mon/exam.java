
public class exam {

    public static void print2d(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println(a[i][j] + "\t");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] b = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[i][j] = a[j][i];
            }
        }
        print2d(a);
        print2d(b);
    }
}
