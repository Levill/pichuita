package swing;

import javax.swing.JFrame;

public class Ventana3 extends JFrame{
    public Ventana3(){
        this.setTitle("VENTANA PEDIDOS");
        this.setSize(500,250);
       
        PanelVentana3 p3=new PanelVentana3();
        this.add(p3);
    }
    
}