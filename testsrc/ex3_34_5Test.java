import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex3_34_5Test {

    @Test
    void testHasEqualSum_1and1notEqualto1() {
        assertFalse(ex3_34_5.hasEqualSum(1,1,1));
    }@Test
    void testHasEqualSum_1and1Equalto2() {
        assertTrue(ex3_34_5.hasEqualSum(1,1,2));
    }@Test
    void testHasEqualSum_1andminus1Equalto0() {
        assertTrue(ex3_34_5.hasEqualSum(1,-1,0));
    }
}