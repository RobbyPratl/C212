public class Circle {
    protected double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("A circle must have a non-negative radius");
        }
        this.radius = radius; // new for this week: use this keyword to refer to the current class
                                // and its members to avoid name conflicts
    }

    // Super helpful IntelliJ tip:
    // You can also use right-click > Generate... to create "boilerplate" constructors, getters and setters for you!
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
