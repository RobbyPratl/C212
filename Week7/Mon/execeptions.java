import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class execeptions {
    public static void fileRead() {
        File inputFile = null;
        Scanner in = null;
        try {
            File inputFlie = new File("Week6/Wed/files/inpu.txt");
            // the "universal" way would be
            // File inputFlie = new File("File/input.txt");
            in = new Scanner(inputFlie);

            while (in.hasNextLine()) {
                String str = in.nextLine();
                System.out.println(str);
            }

            in.close();
        } catch (FileNotFoundException exception) {
            System.out.println("File was not found in location");
        } catch (InputMismatchException exception) {
            System.out.println("Interger was expeceted");
        }
    }

    public static void main(String[] args) {
        fileRead();
    }
}
