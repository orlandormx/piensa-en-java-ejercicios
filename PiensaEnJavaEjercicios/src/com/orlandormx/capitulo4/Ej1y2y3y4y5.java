/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Ejercicio 5 no entiendo lo que se pide descripcion en pag 100
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
        Ej3.comparaValoresRandWhile();
    //    Ej4.encuentraNumerosPrimos(410);
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
        boolean s= true;
        int i=0;
        while(s){
            
            if(valoresRand[i] > cmp)
                print(valoresRand[i]+" > "+cmp);
            else if(valoresRand[i] < cmp)
                print(valoresRand[i]+" < "+cmp);
            else
                print(valoresRand[i]+" = "+cmp);
            
            if(i==10){
               s = false;
               break;
            }
            i++;
        }
    }
}

class Ej4{
    static void encuentraNumerosPrimos(int limite){
        int count = 0;
        for(int i = 1; i < limite; i++){
            for(int j = i; j>0; j--){
                if(i%j == 0)
                    count++;
            }
            if(count ==2){
                print(i+" es primo");
            }
                
            count = 0;
        }
    }
    static void prueba(int x){
        int count = 0;
        for(int j = 1; j<=x; j++){
            if(x%j==0)
                count++;
                
        }
        if(count==2){
            print(x+" es primo");
        }
    }

}

class Ej5{
    static void comparador(){
        int valor1 = 5;
        int valor2 = 10;
    /*
        System.out.println(Integer.toBinaryString(VALOR1));
        System.out.println(Integer.toBinaryString(VALOR2));
        System.out.println(Integer.toBinaryString(VALOR1 & VALOR2));
        System.out.println(Integer.toBinaryString(VALOR1 | VALOR2));
        System.out.println(Integer.toBinaryString(VALOR1 ^ VALOR2));
        System.out.println(Integer.toBinaryString(~VALOR1));
        System.out.println(Integer.toBinaryString(~VALOR2));
        //no se pueden aplicar porque son valores static
        //System.out.println(Integer.toBinaryString(VALOR1 &= VALOR2));
        //System.out.println(Integer.toBinaryString(VALOR1 |= VALOR2));
        //System.out.println(Integer.toBinaryString(VALOR1 ^= VALOR2));
        */
    }
    
    
    
    
    //exp-booleana ? valor1 : valor 2;
    
}