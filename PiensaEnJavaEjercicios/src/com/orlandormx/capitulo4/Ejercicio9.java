/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo4;
import static com.orlandormx.util.Print.*;
/**
 *
 * @author developer
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        fibonacci(10);
    }

    static void fibonacci(int input) {
        int[] fibo = new int[input];
        fibo[0] = 1;
        fibo[1] = 1;
        for(int i = 2; i<fibo.length; i++){
            fibo[i] = fibo[i-1]+fibo[i-2];
        }
        for(int i = 0; i<fibo.length; i++)
        print(fibo[i]);
    }
}
