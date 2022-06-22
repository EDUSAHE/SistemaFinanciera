/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemas.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author bran
 */
public class ControllerAval {
    
//-----------------------------------------------------------------------------METODOS-Aval-------------------------------------------------------------------------------\\
       
       //Peticion a la base de datos con sql GET nos regresa todos los avales  guardar en varibale tipo Resultset
       public  ResultSet consultarAvales(){
           Conexion conexion =new Conexion();
           Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select * FROM AVAL ");
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
       
       
        //consultar un solo aval con id
       public  ResultSet ConsultarAval(int IdAval) throws SQLException{
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("SELECT * FROM Aval where IdAval=?");
                ps.setInt(1,IdAval);
                 rs=ps.executeQuery();
                 
                 
           }catch(Exception ex){
               
               System.err.println("Error "+ex);
               
           }finally{
                try{
                    con.close();
                }catch(Exception ex){
                    
                }
               
           }
            return rs;
       }
       
       
       
        //Crear Aval con el metodo POST
        public  ResultSet CrearAval(String Nombre,String ApellidosP,String ApellidoM,String Direccion,String TelefonoCelular,String TelefonoCasa,String DireccionEmpleo,String Referencia){
           Conexion conexion =new Conexion();
            Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("INSERT INTO AVAL (Nombre,ApellidosP,ApellidoM,Direccion,TelefonoCelular,TelefonoCasa,DireccionEmpleo,Referencia) VALUES(?,?,?,?,?,?,?,?)");
               ps.setString(1,Nombre);
               ps.setString(2,ApellidosP);
               ps.setString(3,ApellidoM);
               ps.setString(4,Direccion);
               ps.setString(5,TelefonoCelular);
               ps.setString(6,TelefonoCasa);
               ps.setString(7,DireccionEmpleo);
               ps.setString(8,Referencia);
               
               int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null," Aval creado correctamente");
                
               }else{
                   JOptionPane.showMessageDialog(null,"Error al crear");
               }
 
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
       
        
        
        //Actualizar Aval con el metodo POST
        public  int ActualizarAval(int IdAval,String Nombre,String ApellidosP,String ApellidoM,String Direccion,String TelefonoCelular,String TelefonoCasa,String DireccionEmpleo,String Referencia){
           Conexion conexion =new Conexion();
            Connection con = conexion.conectar();
           
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("UPDATE Aval SET Nombre=?,ApellidosP=?,ApellidoM=?,Direccion=?,TelefonoCelular=?,TelefonoCasa=?,DireccionEmpleo=?,Referencia=?  WHERE IdAval=?");
     
               ps.setString(1,Nombre);
               ps.setString(2,ApellidosP);
               ps.setString(3,ApellidoM);
               ps.setString(4,Direccion);
               ps.setString(5,TelefonoCelular);
               ps.setString(6,TelefonoCasa);
               ps.setString(7,DireccionEmpleo);
               ps.setString(8,Referencia);
               ps.setInt(9,IdAval);
               
               int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null," Aval Actualizado correctamente");
                return 1;
               }else{
                   JOptionPane.showMessageDialog(null,"Error al actualizar");
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
       
       
        //Elimiar Aval
         public  int EliminarAval(int IdAval){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" DELETE FROM Aval WHERE IdAval=?");
                ps.setInt(1,IdAval);
                int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null,"Aval Eliminado Correctamente");
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
            return 1;
       }
    
    
}
