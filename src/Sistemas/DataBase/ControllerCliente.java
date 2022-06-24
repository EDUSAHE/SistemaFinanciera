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
public class ControllerCliente {
           //-----------------------------------------------------------------------------METODOS-Cliente-------------------------------------------------------------------------------\\
        //Consultar todas los Clientes
        public  ResultSet consultarClientes(){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select * FROM Cliente ");
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
        
        //Consultar todas los Cliente
        public  ResultSet consultarCliente(int IdCliente){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" select * FROM Cliente WHERE IdCliente=?");
               ps.setInt(1, IdCliente);
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
       
       
        //Crear Cliente con el metodo POST
        public  int CrearCliente(String Nombre,String ApellidoP,String ApellidoM,String Direccion,String Telefono,String DireccionCliente,String Referencia){
            Conexion conexion =new Conexion();
            Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("INSERT INTO Cliente (Nombre,ApellidoP,ApellidoM,Direccion,Telefono,DireccionCliente,Referencia) VALUES(?,?,?,?,?,?,?)");
               ps.setString(1,Nombre);
               ps.setString(2,ApellidoP);
               ps.setString(3,ApellidoM);
               ps.setString(4,Direccion);
               ps.setString(5,Telefono);
               ps.setString(6,DireccionCliente);
               ps.setString(7,Referencia);
              
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
       
        //Elimina Cliente
       public  int EliminarCliente(int IdCliente){
           Conexion conexion =new Conexion();
           Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement(" DELETE FROM Cliente WHERE IdCliente=?");
                ps.setInt(1,IdCliente);
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
       
     
       //Actualizar Cliente con el metodo UPDAte
        public  int ActualizarCliente(String Nombre,String ApellidoP,String ApellidoM,String Direccion,String Telefono,String DireccionCliente,String Referencia,int IdCliente){
            Conexion conexion =new Conexion();
            Connection con =  conexion.conectar();
           ResultSet rs = null;
           try{
               //escribimos la consulta en sql
               PreparedStatement ps= con.prepareStatement("UPDATE  Cliente set Nombre=?,ApellidoP=?,ApellidoM=?,Direccion=?,Telefono=?,DireccionCliente=?,Referencia=? WHERE IdCliente =? ");
               ps.setString(1,Nombre);
               ps.setString(2,ApellidoP);
               ps.setString(3,ApellidoM);
               ps.setString(4,Direccion);
               ps.setString(5,Telefono);
               ps.setString(6,DireccionCliente);
               ps.setString(7,Referencia);
               ps.setInt(8, IdCliente);
              
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
