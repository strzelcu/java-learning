package website.strzelecki.excercises.codewars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplyUnitTest {

    @Test
    public void shouldMultiplyDoubleNumbers() {
        assertEquals(4, Multiply.multiply(2.0, 2.0));
        assertEquals(6, Multiply.multiply(3.0, 2.0));
        assertEquals(11, Multiply.multiply(2.0, 5.5));
    }

}
