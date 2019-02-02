package Chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitCheckerTest {

    @Test
    void hasSameLastDigit() {
        assertTrue(LastDigitChecker.hasSameLastDigit(41,22,71));
    }

    @Test
    void hasSameLastDigit1() {
        assertTrue(LastDigitChecker.hasSameLastDigit(23,32,42));
    }

    @Test
    void hasSameLastDigit2() {
        assertFalse(LastDigitChecker.hasSameLastDigit(9,99,999));
    }
}