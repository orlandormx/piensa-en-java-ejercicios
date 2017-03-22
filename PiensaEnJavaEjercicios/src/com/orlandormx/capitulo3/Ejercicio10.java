/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo3;
/*
Realizar operaciones bit a bit
*/
/**
 *
 * @author developer
 */

public class Ejercicio10 {
    public static final int VALOR1 = 5;
    public static final int VALOR2 = 10;
    
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(VALOR1));
        System.out.println(Integer.toBinaryString(VALOR2));
        System.out.println(Integer.toBinaryString(VALOR1 & VALOR2));
        System.out.println(Integer.toBinaryString(VALOR1 | VALOR2));
        System.out.println(Integer.toBinaryString(VALOR1 ^ VALOR2));
        System.out.println(Integer.toBinaryString(~VALOR1));
        System.out.println(Integer.toBinaryString(~VALOR2));
        //no se pueden aplicar porque son valores static
        //System.out.println(Integer.toBinaryString(VALOR1 &= VALOR2));
        //System.out.println(Integer.toBinaryString(VALOR1 |= VALOR2));
        //System.out.println(Integer.toBinaryString(VALOR1 ^= VALOR2));
    }
    
    
    
    
}
