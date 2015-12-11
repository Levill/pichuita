/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Conexion.Conexion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Usuario {
    private int id_usuario;
    private String nombre;
    private int peso;
    private String sexo;
    private String apepat;
    private String apemat;
    Conexion con;
    public Usuario(){
        con=new Conexion();
    }
    

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int usuario_id) {
        this.id_usuario= id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public Conexion getCon() {
        return con;
    }

    public void setCon(Conexion con) {
        this.con = con;
    }
    public void save(){
    con.setEjecutar("insert into usuarios(nombre,peso,sexo,apepat,apemat) values('" + this.nombre + "','" + this.peso + "','"+ this.sexo +"','"+ this.apepat + "','"+ this.apemat +"')");
    }
    public void delete() {
        con.setEjecutar("delete from usuarios where id_ususario='" + this.id_usuario + "'");
    }
    public void update() {
        con.setEjecutar("update usuarios set nombre='" + this.nombre + "',peso='" + this.peso + "',sexo='"+this.sexo+"',apepat='" + this.apepat + "',apemat='"+this.apemat+ "' where  id_usuario='" + this.id_usuario + "'");
    }
      public List list(){
        List<Usuario> lista=new ArrayList<Usuario>();
        con.setSeleccion("select * from usuarios");
        Usuario user;
        try{
            while(con.getRs().next()){
                user=new Usuario();
                user.setId_usuario(con.getRs().getInt("id_usuario"));
                user.setNombre(con.getRs().getString("nombre"));
                user.setPeso(con.getRs().getInt("peso"));
                user.setSexo(con.getRs().getString("sexo"));
                user.setApepat(con.getRs().getString("apepat"));
                user.setApemat(con.getRs().getString("apemat"));
                lista.add(user);
            }
        }catch(Exception ex){
            System.out.println("ERROr"+ex.getMessage());
        }
        return lista;
      }
}