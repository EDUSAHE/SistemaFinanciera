/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemas.DataBase;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *jdbc:hsqldb:C:\Users\bran\Documents\UTM\Finanaciera\Basededatos [financiera on PUBLIC]
 * @author bran
 */
public class Conexion {
       //hacemos la coneccion a la base de datos.
       public Connection conectar(){
            Connection con=null;
            try{
                Class.forName("org.hsqldb.jdbcDriver");
                con = DriverManager.getConnection("jdbc:hsqldb:file:C:\\Users\\bran\\Documents\\ProyectoPrestamil\\SistemaFinanciera\\serverv2\\BDv2","Financiera","");
                System.out.println("En linea");
            }catch(Exception ex){
                System.out.println("Fuera de linea"+ex);
            }
            return con;     
        }

       
       //Inicializamos la conexion con la base de datos
       public static void main(String[] args){
            Conexion con =new Conexion();
            con.conectar();
            
          
       }
}
