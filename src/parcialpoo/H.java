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
public class H {
    protected int numero;
    protected String estado;
    protected static int precio;
    //protected static String tipo;

    public H(int numero, String estado) {
        this.numero= numero;
        this.estado= estado;
    }

    public static int getPrecio() {
        return precio;
    }

    public static void setPrecio(int precio) {
        H.precio = precio;
    }

    /*public String getTipo() {
        return tipo;
    }*/

    /*public static void setTipo(String tipo) {
        H   .tipo = tipo;
    }*/
}
