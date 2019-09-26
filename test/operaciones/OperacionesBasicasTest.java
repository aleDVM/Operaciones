/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pella
 */
public class OperacionesBasicasTest {
    
    public OperacionesBasicasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Sumar method, of class OperacionesBasicas.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        int a = 2;
        int b = 3;
        int expResult = 5;
        int result = OperacionesBasicas.Sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Restar method, of class OperacionesBasicas.
     */
    @Test
    public void testRestar() {
        System.out.println("Restar");
        int a = 5;
        int b = 3;
        int expResult = 2;
        int result = OperacionesBasicas.Restar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicar method, of class OperacionesBasicas.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        int a = 2;
        int b = 3;
        int expResult = 6;
        int result = OperacionesBasicas.Multiplicar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Dividir method, of class OperacionesBasicas.
     */
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        int a = 8;
        int b = 2;
        float expResult = 4.0F;
        float result = OperacionesBasicas.Dividir(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
