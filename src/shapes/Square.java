package shapes;

public class Square extends Shape {
    private double length;

    public Square(double length) throws IllegalArgumentException {
        setLength(length);
    }

    public Square() {

    }

    public void setLength(double length) throws IllegalArgumentException {
        if (length < 0) {
            throw new IllegalArgumentException("Square length must be a positive number");
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

    public static double calculateArea(double length) throws IllegalArgumentException {
        if (length <= 0) {
            throw new IllegalArgumentException("Square length must be a positive number");
        }

        return 4 * length;
    }

    public String toString() {
        return "Square" + "\n" +
                "Length: " + this.length + "\n" +
                "Area: " + this.calculateArea() + "\n" +
                "Perimeter: " + this.calculatePerimeter() + "\n" +
                "---------------------\n";
    }
}
