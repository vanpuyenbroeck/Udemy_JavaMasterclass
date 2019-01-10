import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex4_34_4Test {

    @Test
    void testAreEqualByThreeDecimalPlaces_True4placesDiff() {
        assertTrue(ex4_34_4.areEqualByThreeDecimalPlaces(1.2345, 1.2346));
    }
    @Test
    void testAreEqualByThreeDecimalPlaces_False3placesDiff() {
        assertFalse(ex4_34_4.areEqualByThreeDecimalPlaces(1000.234, 1000.235));
    }@Test
    void testAreEqualByThreeDecimalPlaces_False3placesDiff2() {
        assertFalse(ex4_34_4.areEqualByThreeDecimalPlaces(3.174, 3.175));
    }
    @Test
    void testAreEqualByThreeDecimalPlaces_True2placesEqual() {
        assertTrue(ex4_34_4.areEqualByThreeDecimalPlaces(1.2, 1.2));
    }
}