package swing;

import javax.swing.JFrame;

public class Ventana4 extends JFrame{
    public Ventana4(){
        this.setTitle("VENTANA ARTICULOS");
        this.setSize(500,250);
       
        PanelVentana4 p4=new PanelVentana4();
        this.add(p4);
    }
    
}