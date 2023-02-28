import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Problem2 {

    public static String getRecord(ArrayList<String> records, int n) {
        if (n < 0 || n >= records.size()) {
            return "Out of range";
        } else {
            return records.get(n);
        }

    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("/Users/uzielrivera-lopez/Documents/C212/C212Midterm_A/files/file2-1.txt"));

        ArrayList<String> records = new ArrayList<String>();
        while (in.hasNextLine()) {
            String line = in.nextLine();
            records.add(line);

        }
        in.close();
        Scanner in2 = new Scanner(System.in);

        while (in2.hasNextInt()) {
            int n = in2.nextInt();
            if (n < 0) {
                break;
            } else {
                System.out.println(getRecord(records, n));
            }
        }

        in2.close();
    }
}
