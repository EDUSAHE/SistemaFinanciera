/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReglasNegocio.Control;

import Almacenamiento.Boundary.Boundary;
import Almacenamiento.Entity.Cliente;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author EDUARDO
 */
public class ControlClientes {
       private Boundary API = new Boundary();
       
       public int addCliente(String Nombre,String ApellidoP,String ApellidoM,String Direccion,String Telefono,String DireccionCliente,String Referencia){
        return API.InsertarCliente(Nombre, ApellidoP, ApellidoM, Direccion, Telefono, DireccionCliente, Referencia);
    }
    
    public Cliente obtenerDatosCliente(int IdCliente) throws SQLException{
        Cliente DatosCliente = new Cliente();
        DatosCliente.setIdCliente(IdCliente);
       DatosCliente = API.ListOneCliente(DatosCliente.getIdCliente());
       return DatosCliente;
    }
    
    public int ActualizarCliente(int IdCliente,String Nombre,String ApellidoP,String ApellidoM,String Direccion,String Telefono,String DireccionEmpleado,String Referencia){
        return API.ActualizarCliente(IdCliente, Nombre, ApellidoP, ApellidoM, Direccion, Telefono, DireccionEmpleado, Referencia);
    }
    
    public ResultSet obtenerTodosClientes(){
        ResultSet Clientes;
        Clientes = API.ListClientes();
        return Clientes;
    }
    
    public int deleteCliente(int IdCliente){
        return API.EliminarCliente(IdCliente);
    }
    
    
    
}
