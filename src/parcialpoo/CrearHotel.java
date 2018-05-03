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
public class CrearHotel {
    private int nPisos;
    private int nHabitaciones;

    public CrearHotel(int nPisos, int nHabitaciones) {
        this.nPisos = nPisos;
        this.nHabitaciones = nHabitaciones;
    }

    public int getnHabitaciones() {
        return nHabitaciones;
    }

    public void setnHabitaciones(int nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }

    public int getnPisos() {
        return nPisos;
    }

    public void setnPisos(int nPisos) {
        this.nPisos = nPisos;
    }
    
    
}
