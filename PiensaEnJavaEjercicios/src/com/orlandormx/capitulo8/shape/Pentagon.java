/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo8.shape;
import static com.orlandormx.util.Print.*;
/**
 *
 * @author developer
 */
public class Pentagon extends Shape{

    @Override
    public void mensaje() {
        print("Pentagon message");
    }

    @Override
    public void erase() {
        print("Pentagon.erase()");
    }

    @Override
    public void draw() {
        print("Pentagon.draw()");
    }
    
}
