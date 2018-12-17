package UI;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class PanelBotonesInventario extends JPanel {

    public JButton btnEliminarProducto;
    public JButton btnIngresarProducto;
    public JButton btnGenerarInventario;
    public JButton btnRetorno;

    public PanelBotonesInventario() {
        this.inicializarComponentes();
    }

    private void inicializarComponentes() {
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);

        this.btnIngresarProducto = new JButton("Ingresar Producto");
        this.btnEliminarProducto = new JButton("Eliminar Producto");
        this.btnGenerarInventario = new JButton("Generar Inventario");
        this.btnRetorno = new JButton("Volver al inicio");

        this.add(this.btnIngresarProducto);
        this.add(this.btnEliminarProducto);
        this.add(this.btnGenerarInventario);
        this.add(this.btnRetorno);      
        

    }
}
