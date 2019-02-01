package Chapter4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class areaCalculatorTest {

    @Test
    void area() {
        assertEquals(78.53975,AreaCalculator.area(5.0));
    }

    @Test
    void area1() {
        assertEquals(-1,AreaCalculator.area(-1));
    }

    @Test
    void area2() {
        assertEquals(20,AreaCalculator.area(5.0,4.0));
    }

    @Test
    void area3() {
        assertEquals(-1,AreaCalculator.area(-1, 4.0));
    }
}