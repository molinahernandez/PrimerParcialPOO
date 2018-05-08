/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Jorge Orellana <00103717@uca.edu.sv>
 */
public class Hotel {
    public static HashMap<String,Piso>hotel= new HashMap<>();
    private static String[] Abecedario={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private String letra;
    
    public static void Crearhotel(){
        for(int i=0;i<6;i++){
            Piso piso= new Piso(Abecedario[i]);
            piso.crearpiso();
            hotel.put(Abecedario[i], piso);    
        }
    }
    
    public static void añadirpiso(){
        Piso piso= new Piso(Abecedario[Abecedario.length]);
        piso.crearpiso();
        hotel.put(Abecedario[Abecedario.length], piso);
    }
    
    //Aqui deberia mostrar el hotel
    public static void MostrarHotel(){ 
        //Se crea una variable Keys que guarde todas las key de hotel
        Set<String> Keys = hotel.keySet();
        
        //Iteramos Keys para mostrar hotel
        for(String Key:Keys){
            System.out.println(hotel.get(Key));
        }   
    } 
}
