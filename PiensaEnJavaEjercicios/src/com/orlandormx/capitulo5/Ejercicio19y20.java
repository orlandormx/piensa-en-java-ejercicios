/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo5;

/**
 *
 * @author developer
 */
public class Ejercicio19y20 {
    public static void main(String... args) {
        String[] arregloS = new String[2];
        arregloS[0] = "hola";
        arregloS[1] = "mundo";
        Ejercicio19.varargMethod(arregloS);
        Ejercicio19.varargMethod("hola","cariño");
        Ejercicio19.varargMethod(args);
    }
}

class Ejercicio19{
    static void varargMethod(String... args){
        for(String s: args){
            System.out.println(s+", ");
        }
    }

}