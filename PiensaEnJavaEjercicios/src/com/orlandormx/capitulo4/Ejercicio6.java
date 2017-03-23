/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
modificacion de los metods test
*/
package com.orlandormx.capitulo4;
import static com.orlandormx.util.Print.*;
/**
 *
 * @author developer
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        
        print(IfElse2.test(10, 5));
    }
}

class IfElse {
  static int result = 0;
  static int between =0;
  static void test(int testval, int target, int begin, int end) {
    if(testval > target)
      result = +1;
    else if(testval < target)
      result = -1;
    else
      result = 0; // Match
    
    if(testval >= begin && testval <= end)
        between = 1;
    else
        between = 0;
  }
}

class IfElse2 {
  static int test(int testval, int target) {
    if(testval > target)
      return +1;
    else if(testval < target)
      return -1;
    else
      return 0; // Match
  }
}