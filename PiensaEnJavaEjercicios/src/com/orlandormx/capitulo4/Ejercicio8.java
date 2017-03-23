/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo4;
import static com.orlandormx.util.Print.*;
/**
 *
 * @author developer
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        switchMensaje();
    }
    
    static void switchMensaje(){
        for(int i = 0; i<=3; i++){
            switch(i){
                case 0:
                    print("caso 0");
                    //break;
                case 1:
                    print("caso 1");
                    //break;
                case 2:
                    print("caso 2");
                    //break;
                default:
                    print("caso default");
            }
        }
    }
}