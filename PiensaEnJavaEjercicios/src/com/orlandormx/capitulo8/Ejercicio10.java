/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo8;

import static com.orlandormx.util.Print.*;

/**
 *
 * @author developer
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        BaseClass obj = new DerivateClass();
        obj.method1();
    }
}

class BaseClass{
    void method1(){
        print("BaseClass.method1");
        method2();
    }
    
    void method2(){
        print("BaseClass.method2");
    }
}

class DerivateClass extends BaseClass{
    @Override
    void method2(){
        print("DerivateClass.method2()");
    }
}