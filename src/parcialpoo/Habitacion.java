/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

/**
 *
 * @author Jorge Orellana <00103717@uca.edu.sv>
 */
public class Habitacion {
    private int Numero;
    private String Estado;
    private static int Precio;

    public Habitacion() {
    }
    
    public Habitacion(int Numero, String Estado) {
        this.Numero = Numero;
        this.Estado = Estado;
    }
    
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    public static void setPrecio(int aPrecio) {
        Precio = aPrecio;
    }
    
    public int getNumero() {
        return Numero;
    }

    public String getEstado() {
        return Estado;
    }

    public static int getPrecio() {
        return Precio;
    }

    
    
    
}
