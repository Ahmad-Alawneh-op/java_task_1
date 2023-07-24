package shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) throws IllegalArgumentException {
        setRadius(radius);
    }

    public Circle() {

    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius < 0) {
            throw new IllegalArgumentException("Circle radius must be a positive number");
        }

        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public static double calculateArea(double radius) throws IllegalArgumentException{
        if (radius < 0) {
            throw new IllegalArgumentException("Circle radius must be a positive number");
        }

        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle" + "\n" +
                "Radius: " + this.radius + "\n" +
                "Area: " + this.calculateArea() + "\n" +
                "Perimeter: " + this.calculatePerimeter() + "\n" +
                "---------------------\n";
    }
}
