/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

import java.util.Scanner;

/**
 *
 * @author Cristian Hernandez
 */
public class ParcialPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        int KeyR = 0;
        CrearHotel hotel = new CrearHotel();
        
        Hotel.Crearhotel();
        Hotel.MostrarHotel();
        Hotel.añadirpiso();
        
        Menu1.crearreservacion(KeyR);
        Menu1.MostrarReservacion();
    }
    
}
