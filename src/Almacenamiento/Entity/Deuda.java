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
    int IdDeudor;
    int IdModalidad;
    float TotalPrestamo;
    float Restante;
    
    
    public int getIdDeuda() {
        return IdDeuda;
    }

    public void setIdDeuda(int IdDeuda) {
        this.IdDeuda = IdDeuda;
    }

    public int getIdDeudor() {
        return IdDeudor;
    }

    public void setIdDeudor(int IdDeudor) {
        this.IdDeudor = IdDeudor;
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
