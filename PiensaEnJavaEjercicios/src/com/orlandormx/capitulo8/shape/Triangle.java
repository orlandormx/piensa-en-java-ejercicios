//: polymorphism/shape/Triangle.java
package com.orlandormx.capitulo8.shape;
import static com.orlandormx.util.Print.*;

public class Triangle extends Shape {
  @Override
  public void draw() { print("Triangle.draw()"); }
  @Override
  public void erase() { print("Triangle.erase()"); }
} ///:~
