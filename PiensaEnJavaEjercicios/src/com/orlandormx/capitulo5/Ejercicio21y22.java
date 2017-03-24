/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo5;

/**
 *
 * @author developer
 */
public class Ejercicio21y22 {
    public static void main(String[] args) {
        MexBilletes mB;
        for(MexBilletes m : MexBilletes.values()){
            System.out.println(m+" "+m.ordinal());
            switch(m){
            case BENITO:
                System.out.println("Billete de a 20");
                break;
            case MORELOS:
                System.out.println("Billete de a 50");
                break;
            case CUAU:
                System.out.println("Billete de a 100");
                break;
            case SOR_JUANA:
                System.out.println("Billete de a 200");
                break;
            case FRIDA:
                System.out.println("Billete de a 500");
                break;
            default:
                System.out.println("tal vez una milaneza");
        }
        }
        
        
        
    }
}

enum MexBilletes{
    BENITO,
    MORELOS,
    CUAU,
    SOR_JUANA,
    FRIDA
}