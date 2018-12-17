/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Proceso.Articulo;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Cristobal
 */
public class PanelIngresoInventario extends JPanel implements FocusListener {

    private JLabel lblListaProductos;
    private JLabel lblTamaño;
    private JLabel lblCantidad;
    JComboBox cblistaProductos;
    private JComboBox cbTamaño;
    private JTextField tfCantidad;
    public Object obNombre;
    public Object obTamaño;
    private Articulo a = new Articulo();

    public PanelIngresoInventario() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {

        GridLayout distribucion = new GridLayout(4, 2);
        this.setLayout(distribucion);

        this.lblListaProductos = new JLabel("      Producto");
        this.add(this.lblListaProductos);

        this.cblistaProductos = new JComboBox();
        this.cblistaProductos.addItem("Salchicha");
        this.cblistaProductos.addItem("Pan Completo");
        this.cblistaProductos.addItem("Pan Hamburguesa");
        this.cblistaProductos.addItem("Hamburguesa");
        this.cblistaProductos.addItem("Papas Fritas");
        this.cblistaProductos.addItem("Aceite");
        this.cblistaProductos.addItem("Tomate");
        this.cblistaProductos.addItem("Palta");
        this.cblistaProductos.addItem("Cebolla");
        this.cblistaProductos.addItem("Churrasco");
        this.cblistaProductos.addItem("Queso");
        this.cblistaProductos.addItem("Lechuga");
        this.add(this.cblistaProductos);

        this.lblTamaño = new JLabel("      Tamaño del Producto");
        this.add(this.lblTamaño);

        this.cbTamaño = new JComboBox();
        this.cbTamaño.addItem("Grande");
        this.cbTamaño.addItem("Normal");
        this.cbTamaño.addItem("No Aplica");
        this.add(this.cbTamaño);

        this.lblCantidad = new JLabel("      Cantidad");
        this.add(this.lblCantidad);

        this.tfCantidad = new JTextField("");
        this.add(this.tfCantidad);
        this.tfCantidad.addFocusListener(this);

    }

    public void setTfCantidad(JTextField tfCantidad) {
        this.tfCantidad = tfCantidad;
    }

    public Articulo getAllData() {
        Articulo a = new Articulo();
        ////////////////////////////////////////////////////////////
        String cantidad = this.tfCantidad.getText();
        String nombre = (String) this.cblistaProductos.getSelectedItem();
        String Tamaño = (String) this.cbTamaño.getSelectedItem();
        ////////////////////////////////////////////////////////////
        a.setCantidad(Integer.parseInt(cantidad));
        a.setNombre(nombre);
        a.setTamaño(Tamaño);
        ////////////////////////////////////////////////////////////
        return a;
    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    public JTextField getTfCantidad() {
        return this.tfCantidad;
    }

    @Override
    public void focusLost(FocusEvent e) {
        String cadena = tfCantidad.getText();
        boolean resultado;
        int limite = 2;
        a.setTamaño((String) cbTamaño.getSelectedItem());
        a.setNombre((String) cblistaProductos.getSelectedItem());
    }

}
