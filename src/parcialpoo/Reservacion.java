/**
 *
 * @author david
 */
public class Reservacion {
    public Habitacion habitacion;
    public Paquete paquete;
    public Cliente cliente;
    public int precio;
    public Fecha fechaentrada, fechasalida;
   
    public Reservacion(Habitacion habitacion,Paquete paquete,Cliente cliente,int precio,Fecha fechaentrada,Fecha fechasalida){
        this.habitacion = habitacion;
        this.paquete = paquete;
        this.cliente = cliente;
        this.precio = precio;
        this.fechaentrada = fechaentrada;
        this.fechasalida = fechasalida;
}

//getters y setters
    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Fecha getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(Fecha fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    public Fecha getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Fecha fechasalida) {
        this.fechasalida = fechasalida;
    }
}