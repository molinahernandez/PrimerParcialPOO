/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Registro {
    public ArrayList<Reservacion> registro;
    
    public Registro(){
        registro = new ArrayList<>();
    }
    public void add(){
        Reservacion obj = new Reservacion();
        
        registro.add(obj);
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la Habitacion");
        System.out.print(": ");
        obj.setNombres(leer.nextLine());
        
        System.out.println("Ingrese el Paquete");
        System.out.print(": ");
        obj.setApellidos(leer.nextLine());
        
        System.out.println("Ingrese el Cliente");
        System.out.print(": ");
        obj.setCarnet(leer.next());
    }
    Scanner leer = new Scanner(System.in);
    
    public void add(Reservacion obj) throws Exception{
        if(obj != null) {
            if (!registro.contains(obj)) {
                registro.add(obj);
            }
            Exception e = new Exception("No se permiten datos duplicados");
            throw e;
        } else {
            throw new Exception("No se puede agregar una reservacion nula");
        }
        
    }
    
    public void mostrar() {
        for ( Reservacion e : registro) {
            System.out.println(e.toString());
        }
    }
}
}
