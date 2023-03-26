
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandler {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the name of the file you want to read from: ");
            String fileName = scanner.nextLine();
            Path inputPath = Path.of(fileName);
            List<String> lines = Files.readAllLines(inputPath);
            List<String> shapes = new ArrayList<>();
            for (String line : lines) {
                String[] split = line.split(" ");
                String shape = split[0];
                int dimension = Integer.parseInt(split[1]);
                switch (shape.toLowerCase()) {
                    case "rectangle":
                        Rectangle rectangle = new Rectangle(dimension, dimension);
                        shapes.add(rectangle.getShape() + "\n");
                        break;
                    case "triangle":
                        Triangle triangle = new Triangle(dimension);
                        shapes.add(triangle.getShape() + "\n");
                        break;
                    case "rhombus":
                        Rhombus rhombus = new Rhombus(dimension);
                        shapes.add(rhombus.getShape());
                        break;
                    default:
                        System.err.println("Invalid shape data: " + line);
                }
            }
            Path outputPath = inputPath.resolveSibling(inputPath.getFileName().toString().replace(".in", ".out"));
            Files.write(outputPath, shapes);
            System.out.println("Shapes written to file: " + outputPath);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid dimension: " + e.getMessage());
        }
    }
}
