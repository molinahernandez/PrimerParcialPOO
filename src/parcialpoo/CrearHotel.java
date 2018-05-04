/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

import java.util.Scanner;

/**
 *
 * @author Jorge Orellana <00103717@uca.edu.sv>
 */
public class CrearHotel {
    private int Pisos;
    private int Habitaciones;
    
    //Metodos  
    public void Hotel(){
        Scanner nP = new Scanner(System.in);
        
        //Creando la matriz
        int Hotel [][] = null, nPisos = 0, nHabitaciones = 0;
        int numeroP;
        
        //Pidiendo el numero de Pisos 
        System.out.println("Ingrese el numero de Pisos: ");
        numeroP = nP.nextInt();
        
        Scanner nH = new Scanner(System.in);
        int numeroH;
        
        //Pidiendo el numero de Habitaciones
        System.out.println("Ingrese el numero de Habitaciones por piso: ");
        numeroH = nH.nextInt();
        
        
        //Igualando
        nPisos = numeroP;
        nHabitaciones = numeroH;
        
        //Creando la matriz 
        Hotel = new int [nPisos][nHabitaciones];
        
    }
    
    public void Mostrar(){
            for(int i=0; i<nPisos; i++){                 //Numero de pisos
                for(int j=0; j<nHabitaciones; j++){     //Numero de habitaciones
                System.out.print(Hotel[i][j]);
                }
            System.out.println("");
            }
    }
}
