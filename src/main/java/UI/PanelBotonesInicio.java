/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

class PanelBotonesInicio extends JPanel implements ActionListener {

    private JButton btnAccesoPedidos;
    private JButton btnAccesoInventarios;
    private JButton btnSalir;
    private JLabel imagenDeFondo;
    private VentanaInventario vtnInv;
    private VentanaPedido vtnPed;

    public PanelBotonesInicio() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);

        this.btnAccesoInventarios = new JButton("Ir a Inventarios");
        this.btnAccesoPedidos = new JButton("Ir a Pedidos");
        this.btnSalir = new JButton("Salir");

        this.add(this.btnAccesoInventarios);
        this.add(this.btnAccesoPedidos);
        this.add(this.btnSalir);

        this.btnAccesoInventarios.addActionListener(this);
        this.btnAccesoPedidos.addActionListener(this);
        this.btnSalir.addActionListener(this);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.btnAccesoInventarios == e.getSource()) {
            VentanaInventario v1 = new VentanaInventario();
        } else if (this.btnAccesoPedidos == e.getSource()) {
            VentanaPedido v1 = new VentanaPedido();
        } else if (this.btnSalir == e.getSource()) {
            System.exit(0);
        }

    }
}
