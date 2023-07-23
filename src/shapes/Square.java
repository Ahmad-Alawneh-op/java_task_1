package shapes;

public class Square extends Shape {
    private double length;

    public Square(double length) {
        setLength(length);
    }

    public Square() {
        this(0);
    }

    public void setLength(double length) {
        if (length < 0) {
            this.length = 0;

            return;
        }

        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    @Override
    public double calculateArea() {
        return this.length * this.length;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * this.length;
    }

    public static double calculateArea(double length) {
        if (length < 0) {
            return 0;
        }

        return 4 * length;
    }
}
