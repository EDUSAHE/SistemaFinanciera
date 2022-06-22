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
public class ControllerModalidad {
    //-----------------------------------------------------------------------------METODOS-Modalidad-------------------------------------------------------------------------------\\
       
       //Peticion a la base de datos con sql GET nos regresa todos las modalidades   guardardadas en varibale tipo Resultset
       public  ResultSet consultarModalidad(int IdModalidad){
           Conexion conexion =new Conexion();
           Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select * FROM Modalidad WHERE IdModalidad=? ");
               ps.setInt(1, IdModalidad);
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
       
              //Peticion a la base de datos con sql GET nos regresa todos las modalidades   guardardadas en varibale tipo Resultset
       public  ResultSet consultarModalidades(){
           Conexion conexion =new Conexion();
           Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select * FROM Modalidad ");
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
       
       
        //Crear Modalidad con el metodo POST
        public  int CrearModalidad(String NombreModalidad){
           Conexion conexion =new Conexion();
            Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("INSERT INTO Modalidad (NombreModalidad) VALUES(?)");
               ps.setString(1,NombreModalidad);

               
               int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null," Modalidad creada correctamente");
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
       
        //Elimiar Modalidad
       public  int EliminarModalidad(int IdModalidad){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" DELETE FROM Modadidad WHERE IdModalidad=?");
                ps.setInt(1,IdModalidad);
                int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null,"Modalidad Eliminada Correctamente");
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
 
       
              //Crear Modalidad con el metodo POST
        public  int ActualizarModalidad(int IdModalidad,String NombreModalidad){
           Conexion conexion =new Conexion();
            Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("UPDATE MODALIDAD set NombreModalidad =? WHERE IdModalidad =?");
               ps.setString(1,NombreModalidad);
               ps.setInt(2, IdModalidad);
              
               int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null," Modalidad ACTUALIZADA correctamente");
                return 1;
                
               }else{
                   JOptionPane.showMessageDialog(null,"Error al Actualizar");
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
       
       
}
