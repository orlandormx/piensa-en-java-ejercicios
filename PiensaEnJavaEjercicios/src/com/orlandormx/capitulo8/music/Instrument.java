//: polymorphism/music/Instrument.java
package com.orlandormx.capitulo8.music;
import static com.orlandormx.util.Print.*;

class Instrument {
  void play(Note n) {
    print("Instrument.play() "+n);
  }
  public String toString() { return "Instrument"; }
  void adjust() { print("Adjusting Instrument"); }
}
 ///:~
