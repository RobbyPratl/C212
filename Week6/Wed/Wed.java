import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.http.WebSocketHandshakeException;
import java.util.Scanner;

public class Wed {

    public static void fileRead() throws FileNotFoundException {
        File inputFlie = new File("Week6/Wed/files/input.txt");
        // the "universal" way would be
        // File inputFlie = new File("File/input.txt");
        Scanner in = new Scanner(inputFlie);

        while (in.hasNextLine()) {
            String str = in.nextLine();
            System.out.println(str);
        }

        in.close();
    }

    public static void fileWrite() throws FileNotFoundException {
        PrintWriter out = new PrintWriter("Week6/Wed/files/output.txt");
        out.print("Hello World");
        out.close();
    }

    public static void readTwoColumns() throws FileNotFoundException {
        File inputFile = new File("Week6/Wed/files/rc.txt");
        Scanner in = new Scanner(inputFile);

        int col1sum = 0;
        double col2sum = 0;

        while (in.hasNextInt()) {
            col1sum += in.nextInt();
            col2sum += in.nextDouble();
        }

        System.out.println(col1sum);
        System.out.println(col2sum);

        in.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        readTwoColumns();
    }
}
