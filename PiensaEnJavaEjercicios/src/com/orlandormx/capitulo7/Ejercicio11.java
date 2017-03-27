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
public class Ejercicio11 {
    public static void main(String[] args) {
        Detergent2 d = new Detergent2();
        d.dilute();
        d.apply();
        d.scrub();
        d.foam();
        print(d);
        print("Testing base class:");
    }
}

class Cleanser2 {
  private String s = "Cleanser";
  public void append(String a) { s += a; }
  public void dilute() { append(" dilute()"); }
  public void apply() { append(" apply()"); }
  public void scrub() { append(" scrub()"); }
  public String toString() { return s; }
  
}	

class Detergent2{
    
    private Cleanser2 control = new Cleanser2();
   
    public void append(String a) {
        control.append(a);
    }

    public void dilute() {
        control.dilute();
    }

    public void apply() {
        control.apply();
    }

    public void scrub() {
        control.append(" Detergent.scrub()");
        control.scrub();
    }

    public String toString() {
        return control.toString();
    }
    
    public void foam(){
        append(" foam()");
    }
}