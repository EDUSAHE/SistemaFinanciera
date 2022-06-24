/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacenamiento.Entity;

/**
 *
 * @author bran
 */
public class Credito {
    int IdCredito;
    int IdCliente;
    int IdModalidad;
    float TotalPrestamo;
    float Restante;
    
    
    public int getIdCredito() {
        return IdCredito;
    }

    public void setIdCredito(int IdCredito) {
        this.IdCredito = IdCredito;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getIdModalidad() {
        return IdModalidad;
    }

    public void setIdModalidad(int IdModalidad) {
        this.IdModalidad = IdModalidad;
    }

    public float getTotalPrestamo() {
        return TotalPrestamo;
    }

    public void setTotalPrestamo(float TotalPrestamo) {
        this.TotalPrestamo = TotalPrestamo;
    }

    public float getRestante() {
        return Restante;
    }

    public void setRestante(float Restante) {
        this.Restante = Restante;
    }


   
}
