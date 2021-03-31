package za.ac.cput;
/**
 *
 * @author Tawfeeq Cupido
 */

import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Ignore("This test is being disabled because it sucks")
    @Test
    public void shouldAnswerWithFalse() {

        Assert.assertTrue(true);

    }
    
}
