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
public class ControllerCredito {
           //-----------------------------------------------------------------------------METODOS-Credito-------------------------------------------------------------------------------\\
       
       //consultar un solo Credito con id
       public  ResultSet ListOneCredito(int IdCredito){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" SELECT * FROM Credito WHERE IdCredito=?");
                ps.setInt(1,IdCredito);
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
       
       //lista Creditos de un cliente 
       
       public ResultSet ListCreditosByCliente(int IdCliente){
               Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" SELECT * FROM Credito WHERE IdCliente=?");
                ps.setInt(1,IdCliente);
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

        //Consultar todas las Creditos
        public  ResultSet ListCreditos(){
           Conexion conexion =new Conexion();
           Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select * FROM Credito ");
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
       
       //Crear Credito con el metodo POST
        public  int CrearCredito(int IdCliente,int IdModalidad,float TotalPrestamo,float Restante){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("INSERT INTO Credito (IdCliente,IdModalidad,TotalPrestamo,Restante) VALUES(?,?,?,?)");
               ps.setFloat(1,IdCliente);
               ps.setFloat(2,IdModalidad);
               ps.setFloat(3,TotalPrestamo);
               ps.setFloat(4,Restante);
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
      
        

        //Elimina Credito
       public  int EliminarCredito(int IdCredito){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" DELETE FROM Credito WHERE IdCredito=?");
                ps.setInt(1,IdCredito);
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
       
       
       //Actualizar Credito con el metodo Update
        public  int ActualizarCredito(int IdCredito,int IdCliente,int IdModalidad,float TotalPrestamo,float Restante){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("UPDATE Credito SET IdCliente=?,IdModalidad=?,TotalPrestamo =?,Restante =?  WHERE IdCredito=?");
                ps.setInt(1,IdCliente);
               ps.setInt(2,IdModalidad);
               ps.setFloat(3,TotalPrestamo);
               ps.setFloat(4,Restante);
               ps.setInt(5, IdCredito);
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
      
       
}
