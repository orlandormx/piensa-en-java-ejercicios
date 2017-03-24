/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
crea una clse que contenga una referencia de tipo string y ver que por
default es null
*/
package com.orlandormx.capitulo5;
import static com.orlandormx.util.Print.*;
/**
 *
 * @author developer
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        ClaseString cs = new ClaseString();
        print(cs.s);
        
        ClaseString2 cs2 = new ClaseString2("HOLA");
        print(cs2.s);
        print(cs2.s2);
    }
}

class ClaseString{
    String s;
    
}

class ClaseString2{
    String s = "hola";
    String s2;
    ClaseString2(String s2){
        this.s2 = s2;
    }
}
