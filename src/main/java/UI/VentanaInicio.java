/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.lang.Object;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

/**
 *
 * @author Cristobal
 */
public class VentanaInicio extends JFrame {
    
    public PanelBotonesInicio pnlBtnsInicio;
    private Image fondo;
    
    public VentanaInicio() {
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes() {
        this.pnlBtnsInicio = new PanelBotonesInicio();
        this.add(this.pnlBtnsInicio, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("data//icono2.jpg").getImage());
        this.setTitle("Inicio");
        this.setSize(400, 150);
        this.setVisible(true);
        this.setResizable(false);
        
    }
//    
//    private void preInit(){
//        this.fondo=new ImageIcon("data//fondoComidas.jpg").getImage();
//    }
//    
//    public void paint(Graphics grafica){
//        grafica.drawImage(fondo,0,0,getWidth(),getHeight(),this);
//    }
}
