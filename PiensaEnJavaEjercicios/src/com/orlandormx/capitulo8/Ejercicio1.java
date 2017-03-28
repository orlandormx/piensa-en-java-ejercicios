/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo8;
import static com.orlandormx.util.Print.*;
/**
 *
 * @author developer
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Unicycle u = new Unicycle(1);
        Bicycle b = new Bicycle(2);
        Tricycle t = new Tricycle(3);
        
        PistaBicis.run(u);
        PistaBicis.run(b);
        PistaBicis.run(t);
        
    }
}

class Cycle{
    private int llantas;
    
    Cycle(int i){
        llantas = i;
    }
    
    void moveon(){
        print("move cycle");
    }
    
    String wheels(){
        return "num de llantas: "+llantas;
    }
}

class Unicycle extends Cycle{
    public Unicycle(int i){
        super(i);
    }
    
    @Override
    void moveon(){
        print("move unicycle");
    }
}

class Bicycle extends Cycle{
    public Bicycle(int i){
        super(i);
    }
    @Override
    void moveon(){
        print("move bicycle");
    }
    
    
}

class Tricycle extends Cycle{
    public Tricycle(int i){
        super(i);
    }
    
    @Override
    void moveon(){
        print("move tricycle");
    }
}

class PistaBicis{
    static void run(Cycle c){
        c.moveon();
        print(c.wheels());
    }

}