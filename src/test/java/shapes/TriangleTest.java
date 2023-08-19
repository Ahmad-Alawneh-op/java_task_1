package shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class TriangleTest {
    @Test
    void constructor_whenValidParams_thenSetMemberVariablesCorrectly() {
        Triangle triangle = new Triangle(3, 4, 5, 6);

        assertAll(
                () -> assertEquals(triangle.getBase(), 3),
                () -> assertEquals(triangle.getHeight(), 4),
                () -> assertEquals(triangle.getSideA(), 5),
                () -> assertEquals(triangle.getSideC(), 6)
        );
    }

    @Test
    void constructor_whenInvalidParams_thenThrowError() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(3, 4, 5, -1));
    }

    @Test
    void setBase_whenValidValue_thenSetBaseCorrectly() {
        Triangle triangle = new Triangle();
        triangle.setBase(10);

        assertEquals(triangle.getBase(), 10);
    }

    @Test
    void setBase_whenInvalidValue_thenThrowError() {
        Triangle triangle = new Triangle();

        assertThrows(IllegalArgumentException.class, () -> triangle.setBase(-1));
    }

    @Test
    void setHeight_whenValidValue_thenSetHeightCorrectly() {
        Triangle triangle = new Triangle();
        triangle.setHeight(10);

        assertEquals(triangle.getHeight(), 10);
    }

    @Test
    void setHeight_whenInvalidValue_thenThrowError() {
        Triangle triangle = new Triangle();

        assertThrows(IllegalArgumentException.class, () -> triangle.setHeight(-1));
    }

    @Test
    void setSideA_whenValidValue_thenSetSideACorrectly() {
        Triangle triangle = new Triangle();
        triangle.setSideA(10);

        assertEquals(triangle.getSideA(), 10);
    }

    @Test
    void setSideA_whenInvalidValue_thenThrowError() {
        Triangle triangle = new Triangle();

        assertThrows(IllegalArgumentException.class, () -> triangle.setSideA(-1));
    }

    @Test
    void setSideC_whenValidValue_thenSetSideCCorrectly() {
        Triangle triangle = new Triangle();
        triangle.setSideC(10);

        assertEquals(triangle.getSideC(), 10);
    }

    @Test
    void setSideC_whenInvalidValue_thenThrowError() {
        Triangle triangle = new Triangle();

        assertThrows(IllegalArgumentException.class, () -> triangle.setSideC(-1));
    }

    @Test
    void calculateArea_returnAreaCorrectly() {
        Triangle triangle = new Triangle();
        triangle.setHeight(10);
        triangle.setBase(10);

        assertEquals(triangle.calculateArea(), 50);
    }

    @Test
    void calculatePerimeter_returnPerimeterCorrectly() {
        Triangle triangle = new Triangle(3, 4, 5, 6);

        assertEquals(triangle.calculatePerimeter(), 14);
    }

    @Test
    void toString_printDataCorrectly() {
        Triangle triangle = spy(Triangle.class);
        when(triangle.calculateArea()).thenReturn(30.0);
        when(triangle.calculatePerimeter()).thenReturn(20.0);
        triangle.setBase(3);
        triangle.setHeight(4);

        String expected = "Triangle" + "\n" +
                "Base: 3.0\n" +
                "Height: 4.0\n" +
                "Area: 30.0\n" +
                "Perimeter: 20.0\n" +
                "---------------------\n";

        assertEquals(triangle.toString(), expected);
    }

    @Test
    void staticCalculateArea_whenValidParams_thenReturnAreaCorrectly() {
        assertEquals(Triangle.calculateArea(3, 4), 6);
    }

    @Test
    void staticCalculateArea_whenParamsInvalid_thenThrowError() {
        assertThrows(IllegalArgumentException.class, () -> Triangle.calculateArea(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> Triangle.calculateArea(2, -1));
    }
}
