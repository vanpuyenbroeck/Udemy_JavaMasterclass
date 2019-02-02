package Chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    @Test
    void isPerfectNumber() {
        assertTrue(PerfectNumber.isPerfectNumber(6));
    }

    @Test
    void isPerfectNumber1() {
        assertTrue(PerfectNumber.isPerfectNumber(28));
    }

    @Test
    void isPerfectNumber2() {
        assertFalse(PerfectNumber.isPerfectNumber(5));
    }

    @Test
    void isPerfectNumber3() {
        assertFalse(PerfectNumber.isPerfectNumber(-1));
    }

    @Test
    void isPerfectNumber4() {
        assertFalse(PerfectNumber.isPerfectNumber(0));
    }
}