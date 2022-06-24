/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReglasNegocio.Control;

import Almacenamiento.Boundary.Boundary;
import Almacenamiento.Entity.Aval;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author EDUARDO
 */
public class ControlAvales {
       private Boundary API = new Boundary();
       
       public void addAval(int IdCliente,String Nombre,String ApellidosP,String ApellidoM,String Direccion,String TelefonoCelular,String TelefonoCasa,String DireccionEmpleo,String Referencia){
        API.InsertarAval(IdCliente, Nombre, ApellidosP, ApellidoM, Direccion, TelefonoCelular, TelefonoCasa, DireccionEmpleo, Referencia);
       }
    
    public Aval obtenerDatosAval(int idAval) throws SQLException{
        Aval DatosAval = new Aval();
        DatosAval.setIdAval(idAval);
       DatosAval = API.ListOneAval(DatosAval.getIdAval());
       return DatosAval;
    }
    
    public int ActualizarAval(int IdCliente,int idAval,String Nombre,String ApellidosP,String ApellidoM,String Direccion,String TelefonoCelular,String TelefonoCasa,String DireccionEmpleo,String Referencia){
        return API.ActualizarAval(IdCliente, idAval, Nombre, ApellidosP, ApellidoM, Direccion, TelefonoCelular, TelefonoCasa, DireccionEmpleo, Referencia);
    }
    
    public ResultSet obtenerAvales() throws SQLException{
        ResultSet Avales;
        Avales = API.ListAvales();
        return Avales;
    }
    
    public int deleteAval(int idAval){
        return API.EliminarAval(idAval);
    }
}
