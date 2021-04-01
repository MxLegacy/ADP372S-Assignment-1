package za.ac.cput;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static java.lang.System.exit;
import static java.time.Duration.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
        Assertions.assertEquals(Calculator.add, "+");
        Assertions.assertEquals(Calculator.sub, "-");
        Assertions.assertEquals(Calculator.mul, "*");
        Assertions.assertEquals(Calculator.div, "/");

        Assertions.assertSame(Calculator.lblNone1, Calculator.lblNone2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setGUI() {
    }

    @Test
    void actionPerformed() {
    }

    @Test
    void calculate() {
    }

    @Test
    void getTxtField() {
    }

    @Test
    void setTxtField() {
    }

    @Test
    void testTimeout()
    {
        Assertions.assertTimeout(ofSeconds(10), () ->{
            fail("System Time Out!!");
        });

    }
}