package Chapter4;

import Chapter4.ex4_34_6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex4_34_6Test {

    @Test
    void testHasTeen_oneInRangeIsTrue() {
        assertTrue(ex4_34_6.hasTeen(9,99,19));
    }@Test
    void testHasTeen_twoOutOfRangeIsTrue() {
        assertTrue(ex4_34_6.hasTeen(23,15,42));
    }@Test
    void testHasTeen_threeOutOfRangeIsFalse() {
        assertFalse(ex4_34_6.hasTeen(22,23,34));
    }
}