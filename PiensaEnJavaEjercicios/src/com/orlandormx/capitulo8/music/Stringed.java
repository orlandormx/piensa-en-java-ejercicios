/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo8.music;
import static com.orlandormx.util.Print.*;
/**
 *
 * @author developer
 */
public class Stringed extends Instrument implements Playable{
    @Override
    public void play(Note n) { print("Stringed.play() " + n); }
    @Override
    public String toString() { return "Stringed"; }
    @Override
    void adjust() { print("Adjusting Stringed"); }
}

class Violin extends Stringed{

    @Override
    void adjust() {
        print("Adjusting Violin");
    }

    @Override
    public String toString() {
       return "Violin";
    }

    @Override
    public void play(Note n) {
         print("Violin.play() " + n);
    }
    
}