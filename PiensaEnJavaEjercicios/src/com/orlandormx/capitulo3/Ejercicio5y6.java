/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* Ejercicio 5 creacion y muestra de objetos Dog
Ejercicio 6 asignacion de un nuevo dog y ver el comportamiento con == y el
metodo equals()
*/
package com.orlandormx.capitulo3;
import static com.orlandormx.util.Print.*;
/**
 *
 * @author developer
 */
class Dog{
    String name;
    String says;
}

public class Ejercicio5y6 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        
        d1.name = "spot";
        d1.says = "Ruff!";
        
        d2.name = "scruffy";
        d2.says = "Wurf!";
        
        print(d1.name+" "+d1.says);
        print(d2.name+" "+d2.says);
        
        Dog d3 = new Dog();
        d3 = d1;
        
        
        print(d3 == d1);
        print("d3 equals d1 "+ d3.equals(d1));
    }
}
