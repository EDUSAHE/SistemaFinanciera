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
public class ControllerPago {
    //-----------------------------------------------------------------------------METODOS-Pago-------------------------------------------------------------------------------\\
       
       //Peticion a la base de datos con sql GET nos regresa todos los Pagos  guardardo en varibale tipo Resultset
       public  ResultSet consultarPagos(){
           Conexion conexion =new Conexion();
           Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select * FROM Pago ");
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
       
      //Peticion a la base de datos con sql GET nos regresa un pago espesifico 
       public  ResultSet consultarPago(int IdPago){
           Conexion conexion =new Conexion();
           Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select * FROM Pago WHERE IdPago = ? ");
               ps.setInt(0, IdPago);
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
       
       
       
       
        //Actualizar Pago con el metodo POST
        public  int ActualizarPago(int IdPago,int IdDeudor,String Fecha,int Monto){
           Conexion conexion =new Conexion();
            Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("UPDATE  Pago SET Fecha=?,Monto=? ,IdDeudor WHERE IdPago =?");
               ps.setString(1,Fecha);
               ps.setInt(2,Monto);
               ps.setInt(3, IdDeudor);
               ps.setInt(4, IdPago);

               int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null," Pago Actualizado correctamente");
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
       
        
        //Crear Pago con el metodo POST
        public  int CrearPago(int IdDeudor,String Fecha,int Monto){
           Conexion conexion =new Conexion();
            Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("INSERT INTO Pago (IdDeudor,Fecha,Monto) VALUES(?,?,?)");
               ps.setInt(1,IdDeudor);
               ps.setString(2,Fecha);
               ps.setInt(3,Monto);

               int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null," Pago creado correctamente");
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
       
        //Elimiar Pago
       public  int EliminarPago(int IdPago){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" DELETE FROM PAgo WHERE IdPago=?");
                ps.setInt(1,IdPago);
                int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null,"Pago Eliminado Correctamente");
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
