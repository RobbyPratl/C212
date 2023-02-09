import java.util.Scanner;

public class Ex3 {

    public static double distance(double[] a, double[] b) {
        if (a.length != b.length) {
            return -1;
        }
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.pow(a[i] - b[i], 2);
        }
        return Math.sqrt(sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dimensions for vectors: ");
        int d = in.nextInt();
        double[] v1 = new double[d];
        double[] v2 = new double[d];
        System.out.println("Input the values for the vectors (" + d + " * 2 elements): ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < d; j++) {
                if (i == 0) {
                    v1[j] = in.nextDouble();
                } else {
                    v2[j] = in.nextDouble();
                }
            }
        }
        System.out.println("Euclidean distance: " + distance(v1, v2));
    }

}
