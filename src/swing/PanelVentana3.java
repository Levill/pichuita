/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import Negocio.Pedidos;
import Negocio.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author tito
 */
public class PanelVentana3 extends JPanel {
         JLabel lblFecha = new JLabel("Fecha");
    JTextField txtFecha = new JTextField();
    JLabel lblCodigo = new JLabel("Codigo");
    JTextField txtCodigo = new JTextField();
    JLabel lblId_usuario = new JLabel("Id_usuario");
    JTextField txtId_usuario = new JTextField();
    JButton btnAgregar = new JButton("Agregar");
    JButton btnEliminar = new JButton("ELiminar");
    JButton btnEditar = new JButton("Editar");
    JButton btnLimpiar = new JButton("Limpiar");   
    public PanelVentana3(){
          this.setLayout(null);
        lblFecha.setBounds(20, 20, 120, 20);
        this.add(lblFecha);
        txtFecha.setBounds(150, 20, 120, 20);
        this.add(txtFecha);
        lblCodigo .setBounds(20, 50, 120, 20);
        this.add(lblCodigo);
        txtCodigo.setBounds(150, 50, 120, 20);
        this.add(txtCodigo);
        lblId_usuario.setBounds(20, 80, 120, 20);
        this.add(lblId_usuario);
        txtId_usuario.setBounds(150, 80, 120, 20);
        this.add(txtId_usuario);
        btnAgregar.setBounds(20, 110, 120, 20);
        this.add(btnAgregar);
        btnLimpiar.setBounds(150, 110, 120, 20);
        this.add(btnLimpiar);
        btnEliminar.setBounds(280, 110, 120, 20);
        this.add(btnEliminar);
        btnEditar.setBounds(410, 110, 120, 20);
        this.add(btnEditar);
          OyenteLimpiar oLimpiar = new OyenteLimpiar();
        btnLimpiar.addActionListener(oLimpiar);
        OyenteAgregar oAgregar = new OyenteAgregar();
        btnAgregar.addActionListener(oAgregar);

     }

    class OyenteLimpiar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Limpiar();
        }
    }

    class OyenteAgregar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Pedidos  ped = new Pedidos();
            String fech = txtFecha.getText();
            int cod = Integer.parseInt(txtCodigo.getText());
            int id_usuario= Integer.parseInt(txtId_usuario.getText());

            ped.setfecha(fech);
            ped.setcodigo(cod);
            ped.setid_usuario(id_usuario);
            ped.save();
            Limpiar();
        }
    }
    
    public void Limpiar() {
        txtFecha.setText("");
        txtCodigo.setText("");
        txtId_usuario.setText("");
    }

}