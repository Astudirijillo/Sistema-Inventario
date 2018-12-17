/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Cristobal
 */
public class GenerarInventarioTest {

    GenerarInventario genInv;
    Articulo a1;
    Articulo a2;
    Articulo a3;
    ListaInventario listInv1;
    private boolean estadoEsperado = true;

    @Before
    public void setUp() {
        a1 = new Articulo("Salchicha", 24, "No Aplica");
        a2 = new Articulo("Pan de Hamburguesa", 15, "Pequeño");
        a3 = new Articulo("Pan de Completo", 24, "No Aplica");
        listInv1 = new ListaInventario();
        listInv1.añadirArticulo(a1);
        listInv1.añadirArticulo(a2);
        listInv1.añadirArticulo(a3);
    }

    @Test
//    public void llenarListaPedidosTest() {
//        assertEquals(estadoEsperado, genInv.llenarListaPedidos());
//    }
    public void generarInventarioExcel() throws IOException {
        genInv.generarInventarioExcel();
    }
}
