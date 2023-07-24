package shapes;

public class Triangle extends Shape {
    private double base;
    private double height;
    private double sideA;
    private double sideC;

    public Triangle(double base, double height, double sideA, double sideC) throws IllegalArgumentException {
        setBase(base);
        setHeight(height);
        setSideA(sideA);
        setSideC(sideC);
    }

    public Triangle() {

    }

    public void setBase(double base) throws IllegalArgumentException {
        if (base < 0) {
            throw new IllegalArgumentException("Triangle base must be a positive number");
        }

        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) throws IllegalArgumentException {
        if (height < 0) {
            throw new IllegalArgumentException("Triangle height must be a positive number");
        }

        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setSideA(double sideA) throws IllegalArgumentException {
        if (sideA < 0) {
            throw new IllegalArgumentException("Triangle sideA must be a positive number");
        }

        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideC(double sideC) throws IllegalArgumentException {
        if (sideC < 0) {
            throw new IllegalArgumentException("Triangle sideC must be a positive number");
        }

        this.sideC = sideC;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public double calculateArea() {
        return (this.height * this.base) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return this.sideA + this.base + this.sideC;
    }

    public static double calculateArea(double base, double height) throws IllegalArgumentException {
        if (base < 0) {
            throw new IllegalArgumentException("Triangle base must be a positive number");
        }

        if (height < 0) {
            throw new IllegalArgumentException("Triangle height must be a positive number");
        }

        return (base * height) / 2;
    }

    public String toString() {
        return "Triangle" + "\n" +
                "Base: " + this.base + "\n" +
                "Height: " + this.height + "\n" +
                "Area: " + this.calculateArea() + "\n" +
                "Perimeter: " + this.calculatePerimeter() + "\n" +
                "---------------------\n";
    }
}
