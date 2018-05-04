/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

import java.util.HashMap;

/**
 *
 * @author Ivan Lopez
 */
public class Pisoi {
    private String letra;
    
    public Pisoi(){
        
    }
    
    public void SetLetra(String letra){
        this.letra= letra;
    }
    
    public void crearpiso(){
        HashMap<Integer, Habitacionp>piso= new HashMap<>();
        
        for(int i=1;i<5;i++){
            
            Habitacionp habitacion= new Habitacionp(i);
            piso.put((i*2)-1, habitacion);
        }
    }
}
