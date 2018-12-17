package Proceso;

import java.util.ArrayList;

public class ConsumoIngredientes {

    public ArrayList<Pedido> listaArticulosCons;
    public boolean resultado = false;

    public ConsumoIngredientes() {
        this.listaArticulosCons = listaArticulosCons;
    }

    public boolean añadirArticulo(Pedido pedido) {
        this.listaArticulosCons.add(pedido);
        for (int i = 0; i < this.listaArticulosCons.size(); i++) {
            if (this.listaArticulosCons.get(i) == pedido) {
                resultado = true;
            }
        }
        return resultado;
    }

}
