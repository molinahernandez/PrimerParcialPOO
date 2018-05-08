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
public class Cliente {
    private Nombre nombre;
    private String DUI;
    private String telefono;
    private String tarjetacredito;
    
    public Cliente(){
        
    }

    public Cliente(Nombre nombre, String DUI, String telefono, String tarjetacredito) {
        this.nombre = nombre;
        this.DUI = DUI;
        this.telefono = telefono;
        this.tarjetacredito = tarjetacredito;
    }
    
    public void SetNombre(Nombre nombre){
      this.nombre= nombre;  
    }
    
    public void SetDUI(String DUI){
        this.DUI= DUI;
    }
    
    public void SetTelefono(String telefono){
        this.telefono= telefono;
    }
    
    public void SetTarjetacredito(String tarjetacredito){
        this.tarjetacredito= tarjetacredito;
    }
    
    public Nombre GetNombre(){
        return nombre;
    }
    
    public String GetDUI(){
        return DUI;
    }
    
    public String GetTelefono(){
        return telefono;
    }
    
    public String GetTarjetacredito(){
        return tarjetacredito;
    }
}
