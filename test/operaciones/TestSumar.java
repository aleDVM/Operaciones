
package operaciones;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class TestSumar {

    public TestSumar() {
    }
        @Test
    public void testSumar() {
        System.out.println("Sumar");
        int a = 2;
        int b = 3;
        int expResult = 5;
        OperacionesBasicas instance = new OperacionesBasicas();
        int result = OperacionesBasicas.Sumar(a, b);
        assertEquals(expResult, result);
       //assertTrue(instance.Sumar()==10);
      
    }
}
