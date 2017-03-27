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
public class Ejercicio15 {
    String name;

    public Ejercicio15(String name) {
        this.name = name;
    }
    
    protected void set(String name){
        this.name = name;
    }
    
    public String toString(){
        return name;
    }
}

class PruebaProtected extends Ejercicio15{

    public PruebaProtected(String name) {
        super(name);
    }
    
    public void change(String name){
        set(name);
    }
    
    
    
    public String toString(){
        return name+" "+ super.toString();
    }
    public static void main(String[] args) {
        PruebaProtected pp = new PruebaProtected("prueba protected");
        pp.change("sdsdsd");
        print(pp);
    }

}
