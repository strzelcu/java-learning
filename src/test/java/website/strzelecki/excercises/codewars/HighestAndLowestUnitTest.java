package website.strzelecki.excercises.codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HighestAndLowestUnitTest {

    @Test
    public void shouldReturnHighestAndLowestNumbers() {
        assertEquals("42 -9", HighestAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

}
