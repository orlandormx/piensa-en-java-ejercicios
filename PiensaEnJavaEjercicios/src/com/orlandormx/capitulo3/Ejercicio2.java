/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Se crea una clase con valor float para ilustar la creacion de alias
*/

package com.orlandormx.capitulo3;
import static com.orlandormx.util.Print.*;
/**
 *
 * @author developer
 */

class Flotante{
    float valor;
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Flotante f1 = new Flotante();
        Flotante f2 = new Flotante();
        
        f1.valor = 5.0f;
        f2.valor = 10.2f;
        
        print("valor de f1 "+f1.valor+
              " Valor de f2 "+f2.valor);
        /*se copia la referencia de f2 a f1*/
        f1 = f2;
        
        print("valor de f1 "+f1.valor+
              " Valor de f2 "+f2.valor);
        /*f1 tiene la referencia de f2, cualquier modificacion
        afectará a f2*/
        f1.valor = 2.2f;
        
        print("valor de f1 "+f1.valor+
              " Valor de f2 "+f2.valor);
    }
}
