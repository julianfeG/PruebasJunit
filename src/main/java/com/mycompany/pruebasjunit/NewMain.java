/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebasjunit;

/**
 *
 * @author Julian
 */
public class NewMain {
    
    public static void main(String[] args) throws Exception{
        Coche p= new Coche ("Audi A3",10000);
        Coche.impuesto=20f;
        System.out.println("Precio final: "+p.precioFinal(10f));
    }
    
}
