import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex4_34_1Test {

    @Test
    void testPrintMegaBytesAndKiloBytes_IsZero() {
        ex4_34_1.printMegaBytesAndKiloBytes(0);
        assertEquals("0 KB = 0 MB and 0 KB", ex4_34_1.getMessage());
    }

    @Test
    void testPrintMegaBytesAndKiloBytes_IsSmallerThanZero() {
        ex4_34_1.printMegaBytesAndKiloBytes(-5);
        assertEquals("Invalid Value", ex4_34_1.getMessage());
    }

    @Test
    void testPrintMegaBytesAndKiloBytes_IsLargerThanZero() {
        ex4_34_1.printMegaBytesAndKiloBytes(12345);
        assertEquals("12345 KB = 12 MB and 57 KB", ex4_34_1.getMessage());
    }
}