/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReglasNegocio.Control;

import Almacenamiento.Boundary.Boundary;
import Almacenamiento.Entity.Deudor;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author EDUARDO
 */
public class ControlClientes {
       private Boundary API = new Boundary();
       
       public int addCliente(int IdAval,int IdDeuda,String Nombre,String ApellidoP,String ApellidoM,String Direccion,String Telefono,String DireccionEmpleado,String Referencia){
        return API.InsertarDeudor(0, 0, Nombre, ApellidoP, ApellidoM, Direccion, Telefono, DireccionEmpleado, Referencia);
    }
    
    public Deudor obtenerDatosCliente(int IdDeudor) throws SQLException{
        Deudor DatosCliente = new Deudor();
        DatosCliente.setIdDeudor(IdDeudor);
       DatosCliente = API.ListOneDeudor(DatosCliente.getIdDeudor());
       return DatosCliente;
    }
    
    public int ActualizarCliente(Deudor DatosActualizados){
        return API.ActualizarDeudor(DatosActualizados.getIdDeudor(), DatosActualizados.getIdAval(),DatosActualizados.getIdDeuda() , DatosActualizados.getNombre(), DatosActualizados.getApellidoP(), DatosActualizados.getApellidoM(), DatosActualizados.getDireccion(), DatosActualizados.getTelefono(), DatosActualizados.getDireccionEmpleado(), DatosActualizados.getReferencia());
    }
    
    public ResultSet obtenerTodosClientes(){
        ResultSet Clientes;
        Clientes = API.ListDeudores();
        return Clientes;
    }
    
    public int deleteCliente(int IdDeudor){
        return API.EliminarDeudor(IdDeudor);
    }
    
    
    
}
