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
public class ControllerDeuda {
           //-----------------------------------------------------------------------------METODOS-Deuda-------------------------------------------------------------------------------\\
       
       //consultar un solo Deuda con id
       public  ResultSet ListOneDeuda(int IdDeuda){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" SELECT * FROM Deuda WHERE IdDeuda=?");
                ps.setInt(1,IdDeuda);
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
       
       

        //Consultar todas las deudas
        public  ResultSet ListDeudas(){
           Conexion conexion =new Conexion();
           Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select * FROM DEUDA ");
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
       
       //Crear Deuda con el metodo POST
        public  int CrearDeuda(int IdDeudor,int IdModalidad,float TotalPrestamo,float Restante){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("INSERT INTO DEUDA (IdDeudor,IdModalidad,TotalPrestamo,Restante) VALUES(?,?,?,?)");
               ps.setFloat(1,IdDeudor);
               ps.setFloat(2,IdModalidad);
               ps.setFloat(3,TotalPrestamo);
               ps.setFloat(4,Restante);
               int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null," Deuda creada correctamente");
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
      
        

        //Elimina deuda
       public  int EliminarDeuda(int IdDeuda){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" DELETE FROM DEUDA WHERE IdDeuda=?");
                ps.setInt(1,IdDeuda);
                int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null,"Deuda Eliminada Correctamente");
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
       
       
       //Actualizar Deuda con el metodo Update
        public  int ActualizarDeuda(int IdDeuda,int IdDeudor,int IdModalidad,float TotalPrestamo,float Restante){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("UPDATE DEUDA SET IdDeudor=?,IdModalidad=?,TotalPrestamo =?,Restante =?  WHERE IdDeuda=?");
                ps.setInt(1,IdDeudor);
               ps.setInt(2,IdModalidad);
               ps.setFloat(3,TotalPrestamo);
               ps.setFloat(4,Restante);
               ps.setInt(5, IdDeuda);
               int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null," Deuda Actualizada correctamente");
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
