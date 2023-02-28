import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Problem5 {
    public static int findSecondLargest(int[][] arr) {
        int secondLargest = 0;
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > largest) {
                    secondLargest = largest;
                    largest = arr[i][j];
                } else if (arr[i][j] > secondLargest) {
                    secondLargest = arr[i][j];
                }
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) throws FileNotFoundException {

        int nRows = 4, nCols = 4;
        try {
            int[][] arr = new int[nRows][nCols];

            Scanner in = new Scanner(new File("/Users/uzielrivera-lopez/Documents/C212Midterm_A/files/file5.txt"));// uses
                                                                                                                   // my
                                                                                                                   // exact
                                                                                                                   // path
                                                                                                                   // but
                                                                                                                   // it
                                                                                                                   // would
                                                                                                                   // be
                                                                                                                   // file/file5.txt
            for (int i = 0; i < nRows; i++) {
                for (int j = 0; j < nCols; j++) {
                    arr[i][j] = in.nextInt();
                }
            }
            in.close();

            int secondLargest = findSecondLargest(arr);

            System.out.println("The second largest value in the array is " + secondLargest);

        } catch (FileNotFoundException ex) {
            System.out.println("file was not found");
        } catch (NoSuchElementException ex) {
            System.out.println("No value found");
        }
    }
}
