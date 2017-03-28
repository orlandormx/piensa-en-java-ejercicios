//: polymorphism/shape/Square.java
package com.orlandormx.capitulo8.shape;
import static com.orlandormx.util.Print.*;

public class Square extends Shape {
  @Override
  public void draw() { print("Square.draw()"); }
  @Override
  public void erase() { print("Square.erase()"); }
} ///:~
