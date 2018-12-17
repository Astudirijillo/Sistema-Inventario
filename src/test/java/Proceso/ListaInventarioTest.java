/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Cristobal
 */
public class ListaInventarioTest {

    Articulo a1;
    Articulo a2;
    Articulo a3;
    ListaInventario listInv1;
    Pedido p1;
    Pedido p2;
    Pedido p3;
    ConsumoIngredientes listPed1;
    private boolean estadoEsperado = true;

    @Before
    public void setUp() {
        a1 = new Articulo("Salchicha", 24, "No Aplica");
        a2 = new Articulo("Pan de Hamburguesa", 15, "Pequeño");
        a3 = new Articulo("Pan de Completo", 24, "No Aplica");
        listInv1 = new ListaInventario();
        p1 = new Pedido("Hamburguesa", "Normal", "Sin mayo ni lechuga");
        p1 = new Pedido("Completo", "Normal", "sin palta");
        p1 = new Pedido("Papas Fritas", "Grande", "Solo ketchup");
        listPed1 = new ConsumoIngredientes();
    }

    @Test
    public void añadirArticuloTest() {
        assertEquals(estadoEsperado, listInv1.añadirArticulo(a1));
        assertEquals(estadoEsperado, listInv1.añadirArticulo(a2));
        assertEquals(estadoEsperado, listInv1.añadirArticulo(a3));
    }

    @Test
    public void eliminarArticuloTest() {
        listInv1.añadirArticulo(a1);
        listInv1.añadirArticulo(a2);
        listInv1.añadirArticulo(a3);
        assertEquals(estadoEsperado, listInv1.eliminarProducto(a1));
        assertEquals(estadoEsperado, listInv1.eliminarProducto(a2));
        assertEquals(estadoEsperado, listInv1.eliminarProducto(a3));
    }

}
