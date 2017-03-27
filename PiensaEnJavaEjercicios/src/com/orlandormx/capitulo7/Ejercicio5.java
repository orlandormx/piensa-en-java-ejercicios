/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo7;
import static com.orlandormx.util.Print.*;
/**
 *
 * @author developer
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        C c = new C();
    }
}
class A{
    public A(){
        print("A constructor");
    }
}

class B{
    public B(){
        print("B constructor");
    }
}

class C extends A{
    B b = new B();
}