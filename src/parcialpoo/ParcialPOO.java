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
public class ParcialPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        int KeyR = 0;
        CrearHotel hotel = new CrearHotel();
        
        Hotel.Crearhotel();
        Hotel.MostrarHotel();
        
        Administrador.crearreservacion(KeyR);
        Administrador.MostrarReservacion();
        
        Hotel.añadirpiso();
        Hotel.MostrarHotel();
    }
    
}
