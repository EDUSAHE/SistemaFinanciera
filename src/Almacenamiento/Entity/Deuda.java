/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacenamiento.Entity;

/**
 *
 * @author bran
 */
public class Deuda {
    int IdDeuda;
    int Idmulta;
    int IdPago;
    int IdModalidad;
    float TotalPrestamo;
    float Restante;

    public int getIdDeuda() {
        return Idmulta;
    }

    public void seIdDeuda(int IdDeuda) {
        this.IdDeuda = IdDeuda;
    }
    
    public int getIdmulta() {
        return Idmulta;
    }

    public void setIdmulta(int Idmulta) {
        this.Idmulta = Idmulta;
    }

    public int getIdPago() {
        return IdPago;
    }

    public void setIdPago(int IdPago) {
        this.IdPago = IdPago;
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
