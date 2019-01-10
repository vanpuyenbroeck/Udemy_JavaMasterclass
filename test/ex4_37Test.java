import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex4_37Test {

    @Test
    void testGetDurationString_MinutesTooLow() {
        assertEquals("Invalid value", ex4_37.getDurationString(-1, 1));
    }

    @Test
    void testGetDurationString_SecondsTooLow() {
        assertEquals("Invalid value", ex4_37.getDurationString(0, -1));
    }

    @Test
    void testGetDurationString_SecondsTooHigh() {
        assertEquals("Invalid value", ex4_37.getDurationString(0, 60));
    }

    @Test
    void testGetDurationString_ValidMinutesAndSeconds() {
        assertEquals("01h 15m 10s", ex4_37.getDurationString(75, 10));
    }

    @Test
    void testGetDurationString_SecondsOnlyTooLow() {
        assertEquals("Invalid value", ex4_37.getDurationString(-1));
    }

    @Test
    void testGetDurationString_ValidSecondsOnly() {
        assertEquals("01h 01m 40s", ex4_37.getDurationString(3700));
    }
}