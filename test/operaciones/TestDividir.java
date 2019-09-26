package operaciones;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestDividir {

    public TestDividir() {
    }
      @Test
    public void testDividir() {
        System.out.println("Dividir");
        int a = 8;
        int b = 2;
        float expResult = 4.0F;
        float result = OperacionesBasicas.Dividir(a, b);
        assertEquals(expResult, result, 0.0);
    }
}
