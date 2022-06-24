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
     private Boundary API = new Boundary();
        //retorna idTipoUsuario
        public int AccesoSistema(String username,String password){
              
           return 0;
       }
    
        public int  ActualizarUsuario(int IdUsuario,int IdTIpoUsuario,String Nombre,String ApellidoP,String ApellidoM,String Usuario,String Password,String Horario){
            int resultado;
            resultado=API.ActualizarUsuario(IdUsuario, IdTIpoUsuario, Nombre, ApellidoP, ApellidoM, Usuario, Password, Horario);
            return resultado;
        }
        //Retorna id del Usuario
       public int verificarDatosInicio(String usarname,String password){
           int resultado;
           resultado=API.Login(usarname, password);
           return resultado;
       }
       
       //Datos del empleado 
       public Usuario ObtenerInformacionUsuario(int idUsuario) throws SQLException{
           Usuario usuario= new Usuario();
           usuario = API.ListOneUsuario(idUsuario);
           return usuario;
       }

}
