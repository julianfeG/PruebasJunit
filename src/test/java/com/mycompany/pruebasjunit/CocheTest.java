/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebasjunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author Julian
 */
public class CocheTest {
    
    static Coche instance;
    public CocheTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        instance= new Coche ("Audi A3", 10000);
        Coche.impuesto=20f;
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("---------------Comienzo del test--------------");
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of precioFinal method, of class Coche.
     */
    @Test
    public void testPrecioFinal_1() throws Exception {
        System.out.println("precioFinal_1");
        float descuento = 10.0F;
        float expResult = 10800.0F;
        float result = instance.precioFinal(descuento);
        assertEquals(expResult, result, 0.000001);
    }
    
    @Test
    public void testPrecioFinal_2() throws Exception {
        System.out.println("precioFinal_2");
        float descuento = 10.0F;
        instance.precioBase=1000f;
        float expResult = 1200.0F;
        float result = instance.precioFinal(descuento);
        assertEquals(expResult, result, 0.000001);
    }
    
    @Test
    public void testPrecioFinal_3() throws Exception {
        System.out.println("precioFinal_3");
        float descuento = 110.0F;
        assertThrows(Exception.class, new Executable(){
           @Override
           public void execute() throws Throwable {
               float result = instance.precioFinal(150f);
           }
        });
    }
    
}
