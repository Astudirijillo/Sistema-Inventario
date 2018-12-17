package UI;

import Proceso.Pedido;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelRecibirPedido extends JPanel implements FocusListener {
    
    JComboBox cbProducto;
    private JComboBox cbTamaño;
    private JTextField tfAnotacion;
    private JLabel lblProducto;
    private JLabel lblTamaño;
    private JLabel lblAnotacion;
    private Pedido p = new Pedido();
    
    public PanelRecibirPedido() {
        this.incializarComponentes();
    }
    
    private void incializarComponentes() {
        GridLayout distribucion = new GridLayout(3, 2);
        this.setLayout(distribucion);
        
        this.lblProducto = new JLabel("    Producto");
        this.cbProducto = new JComboBox();
        this.lblTamaño = new JLabel("    Tamaño");
        this.cbTamaño = new JComboBox();
        this.lblAnotacion = new JLabel("    Anotacion");
        this.tfAnotacion = new JTextField();
        //////////////////////////////////////////
        this.cbProducto.addItem("Hamburguesa");
        this.cbProducto.addItem("Churrasco");
        this.cbProducto.addItem("Barros Luco");
        this.cbProducto.addItem("Completo");
        this.cbProducto.addItem("Papas Fritas");

        //////////////////////////////////////////
        this.cbTamaño.addItem("Grande");
        this.cbTamaño.addItem("Normal");

        //////////////////////////////////////////
        this.add(this.lblProducto);
        this.add(this.cbProducto);
        this.add(this.lblTamaño);
        this.add(this.cbTamaño);
        this.add(this.lblAnotacion);
        this.add(this.tfAnotacion);
        //////////////////////////////////////////

    }
    
    @Override
    public void focusGained(FocusEvent e) {
        
    }
    
    @Override
    public void focusLost(FocusEvent e) {
        p.setProducto((String) cbTamaño.getSelectedItem());
        p.setTamaño((String) cbProducto.getSelectedItem());        
        p.setAnotacion((String) tfAnotacion.getText());
    }
    
}
