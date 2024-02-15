package shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;
import shapes.Circle;

public class CircleTest {
    @Test
    void constructor_whenValidRadius_thenSetRadiusCorrectly() {
        Circle circle = new Circle(5);

        assertEquals(circle.getRadius(), 5);
    }

    @Test
    void constructor_whenInvalidRadius_thenThrowError() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(-1));
    }

    @Test
    void setRadius_whenValidRadius_thenSetRadiusCorrectly() {
        Circle circle = new Circle();
        circle.setRadius(10);

        assertEquals(circle.getRadius(), 10);
    }

    @Test
    void setRadius_whenInvalidRadius_thenThrowError() {
        Circle circle = new Circle();

        assertThrows(IllegalArgumentException.class, () -> circle.setRadius(-1));
    }

    @Test
    void calculateArea_returnAreaCorrectly() {
        Circle circle = new Circle(5);

        assertEquals(circle.calculateArea(), 78.57142857142857);
    }

    @Test
    void calculatePerimeter_returnPerimeterCorrectly() {
        Circle circle = new Circle(5);

        assertEquals(circle.calculatePerimeter(), 31.428571428571427);
    }

    @Test
    void toString_printDataCorrectly() {
        Circle circle = spy(Circle.class);
        when(circle.calculateArea()).thenReturn(100.0);
        when(circle.calculatePerimeter()).thenReturn(40.0);
        circle.setRadius(10);

        String expected = "Circle" + "\n" +
                "Radius: 10.0\n" +
                "Area: 100.0\n" +
                "Perimeter: 40.0\n" +
                "---------------------\n";

        assertEquals(circle.toString(), expected);
    }

    @Test
    void staticCalculateArea_whenRadiusIsValid_thenReturnAreaCorrectly() {
        assertEquals(Circle.calculateArea(5), 78.57142857142857);
    }

    @Test
    void staticCalculateArea_whenRadiusIsInvalid_thenThrowError() {
        assertThrows(IllegalArgumentException.class, () -> Circle.calculateArea(-1));
    }
}
