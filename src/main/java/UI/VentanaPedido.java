package UI;

import Proceso.ConsumoIngredientes;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaPedido extends JFrame implements ActionListener {
    
    public PanelRecibirPedido pnlRecibirPedido;
    public PanelBotonesPedido pnlBtnsPedido;
    public ConsumoIngredientes consIng;
    public boolean visible;
    
    public VentanaPedido() {
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes() {
        
        this.pnlBtnsPedido = new PanelBotonesPedido();
        this.pnlRecibirPedido = new PanelRecibirPedido();
        
        this.add(this.pnlBtnsPedido, BorderLayout.CENTER);
        this.add(this.pnlRecibirPedido, BorderLayout.NORTH);
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setIconImage(new ImageIcon("imagenes//icono2.jpg").getImage());
        this.setSize(400, 200);
        this.setLocation(500, 0);
        this.setTitle("Gestion de Pedidos");
        this.visible = true;
        this.setVisible(visible);
        this.setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (pnlBtnsPedido.btnGenerarPedido == e.getSource()) {
            
        } else if (pnlBtnsPedido.btnRetorno == e.getSource()) {
            
        }
    }
    
}
