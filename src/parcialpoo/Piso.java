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
public class Piso {
    private String letra;
    
    public Piso(String letra){
        this.letra= letra;
    }
    
    public void SetLetra(String letra){
        this.letra= letra;
    }
    
    public void crearpiso(){
        HashMap<Integer, H>piso= new HashMap<>();
        
        for(int i=1;i<=5;i++){
            
            Habitacioni habitacion= new Habitacioni((i*2)-1);
            piso.put((i*2)-1, habitacion);
            
            Habitacionp habitacion1= new Habitacionp(i*2);
            piso.put((i*2),habitacion);
        }
    }
}
