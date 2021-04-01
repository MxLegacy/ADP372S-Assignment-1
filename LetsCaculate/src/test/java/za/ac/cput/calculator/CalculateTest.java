// Devon Daniels - 217299822
// Assignment1
package za.ac.cput.calculator;


import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @Test
    void Identity() {
        Calculate calculator = new Calculate();
        assertSame(5, calculator.add(1, 4), "1 + 4 should equal 5");
    }
    void Equality() {
        Calculate calculator = new Calculate();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }

    @Test
    void testFail() {
        fail("Failed Test");
    }

    @Test
    void Timeout() {
        assertTimeout(ofMillis(9), () -> Thread.sleep(10));
    }

    @Ignore
    @Test
    public void testDisable() {
        Calculate calculator = new Calculate();
        assertSame(5, calculator.add(1, 4), "1 + 4 should equal 5");
    }
}