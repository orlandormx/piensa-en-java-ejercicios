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
        //esVampiro();
        desconcatenaInt(1092);
    }
    
    static void esVampiro(){
       int count = 0;
       for( int valor = 1001; valor <10000; valor++){
            int op[] = desconcatenaInt(valor);
            
            for(int i = 0; i < op.length ; i++){
                for(int j = i;j <op.length-1 ; j++){
                    if(valor == op[i]*op[j]){
                        print(valor+" == "+ op[i]+"*"+op[j]);
                        count++;
                    }
                }
            } 
            
       }
       print("Numeros vampiros = "+count);
    }
    static int[] desconcatenaInt(int input){
        ArrayList<String> strings = new ArrayList<>();
        int[] op;
        
        String s1 = Integer.toString(input);
        char[] sSeparate = s1.toCharArray();
        
        for(int i =0; i < 4 ; i++){
            for(int j =0; j < 4 ; j++){
                if((sSeparate[i] != '0' || sSeparate[j] != '0')&&(i!=j))
                    strings.add(""+sSeparate[i]+sSeparate[j]);
            }
        }
        
        for(int i = 0; i<strings.size(); i++)
            print(strings.get(i));
        
        op = new int[strings.size()];
        
        for(int i =0; i < op.length ; i++){
            op[i] = Integer.parseInt(strings.get(i));
        }
        
        return op;
    }
}
