
public class Shape {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2);
        rectangle.printShape();
        Rectangle rectangle1 = new Rectangle(5, 4);
        rectangle1.printShape();
        Rectangle rectangle2 = new Rectangle(3, 9);
        rectangle2.printShape();

        Triangle triangle = new Triangle(1);
        triangle.printShape();
        Triangle triangle1 = new Triangle(5);
        triangle1.printShape();
        Triangle triangle2 = new Triangle(3);
        triangle2.printShape();

        Rhombus rhombus = new Rhombus(1);
        rhombus.printShape();
        Rhombus rhombus1 = new Rhombus(5);
        rhombus1.printShape();
        Rhombus rhombus2 = new Rhombus(3);
        rhombus2.printShape();
    }

    public void printShape() {
    }
}
