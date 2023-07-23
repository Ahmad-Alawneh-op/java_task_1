package shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public Circle() {
        this(0);
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            this.radius = 0;

            return;
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

    public static double calculateArea(double radius) {
        if (radius < 0) {
            return 0;
        }

        return Math.PI * radius * radius;
    }
}
