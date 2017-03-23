/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Programa que usa la forma larga de impresion a consola y impresion corta,
importando biblioteca estatica.
*/
package com.orlandormx.capitulo3;

import static com.orlandormx.util.Print.Print.*;
/**
 *
 * @author developer
 */
public class Ejercicio1 {
    static void imprimeFormaLarga(String datos){
        System.out.println(datos);
    }
    
    static void imprimeFormaCorta(String datos){
        print(datos);
    }
    
    
    public static void main(String[] args){
        imprimeFormaCorta("hola mundo corto");
        imprimeFormaLarga("hola mundo largo");
    }
}
