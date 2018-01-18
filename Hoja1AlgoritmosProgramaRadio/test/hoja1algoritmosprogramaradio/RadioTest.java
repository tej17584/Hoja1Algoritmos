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
     * Test of onOff method, of class Radio. Para ver si lo apaga
     */
    @Test
    public void testOnOff1() {
        System.out.println("OFF");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.onOff();
        assertEquals(expResult, result);
      
    }
 /**
     * Test of onOff method, of class Radio. Para ver si lo enciende
     */
    @Test
    public void testOnOff2() {
        System.out.println("ON");
        Radio instance = new Radio();
        instance.onOff();
        boolean expResult = true;
        boolean result = instance.onOff();
        assertEquals(expResult, result);
      
    }
    /**
     * Test of Switch method, of class Radio. Para ver si cambia la variable de estacion
     */
    @Test
    public void testSwitch1() {
        System.out.println("SwitchFM");
        Radio instance = new Radio();
        instance.Switch();
        boolean expResult = false;
        boolean result = instance.Switch();
        assertEquals(expResult, result);
       
    }
    /**
     * Test of Switch method, of class Radio. Para ver si cambia la variable de estacion
     */
    @Test
    public void testSwitch2() {
        System.out.println("SwitchAM");
        Radio instance = new Radio();
        boolean expResult = true;
        boolean result = instance.Switch();
        assertEquals(expResult, result);
       
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
     * Test of anterior method, of class Radio. Veremos si retrocede con FM activado
     */
    @Test
    public void testAnteriorFM() {
        System.out.println("anteriorFM");
        float a = (float) 90.0;
        Radio instance = new Radio();
        //instance.Switch();
        float expResult = (float) 89.8;
        float result = instance.anterior(a);
        assertEquals(expResult, result, 0.0);
      
    }

     /**
     * Test of anterior method, of class Radio. Veremos si retrocede con AM activado, debería retroceder 10
     */
    @Test
    public void testAnteriorAM() {
        System.out.println("anteriorAM");
        float a = (float) 90.0;
        Radio instance = new Radio();
        instance.Switch();
        float expResult = (float) 80.0;
        float result = instance.anterior(a);
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
        float result = instance.SeleccionarFav(b);
        assertEquals(expResult, result, 0.0);
       
    }
    
}
