package operaciones;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestMultiplicar {

    public TestMultiplicar() {
    }
        @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        int a = 2;
        int b = 3;
        int expResult = 6;
        int result = OperacionesBasicas.Multiplicar(a, b);
    }
}
