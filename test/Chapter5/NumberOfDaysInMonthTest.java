package Chapter5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDaysInMonthTest {

    @Test
    void isLeapYear() {
        assertFalse(NumberOfDaysInMonth.isLeapYear(-1600));
    }

    @Test
    void isLeapYear1() {
        assertTrue(NumberOfDaysInMonth.isLeapYear(1600));
    }

    @Test
    void isLeapYear2() {
        assertFalse(NumberOfDaysInMonth.isLeapYear(2017));
    }

    @Test
    void isLeapYear3() {
        assertTrue(NumberOfDaysInMonth.isLeapYear(2000));
    }
}