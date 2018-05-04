/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppoo;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Registro {
    //Se crea un ArrayList para guardar objetos de tipo Coche.
    static ArrayList<Reservacion> reservaciones = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    /*//método main
    public static void main(String[] args) {
        leerCoches();
        System.out.println("\nCoches introducidos:");
        mostrarCoches();
        mostrarPorMarca();
        mostrarPorKm();
        System.out.println("\nCoche con mayor número de Km: " + mostrarMayorKm());
        System.out.println("\nCoches ordenados de menor a mayor número de Km");
        mostrarOrdenadosPorKm();
    } //fin método main
   */
//Método para leer coches e introducirlos en el array
public static void leerReservaciones(){
        //Declaración de variables para leer los datos de las Reservaciones
        Habitacion habitacion;
        Paquete paquete;
        Cliente cliente;
        int precio;
        //Variable auxiliar que contendrá la referencia a cada Reservacion nueva.
        Registro aux;
        int i, N;
        //se pide por teclado el número de coches a leer
        do {
            System.out.print("Número de coches? ");
            N = sc.nextInt();
        } while (N < 0);
        sc.nextLine(); //limpiar el intro
        //lectura de N coches
        for (i = 1; i <= N; i++) {
            //leer datos de cada coche
            System.out.println("Resservacion " + i);
            System.out.print("Habitacion: ");
            habitacion = sc.nextLine();          
            System.out.print("Paquete: ");
            paquete = sc.nextLine();
            System.out.print("Cliente: ");
            cliente = sc.nextLine();
            System.out.print("Precio: ");
            precio = sc.nextInt();
            sc.nextLine(); //limpiar el intro
            aux = new Registro(); //Se crea un objeto Coche y se asigna su referencia a aux
            //se asignan valores a los atributos del nuevo objeto
            aux.setHabitacion(habitacion);
            aux.setPaquete(paquete);
            aux.setCliente(cliente);
            aux.setPrecio(100);
                      
           //se añade el objeto al final del array
            reservaciones.add(aux);
        }
    } //fin método leerCoches()

}
    
    /*
    // Nos creamos un ArrayList de objetos de la Clase "PartidoFutbol"
System.out.println("... Nos creamos un ArrayList de objetos de la Clase "Reservacion" ...");
ArrayList<Reservacion> reserva = new ArrayList<Reservacion>();

// Instanciamos el fichero donde estan los datos
File fichero = new File(nombreFichero);
Scanner s = null;

try {
	// Leemos el contenido del fichero
	System.out.println("... Leemos el contenido del fichero ...");
	s = new Scanner(fichero);
	// Obtengo los datos de los partidos de fútbol del fichero
	while (s.hasNextLine()){
		String linea = s.nextLine();	// Obtengo una linea del fichero (un partido de fútbol)
		String [] cortarString = linea.split("::");		// Obtengo los datos del partido de futbol
		Reservacion res = new Reservacion();	// Creo un objeto de la clase "PartidoFutbol"

		// Pongo los atributos al objeto "reserva"
		res.setHabitacion();
		res.setPaquete();
		res.setCliente();
		res.getPrecio();

		// Añadimos el objeto "reserva" al ArrayList
		reserva.add(res);
	}

} catch (Exception e) {
	e.printStackTrace();
} finally{
	try {
		if (s != null)
			s.close();
	} catch (Exception e2) {
		e2.printStackTrace();
	}
}

System.out.println("... Guardados "+reserva.size()+" partidos de fútbol  ...");
    
    
}
    */
    /*

    public static void main(String[] args) {  
        Scanner leer = new Scanner(System.in);
        Reservacion obj = new Reservacion();
        ArrayList<Reservacion> registro;
        
        registro = new ArrayList();
        obj.setHabitacion(habitacion);
        obj.setPaquete(paquete);
        obj.setCliente(cliente);
        obj.setPrecio(0);
        
        registro.add(obj);
        
        System.out.println(registro.size());
        
    
    
    
    }
    
}
*/