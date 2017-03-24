/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
invocar metodos dentro de otro metodos, uso de palabra clave this*/
package com.orlandormx.capitulo5;

/**
 *
 * @author developer
 */
public class Ejercicio8 {
    public static void main(String[] args) {
       new X().method1();
    }
}

class X{
    void method1(){
        method2();
        method2();
        
        this.method2();
        this.method2();
    }
    
    void method2(){
        System.out.println("method 2");
    }
}
