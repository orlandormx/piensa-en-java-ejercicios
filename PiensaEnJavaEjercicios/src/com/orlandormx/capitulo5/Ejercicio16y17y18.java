/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo5;
import static com.orlandormx.util.Print.*;
/**
 *
 * @author developer
 */
public class Ejercicio16y17y18 {
    public static void main(String[] args) {
        //ejercicio 1
        String[] matriz = new String[4];
        matriz[0] = "go";
        matriz[1] = "Diego";
        matriz[2] = "gou";
        matriz[3] = "gok";
        for(int i = 0; i < matriz.length; i++){
            print(matriz[i]);
        }
        
        Ejercicio17[] ej = new Ejercicio17[2];
        ej[0] = new Ejercicio17("holi");
        ej[1] = new Ejercicio17("crayoli");
    }
}

class Ejercicio17{
    Ejercicio17( String s){
        print("constructor con: "+ s);
    }

}