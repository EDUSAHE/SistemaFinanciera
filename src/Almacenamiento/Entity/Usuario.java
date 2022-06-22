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

    //Constructor vacio
    public Usuario(){
        this.nombre = "";
        this.apellidoP = "";
        this.apellidoM = "";
        this.usuario = "";
        this.password = "";
    }

    //Constructor sobrecargado con todos los campos
    public Usuario(String nombreNuevo, String apellidoPNuevo, String apellidoMNuevo, String usuarioNuevo, String passwordNuevo){
        this.nombre = nombreNuevo;
        this.apellidoP = apellidoPNuevo;
        this.apellidoM = apellidoMNuevo;
        this.usuario = usuarioNuevo;
        this.password = passwordNuevo;
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
}
