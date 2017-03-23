/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Comprobar que los sufijos de octal y hexdecimal funcionan para los tipo
long
*/

package com.orlandormx.capitulo3;
import static com.orlandormx.util.Print.*;
/**
 *
 * @author developer
 */
public class Ejercicio8 {
    
    public static void main(String[] args) {
        long l1 = 1L;
        long l2 = 0x1L;
        long l3 = 01;
        
        print(Long.toBinaryString(l1));
        print(Long.toBinaryString(l2));
        print(Long.toBinaryString(l3));
    }
    
}
