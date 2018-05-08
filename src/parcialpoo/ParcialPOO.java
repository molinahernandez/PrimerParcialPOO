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
        
        int a;
        Scanner entrada=new Scanner(System.in);
        System.out.println("que opcion quiere?");
        a=entrada.nextInt();
                
        
        switch(a){
            case 1:
                Menu1.modificarpreciohi(KeyR);
        }
    }
    
}
