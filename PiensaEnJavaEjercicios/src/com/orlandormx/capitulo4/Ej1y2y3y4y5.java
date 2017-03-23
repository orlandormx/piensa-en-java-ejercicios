/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo4;
import static com.orlandormx.util.Print.*;
import java.util.Random;
/**
 *
 * @author developer
 */
public class Ej1y2y3y4y5 {
    public static void main(String[] args) {
//        Ej1.imprimeValores();
  //      Ej2.comparaValoresRand();
    //  tener cuidado entra a un bucle infinito
    //    Ej3.comparaValoresRandWhile();
    }
}

class Ej1{
    static void imprimeValores(){
        for(int i = 1; i <=100; i++){
            print(i);
        }
    }
}

class Ej2{
    static void comparaValoresRand(){
        int[] valoresRand = new int[25];
        Random r = new Random();
        int cmp = r.nextInt(20);
        for(int i = 0; i < valoresRand.length; i++){
            valoresRand[i] = r.nextInt(20);
        }
        
        for(int i = 0; i < valoresRand.length; i++){
            if(valoresRand[i] > cmp)
                print(valoresRand[i]+" > "+cmp);
            else if(valoresRand[i] < cmp)
                print(valoresRand[i]+" < "+cmp);
            else
                print(valoresRand[i]+" = "+cmp);
        }
    }
}

class Ej3{
    static void comparaValoresRandWhile(){
        int[] valoresRand = new int[25];
        Random r = new Random();
        int cmp = r.nextInt(20);
        for(int i = 0; i < valoresRand.length; i++){
            valoresRand[i] = r.nextInt(20);
        }
        
        while(true){
            int i=0;
            if(valoresRand[i] > cmp)
                print(valoresRand[i]+" > "+cmp);
            else if(valoresRand[i] < cmp)
                print(valoresRand[i]+" < "+cmp);
            else
                print(valoresRand[i]+" = "+cmp);
            i++;
        }
    }
}