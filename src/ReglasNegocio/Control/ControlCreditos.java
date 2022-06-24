/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReglasNegocio.Control;

import Almacenamiento.Boundary.Boundary;
import Almacenamiento.Entity.Deuda;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author EDUARDO
 */
public class ControlCreditos {
    private Boundary API = new Boundary();
       
       public int addCredito(int IdMulta,int IdPago,int IdModalidad,float TotalPrestamo,float Restante){
        return API.InsertarDeuda(IdMulta, IdPago, IdModalidad, TotalPrestamo, Restante);
    }
    
    public Deuda ObtenerDatosCredito(int IdDeuda) throws SQLException{
        Deuda DatosCredito = new Deuda();
        DatosCredito.seIdDeuda(IdDeuda);
       DatosCredito = API.ListOneDeuda(DatosCredito.getIdDeuda());
       return DatosCredito;
    }
    
    public int ActualizarCredito(Deuda DatosActualizados){
        return API.ActualizarDeuda(DatosActualizados.getIdDeuda(), DatosActualizados.getIdmulta(), DatosActualizados.getIdPago(), DatosActualizados.getIdModalidad(), DatosActualizados.getTotalPrestamo(), DatosActualizados.getRestante());
    }
    
    public ResultSet ObtenerCreditosCliente(int idDeudor){
        ResultSet CreditosCliente;
        CreditosCliente = API.ListDeudores();
        return CreditosCliente;
    }
    
    public int deleteCredito(int IdDeuda){
        return API.EliminarDeuda(IdDeuda);
    }
    
    
    
}
