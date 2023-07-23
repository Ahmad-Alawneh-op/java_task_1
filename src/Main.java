import shapes.Circle;
import shapes.Shape;
import shapes.Square;
import shapes.Triangle;

public class Main {
    public static void printShapeInfo(Shape shape) {
        System.out.println("Calling printShapeInfo");
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Shape s1 = new Square(5);
        printShapeInfo(s1);

        Shape s2 = new Circle(3);
        printShapeInfo(s2);

        Shape s3 = new Triangle(3, 4, 5, 6);
        printShapeInfo(s3);

        // Testing static overloaded methods
        System.out.println("Square: " + Square.calculateArea(10));
        System.out.println("Circle: " + Circle.calculateArea(5));
        System.out.println("Triangle: " + Triangle.calculateArea(9, 8));
    }
}
