package Chapter4;

import Chapter4.ex4_34_3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex4_34_3Test {

    @Test
    void isLeapYearSmallerThan1ReturnFalse() {
        assertFalse(ex4_34_3.isLeapYear(0));
    }

    @Test
    void isLeapYearLargerThan9999ReturnFalse() {
        assertFalse(ex4_34_3.isLeapYear(10000));
    }

    @Test
    void isLeapYear1600ReturnTrue() {
        assertTrue(ex4_34_3.isLeapYear(1600));
    }

    @Test
    void isLeapYear1000ReturnFalse() {
        assertFalse(ex4_34_3.isLeapYear(1000));
    }
}