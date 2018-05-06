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
    //public static String tipo;
    protected static String Servicios;
    protected static int precios;

    public Paquete() {
    }

    /*public static String getTipo() {
        return tipo;
    }*/

    public static String getServicios() {
        return Servicios;
    }

    public static int getPrecios() {
        return precios;
    }

    /*public static void setTipo(String tipo) {
        Paquete.tipo = tipo;
    }*/

    public static void setServicios(String Servicios) {
        Paquete.Servicios = Servicios;
    }

    public static void setPrecios(int precios) {
        Paquete.precios = precios;
    }
    
}