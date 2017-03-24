/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
pruebas de constructores
*/
package com.orlandormx.capitulo5;
import static com.orlandormx.util.Print.*;
/**
 *
 * @author developer
 */
public class Ejercicio3y4y5y6y7 {
    public static void main(String[] args) {
        new Ejercicio3y4();
        new Ejercicio3y4("HOla mundo");
        //ejercicio 5 y 6
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.bark("string");
        dog1.bark('a');
        dog1.bark(12);
        dog1.bark(012);
        dog1.bark(10,"grrr");
        dog1.bark("asfad",23);
        
        Ejercicio7 ej7 = new Ejercicio7();
        print(ej7.s);
    }
}

class Ejercicio3y4{
    Ejercicio3y4(){
        print("Ejercicio 3 imprime desde constructor");
    }
    Ejercicio3y4(String s){
        print("Ejercicio 3 imprime desde constructor con la cadena: "+s);
    }
}

class Dog{
    void bark(){
        print("woof");
    }
    void bark(int i){
        print("woof " +i);
    }
    void bark(String s){
        print("woof " +s);
    }
    void bark(char c){
        print("woof " +c);
    }
    void bark(long l){
        print("woof " +l);
    }
    
    void bark(int i, String s){
        print("woof " +i+s);
    }
    void bark(String s, int i){
        print("woof " +s+i);
    }
}

class Ejercicio7{
    String s;
}
