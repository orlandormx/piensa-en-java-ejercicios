/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
demostracion de inicializacion correcta por herencia
*/
package com.orlandormx.capitulo7;
import static com.orlandormx.util.Print.*;
/**
 *
 * @author developer
 */
public class Ejercicio3 {
    public static void main(String[] args) {
    Cartoon x = new Cartoon();
  }
}

class Art {
  Art() { print("Art constructor"); }
}

class Drawing extends Art {
  Drawing() { print("Drawing constructor"); }
}

class Cartoon extends Drawing {
  public Cartoon() { print("Cartoon constructor"); }
  
}