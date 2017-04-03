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
public class Percussion extends Instrument implements Playable{
    @Override
    public void play(Note n) { print("Percussion.play() " + n); }
    @Override
    public String toString() { return "Percussion"; }
    @Override
    void adjust() { print("Adjusting Percussion"); }
}
