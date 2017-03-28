/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
solo se agrega la anotacion Override al package shape
*/
package com.orlandormx.capitulo8;
import com.orlandormx.capitulo8.shape.*;

/**
 *
 * @author developer
 */
public class Ejercicio2 {
    private static RandomShapeGenerator gen =
    new RandomShapeGenerator();
  public static void main(String[] args) {
    Shape[] s = new Shape[9];
    // Fill up the array with shapes:
    for(int i = 0; i < s.length; i++)
      s[i] = gen.next();
    // Make polymorphic method calls:
    for(Shape shp : s){
        shp.draw();
        shp.mensaje();
    }
      
  }
}