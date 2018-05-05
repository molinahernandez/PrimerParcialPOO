/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Ivan Lopez
 */
public class Hotel {
    
    
    public static void Crearhotel(){
    String[]Abecedario={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    HashMap<String,Piso>hotel= new HashMap<>();
    

    for(int i=0;i<6;i++){
        Piso piso= new Piso(Abecedario[i]);
        piso.crearpiso();
        hotel.put(Abecedario[i], piso);    
    }
    }
    
    
}
