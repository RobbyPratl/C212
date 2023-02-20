import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//These are notes from Week 6 and are continued on Week7 
// Hence Week6 continued

public class W6cont {
    private static void populationWorld(String filename) throws FileNotFoundException {
        File inputFile = new File(filename);
        Scanner in = new Scanner(inputFile);
        int totalPop = 0;
        while (in.hasNextLine()) {
            String str = in.nextLine();
            String countryName = str.substring(0, str.indexOf('\t'));
            int countryPopulation = Integer.valueOf(str.substring(str.indexOf('\t') + 1));
            System.out.print(countryName + " ");
            System.out.println(countryPopulation);
            totalPop += countryPopulation;
        }

        System.out.println("Total Population " + totalPop);

        in.close();

    }

    public static void main(String[] args) throws FileNotFoundException {
        if (args.length == 0) {
            System.out.println("Please provide file name");
        } else {
            populationWorld(args[0]);
        }
    }
}
