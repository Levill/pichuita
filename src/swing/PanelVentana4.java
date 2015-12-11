/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import Negocio.Pedidos;
import Negocio.Articulo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author emanuel
 */
public class PanelVentana4 extends JPanel {
    
    JLabel lblDescripcion = new JLabel("Descripcion:");
    JTextField txtDescripcion = new JTextField();
    JLabel lblNombre = new JLabel("Nombre:");
    JTextField txtNombre = new JTextField();
    JLabel lblPrecio = new JLabel("Precio:");
    JTextField txtPrecio = new JTextField();
    JLabel lblId_pedido = new JLabel("Id_pedido");
    JTextField txtId_pedido = new JTextField();
    JButton btnAgregar = new JButton("Agregar");
    JButton btnEliminar = new JButton("ELiminar");
    JButton btnEditar = new JButton("Editar");
    JButton btnLimpiar = new JButton("Limpiar");
    public PanelVentana4() {
     this.setLayout(null);
        lblDescripcion.setBounds(20, 20, 120, 20);
        this.add(lblDescripcion);
        txtDescripcion.setBounds(150, 20, 120, 20);
        this.add(txtDescripcion);
        lblNombre.setBounds(20, 50, 120, 20);
        this.add(lblNombre);
        txtNombre.setBounds(150, 50, 120, 20);
        this.add(txtNombre);
        lblPrecio.setBounds(20, 80, 120, 20);
        this.add(lblPrecio);
        txtPrecio.setBounds(150, 80, 120, 20);
        this.add(txtPrecio);
        lblId_pedido.setBounds(20, 110, 120, 20);
        this.add(lblId_pedido);
        txtId_pedido.setBounds(150, 110, 120, 20);
        this.add(txtId_pedido);
             
                        
        
        btnAgregar.setBounds(20, 170, 120, 20);                
        this.add(btnAgregar);
        btnLimpiar.setBounds(150, 170, 120, 20);
        this.add(btnLimpiar);
        btnEliminar.setBounds(280, 170, 120, 20);
        this.add(btnEliminar);
        btnEditar.setBounds(410, 170, 120, 20);
        this.add(btnEditar);
    }
     class OyenteLimpiar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Limpiar();
        }
    }

    class OyenteAgregar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Articulo art = new Articulo();
            String desc=txtDescripcion.getText();
            String nom = txtNombre.getText();
            int pre = Integer.parseInt(txtPrecio.getText());
            int id = Integer.parseInt(txtId_pedido.getText());

            art.setDescripcion(desc);
            art.setNombre(nom);
            art.setPrecio(pre);
            art.setId_pedido(id);
            
            art.save();
            Limpiar();
        }
    }
    
    public void Limpiar() {
        txtDescripcion.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtId_pedido.setText("");

    }
      
    }