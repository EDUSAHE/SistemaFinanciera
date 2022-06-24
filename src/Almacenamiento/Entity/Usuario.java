/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacenamiento.Entity;

/**
 *
 * @author bran
 */
public class Usuario {
  
    String nombre;
    String apellidoP;
    String apellidoM;
    String usuario;
    String password;
    String horario;
    int IdTIpoUsuario;
    int IdUsuario;
    //Constructor vacio
    public Usuario(){
        
        this.nombre = "";
        this.apellidoP = "";
        this.apellidoM = "";
        this.usuario = "";
        this.password = "";
        this.horario="";
        this.IdTIpoUsuario=0;
        this.IdUsuario=0;
    }

    //Constructor sobrecargado con todos los campos
    public Usuario(int IdTIpoUsuario,int IdUsuario,String nombreNuevo, String apellidoPNuevo, String apellidoMNuevo, String usuarioNuevo, String passwordNuevo,String horario){
        this.nombre = nombreNuevo;
        this.apellidoP = apellidoPNuevo;
        this.apellidoM = apellidoMNuevo;
        this.usuario = usuarioNuevo;
        this.password = passwordNuevo;
        this.horario=horario;
        this.IdTIpoUsuario=IdTIpoUsuario;
        this.IdUsuario=IdUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.apellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.apellidoM = ApellidoM;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String Usuario) {
        this.usuario = Usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }
      public String getHorario() {
        return horario;
    }

    public void setHorario(String Horario) {
        this.horario = Horario;
    }
    public void setIdTIpoUsuario(int IdTIpoUsuario) {
        this.IdTIpoUsuario = IdTIpoUsuario;
    }
    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }
    public int getIdTIpoUsuario() {
        return IdTIpoUsuario;
    }
    public int getIdUsuario() {
        return IdUsuario;
    }
    
}
