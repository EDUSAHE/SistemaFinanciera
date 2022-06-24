/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReglasNegocio.Control;

import Almacenamiento.Boundary.Boundary;
import Almacenamiento.Entity.Usuario;
import java.sql.SQLException;
import java.sql.ResultSet;


/**
 *
 * @author EDUARDO
 */
public class ControlEmpleados {
    private Boundary API = new Boundary();
    
    public int addUsuario(int IdTIpoUsuario,String Nombre,String ApellidoP,String ApellidoM,String Usuario,String Password,String Horario){
        Usuario usuario = new Usuario();
        usuario.setIdTIpoUsuario(IdTIpoUsuario);
        usuario.setNombre(Nombre);
        usuario.setApellidoP(ApellidoP);
        usuario.setApellidoM(ApellidoM);
        usuario.setUsuario(Usuario);
        usuario.setPassword(Password);
        usuario.setHorario(Horario);
        if(API.Login(usuario.getUsuario(), usuario.getPassword())!=-1){
            return 2;
        }
        else{
            return API.InsertarUsuario(usuario);
        }
    }
    
    public Usuario obtenerDatosUsuario(int IdUsuario) throws SQLException{
        Usuario datosusuario = new Usuario();
        datosusuario.setIdUsuario(IdUsuario);
       datosusuario = API.ListOneUsuario(datosusuario.getIdUsuario());
       return datosusuario;
    }
    
    public int ActualizarUsuario(int IdUsuario,int IdTIpoUsuario,String Nombre,String ApellidoP,String ApellidoM,String Usuario,String Password,String Horario){
        int Result;
        return Result= API.ActualizarUsuario(IdUsuario, IdTIpoUsuario, Nombre, ApellidoP, ApellidoM, Usuario, Password, Horario);
    }
    
    public ResultSet obtenerTodosUsuarios(){
        ResultSet Usuarios;
        Usuarios = API.ListUsuario();
        return Usuarios;
    }
    
    public int deleteUsuario(int idUsuario){
        return API.EliminarUsuario(idUsuario);
    }
}
