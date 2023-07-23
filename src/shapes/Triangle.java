package shapes;

public class Triangle extends Shape {

    private double base;
    private double height;
    private double sideA;
    private double sideC;

    public Triangle(double base, double height, double sideA, double sideC) {
        setBase(base);
        setHeight(height);
        setSideA(sideA);
        setSideC(sideC);
    }

    public Triangle() {
        this(0, 0, 0, 0);
    }

    public void setBase(double base) {
        if (base < 0) {
            this.base = 0;

            return;
        }

        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;

            return;
        }

        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setSideA(double sideA) {
        if (sideA < 0) {
            this.sideA = 0;

            return;
        }

        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideC(double sideC) {
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

    public static double calculateArea(double base, double height) {
        if (base < 0 || height < 0) {
            return 0;
        }

        return (base * height) / 2;
    }
}
