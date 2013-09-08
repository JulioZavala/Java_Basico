/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Clase6.pruebas.Divisa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PFR
 */
public class DivisaTest {
    
    public DivisaTest() {
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
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testSumarDivisa() throws Exception {
        System.out.println("sumar");
        Divisa divisaJose = new Divisa(10, "Soles");
        Divisa divisaSilvia = new Divisa(20, "Soles");
        Divisa resultadoEsperado = new Divisa(30, "Soles");
        
        Divisa resultado = divisaSilvia.sumar(divisaJose);
        assertEquals(resultadoEsperado.getImporte(), resultado.getImporte());
    }

    
    
}