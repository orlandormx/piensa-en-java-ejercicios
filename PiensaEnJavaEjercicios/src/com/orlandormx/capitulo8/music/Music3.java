/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo8.music;

/**
 *
 * @author developer
 */
public class Music3 {
    // Doesn't care about type, so new types
  // added to the system still work right:
  public static void tune(Instrument i) {
    // ...
    i.play(Note.MIDDLE_C);
  }
  public static void tuneAll(Instrument[] e) {
    for(Instrument i : e)
      tune(i);
  }	
  public static void main(String[] args) {
    RandomInstrumentGenerator r = new RandomInstrumentGenerator();
    
// Upcasting during addition to the array:
    Instrument[] orchestra = {
      new Wind(),
      new Percussion(),
      new Stringed(),
      new Brass(),
      new Woodwind(),
      new Violin()
    };
    
    Instrument[] orchestraRandom = new Instrument[10];
    
    for( int i = 0; i < orchestraRandom.length; i++){
        orchestraRandom[i]= r.next();
    }
    tuneAll(orchestra);
    
    for(Instrument i : orchestra){
        System.out.println(i);
    }
      System.out.println("");
      
    tuneAll(orchestraRandom);
    
    for(Instrument i : orchestraRandom){
        System.out.println(i);
    }
  }
}
