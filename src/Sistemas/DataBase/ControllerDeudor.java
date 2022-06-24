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
public class ControllerDeudor {
           //-----------------------------------------------------------------------------METODOS-Deudor-------------------------------------------------------------------------------\\
        //Consultar todas los Deudores
        public  ResultSet consultarDeudores(){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select * FROM DEUDOR ");
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
        
        //Consultar todas los Deudor
        public  ResultSet consultarDeudor(int IdDeudor){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select * FROM DEUDOR WHERE IdDeudor=?");
               ps.setInt(1, IdDeudor);
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
       
       
        //Crear Deudor con el metodo POST
        public  int CrearDeudor(String Nombre,String ApellidoP,String ApellidoM,String Direccion,String Telefono,String DireccionEmpleado,String Referencia){
            Conexion conexion =new Conexion();
            Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("INSERT INTO DEUDOR (Nombre,ApellidoP,ApellidoM,Direccion,Telefono,DireccionEmpleado,Referencia) VALUES(?,?,?,?,?,?,?)");
               ps.setString(1,Nombre);
               ps.setString(2,ApellidoP);
               ps.setString(3,ApellidoM);
               ps.setString(4,Direccion);
               ps.setString(5,Telefono);
               ps.setString(6,DireccionEmpleado);
               ps.setString(6,Referencia);
              
               int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null," Deudor creado correctamente");
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
       
        //Elimina Deudor
       public  int EliminarDeudor(int IdDeudor){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" DELETE FROM DEUDOR WHERE IdDeudor=?");
                ps.setInt(1,IdDeudor);
                int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null,"Deudor Eliminada Correctamente");
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
       
     
       //Actualizar Deudor con el metodo UPDAte
        public  int ActualizarDeudor(String Nombre,String ApellidoP,String ApellidoM,String Direccion,String Telefono,String DireccionEmpleado,String Referencia,int IdDeudor){
            Conexion conexion =new Conexion();
            Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("UPDATE  DEUDOR set Nombre=?,ApellidoP=?,ApellidoM=?,Direccion=?,Telefono=?,DireccionEmpleado=?,Referencia=? WHERE IdDeudor =? ");
               ps.setString(1,Nombre);
               ps.setString(2,ApellidoP);
               ps.setString(3,ApellidoM);
               ps.setString(4,Direccion);
               ps.setString(5,Telefono);
               ps.setString(6,DireccionEmpleado);
               ps.setString(7,Referencia);
               ps.setInt(8, IdDeudor);
              
               int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null," Deudor Actualizado correctamente");
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
