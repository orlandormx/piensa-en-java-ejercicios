/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Creacion de alias en las llamadas a metodos
*/
package com.orlandormx.capitulo3;
import static com.orlandormx.util.Print.Print.*;
/**
 *
 * @author developer
 */
public class Ejercicio3 {
    static void fMethod(Flotante f){
        f.valor = 85.4f;
    }
    
    public static void main(String[] args) {
        Flotante f1 = new Flotante();
        
        f1.valor = 7.1f;
        print("f1.valor="+f1.valor);
        
        fMethod(f1);
        print("f1.valor="+f1.valor);
    }
    
}
