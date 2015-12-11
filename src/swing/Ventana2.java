package swing;

import javax.swing.JFrame;

public class Ventana2 extends JFrame{
    public Ventana2(){
        this.setTitle("VENTANA CIUDADES");
        this.setSize(500,200);
       
        PanelVentana2 p2=new PanelVentana2();
        this.add(p2);
    }
    
}