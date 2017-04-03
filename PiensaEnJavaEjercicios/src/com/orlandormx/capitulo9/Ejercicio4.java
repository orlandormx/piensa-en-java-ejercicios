/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo9;

/**
 *
 * @author developer
 */
public class Ejercicio4 {
    public static void main(String[] args) {

    }
    
}

abstract class ClaseAbstracta{
}

class Derivada extends ClaseAbstracta{

    void imprime(){
        System.out.println("Derivada.imprime()");
    }
    
    static void metodo( ClaseAbstracta cs){
        Derivada d = (Derivada)cs;    
        d.imprime();
    }
    
    
}