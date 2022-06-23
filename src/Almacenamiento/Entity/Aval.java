/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacenamiento.Entity;

/**
 *
 * @author bran
 */
public class Aval {
  String Nombre; 
  String ApellidosP;
  String ApellidoM; 
  String Direccion; 
  String TelefonoCelular;
  String TelefonoCasa;
  String DireccionEmpleo; 
  String Referencia; 
  
    public Aval(){
        this.Nombre = "";
        this.ApellidosP = "";
        this.ApellidoM = "";
        this.Direccion = "";
        this.TelefonoCelular = "";
        this.TelefonoCasa = "";
        this.DireccionEmpleo = "";
        this.Referencia = "";
    }
    public Aval(String nombre, String apellidoPat, String apellidoMat, String direccion, String telefonoCelular, String telefonoCasa, String direccionEmpleo, String referencia){
        this.Nombre = nombre;
        this.ApellidosP = apellidoPat;
        this.ApellidoM = apellidoMat;
        this.Direccion = direccion;
        this.TelefonoCelular = telefonoCelular;
        this.TelefonoCasa = telefonoCasa;
        this.DireccionEmpleo = direccionEmpleo;
        this.Referencia = referencia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidosP() {
        return ApellidosP;
    }

    public void setApellidosP(String ApellidosP) {
        this.ApellidosP = ApellidosP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefonoCelular() {
        return TelefonoCelular;
    }

    public void setTelefonoCelular(String TelefonoCelularl) {
        this.TelefonoCelular = TelefonoCelularl;
    }

    public String getTelefonoCasa() {
        return TelefonoCasa;
    }

    public void setTelefonoCasa(String TelefonoCasa) {
        this.TelefonoCasa = TelefonoCasa;
    }

    public String getDireccionEmpleo() {
        return DireccionEmpleo;
    }

    public void setDireccionEmpleo(String DireccionEmpleo) {
        this.DireccionEmpleo = DireccionEmpleo;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

   


    
}


