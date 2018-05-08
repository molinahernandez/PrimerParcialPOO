/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

/*import java.util.HashMap;*/
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Ivan Lopez
 */
public class Menu1 {
    private static Nombre nombre1;
    private static Cliente cliente;
    private static Reservacion reservacion;

    public Menu1() {
    }
     
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
        a=Hotel.hotel.get(letra);
        b=a.piso.get(numero);
        b.estado=estado;
    }
    
    public static void agregarpiso(){
        Hotel.añadirpiso();
    }
    
    public static void crearreservacion(int KeyR){
        Reservacion reservacion1 = new Reservacion(); 
        String nombre, apellido, DUI, telefono, tarjetacredito, tipopaquete;
        
        Scanner n=new Scanner(System.in);
        Nombre N1 = new Nombre();
        Cliente C1 = new Cliente();
        
        System.out.println("Escriba su nombre: ");
        nombre=n.nextLine();
        
        N1.SetNombre(nombre);
        
        Scanner ap=new Scanner(System.in);
        
        System.out.println("Escriba su apellido: ");
        apellido=ap.nextLine();
        
        N1.SetApellido(apellido);
        C1.SetNombre(N1);
        
        Scanner d=new Scanner(System.in);
        
        System.out.println("Escriba su DUI: ");
        DUI=d.nextLine();
        
        C1.SetDUI(DUI);
        
        Scanner t=new Scanner(System.in);
        
        System.out.println("Escriba su telefono: ");
        telefono=t.nextLine();
        
        C1.SetTelefono(telefono);
        
        Scanner ta=new Scanner(System.in);
        
        System.out.println("Escriba su tarjeta de credito: ");
        tarjetacredito=ta.nextLine();
        
        C1.SetTarjetacredito(tarjetacredito);
        
        /*Scanner ti=new Scanner(System.in);
        Paquete P1 = new Paquete();
        
        System.out.println("Escriba el tipo de paquete: ");
        tipopaquete=ti.nextLine();
        P1.*/
        
        
        /*nombre1.SetNombre(nombre);
        nombre1.SetApellido(apellido);
        cliente.SetNombre(nombre1);
        cliente.SetDUI(DUI);
        cliente.SetTarjetacredito(tarjetacredito);
        cliente.SetTelefono(telefono);*/
        
        int a,b;
        Scanner entrada= new Scanner(System.in);
        System.out.println("1=paquete premium, 2=paquete basico, 3=no quiero paquete");
        a=entrada.nextInt();
        switch(a){
            case 1:
                System.out.println("1=  sencilla, 2= doble");
                b=entrada.nextInt();
                switch(b){
                    case 1:
                        reservacion1.setCliente(C1);
                        reservacion1.setPaquete(Paquete.getTipo1());
                        reservacion1.setPrecio(Habitacionp.getPrecio() + Paquete_P.getPrecios());
                        reservacion1.setServiciospaquete(Paquete_P.getServicios());
                        break;
                    case 2:
                        reservacion1.setCliente(C1);
                        reservacion1.setPaquete(Paquete.getTipo1());
                        reservacion1.setPrecio(Habitacioni.getPrecio() + Paquete_P.getPrecios());
                        reservacion1.setServiciospaquete(Paquete_P.getServicios());
                        break;
                }
                break;
            case 2:
                System.out.println("1=  sencilla, 2= doble");
                b=entrada.nextInt();
                switch(b){
                    case 1:
                        reservacion1.setCliente(C1);
                        reservacion1.setPaquete(Paquete.getTipo2());
                        reservacion1.setPrecio(Habitacionp.getPrecio() + Paquete_S.getPrecios());
                        reservacion1.setServiciospaquete(Paquete_S.getServicios());
                        break;
                    case 2:
                        reservacion1.setCliente(C1);
                        reservacion1.setPaquete(Paquete.getTipo2());
                        reservacion1.setPrecio(Habitacioni.getPrecio() + Paquete_S.getPrecios());
                        reservacion1.setServiciospaquete(Paquete_S.getServicios());
                        break;
                }
                break; 
            case 3:
                System.out.println("1=  sencilla, 2= doble");
                b=entrada.nextInt();
                switch(b){
                    case 1:
                        reservacion1.setCliente(C1);
                        reservacion1.setPrecio(Habitacionp.getPrecio());
                        break;
                    case 2:
                        reservacion1.setCliente(C1);
                        reservacion1.setPrecio(Habitacioni.getPrecio());
                        break;
                }
                break;
        }
        RegistroR.registro.put(KeyR + 1, reservacion1);
    }
    
    
    public static void MostrarReservacion(){
                //Se crea una variable Keys que guarde todas las key de hotel
        Set<Integer> Keys = RegistroR.registro.keySet();
        
        for(Integer Key:Keys){
            Reservacion valor = RegistroR.registro.get(Key);
            System.out.println(valor.cliente.GetNombre().GetNombre() + valor.cliente.GetNombre().GetApellido()+
            valor.getTipopaquete() + valor.habitacionp + valor.habitacioni + valor.precio);
        }
    }
    
    public static void Salir(int a){
        a=1;
    }
    
}
