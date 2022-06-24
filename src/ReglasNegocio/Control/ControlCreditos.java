/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReglasNegocio.Control;

import Almacenamiento.Boundary.Boundary;
import Almacenamiento.Entity.Credito;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author EDUARDO
 */
public class ControlCreditos {
    private Boundary API = new Boundary();
       
       public int addCredito(int IdCliente,int IdModalidad,float TotalPrestamo,float Restante){
        return API.InsertarCredito(IdCliente, IdModalidad, TotalPrestamo, Restante);
    }
    
    public Credito ObtenerDatosCredito(int IdCredito) throws SQLException{
        Credito DatosCredito = new Credito();
       DatosCredito = API.ListOneCredito(IdCredito);
       return DatosCredito;
    }
    
    public int ActualizarCredito(int IdCredito,int IdModalidad,float TotalPrestamo,float Restante){
        return API.ActualizarCredito(IdCredito, IdCredito, IdModalidad, TotalPrestamo, Restante);
    }
    
    public ResultSet ObtenerCreditosCliente(int idCredito){
        ResultSet CreditosCliente;
        CreditosCliente = API.ListCreditos();
        return CreditosCliente;
    }
    
    public int deleteCredito(int IdCredito){
        return API.EliminarCredito(IdCredito);
    }
    
    
    
}
