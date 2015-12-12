/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import Negocio.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
    JLabel lblId=new JLabel("ID");
    JTextField txtId=new JTextField();
    DefaultTableModel modelo=new DefaultTableModel();{
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("PESO");
        modelo.addColumn("SEXO");
        modelo.addColumn("APEPAT");
        modelo.addColumn("APEMAT");
}
     JTable tabla=new JTable(modelo);
     JScrollPane scrollTabla=new JScrollPane(tabla);
     
      public PanelVentana2(){
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
        lblId.setBounds(280, 80, 120, 20);
        this.add(lblId);
        txtId.setBounds(410, 80, 120, 20);
        this.add(txtId);
        scrollTabla.setBounds(20,210, 640,380);
        this.add(scrollTabla);
        PanelVentana2.OyenteLimpiar oLimpiar = new PanelVentana2.OyenteLimpiar();
        btnLimpiar.addActionListener(oLimpiar);
        PanelVentana2.OyenteAgregar oAgregar = new PanelVentana2.OyenteAgregar();
        btnAgregar.addActionListener(oAgregar);
       PanelVentana2.OyenteEliminar oEliminar=new PanelVentana2.OyenteEliminar();
        btnEliminar.addActionListener(oEliminar);
        PanelVentana2.OyenteEditar oEditar=new PanelVentana2.OyenteEditar();
        btnEditar.addActionListener(oEditar);
           scrollTabla.setBounds(20,210, 640,380);
        this.add(scrollTabla);
        llenarTabla();
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
            llenarTabla();
        }
    }
         class OyenteEliminar implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Usuario usu=new Usuario();
            String nom=(txtNombre.getText());
            usu.setNombre(nom);
            usu.delete();
            Limpiar();
            llenarTabla();
        }
    }
            class OyenteEditar implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Usuario usu=new Usuario();
            String nom=(txtNombre.getText());
            int peso=Integer.parseInt(txtPeso.getText());
            String sexo=txtSexo.getText();
            String Apepat=txtApepat.getText();
            String Apemat=txtApemat.getText();
            usu.setNombre(nom);
            usu.setPeso(peso);
            usu.setSexo(sexo);
            usu.setApepat(Apepat);
            usu.setApemat(Apemat);
            usu.update();
            Limpiar();
            llenarTabla();
        }
            }
              public void llenarTabla(){
        
        modelo.setRowCount(0);
        Usuario usuario=new Usuario();
        List<Usuario> lista=usuario.list();
       
       Object[] list=new Object[4];
        for(int i=0;i<lista.size();i++){
            
            list[0]=""+lista.get(i).getId_usuario();
         
            list[1]=""+lista.get(i).getNombre();
           
            list[2]=""+lista.get(i).getPeso();
           
            list[3]=""+lista.get(i).getSexo();
            list[4]=""+lista.get(i).getApepat();
            list[5]=""+lista.get(i).getApemat();
            
            modelo.addRow(list);
            
        }
        
    }
    public void buscarTabla(){
        list.setNombre(txtBuscar.getText());  
        
    }
    
    public void Limpiar() {
        txtNombre.setText("");
        txtPeso.setText("");
        txtSexo.setText("");
        txtApepat.setText("");
        txtApemat.setText("");
    }
      
    }


