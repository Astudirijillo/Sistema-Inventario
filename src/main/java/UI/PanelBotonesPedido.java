package UI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelBotonesPedido extends JPanel {

    public JButton btnGenerarPedido;
    public JButton btnRetorno;
    public int pedidos;

    public PanelBotonesPedido() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);

        this.btnGenerarPedido = new JButton("Generar Pedido");
        this.add(this.btnGenerarPedido);

        this.btnRetorno = new JButton("Volver al Inicio");
        this.add(this.btnRetorno);
    }

}
