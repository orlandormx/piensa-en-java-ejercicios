/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Ejercicio de patron singleton y similares*/
package com.orlandormx.capitulo6;

import java.util.ArrayList;

/**
 *
 * @author developer
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Connection c = ConnectionManager.makeConnection();
    }
}

class ConnectionManager{
    static ArrayList<Connection> col = new ArrayList<>(5);    
    int count = 0;
    
    private ConnectionManager(){
        for(int i = 0; i < col.size(); i++){
            col.add(new Connection());
        }
    }

    public static Connection makeConnection(){
        return col.get(count);
        count++;
    }
}

class Connection{
   
}