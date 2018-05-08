/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

/*import java.util.HashMap;*/
import java.util.Scanner;

/**
 *
 * @author Ivan Lopez
 */
public class Administrador {
    private static Nombre nombre1;
    private static Cliente cliente;
    private static Reservacion reservacion;
     
    public static void modificarpreciohp(int precio){
        Habitacionp.setPrecio(precio);
    }
    
    public static void modificarpreciohi(int precio){
        Habitacioni.setPrecio(precio);    
    }
    
    public static void modificarpreciopaqueteP (int precio){
        Paquete_P.setPrecios(precio);
    }
    
    public static void modificarpreciopaqueteS (int precio){
        Paquete_S.setPrecios(precio);
    }
    
    public static void modificarserviciopaqueteP (String servicio){
        Paquete_P.setServicios(servicio);
    }
    
    public static void modificarserviciopaqueteS (String servicio){
        Paquete_S.setServicios(servicio);
    }
       
    public static void modificarestadoh(String estado, int numero, String letra){
        H b; //Si H es por la clase H se debe cambiar por Habitacion
        Piso a;
        a=HotelI.hotel.get(letra);
        b=a.piso.get(numero);
        b.estado=estado;
    }
    
    public static void agregarpiso(){
        HotelI.añadirpiso();
    }
    
    public static void crearreservacion(String nombre, String apellido, String DUI, String telefono, String tarjetacredito, String tipopaquete){
        nombre1.SetNombre(nombre);
        nombre1.SetApellido(apellido);
        cliente.SetNombre(nombre1);
        cliente.SetDUI(DUI);
        cliente.SetTarjetacredito(tarjetacredito);
        cliente.SetTelefono(telefono);
        
        int a,b;
        Scanner entrada= new Scanner(System.in);
        System.out.println("1=paquete premium, 2=paquete basico, 3=no tiene paquete");
        a=entrada.nextInt();
        switch(a){
            case 1:
                System.out.println("1=  sencilla, 2= doble");
                b=entrada.nextInt();
                switch(b){
                    case 1:
                        reservacion.setCliente(cliente);
                        reservacion.setPaquete(tipopaquete);
                        reservacion.setPrecio(Habitacionp.getPrecio() + Paquete_P.getPrecios());
                        reservacion.setServiciospaquete(Paquete_P.getServicios());
                        break;
                    case 2:
                        reservacion.setCliente(cliente);
                        reservacion.setPaquete(tipopaquete);
                        reservacion.setPrecio(Habitacioni.getPrecio() + Paquete_P.getPrecios());
                        reservacion.setServiciospaquete(Paquete_P.getServicios());
                        break;
                }
                break;
            case 2:
                System.out.println("1=  sencilla, 2= doble");
                b=entrada.nextInt();
                switch(b){
                    case 1:
                        reservacion.setCliente(cliente);
                        reservacion.setPaquete(tipopaquete);
                        reservacion.setPrecio(Habitacionp.getPrecio() + Paquete_S.getPrecios());
                        reservacion.setServiciospaquete(Paquete_S.getServicios());
                        break;
                    case 2:
                        reservacion.setCliente(cliente);
                        reservacion.setPaquete(tipopaquete);
                        reservacion.setPrecio(Habitacioni.getPrecio() + Paquete_S.getPrecios());
                        reservacion.setServiciospaquete(Paquete_S.getServicios());
                        break;
                }
                break; 
            case 3:
                System.out.println("1=  sencilla, 2= doble");
                b=entrada.nextInt();
                switch(b){
                    case 1:
                        reservacion.setCliente(cliente);
                        reservacion.setPrecio(Habitacionp.getPrecio());
                        break;
                    case 2:
                        reservacion.setCliente(cliente);
                        reservacion.setPrecio(Habitacioni.getPrecio());
                        break;
                }
                break;
        }
        
    }
    
    
}
