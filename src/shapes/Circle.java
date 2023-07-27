package shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) throws IllegalArgumentException {
        setRadius(radius);
    }

    public Circle() {

    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius <= 0) {
            throw new IllegalArgumentException("Circle radius must be a positive number");
        }

        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double calculateArea() {
        return (22.0 / 7) * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (22.0 / 7) * this.radius;
    }

    public static double calculateArea(double radius) throws IllegalArgumentException {
        if (radius <= 0) {
            throw new IllegalArgumentException("Circle radius must be a positive number");
        }

        return (22.0 / 7) * radius * radius;
    }

    public String toString() {
        return "Circle" + "\n" +
                "Radius: " + this.radius + "\n" +
                "Area: " + this.calculateArea() + "\n" +
                "Perimeter: " + this.calculatePerimeter() + "\n" +
                "---------------------\n";
    }
}
