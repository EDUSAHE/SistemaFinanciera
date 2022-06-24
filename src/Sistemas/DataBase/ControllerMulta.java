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
public class ControllerMulta {
    //-----------------------------------------------------------------------------METODOS-Multa-------------------------------------------------------------------------------\\
       
       //Peticion a la base de datos con sql GET nos regresa todos las Multas  guardar en varibale tipo Resultset
       public  ResultSet consultarMultas(){
           Conexion conexion =new Conexion();
           Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select * FROM Multa ");
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
             //Peticion a la base de datos con sql GET nos regresa todos las Multas  guardar en varibale tipo Resultset
       public  ResultSet consultarMulta(int IdMulta){
           Conexion conexion =new Conexion();
           Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select * FROM Multa WHERE IdMulta=? ");
               ps.setInt(1, IdMulta);
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
       
       
        //Crear Multa con el metodo POST
        public  int CrearMulta(int IdCliente,String Fecha,int Monto){
           Conexion conexion =new Conexion();
            Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("INSERT INTO Multa (Fecha,Monto,IdCliente) VALUES(?,?,?)");
               ps.setString(1,Fecha);
               ps.setInt(2, Monto);
               ps.setInt(3, IdCliente);
      
               
               int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null," Multa creado correctamente");
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
       
        //Elimiar Multa
       public  int EliminarMulta(int IdMulta){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" DELETE FROM Multa WHERE IdMulta=?");
                ps.setInt(1,IdMulta);
                int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null,"Multa Eliminada Correctamente");
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
 
       
       //Actualiza Multa con el metodo Update
        public  int ActualizarMulta(int IdMulta,int IdCliente,String Fecha,int Monto){
           Conexion conexion =new Conexion();
            Connection con = conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("UPDATE  Multa SET Fecha=?,Monto=?,IdCliente=? WHERE IdMulta=?");
               ps.setString(1,Fecha);
               ps.setInt(2,Monto);
               ps.setInt(3,IdCliente);
               ps.setInt(4, IdMulta);
      
               
               int res=ps.executeUpdate();
               
               if(res> 0){
                  
                JOptionPane.showMessageDialog(null," Multa ACTUALIZADA correctamente");
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
       
}
