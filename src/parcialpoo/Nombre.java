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
public class Nombre {
    private String nombre;
    private String apellido;

    public Nombre() {
    }
    
    public void SetNombre(String nombre){
        this.nombre= nombre;
    }
    
    public void SetApellido(String apellido){
        this.apellido= apellido;
    }
    
    public String GetNombre(){
        return nombre;
    }
    
    public String GetApellido(){
        return apellido;
    }
}
