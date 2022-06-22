/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemas.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author bran
 */
public class ControllerTipoUsuario {
    //-----------------------------------------------------------------------------METODOS-Aval-------------------------------------------------------------------------------\\
       
       //Peticion a la base de datos con sql GET nos regresa todos los tipoUsuario  guardar en varibale tipo Resultset
       public  ResultSet consultarTipoUsuario(){
           Conexion conexion =new Conexion();
           Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select * FROM tipoUsuario ");
               rs=ps.executeQuery();
               
           }catch(Exception ex){
               
               System.err.println("Error"+ex);
           }finally{
                try{
                    con.close();
                }catch(Exception ex){
                    
                }
               
           }
            return rs;
       }
       
              //Peticion a la base de datos con sql GET nos regresa todos los tipoUsuario  guardar en varibale tipo Resultset
       public  ResultSet consultarTipoUsuarios(int IdTipoUsuario){
           Conexion conexion =new Conexion();
           Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select * FROM tipoUsuario  WHERE IdTipoUsuario = ?");
               ps.setInt(0, IdTipoUsuario);
               rs=ps.executeQuery();
               
           }catch(Exception ex){
               
               System.err.println("Error"+ex);
           }finally{
                try{
                    con.close();
                }catch(Exception ex){
                    
                }
               
           }
            return rs;
       }
        //Crear tipoUsuario con el metodo POST
        public  int CrearTipoUsuario(String NombreTipo){
           Conexion conexion =new Conexion();
            Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("INSERT INTO tipoUsuario (NombreTipo) VALUES(?)");
               ps.setString(1,NombreTipo);

               
               int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null," TipoUsuario creado correctamente");
                return 1;
                
               }else{
                   JOptionPane.showMessageDialog(null,"Error al crear");
                   return 0;
               }
 
           }catch(Exception ex){
               
               System.err.println("Error"+ex);
           }finally{
                try{
                    con.close();
                }catch(Exception ex){
                    
                }
               
           }
           return 0;
       }
        //ActualizartipoUsuario con el metodo POST
        public  int ActualizarTipoUsuario(int IdTipoUsuario,String NombreTipoUsuario){
           Conexion conexion =new Conexion();
            Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("UPDATE  TipoUsuario SET NombreTipo=? WHERE IdTipoUsuario =? ");
               ps.setString(1,NombreTipoUsuario);
               ps.setInt(2, IdTipoUsuario);

               
               int res=ps.executeUpdate();
               
               if(res> 0){
                  return 1;
                
                
               }else{
                   return 0;
               }
 
           }catch(Exception ex){
               
               System.err.println("Error"+ex);
           }finally{
                try{
                    con.close();
                }catch(Exception ex){
                    
                }
               
           }
           return 0;
       }
       
        //Elimiar TipoUsuario
       public  int EliminarTipoUsuario(int IdTipoUsuario){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" DELETE FROM tipoUsuario WHERE IdTipoUsuario=?");
                ps.setInt(1,IdTipoUsuario);
                int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null,"TipoUsuario Eliminado Correctamente");
                return 1;
               }else{
                   JOptionPane.showMessageDialog(null,"Error al Eliminar");
                   return 0;
               }
 
           }catch(Exception ex){
               
               System.err.println("Error "+ex);
           }finally{
                try{
                    con.close();
                }catch(Exception ex){
                    
                }
               
           }
            return 0;
       }
       
    
}
