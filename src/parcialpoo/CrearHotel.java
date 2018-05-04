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
        String[][] Hotel = null;
        //Creando la matriz
        int nPisos = 0;
        //Creando la matriz
        int nHabitaciones = 0;
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
        Hotel = new String [nPisos][nHabitaciones];
        
        //Nombre de habitacion
        String Alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        String Alpha2 = "cdefghijklmnopqrstuvwxyz"; 
        String Nombre = "";
        String Nombre1 = "";
        String Numero1 = ""; 
        int Numero = 0;
        int Letra;
        
        //Iterador para las habitaciones
        
        /*for(int i=0;i<10;i++){
            //Metodo de elegir letra
            Letra = (Alpha.length()-26);
            //Metodo del numero
            Numero = Numero + 1;
            Nombre = Nombre+ Alpha.charAt(Letra)+Numero;
            System.out.println("Tu nombre de habitacion es: "+Nombre); //Nombre de la habitacion
        }*/
        for(int i=0; i<nPisos; i++){  //Numero de pisos
            //Letra = (Alpha.length()-26+i);
            //Nombre = Nombre1 + Alpha.charAt(Letra);
            //Hotel[i][0]= Nombre;
            //System.out.print(Hotel[i][0]);
                for(int j=0; j<nHabitaciones; j++){//Numero de habitaciones
                    Numero = Numero + 1;
                    Letra = (Alpha.length()-26+i);
                    //Numero1 = Numero1 + Numero;
                    Nombre = Nombre1+ Alpha.charAt(Letra)+Numero;
                    Hotel[i][j]= Nombre;
                    System.out.print(Hotel[i][j]+" ");
                }
            System.out.println("");
            }
        
    }
    
    /*public void Mostrar(){
            for(int i=0; i<nPisos; i++){                 //Numero de pisos
                for(int j=0; j<nHabitaciones; j++){     //Numero de habitaciones
                System.out.print(Hotel[i][j]);
                Hotel[i][j] = Nombre;
                }
            System.out.println("");
            }
    }*/
}
