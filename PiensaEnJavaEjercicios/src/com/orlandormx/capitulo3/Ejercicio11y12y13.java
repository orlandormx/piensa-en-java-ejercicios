/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
DESCRIPCION EN LA PAG 84 DEL LIBRO
*/
package com.orlandormx.capitulo3;
import static com.orlandormx.util.Print.Print.*;
import java.util.*;
/**
 *
 * @author developer
 */
public class Ejercicio11y12y13 {
    public static int VALOR = 0xafff;
    public static int VALOR2 = 0xffff;
    
    static int cuentaBits(int numero) {
        return Integer.SIZE - Integer.numberOfLeadingZeros(numero);
    }
    
    public static void main(String[] args) {
        //ejercicio 11
        /*
        print("Valor original "+Integer.toBinaryString(VALOR1));
        int numBits = cuentaBits(VALOR);
        for(int i = 0; i < numBits; i++){
            print("Valor desplazado "+i+" "+Integer.toBinaryString(VALOR >>>= 1));
        }
*/
        //ejercicio 12
        /*
        print("Valor original "+Integer.toBinaryString(VALOR2));
        int numBits2 = cuentaBits(VALOR2);
        print("Valor desplazado a la izquierda "+Integer.toBinaryString(VALOR2 << 1));
        for(int i = 0; i < numBits2; i++){
            print("Valor desplazado "+i+" "+Integer.toBinaryString(VALOR2 >>= 1));
        }
        */
        //ejercicio 13
        Random r = new Random();
        for(int i = 0; i < 5; i++){
            int n = r.nextInt(122-97) + (97);
            print(n+" "+(char)n);
        }
    }
}
