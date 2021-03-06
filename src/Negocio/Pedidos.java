package Negocio;

import Conexion.Conexion;
import java.util.ArrayList;
import java.util.List;


public class Pedidos {
    private int id_pedido;
    private String fecha;
    private int codigo;
    private int id_usuario;
    Conexion con;
    
    public int geTid_pedido(){
        return id_pedido;
    }
    public void setid_pedido(int id_pedido){
        this.id_pedido = id_pedido;
    }
    public String getfecha() {
        return fecha;
    }
    public void setfecha(String fecha) {
        this.fecha = fecha;
    }
    public int getcodigo() {
        return codigo;
    }

    public void setcodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getid_usuario() {
        return id_usuario;
    }

    public void setid_usuario(int id_usuario) {
        this.id_usuario= id_usuario;
    }
    public Conexion getCon() {
        return con;
    }

    public void setCon(Conexion con) {
        this.con = con;
    }
        public void save(){
    con.setEjecutar("insert into Pedidos(id_pedido,fecha,codigo,id_usuario) values('" + this.id_pedido+ this.fecha + "','" + this.codigo + "','"+this.id_usuario+"')");
    }
     public void delete() {
        con.setEjecutar("delete from Pedidos where id_pedido='" + this.id_pedido + "'");
    }
     public void update() {
        con.setEjecutar("update Pedidos set fecha='" + this.fecha + "',codigo='" + this.codigo + "',id_usuario='"+this.id_usuario+"' where  id_pedido='" + this.id_pedido + "'");
    }
      public List list(){
           List<Pedidos> Lista2=new ArrayList<Pedidos>();
        con.setSeleccion("select * from Pedidos");
        Pedidos Ped;
        try{
            while(con.getRs().next()){
                Ped=new Pedidos();
                Ped.setid_pedido(con.getRs().getInt("ID_pedido"));
                Ped.setfecha(con.getRs().getString("FECHA"));
                Ped.setcodigo(con.getRs().getInt("Codigo"));
                Ped.setid_usuario(con.getRs().getInt("Id_usuario"));
                
                Lista2.add(Ped);
            }
        }catch(Exception ex){
            System.out.println("ERROr"+ex.getMessage());
        }
        return Lista2;
        /*List<Pedidos> lista=new ArrayList<Pedidos>();
        con.setSeleccion("select * from pedidos");
        Pedidos ped;
        try{
            while(con.getRs().next()){
                ped=new Pedidos();
                ped.setid_pedido(con.getRs().getInt("id_pedidos"));
                ped.setfecha(con.getRs().getString("fecha"));
                ped.setcodigo(con.getRs().getInt("codigo"));
                ped.setid_usuario(con.getRs().getInt("Id_usuario"));
                lista.add(ped);
            }
        }catch(Exception ex){
            System.out.println("ERROr"+ex.getMessage());
        }
        return lista;*/
      }
}