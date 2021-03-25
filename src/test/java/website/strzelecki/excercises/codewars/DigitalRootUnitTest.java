package website.strzelecki.excercises.codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DigitalRootUnitTest {

    @Test
    public void Test1() {
        assertEquals(7, DigitalRoot.digital_root(16));
    }
    @Test
    public void Test2() {
        assertEquals( 6, DigitalRoot.digital_root(456));
    }

}