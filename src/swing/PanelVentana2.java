/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author emanuel
 */
public class PanelVentana2 extends JPanel {
    
    JLabel lblDescripcion = new JLabel("Descripcion:");
    JTextField txtDescripcion = new JTextField();
    JLabel lblNombre = new JLabel("Nombre");
    JTextField txtNombre = new JTextField();
    JLabel lblPrecio = new JLabel("Precio");
    JTextField txtPrecio = new JTextField();
    JLabel lblId_pedido = new JLabel("id_pedido");
    JTextField txtId_pedido = new JTextField();
    JButton btnAgregar = new JButton("Agregar");
    JButton btnEliminar = new JButton("ELiminar");
    JButton btnEditar = new JButton("Editar");
    JButton btnLimpiar = new JButton("Limpiar");
    public PanelVentana2() {
     this.setLayout(null);
        lblNombre.setBounds(20, 20, 120, 20);
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
        txtId_pedido .setBounds(150, 50, 120, 20);
        this.add(txtId_pedido );
        lblId_pedido .setBounds(20, 80, 120, 20);
        this.add(lblId_pedido );
        btnAgregar.setBounds(20, 110, 120, 20);
        this.add(btnAgregar);
        btnLimpiar.setBounds(150, 110, 120, 20);
        this.add(btnLimpiar);
        btnEliminar.setBounds(280, 110, 120, 20);
        this.add(btnEliminar);
        btnEditar.setBounds(410, 110, 120, 20);
        this.add(btnEditar);
      
    }
} 

