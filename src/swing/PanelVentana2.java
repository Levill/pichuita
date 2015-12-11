/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import Negocio.Usuario;
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
public class PanelVentana2 extends JPanel {
    
    JLabel lblNombre = new JLabel("Nombre:");
    JTextField txtNombre = new JTextField();
    JLabel lblPeso = new JLabel("Peso:");
    JTextField txtPeso = new JTextField();
    JLabel lblSexo = new JLabel("Sexo:");
    JTextField txtSexo = new JTextField();
    JLabel lblApepat = new JLabel("Apepat");
    JTextField txtApepat = new JTextField();
    JLabel lblApemat = new JLabel("Apemat");
    JTextField txtApemat = new JTextField();
    JButton btnAgregar = new JButton("Agregar");
    JButton btnEliminar = new JButton("ELiminar");
    JButton btnEditar = new JButton("Editar");
    JButton btnLimpiar = new JButton("Limpiar");
    public PanelVentana2() {
     this.setLayout(null);
        lblNombre.setBounds(20, 20, 120, 20);
        this.add(lblNombre);
        txtNombre.setBounds(150, 20, 120, 20);
        this.add(txtNombre);
        lblPeso.setBounds(20, 50, 120, 20);
        this.add(lblPeso);
        txtPeso.setBounds(150, 50, 120, 20);
        this.add(txtPeso);
        lblSexo.setBounds(20, 80, 120, 20);
        this.add(lblSexo);
        txtSexo.setBounds(150, 80, 120, 20);
        this.add(txtSexo);
        lblApepat.setBounds(20, 110, 120, 20);
        this.add(lblApepat);
        txtApepat.setBounds(150, 110, 120, 20);
        this.add(txtApepat);
        lblApemat.setBounds(20, 140, 120, 20);
        this.add(lblApemat);
        txtApemat.setBounds(150, 140, 120, 20);
        this.add(txtApemat);
        
        
                
        
        btnAgregar.setBounds(20, 170, 120, 20);                
        this.add(btnAgregar);
        btnLimpiar.setBounds(150, 170, 120, 20);
        this.add(btnLimpiar);
        btnEliminar.setBounds(280, 170, 120, 20);
        this.add(btnEliminar);
        btnEditar.setBounds(410, 170, 120, 20);
        this.add(btnEditar);
        PanelVentana2.OyenteLimpiar oLimpiar = new PanelVentana2.OyenteLimpiar();
        btnLimpiar.addActionListener(oLimpiar);
        PanelVentana2.OyenteAgregar oAgregar = new PanelVentana2.OyenteAgregar();
        btnAgregar.addActionListener(oAgregar);
    }
     class OyenteLimpiar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Limpiar();
        }
    }

    class OyenteAgregar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Usuario usu = new Usuario();
            String nom = txtNombre.getText();
            int pes = Integer.parseInt(txtPeso.getText());
            String sex = txtSexo.getText();
            String apep=txtApepat.getText();
            String apem=txtApemat.getText();

            usu.setNombre(nom);
            usu.setPeso(pes);
            usu.setSexo(sex);
            usu.setApepat(apep);
            usu.setApemat(apem);
            usu.save();
            Limpiar();
        }
    }
    
    public void Limpiar() {
        txtNombre.setText("");
        txtPeso.setText("");
        txtSexo.setText("");
        txtApepat.setText("");
        txtApemat.setText("");
    }
      
    }


