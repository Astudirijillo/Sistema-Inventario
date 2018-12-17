package Proceso;

import java.util.ArrayList;

public class ListaInventario {

    public ArrayList<Articulo> listaArticulos;
    boolean resultado = false;

    public ListaInventario() {
        this.listaArticulos = new ArrayList();
    }

    public boolean añadirArticulo(Articulo articulo) {
        this.listaArticulos.add(articulo);
        for (int i = 0; i < this.listaArticulos.size(); i++) {
            if (this.listaArticulos.get(i) == articulo) {
                resultado = true;
            }
        }        
        return resultado;
    }

    public boolean eliminarProducto(Articulo articulo) {
        for (int i = 0; i < this.listaArticulos.size(); i++) {
            if (this.listaArticulos.get(i).equals(articulo)) {
                this.listaArticulos.remove(i);
                resultado = true;
            }
        }
        return resultado;
    }

}
