/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja1algoritmosprogramaradio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Tejada
 */
public class RadioTest {
    
    public RadioTest() {
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
     * Test of onOff method, of class Radio.
     */
    @Test
    public void testOnOff() {
        System.out.println("onOff");
        boolean e = false;
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.onOff(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Switch method, of class Radio.
     */
    @Test
    public void testSwitch() {
        System.out.println("Switch");
        boolean e = false;
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.Switch(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of siguiente method, of class Radio.
     */
    @Test
    public void testSiguiente() {
        System.out.println("siguiente");
        float a = 0.0F;
        Radio instance = new Radio();
        float expResult = 0.0F;
        float result = instance.siguiente(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anterior method, of class Radio.
     */
    @Test
    public void testAnterior() {
        System.out.println("anterior");
        float a = 0.0F;
        Radio instance = new Radio();
        float expResult = 0.0F;
        float result = instance.anterior(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class Radio.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        float e = 0.0F;
        int b = 0;
        Radio instance = new Radio();
        instance.guardar(e, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SeleccionarFav method, of class Radio.
     */
    @Test
    public void testSeleccionarFav() {
        System.out.println("SeleccionarFav");
        int b = 0;
        Radio instance = new Radio();
        instance.SeleccionarFav(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
