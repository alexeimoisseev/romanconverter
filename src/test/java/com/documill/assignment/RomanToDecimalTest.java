package com.documill.assignment;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static com.documill.assignment.RomanToDecimal.convert;

public class RomanToDecimalTest {

    @Test
    public void testUpperCase() {
        int ten = convert("X");
        assertEquals(10, ten);
    }

    @Test
    public void testLowerCase() {
        int twenty = convert("xx");
        assertEquals(20, twenty);
    }

    @Test(expected = IllegalArgumentException.class)
        public void testEmpty() {
        int zero = convert("");
    }

    @Test(expected = IllegalArgumentException.class)
        public void testInvalid() {
        int invalid = convert("XCA");
    }

    @Test
    public void testBigNumber() {
        int big = convert("MMMCMCCXCXXXIXIVIII");
        assertEquals(4236, big);
    }

    @Test (expected = NullPointerException.class)
        public void testNullPointer() {
        convert(null);
    }
}
