//: polymorphism/shape/Circle.java
package com.orlandormx.capitulo8.shape;
import static com.orlandormx.util.Print.*;

public class Circle extends Shape {
  @Override
  public void draw() { print("Circle.draw()"); }
  @Override
  public void erase() { print("Circle.erase()"); }

    @Override
    public void mensaje() {
        print("circle mensagge");
    }
  
} 
