/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;
import org.apache.poi.hssf.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;

/**
 *
 * @author Cristobal
 */
public class GenerarInventario {

    private ConsumoIngredientes listArtCons;
    private ListaInventario listInv;
    private ArrayList<Articulo> listaArtDescontado;
    private boolean resultado = false;
    private File direccion = new File("archivosExcel//libroContabilidad.xlsx");
    private HSSFWorkbook libroContabilidad = new HSSFWorkbook();
    private int cantidadPapasN = 300;
    private int cantidadPapasG = 500;
    private int cantidadTomateN = 52;
    private int cantidadTomateG = 78;
    private int cantidadPaltaN = 42;
    private int cantidadPaltaG = 63;
    private int cantidadAceiteG = 1500;
    private int cantidadAceiteN = 750;

    public boolean llenarListaPedidos() {

        this.listaArtDescontado.get(0).setNombre("Salchicha"); // 0 = salchicha
        this.listaArtDescontado.get(1).setNombre("Pan Completo"); // 1 = pan completo grande
        this.listaArtDescontado.get(1).setTamaño("Grande");
        this.listaArtDescontado.get(11).setNombre("Pan Completo"); // 11 = pan completo normal
        this.listaArtDescontado.get(11).setTamaño("Normal");
        this.listaArtDescontado.get(2).setNombre("Pan Hamburguesa"); // 2 = pan hamburguesa grande
        this.listaArtDescontado.get(2).setTamaño("Grande");
        this.listaArtDescontado.get(12).setNombre("Pan Hamburguesa"); // 12 = pan hamburguesa normal
        this.listaArtDescontado.get(12).setTamaño("Normal");
        this.listaArtDescontado.get(3).setNombre("Hamburguesa"); // 3 = Hamburguesa
        this.listaArtDescontado.get(4).setNombre("Papas"); // 4 = Papas
        this.listaArtDescontado.get(5).setNombre("Aceite"); // 5 = Aceite
        this.listaArtDescontado.get(6).setNombre("Tomate"); // 6 = tomate 
        this.listaArtDescontado.get(7).setNombre("Palta"); // 7 = Palta
        this.listaArtDescontado.get(8).setNombre("Cebolla"); // 8 = cebolla 
        this.listaArtDescontado.get(9).setNombre("Churrasco"); // 9 = Churrasco
        this.listaArtDescontado.get(10).setNombre("Queso"); // 10 = queso
        this.listaArtDescontado.get(13).setNombre("Lechuga"); // 13 = lechuga
        int i = 0;
        boolean resultado = false;
        while (i < this.listArtCons.listaArticulosCons.size()) {
            if (this.listArtCons.listaArticulosCons.get(i).getProducto() == "Hamburguesa") {
                if (this.listArtCons.listaArticulosCons.get(i).getTamaño() == "Grande") {
                    this.listaArtDescontado.get(2).setCantidad(this.listaArtDescontado.get(2).getCantidad());
                    this.listaArtDescontado.get(3).setCantidad(this.listaArtDescontado.get(2).getCantidad());
                    this.listaArtDescontado.get(6).setCantidad(this.listaArtDescontado.get(6).getCantidad() + cantidadTomateG);
                    this.listaArtDescontado.get(13).setCantidad(this.listaArtDescontado.get(13).getCantidad() + 30);
                } else if (this.listArtCons.listaArticulosCons.get(i).getTamaño() == "Normal") {
                    this.listaArtDescontado.get(12).setCantidad(this.listaArtDescontado.get(12).getCantidad() + 1);
                    this.listaArtDescontado.get(3).setCantidad(this.listaArtDescontado.get(3).getCantidad() + 1);
                    this.listaArtDescontado.get(6).setCantidad(this.listaArtDescontado.get(6).getCantidad() + cantidadTomateN);
                    this.listaArtDescontado.get(13).setCantidad(this.listaArtDescontado.get(13).getCantidad() + 55);
                }
            }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////            
            if (this.listArtCons.listaArticulosCons.get(i).getProducto() == "Completo") {
                if (this.listArtCons.listaArticulosCons.get(i).getTamaño() == "Grande") {
                    this.listaArtDescontado.get(0).setCantidad(this.listaArtDescontado.get(0).getCantidad() + 2);
                    this.listaArtDescontado.get(1).setCantidad(this.listaArtDescontado.get(1).getCantidad() + 1);
                    this.listaArtDescontado.get(6).setCantidad(this.listaArtDescontado.get(6).getCantidad() + cantidadTomateG);
                    this.listaArtDescontado.get(7).setCantidad(this.listaArtDescontado.get(7).getCantidad() + cantidadPaltaG);
                } else if (this.listArtCons.listaArticulosCons.get(i).getTamaño() == "Normal") {
                    this.listaArtDescontado.get(0).setCantidad(this.listaArtDescontado.get(11).getCantidad() + 1);
                    this.listaArtDescontado.get(11).setCantidad(this.listaArtDescontado.get(11).getCantidad() + 1);
                    this.listaArtDescontado.get(6).setCantidad(this.listaArtDescontado.get(6).getCantidad() + cantidadTomateN);
                    this.listaArtDescontado.get(7).setCantidad(this.listaArtDescontado.get(7).getCantidad() + cantidadPaltaN);
                }
            }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (this.listArtCons.listaArticulosCons.get(i).getProducto() == "Barros Luco") {
                if (this.listArtCons.listaArticulosCons.get(i).getTamaño() == "Grande") {
                    this.listaArtDescontado.get(2).setCantidad(this.listaArtDescontado.get(2).getCantidad() + 1);
                    this.listaArtDescontado.get(9).setCantidad(this.listaArtDescontado.get(9).getCantidad() + 1);
                    this.listaArtDescontado.get(10).setCantidad(this.listaArtDescontado.get(10).getCantidad() + 1);
                } else if (this.listArtCons.listaArticulosCons.get(i).getTamaño() == "Normal") {
                    this.listaArtDescontado.get(12).setCantidad(this.listaArtDescontado.get(12).getCantidad() + 1);
                    this.listaArtDescontado.get(9).setCantidad(this.listaArtDescontado.get(9).getCantidad() + 1);
                    this.listaArtDescontado.get(10).setCantidad(this.listaArtDescontado.get(10).getCantidad() + 2);
                }
            }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////            
            if (this.listArtCons.listaArticulosCons.get(i).getProducto() == "Papas Fritas") {
                if (this.listArtCons.listaArticulosCons.get(i).getTamaño() == "Grande") {
                    this.listaArtDescontado.get(4).setCantidad(this.listaArtDescontado.get(4).getCantidad() + cantidadPapasG);
                    this.listaArtDescontado.get(5).setCantidad(this.listaArtDescontado.get(5).getCantidad() + cantidadAceiteG);
                } else if (this.listArtCons.listaArticulosCons.get(i).getTamaño() == "Normal") {
                    this.listaArtDescontado.get(4).setCantidad(this.listaArtDescontado.get(4).getCantidad() + cantidadPapasN);
                    this.listaArtDescontado.get(5).setCantidad(this.listaArtDescontado.get(5).getCantidad() + cantidadPapasN);
                }
            }
            i++;
        }
        for (int j = 0; j < this.listaArtDescontado.size(); j++) {
            if (this.listaArtDescontado.get(j).getCantidad() == 0) {
                resultado = true;
            }
        }
        return resultado;
    }

    public void generarInventarioExcel() throws FileNotFoundException, IOException {
        HSSFSheet hoja = this.libroContabilidad.createSheet();

        libroContabilidad.setSheetName(0, "Dia 1");
        String[] cabecera = new String[]{"Nombre", "Tamaño", "Cantidad Entrante", "Cantidad Saliente "};
        CellStyle headerStyle = this.libroContabilidad.createCellStyle();
        HSSFFont font = this.libroContabilidad.createFont();
        font.setBold(true);
        headerStyle.setFont(font);
        HSSFRow cabeceraFila = hoja.createRow(0);
        for (int i = 0; i < 4; i++) {
            String cab = cabecera[i];
            HSSFCell cell = cabeceraFila.createCell(i);
            cell.setCellStyle(headerStyle);
            cell.setCellValue(cab);
        }
        int j = 0;
        while (j < this.listInv.listaArticulos.size()) {
            HSSFRow fila = hoja.createRow(j + 1);
            String nombre = this.listInv.listaArticulos.get(j).getNombre();
            String tamaño = this.listInv.listaArticulos.get(j).getTamaño();
            int cantidadBase = this.listInv.listaArticulos.get(j).getCantidad();
            int cantidadGastada = this.listaArtDescontado.get(j).getCantidad();

            fila.createCell(0).setCellValue(nombre);
            fila.createCell(1).setCellValue(tamaño);
            fila.createCell(2).setCellValue(cantidadBase);
            fila.createCell(3).setCellValue(cantidadGastada);
            j++;
        }
        FileOutputStream file = new FileOutputStream("data.xls");
        libroContabilidad.write(file);
        file.close();
    }

}
