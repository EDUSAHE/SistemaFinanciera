/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemas.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author bran
 */
public class ControllerUsuario {
     //-----------------------------------------------------------------------------METODOS-USUARIO-----------------------------------------------------------------------------\\
       
       //Peticion a la base de datos con sql GET
       public  ResultSet consultarUsuarios(){
            Conexion conexion =new Conexion();
           Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select * FROM USUARIO ");
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
              //Peticion a la base de datos con sql GET
       public  ResultSet consultarUsuario(int dUsuario){
            Conexion conexion =new Conexion();
           Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select * FROM USUARIO WHERE IdUsuario=? ");
              ps.setInt(1, dUsuario);
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
       //Crear Usuario con el metodo PPOST
        public  int CrearUsuario(int IdTIpoUsuario,String Nombre,String ApellidoP,String ApellidoM,String Usuario,String Password,String Horario){
             Conexion conexion =new Conexion();
           Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("INSERT INTO USUARIO (IdTIpoUsuario,Nombre,ApellidoP,ApellidoM,Usuario,Password,Horario) VALUES(?,?,?,?,?,?,?)");
               ps.setInt(1,IdTIpoUsuario);
               ps.setString(2,Nombre);
               ps.setString(3,ApellidoP);
               ps.setString(4,ApellidoM);
               ps.setString(5,Usuario);
               ps.setString(6,Password);
                 ps.setString(7, Horario);
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
               //Crear Usuario con el metodo PPOST
        public  int ActualizarUsuario(int IdUsuario,int IdTIpoUsuario,String Nombre,String ApellidoP,String ApellidoM,String Usuario,String Password,String Horario){
             Conexion conexion =new Conexion();
           Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("UPDATE USUARIO SET IdTIpoUsuario=?,Nombre=?,ApellidoP=?,ApellidoM=?,Usuario=?,Password=?,Horario=? WHERE IdUsuario = ?");
               ps.setInt(1,IdTIpoUsuario);
               ps.setString(2,Nombre);
               ps.setString(3,ApellidoP);
               ps.setString(4,ApellidoM);
               ps.setString(5,Usuario);
               ps.setString(6,Password);
               ps.setString(7, Horario);
               ps.setInt(8, IdUsuario);
             
               
               
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
        
      //Elimiar Usuario
       public  int EliminarUsuario(int IdUsuario){
            Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" DELETE FROM Usuario WHERE IdUsuario=?");
                ps.setInt(1,IdUsuario);
                int res=ps.executeUpdate();
               
               if(res> 0){
                  
                return 1;
                
               }else{
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
       
  
       //Peticion a la base verificamos si existe usuario (Si existe te retorta el id del usuario de lo contrario un 0)
       public  int login(String Usuario,String Password){
            Conexion conexion =new Conexion();
           Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select IdUsuario,Nombre,Usuario,Password FROM USUARIO WHERE  Usuario=? ");
                ps.setString(1,Usuario);
               rs=ps.executeQuery();
               
               if(rs.next()){
                  
                   if(Password.equals(rs.getString(4))){
                     
                       return rs.getInt("IdUsuario");
                   }else{
                       return -1;
                   }
                   
               }
               return -1;
               
               
               
           }catch(Exception ex){
               
               System.err.println("Error"+ex);
           }finally{
                try{
                    con.close();
                }catch(Exception ex){
                    
                }
               
           }
            return -1;
       }
       
       

}
