/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo7;

/**
 *
 * @author developer
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        SecondClass ss = new SecondClass();
        ss.toString();
    }    
}

class SimpleClass{
    
}

class SecondClass{
    SimpleClass sc;
    
    @Override
    public String toString(){
        if(sc == null)
            sc = new SimpleClass();
        return "hola"+sc;
    }
    
    
}