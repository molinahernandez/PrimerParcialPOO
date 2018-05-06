
package parcialpoo;

/**
 *
 * @author david
 */
public class Reservacion {
    public Habitacionp habitacionp;
    public Habitacioni habitacioni;
    public String tipopaquete;
    public String serviciospaquete;
    public Cliente cliente;
    public int precio;
    public Fecha fechaentrada, fechasalida;
   
    public Reservacion(Habitacionp habitacionp,Habitacioni habitacioni,String tipopaquete,Cliente cliente,int precio,Fecha fechaentrada,Fecha fechasalida, String serviciospaquete){
        this.habitacionp = habitacionp;
        this.habitacioni = habitacioni;
        this.tipopaquete = tipopaquete;
        this.cliente = cliente;
        this.precio = precio;
        this.fechaentrada = fechaentrada;
        this.fechasalida = fechasalida;
        this.serviciospaquete= serviciospaquete;
}

//getters y setters

    public Habitacionp getHabitacionp() {
        return habitacionp;
    }

    public void setHabitacionp(Habitacionp habitacionp) {
        this.habitacionp = habitacionp;
    }

    public Habitacioni getHabitacioni() {
        return habitacioni;
    }

    public void setHabitacioni(Habitacioni habitacioni) {
        this.habitacioni = habitacioni;
    }

    public String getTipopaquete() {
        return tipopaquete;
    }

    public void setPaquete(String paquete) {
        this.tipopaquete = tipopaquete;
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

    public String getServiciospaquete() {
        return serviciospaquete;
    }

    public void setServiciospaquete(String serviciospaquete) {
        this.serviciospaquete = serviciospaquete;
    }
    
    
}