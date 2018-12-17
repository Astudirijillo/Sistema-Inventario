package Proceso;

import java.util.Vector;
import Proceso.ListaInventario;

public class Articulo {

    public String nombre;
    public int cantidad;
    public String tamaño;

    public Articulo() {

    }

    public Articulo(String nombre, int cantidad, String tamaño) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tamaño = tamaño;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", tama\u00f1o=" + tamaño + '}';
    }

    
    
}
