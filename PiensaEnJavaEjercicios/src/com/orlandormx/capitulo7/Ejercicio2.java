/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo7;
import static com.orlandormx.util.Print.*;
/**
 *
 * @author developer
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Persil x = new Persil();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        print(x);
        print("Testing base class:");
        Detergent.main(args);
    }
}

class Cleanser {
  private String s = "Cleanser";
  public void append(String a) { s += a; }
  public void dilute() { append(" dilute()"); }
  public void apply() { append(" apply()"); }
  public void scrub() { append(" scrub()"); }
  public String toString() { return s; }
  public static void main(String[] args) {
    Cleanser x = new Cleanser();
    x.dilute(); x.apply(); x.scrub();
    print(x);
  }
}	

class Detergent extends Cleanser {
  // Change a method:
  public void scrub() {
    super.scrub(); // Call base-class version  
    append(" Detergent.scrub()");
    
  }
  // Add methods to the interface:
  public void foam() { append(" foam()"); }
  // Test the new class:
  public static void main(String[] args) {
    Detergent x = new Detergent();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    print(x);
    print("Testing base class:");
    Cleanser.main(args);
  }	
}

class Persil extends Detergent{
    public void sterilize(){
        append("sterilize()");
    }

    public void foam(){
        append("Persil.foam()");
    }    
    
}