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
     * Test of siguiente method, of class Radio. Para ver si hace la opcion de FM si la FM esta activada
     */
    @Test
    public void testSiguienteFMActivado() {
        System.out.println("siguienteFM");
        float a = (float) 90.0;
        Radio instance = new Radio();
        float expResult = (float) 90.2;
        float result = instance.siguiente(a);
        assertEquals(expResult, result, 0.0);
       
    }
     
    
    /**
     * Test of siguiente method, of class Radio. Para ver si hace la opcion de AM
     */
    @Test
    public void testSiguienteAM() {
        System.out.println("siguienteAM");
        float a = (float) 560;
        Radio instance = new Radio();
        instance.Switch();
        float expResult = (float) 570;
        float result = instance.siguiente(a);
        assertEquals(expResult, result, 0.0);
    }


    
    /**
     * Test of guardar method, of class Radio.Guardamos una emisora en el número de boton que enviamos
     */
    @Test
    public void testGuardarBoton1() {
        System.out.println("guardarBoton1");
        float e = (float) 105.5;
        int b = 1;
        Radio instance = new Radio();
        instance.guardar(e, b);
    }
    /**
     * Test of guardar method, of class Radio.Guardamos una emisora en el número de boton que enviamos
     */
    @Test
    public void testGuardarBoton5() {
        System.out.println("guardarBoton5");
        float e = (float) 98.9;
        int b = 5;
        Radio instance = new Radio();
        instance.guardar(e, b);
    }

    /**
     * Test of guardar method, of class Radio.Guardamos una emisora en el número de boton que enviamos
     */
    @Test
    public void testGuardarBoton10() {
        System.out.println("guardarBoton10");
        float e = (float) 700.0;
        int b = 10;
        Radio instance = new Radio();
        instance.guardar(e, b);
    }


    /**
     * Test of SeleccionarFav method, of class Radio. Acá seleccionamos un favorito y lo extraemos
     */
    @Test
    public void testSeleccionarFav() {
        System.out.println("SeleccionarFav");
        int b = 5;
        Radio instance = new Radio();
        float expResult = (float) 0.0;
        float result = instance.seleccionarFav(b);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of onOff method, of class Radio.
     */
    @Test
    public void testOnOff() {
        System.out.println("onOff");
        Radio instance = new Radio();
        instance.onOff();
        // TODO review the generated test code and remove the default call to fail.
        
    }

   

    /**
     * Test of siguiente method, of class Radio.
     */
    @Test
    public void testSiguiente() {
        System.out.println("siguiente");
        float a =(float) 90.0;
        Radio instance = new Radio();
        float expResult =(float) 90.2;
        float result = instance.siguiente(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of anterior method, of class Radio.
     */
    @Test
    public void testAnterior() {
        System.out.println("anterior");
        float a = (float)550.0;
        Radio instance = new Radio();
        instance.Switch();
        float expResult = (float)540.0;
        float result = instance.anterior(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of guardar method, of class Radio.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        float e = 1;
        int b = 10;
        Radio instance = new Radio();
        instance.guardar(e, b);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
