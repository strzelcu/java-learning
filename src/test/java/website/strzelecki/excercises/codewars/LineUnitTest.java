package website.strzelecki.excercises.codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LineUnitTest {

    @Test
    public void shouldReturnCorrectInformation() {
        assertEquals("YES", Line.Tickets(new int[] { 25, 25, 50 }));
        assertEquals("YES", Line.Tickets(new int[] { 25, 25, 25, 25, 25, 50, 50, 100, 100 }));
        assertEquals("NO", Line.Tickets(new int[] { 25, 25, 50, 100, 100 }));
        assertEquals("NO", Line.Tickets(new int[] { 25, 25, 50, 50, 100, 100 }));
        assertEquals("NO", Line.Tickets(new int[] { 25, 100 }));
    }

}
