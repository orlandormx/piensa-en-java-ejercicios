/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo3;
import static com.orlandormx.util.Print.*;
/*
DESCRIPCION EN LA PAG 96
uso de comparaciones boolean con strings
 */
/**
 *
 * @author developer
 */
public class Ejercicio14 {
    
    static void compara(String x, String y) {    
        print("x == y "+ (x == y));
        print("x != y "+ (x != y));
        print("x equals y "+ x.equals(y));
        print("x !equals y "+ !(x.equals(y)));
        
    }

    public static void main(String[] args) {
        compara("hola","hola");
    }
}
