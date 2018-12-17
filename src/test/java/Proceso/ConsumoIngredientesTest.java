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
public class ConsumoIngredientesTest {

    Pedido p1;
    Pedido p2;
    Pedido p3;
    ConsumoIngredientes listPed1;
    private boolean estadoEsperado = true;

    @Before
    public void setUp() {
        p1 = new Pedido("Hamburguesa", "Normal", "Sin mayo ni lechuga");
        p1 = new Pedido("Completo", "Normal", "sin palta");
        p1 = new Pedido("Papas Fritas", "Grande", "Solo ketchup");
        listPed1 = new ConsumoIngredientes();
    }

    @Test
    public void añadirArticuloTest() {
        assertEquals(estadoEsperado, listPed1.añadirArticulo(p1));
        assertEquals(estadoEsperado, listPed1.añadirArticulo(p2));
        assertEquals(estadoEsperado, listPed1.añadirArticulo(p3));
    }

}
