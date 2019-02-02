package Chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    void getGreatestCommonDivisor() {
        assertEquals(6, GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
    }

    @Test
    void getGreatestCommonDivisor1() {
        assertEquals(5, GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
    }

    @Test
    void getGreatestCommonDivisor2() {
        assertEquals(-1, GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
    }

    @Test
    void getGreatestCommonDivisor3() {
        assertEquals(9, GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
    }

    @Test
    void getGreatestCommonDivisor4() {
        assertEquals(10, GreatestCommonDivisor.getGreatestCommonDivisor(10, 10));
    }
}