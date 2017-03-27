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
public class Ejercicio16y17 {
    public static void main(String[] args) {
        Frog frog = new Frog("estreptococo");
        Amphibian.live(frog);
    }
}

class Amphibian{
    private String raza;

    public Amphibian(String raza) {
        this.raza = raza;
    }
    
    public void breath(){
        print(raza+" breath");
    }
    
    static void live(Amphibian a){
        a.breath();
    }
    
    public String toString(){
        return "im an"+raza;
    }
    
}

class Frog extends Amphibian{

    public Frog(String raza) {
        super(raza);
    }
    
    @Override
    public void breath(){
        print(" breath Frog");
    }
}