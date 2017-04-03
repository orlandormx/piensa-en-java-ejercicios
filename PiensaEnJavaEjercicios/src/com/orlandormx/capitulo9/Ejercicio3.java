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
public class Ejercicio3 {
    public static void main(String[] args) {
        Deriva d = new Deriva();
        d.print();
    }
}

abstract class Base{
    abstract void print();
    
    Base(){
        print();
    }
}

class Deriva extends Base{
    private int valor = 5;
    @Override
    void print() {
        System.out.println(valor);
    }
    

}