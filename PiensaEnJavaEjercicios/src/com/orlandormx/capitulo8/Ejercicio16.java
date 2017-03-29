/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo8;

import static com.orlandormx.util.Print.*;

/**
 *
 * @author developer
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Spaceship s = new Spaceship();
        s.play();
        s.change();
        s.play();
    }
}


class Spaceship{
    AlertStatus as = new StatusOn();
    public void change(){ as = new StatusOff();}
    public void play() { as.alert(); }
}

class AlertStatus {   
    void alert(){}
}

class StatusOn extends AlertStatus{
    private Status status = Status.ON;
    
    @Override
    void alert(){
        print("StatusOn.alert() "+status);
    }
    
}

class StatusOff extends AlertStatus{
    private Status status = Status.OFF;
    
    @Override
    void alert(){
        print("StatusOff.alert() "+status);
    }
    
}

class StatusAveriate extends AlertStatus{
    private Status status = Status.AVERIATE;
    
    @Override
    void alert(){
        print("StatusAveriate.alert() "+status);
    }
    
}

enum Status{
    OFF, ON, AVERIATE;
}