/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

/**
 *
 * @author Cristian Hernandez
 */
public class Paquete {
    public String tipo;
    public String Servicios;
    public int precios;

    public Paquete(String tipo, String Servicios, int precios) {
        this.tipo = tipo;
        this.Servicios = Servicios;
        this.precios = precios;
    }

    public String getTipo() {
        return tipo;
    }

    public String getServicios() {
        return Servicios;
    }

    public int getPrecios() {
        return precios;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setServicios(String Servicios) {
        this.Servicios = Servicios;
    }

    public void setPrecios(int precios) {
        this.precios = precios;
    }
    
}