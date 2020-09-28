package Prueba_travis.DemoTravis;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
    
    @Test
    public void Sum() {
    	int sum1 = 1;
    	int sum2 = 1;
    	int res = 3;
    	
    	assertTrue(((sum1+sum2)==res));
    }
}
