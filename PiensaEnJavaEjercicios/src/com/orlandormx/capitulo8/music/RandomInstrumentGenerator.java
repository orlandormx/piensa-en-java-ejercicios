/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo8.music;

import java.util.Random;

/**
 *
 * @author developer
 */
public class RandomInstrumentGenerator {
    private Random r = new Random(47);
    
    public Playable next(){
        switch(r.nextInt(6)){
            default:
            case 0:
                return new Percussion();
            case 1:
                return new Stringed();
            case 2:
                return new Wind();
            case 3:
                return new Brass();
            case 4:
                return new Woodwind();
            case 5:
                return new Violin();
        }
    }
}
