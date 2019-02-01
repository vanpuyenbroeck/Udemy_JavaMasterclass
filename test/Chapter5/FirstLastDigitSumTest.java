package Chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLastDigitSumTest {

    @Test
    void sumFirstAndLastDigit1() {
        assertEquals(4, FirstLastDigitSum.sumFirstAndLastDigit(252));
    }

    @Test
    void sumFirstAndLastDigit2() {
        assertEquals(0, FirstLastDigitSum.sumFirstAndLastDigit(0));
    }

    @Test
    void sumFirstAndLastDigit3() {
        assertEquals(10, FirstLastDigitSum.sumFirstAndLastDigit(5));
    }

    @Test
    void sumFirstAndLastDigit4() {
        assertEquals(-1, FirstLastDigitSum.sumFirstAndLastDigit(-10));
    }
}