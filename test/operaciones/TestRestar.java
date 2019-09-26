package operaciones;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestRestar {

    public TestRestar() {
    }
    @Test
    public void testRestar() {
         System.out.println("Restar");
        int a = 5;
        int b = 3;
        int expResult = 2;
        int result = OperacionesBasicas.Restar(a, b);
        assertEquals(expResult, result); 
    }
}
