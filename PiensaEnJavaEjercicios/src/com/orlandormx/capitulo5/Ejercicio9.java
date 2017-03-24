/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
pruebas de constructores , palabra clave this
*/
package com.orlandormx.capitulo5;

/**
 *
 * @author developer
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Flower f = new Flower(3);        
        System.out.println(f.i);
        System.out.println(f.s);
    }
}

class Flower{
    int i;
    String s;
    Flower(int i){
        this("hola");
        this.i = i;
    }
    
    Flower(String s){
        this.s = s;
    }
}
