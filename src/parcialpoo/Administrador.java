/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

/**
 *
 * @author Ivan Lopez
 */
public class Administrador {
    public void modificarpreciohp(int precio){
        Habitacionp.setPrecio(precio);    
    }
    
    public void modificarpreciohi(int precio){
        Habitacioni.setPrecio(precio);    
    }
    
    public void modificarpreciop (int precio){
        Paquete.setPrecios(precio);
    }
    
    public void modificarserviciosp(String servicios){
        Paquete.setServicios(servicios);
    }
    
    public void modificarestadoh(){
        
    }
    
    public void agregarpiso(){
        
    }
    
    public void agregarreserva(){
        
    }
}
