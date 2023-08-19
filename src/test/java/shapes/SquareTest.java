package shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class SquareTest {
    @Test
    void constructor_whenValidLength_thenSetLengthCorrectly() {
        Square square = new Square(5);

        assertEquals(square.getLength(), 5);
    }

    @Test
    void constructor_whenInvalidLength_thenThrowError() {
        assertThrows(IllegalArgumentException.class, () -> new Square(-1));
    }

    @Test
    void setLength_whenValidLength_thenSetLengthCorrectly() {
        Square square = new Square();
        square.setLength(10);

        assertEquals(square.getLength(), 10);
    }

    @Test
    void setLength_whenInvalidLength_thenThrowError() {
        Square square = new Square();

        assertThrows(IllegalArgumentException.class, () -> square.setLength(-1));
    }

    @Test
    void calculateArea_returnAreaCorrectly() {
        Square square = new Square(5);

        assertEquals(square.calculateArea(), 25);
    }

    @Test
    void calculatePerimeter_returnPerimeterCorrectly() {
        Square square = new Square(5);

        assertEquals(square.calculatePerimeter(), 20);
    }

    @Test
    void toString_printDataCorrectly() {
        Square square = spy(Square.class);
        when(square.calculateArea()).thenReturn(100.0);
        when(square.calculatePerimeter()).thenReturn(40.0);
        square.setLength(10);

        String expected = "Square" + "\n" +
                "Length: 10.0\n" +
                "Area: 100.0\n" +
                "Perimeter: 40.0\n" +
                "---------------------\n";

        assertEquals(square.toString(), expected);
    }

    @Test
    void staticCalculateArea_whenLengthIsValid_thenReturnAreaCorrectly() {
        assertEquals(Square.calculateArea(5), 25);
    }

    @Test
    void staticCalculateArea_whenLengthIsInvalid_thenThrowError() {
        assertThrows(IllegalArgumentException.class, () -> Square.calculateArea(-1));
    }
}
