/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
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
        Scanner nPisos = new Scanner(System.in);
        int nP;
        
        System.out.println("Ingrese el numero de Pisos: ");
        nP = nPisos.nextInt();
        
        for(int i=0;i<nP;i++){
            Piso piso= new Piso(Abecedario[i+6]);
            piso.crearpiso();
            hotel.put(Abecedario[i+6], piso);    
        }
        
    }
    
    //Aqui deberia mostrar el hotel
    public static void MostrarHotel(){ 
        //Se crea una variable Keys que guarde todas las key de hotel
        Set<String> Keys = hotel.keySet();
        
        Piso a;
        
        H b;
        
        //Iteramos Keys para mostrar hotel
        for(String Key:Keys){
            for(int i=1; i<=10; i++){
                a = hotel.get(Key);
                b = a.piso.get(i);
                System.out.print(a.GetLetra()+""+b.numero+"  ");
            }
            System.out.println("");
        }
        
    } 
}
