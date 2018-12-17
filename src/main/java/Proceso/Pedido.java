package Proceso;

import java.util.Vector;
import Proceso.ConsumoIngredientes;

public class Pedido {

    private String producto;
    private String tamaño;
    private String anotacion;

    public Pedido() {
    }

    public Pedido(String producto, String tamaño, String anotacion) {
        this.producto = producto;
        this.tamaño = tamaño;
        this.anotacion = anotacion;
    }

    public String getAnotacion() {
        return anotacion;
    }

    public void setAnotacion(String anotacion) {
        this.anotacion = anotacion;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Pedido{" + "producto=" + producto + ", tama\u00f1o=" + tamaño + '}';
    }

}
