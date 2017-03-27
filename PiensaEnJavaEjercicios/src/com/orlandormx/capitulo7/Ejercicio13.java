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
public class Ejercicio13 {
    public static void main(String[] args) {
        Benedetis bd = new Benedetis();
        bd.eat(1);
        bd.eat("s");
        bd.eat(1f);
        bd.eat(1L);
    }
}

class Pizza{

    public void eat(int i){
        print("eat(int)");
    }
    public void eat(String i){
        print("eat(String)");
    }
    public void eat(float i){
        print("eat(float)");
    }
}

class Benedetis extends Pizza{
    public void eat(long i){
        print("eat(long)");
    }
}