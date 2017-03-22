/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
simulacion de lanzamiento de una moneda, en el libro aun no se llega a if´s
por lo tanto se asume que se espera solo dos valores 0 y 1
*/
package com.orlandormx.capitulo3;

import java.util.Random;

/**
 *
 * @author developer
 */
public class Ejercicio7 {
    static void lanzarMoneda(){
        Random r = new Random();
        int moneda = r.nextInt(2);
        System.out.println(moneda);
    }
    public static void main(String[] args) {
        lanzarMoneda();
        lanzarMoneda();
        lanzarMoneda();
    }
}