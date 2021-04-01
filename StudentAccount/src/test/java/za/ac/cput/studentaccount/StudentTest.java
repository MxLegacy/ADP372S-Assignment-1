/*
Author Tatum De Wet 218069227
 */
package za.ac.cput.studentaccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student s1;
    private Student s2;

    @BeforeEach
    void setUp() {
        s1 = new Student("Tatum", 218069227, "AppDev", 50000);
        s2 = new Student();
    }

    //object equality
    @Test
    void testEquality() {
        assertNotEquals(s1, s2);
    }

    //object identity
    @Test
    void testIdentity() {
        assertNotSame(s1, s2);
    }

    //failing test
    @Test
    void testFail() {
        s1.getFees();
        fail("This should force the test to fail");
    }

    //timeouts test
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testWithTimeout(){
        s2.setFees(1000);
        s2.show();
    }

    //disabling test
    @Test
    @Disabled
    void testDisabling(){
        s1.payment(1200.00);
        assertEquals(s1.getFees(), 48800.00);
    }
}