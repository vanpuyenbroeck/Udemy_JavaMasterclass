package Chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharedDigitTest {

    @Test
    void hasSharedDigit() {
        assertTrue(SharedDigit.hasSharedDigit(12,23));
    }

    @Test
    void hasSharedDigit1() {
        assertFalse(SharedDigit.hasSharedDigit(9,99));
    }

    @Test
    void hasSharedDigit2() {
        assertTrue(SharedDigit.hasSharedDigit(15,55));
    }
}