import shapes.Circle;
import shapes.Shape;
import shapes.Square;
import shapes.Triangle;

public class Main {

    public static void main(String[] args) {
        try {
            Shape s1 = new Square(5);
            System.out.println(s1);

            Shape s2 = new Circle(3);
            System.out.println(s2);

            Shape s3 = new Triangle(3, 4, 5, 6);
            System.out.println(s3);

            // Testing static overloaded methods
            System.out.println("Square: " + Square.calculateArea(10));
            System.out.println("Circle: " + Circle.calculateArea(5));
            System.out.println("Triangle: " + Triangle.calculateArea(9, 8));
        } catch (IllegalArgumentException e) {
            System.out.println("An exception has occurred");
            System.out.println(e.getMessage());
        }
    }
}
