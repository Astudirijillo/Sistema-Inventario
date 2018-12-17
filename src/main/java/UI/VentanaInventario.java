package UI;

import Proceso.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import Proceso.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentanaInventario extends JFrame implements ActionListener {

    public PanelBotonesInventario pnlBtnsInventario;
    public PanelIngresoInventario pnlIngresoInventario;
    public PanelTablaInventario pnlTablaInv;
    public boolean visible;
    private Image fondo;
    public GenerarInventario genInv;
    public ListaInventario listInv;
    private GenerarInventario v1 = new GenerarInventario();

    public VentanaInventario() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {

        this.pnlIngresoInventario = new PanelIngresoInventario();
        this.pnlBtnsInventario = new PanelBotonesInventario();
        this.pnlTablaInv = new PanelTablaInventario();

        this.add(this.pnlIngresoInventario, BorderLayout.NORTH);
        this.add(this.pnlBtnsInventario, BorderLayout.CENTER);
        this.add(this.pnlTablaInv, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setIconImage(new ImageIcon("data//icono2.jpg").getImage());
        this.setSize(500, 650);
        this.setLocation(500, 0);
        this.setTitle("Gestion de Inventario");
        this.visible = true;
        this.setVisible(visible);
        this.setResizable(true);

        pnlBtnsInventario.btnIngresarProducto.addActionListener(this);
        pnlBtnsInventario.btnEliminarProducto.addActionListener(this);
        pnlBtnsInventario.btnGenerarInventario.addActionListener(this);
        pnlBtnsInventario.btnRetorno.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (pnlBtnsInventario.btnIngresarProducto == e.getSource()) {
            System.out.println(this.pnlIngresoInventario.getTfCantidad().getText());
            if (!pnlIngresoInventario.getTfCantidad().getText().matches("[0-9]{1,2}")) {
                JOptionPane.showMessageDialog(null, "Cantidad invalida \nIntente Nuevamente");
            } else {
                Articulo art = this.pnlIngresoInventario.getAllData();
                Object[] fila = new Object[3];
                fila[0] = art.getNombre();
                fila[1] = art.getCantidad();
                fila[2] = art.getTamaño();
                this.pnlTablaInv.modelo.addRow(fila);
            }
        }
        if (pnlBtnsInventario.btnEliminarProducto == e.getSource()) {
            int seleccion = this.pnlTablaInv.tabla.getSelectedRow();
            this.pnlTablaInv.modelo.removeRow(seleccion);
        }
        if (pnlBtnsInventario.btnGenerarInventario == e.getSource()) {
            try {
                v1.generarInventarioExcel();
                JOptionPane.showMessageDialog(null, "Archivo creado exitosamente");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido crear el archivo \nIntente mas tarde");
            }
        }
        if (pnlBtnsInventario.btnRetorno == e.getSource()) {
            this.visible = false;
            this.setVisible(visible);
        }
    }

}
