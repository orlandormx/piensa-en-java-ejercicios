/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orlandormx.capitulo4;
import static com.orlandormx.util.Print.*;
import java.util.ArrayList;
/**
 *
 * @author developer
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        esVampiro();
        desconcatenaInt(1001);
    }
    
    static void esVampiro(){
       int count = 0;
       for( int valor = 1001; valor <10000; valor++){
           int op[] = new int[4];
           //op = desconcatenaInt(valor);
           
           
       } 
    }
    static void desconcatenaInt(int input){
        ArrayList<String> strings = new ArrayList<>();
        int[] op;
        
        String s1 = Integer.toString(input);
        char[] sSeparate = s1.toCharArray();
        
        for(int i =0; i < 4 ; i++){
            for(int j =0; j < 4 ; j++){
                if(i != j)
                    strings.add(""+sSeparate[i]+sSeparate[j]);
            }
        }
        
        for(int i=0 ; i < strings.size(); i++)
            print(i+"op "+strings.get(i));
        
        op = new int[strings.size()];
        /*
        for(int i =0; i < op.length ; i++){
            op[i] = Integer.parseInt(strings.get(i));
            print(op[i]);
        }
        */
        
    }
}
