/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*uso de la palabra static*/
package com.orlandormx.capitulo5;
import static com.orlandormx.util.Print.*;
/**
 *
 * @author developer
 */
public class Ejercicio13y14 {
    public static void main(String[] args) {
        print("main");
        print(Estatica.s);
        print(Estatica.s2);
        Estatica.imprimeStatic();
    }
}


class Estatica{
    static String s = "inicializado statico";
    static String s2;
    
    Estatica(){
        print("constructor");
    }
    
    static{
        s2 = "incializado por bloque";
    }
    
    static void imprimeStatic(){
        print(s);
        print(s2);
    }
}