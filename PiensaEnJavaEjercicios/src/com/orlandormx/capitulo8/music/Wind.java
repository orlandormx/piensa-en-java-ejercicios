//: polymorphism/music/Wind.java
package com.orlandormx.capitulo8.music;
import static com.orlandormx.util.Print.*;

// Wind objects are instruments
// because they have the same interface:
public class Wind extends Instrument implements Playable{
  // Redefine interface method:
  @Override
  public void play(Note n) {
    System.out.println("Wind.play() " + n);
  }
  @Override
  public String toString() { return "Wind"; }
  @Override
  void adjust() { print("Adjusting Wind"); }
  
}

class Brass extends Wind {
  @Override
  public void play(Note n) { print("Brass.play() " + n); }
  @Override
  void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
  @Override
  public void play(Note n) { print("Woodwind.play() " + n); }
  @Override
  public String toString() { return "Woodwind"; }
}
