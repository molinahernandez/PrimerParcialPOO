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
    private static String tipo1 = "Premium";
    private static String tipo2 = "Basico";
    private static String Servicios;
    private static int precios;

    public static String getTipo1() {
        return tipo1;
    }

    public static void setTipo1(String aTipo1) {
        tipo1 = aTipo1;
    }

    public static String getTipo2() {
        return tipo2;
    }

    public static void setTipo2(String aTipo2) {
        tipo2 = aTipo2;
    }

    public static String getServicios() {
        return Servicios;
    }

    public static void setServicios(String aServicios) {
        Servicios = aServicios;
    }

    public static int getPrecios() {
        return precios;
    }

    public static void setPrecios(int aPrecios) {
        precios = aPrecios;
    }

    public Paquete() {
    }

    
}