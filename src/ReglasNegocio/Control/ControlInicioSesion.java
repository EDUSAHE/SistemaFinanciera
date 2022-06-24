/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReglasNegocio.Control;
import Almacenamiento.Entity.*;
import Almacenamiento.Boundary.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author EDUARDO
 */
public class ControlInicioSesion {
    
        //retorna idTipoUsuario
        public int AccesoSistema(String username,String password){
              
           return 0;
       }
    
        //Retorna id del Usuario
       public int verificarDatosInicio(String usarname,String password){
           Boundary boundary= new Boundary();
           int resultado;
           resultado=boundary.Login(usarname, password);
           return resultado;
       }
       
       //Datos del empleado 
       public Usuario ObtenerInformacionUsuario(int idUsuario) throws SQLException{
           Usuario usuario= new Usuario();
           Boundary boundary = new Boundary();
           usuario = boundary.ListOneUsuario(idUsuario);
           return usuario;
       }

}
