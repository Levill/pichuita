package swing;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class Ventana extends JFrame {
    PanelVentana p=new PanelVentana();
    JMenuBar barra=new JMenuBar();
    JMenu mnuArchivo=new JMenu("Archivo");
    JMenu mnuModulos=new JMenu("Modulos");
    JMenuItem mnuSalir=new JMenuItem("Salir");
    JMenuItem mnuUsuarios=new JMenuItem("Usuarios");
    JMenuItem mnuPedidos=new JMenuItem("Pedidos");
    Ventana2 v2=new Ventana2();
    Ventana3 v3=new Ventana3();
    public Ventana(){
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Menu");
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(p);
        barra.add(mnuArchivo);
        barra.add(mnuModulos);
        mnuModulos.add(mnuUsuarios);
        mnuModulos.add(mnuPedidos);
        mnuArchivo.add(mnuSalir);
        this.add(barra,BorderLayout.NORTH);
        OyenteModulo1 o1=new OyenteModulo1();
        mnuUsuarios.addActionListener(o1);
        OyenteCerrar oCerrar=new OyenteCerrar();
        mnuSalir.addActionListener(oCerrar);
     }
    class OyenteModulo1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
           v2.setVisible(true);
        }
    }
    class OyenteModulo2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
           v3.setVisible(true);
        }
    }
    class OyenteCerrar implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    
}
    

