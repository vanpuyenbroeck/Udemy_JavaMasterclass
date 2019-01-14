package Chapter4;

import Chapter4.ex4_34_2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex4_34_2Test {

    @Test
    void testBark_True1IsTrue() {
        assertTrue(ex4_34_2.bark(true, 1));
    }

    @Test
    void testBark_False2IsFalse() {
        assertFalse(ex4_34_2.bark(false, 2));
    }

    @Test
    void testBark_True8IsTrue() {
        assertFalse(ex4_34_2.bark(true, 8));
    }

    @Test
    void testBark_TrueNegative1IsFalse() {
        assertFalse(ex4_34_2.bark(true, -1));
    }
}