import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q3 {
    public static void readFile() throws FileNotFoundException {
        File file = new File("Labs/Lab06/Q3.txt");
        Scanner in = new Scanner(file);
        String str = "";
        while (in.hasNextLine()) {
            String line = in.nextLine();
            if (!line.isBlank()) {
                str += line + "  ";
            }
        }
        in.close();
        System.out.println(str);

    }

    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }

}