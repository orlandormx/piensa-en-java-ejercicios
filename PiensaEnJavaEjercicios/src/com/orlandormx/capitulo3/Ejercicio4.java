/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* Calcula la velocidad con uso de CONSTANTES
*/
package com.orlandormx.capitulo3;
import static net.mindview.util.Print.*;
/**
 *
 * @author developer
 */
public class Ejercicio4 {
    static float calculaVelocidad(){
        float distacia = 12f;
        float tiempo = 5f;
        
        return distacia/tiempo;
    }
    public static void main(String[] args) {
        print("velocidad" +calculaVelocidad());
    }
}
