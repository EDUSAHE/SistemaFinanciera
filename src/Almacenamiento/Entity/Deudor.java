/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacenamiento.Entity;

/**
 *
 * @author bran
 */
public class Deudor {
    
    int IdAval;
    int IdDeudor;
    int IdDeuda;
    String Nombre;
    String ApellidoP;
    String ApellidoM;
    String Direccion;
    String Telefono;
    String DireccionEmpleado;
    String Referencia;

      public int getIdDeudor() {
        return IdDeudor;
    }

    public void setIdDeudor(int IdDeudor) {
        this.IdDeudor = IdDeudor;
    }
    
    public int getIdAval() {
        return IdAval;
    }

    public void setIdAval(int IdAval) {
        this.IdAval = IdAval;
    }

    public int getIdDeuda() {
        return IdDeuda;
    }

    public void setIdDeuda(int IdDeuda) {
        this.IdDeuda = IdDeuda;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccionEmpleado() {
        return DireccionEmpleado;
    }

    public void setDireccionEmpleado(String DireccionEmpleado) {
        this.DireccionEmpleado = DireccionEmpleado;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }
    
}
