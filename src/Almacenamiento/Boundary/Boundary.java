/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Almacenamiento.Boundary;

import Sistemas.DataBase.*;
import Almacenamiento.Entity.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author bran
 */
public class Boundary {
 //------------------------------------------------------------------------METODOS-AVAL--------------------------------------------------------------------------
    
    
    //CREA UN NUEVO AVAL  (Retorno: si  fue eliminado con exito=1  de lo contrario = 0)
    public  ResultSet InsertarAval(int IdCliente,String Nombre,String ApellidosP,String ApellidoM,String Direccion,String TelefonoCelular,String TelefonoCasa,String DireccionEmpleo,String Referencia){
                ControllerAval nuevo = new ControllerAval();
                nuevo.CrearAval(IdCliente, Nombre, ApellidosP, ApellidoM, Direccion, TelefonoCelular, TelefonoCasa, DireccionEmpleo, Referencia);
                return null;       
    }
    
    //ELIMINAR AVAL    (Retorno: si  fue eliminado con exito=1  de lo contrario = 0)
    public int EliminarAval(int idAval){
        int resultado;
        ControllerAval nuevo = new ControllerAval();
        resultado=nuevo.EliminarAval(idAval);
        
        return resultado;
    }
    
    //ACTUALIZAR AVAL   (Retorno: si  fue actualizado con exito=1  de lo contrario = 0)
    public int ActualizarAval(int IdCliente,int idAval,String Nombre,String ApellidosP,String ApellidoM,String Direccion,String TelefonoCelular,String TelefonoCasa,String DireccionEmpleo,String Referencia){
        int resultado;
        ControllerAval nuevo = new ControllerAval();
        resultado=nuevo.ActualizarAval(idAval, IdCliente, Nombre, ApellidosP, ApellidoM, Direccion, TelefonoCelular, TelefonoCasa, DireccionEmpleo, Referencia);
        return resultado;
    }
    
    //OBTER INFORMACION DE UN AVAL 
    public Aval ListOneAval(int idAval) throws SQLException{
        ResultSet AvalR;
        Aval AvalResultado = new Aval();
        ControllerAval nuevo = new ControllerAval();
        AvalR=nuevo.ConsultarAval(idAval);
        while(AvalR.next()){
             AvalResultado.setIdCliente(AvalR.getInt("IdCliente"));
              AvalResultado.setNombre(AvalR.getString("Nombre"));
              AvalResultado.setApellidosP(AvalR.getString("ApellidosP"));
              AvalResultado.setApellidoM(AvalR.getString("ApellidoM"));
              AvalResultado.setDireccion(AvalR.getString("Direccion"));
              AvalResultado.setTelefonoCelular(AvalR.getString("TelefonoCelular"));
              AvalResultado.setTelefonoCasa(AvalR.getString("TelefonoCasa"));
              AvalResultado.setDireccionEmpleo(AvalR.getString("DireccionEmpleo"));
              AvalResultado.setReferencia(AvalR.getString("Referencia"));
        }
      
        
        
        return AvalResultado;
    }
    
    //OBTENER INFORMACION DE AVALES
    public ResultSet ListAvales() throws SQLException{
        ResultSet Avales;
        ControllerAval nuevo= new ControllerAval();
        Avales= nuevo.consultarAvales();
        return Avales;
    }
   
    
    
     //------------------------------------------------------------------------METODOS-Credito--------------------------------------------------------------------------
    
    
        
    //CREA UN NUEVO Credito   (Retorno: si  fue eliminado con exito=1  de lo contrario = 0)
    public  int InsertarCredito(int IdCliente,int IdModalidad,float TotalPrestamo,float Restante){
        int resultado;
        ControllerCredito nuevo=new ControllerCredito();
        resultado=nuevo.CrearCredito(IdCliente, IdModalidad, TotalPrestamo, Restante);
         
        return resultado;       
    }
    
    //ELIMINAR Credito    (Retorno: si  fue eliminado con exito=1  de lo contrario = 0)
    public int EliminarCredito(int idCredito){
        int resultado;
        ControllerCredito nuevo= new ControllerCredito();
        resultado= nuevo.EliminarCredito(idCredito);
        return resultado;
    }
    
    //ACTUALIZAR Credito   (Retorno: si  fue actualizado con exito=1  de lo contrario = 0)
    public int ActualizarCredito(int IdCredito,int IdCliente,int IdModalidad,float TotalPrestamo,float Restante){
        int resultado;
        ControllerCredito nuevo = new ControllerCredito();
        resultado =nuevo.ActualizarCredito(IdCredito, IdCliente, IdModalidad, TotalPrestamo, Restante);
        return resultado;
    }
    
    //OBTER INFORMACION DE UN Credito 
    public Credito ListOneCredito(int idCredito) throws SQLException{
        ResultSet Deuda;
         Credito Credito = new Credito();
        ControllerCredito nuevo= new ControllerCredito();
        Deuda=nuevo.ListOneCredito(idCredito);
        while(Deuda.next()){
                          
              Credito.setIdCredito(Deuda.getInt("IdCredito"));
              Credito.setIdCliente(Deuda.getInt("IdCliente"));
              Credito.setIdModalidad(Deuda.getInt("IdModalidad"));
              Credito.setTotalPrestamo(Deuda.getFloat("TotalPrestamo"));
              Credito.setRestante(Deuda.getFloat("Restante"));
        }
        
        return Credito;
    }
    
    //OBTENER INFORMACION DE Creditos
    public ResultSet ListCreditos(){
        ResultSet Creditos;
        ControllerCredito nuevo =new ControllerCredito();
        Creditos=nuevo.ListCreditos();
        return Creditos;
    }
   
     //------------------------------------------------------------------------METODOS-Cliente--------------------------------------------------------------------------

            
    //CREA UN NUEVO Cliente   (Retorno: si  fue eliminado con exito=1  de lo contrario = 0)
    public  int InsertarCliente(String Nombre,String ApellidoP,String ApellidoM,String Direccion,String Telefono,String DireccionCliente,String Referencia){
        int resultado;
        ControllerCliente nuevo = new ControllerCliente();
        resultado = nuevo.CrearCliente(Nombre, ApellidoP, ApellidoM, Direccion, Telefono, DireccionCliente, Referencia);
        return resultado;       
    }
    
    //ELIMINAR DEUDOR    (Retorno: si  fue eliminado con exito=1  de lo contrario = 0)
    public int EliminarCliente(int idCliente){
        int resultado;
        ControllerCliente nuevo = new ControllerCliente();
       resultado = nuevo.EliminarCliente(idCliente);
        return resultado;
    }
    
    //ACTUALIZAR DEUDOR  (Retorno: si  fue actualizado con exito=1  de lo contrario = 0)
    public int ActualizarCliente(int IdCliente,String Nombre,String ApellidoP,String ApellidoM,String Direccion,String Telefono,String DireccionCliente,String Referencia){
       int resultado;
       ControllerCliente nuevo = new ControllerCliente();
       resultado = nuevo.ActualizarCliente(Nombre, ApellidoP, ApellidoM, Direccion, Telefono, DireccionCliente, Referencia, IdCliente);
        return resultado;
    }
    
    //OBTER INFORMACION DE UN DEUDOR 
    public Cliente ListOneCliente(int idCliente) throws SQLException{
       ControllerCliente nuevo = new ControllerCliente();
       Cliente ClienteR = new Cliente();
       ResultSet Deudor;
       Deudor = nuevo.consultarCliente(idCliente);
           while(Deudor.next()){
              ClienteR.setNombre(Deudor.getString("Nombre"));
              ClienteR.setApellidoP(Deudor.getString("ApellidoP"));
              ClienteR.setApellidoM(Deudor.getString("ApellidoM"));
              ClienteR.setDireccion(Deudor.getString("Direccion"));
              ClienteR.setTelefono(Deudor.getString("Telefono"));
              ClienteR.setDireccionEmpleado(Deudor.getString("DireccionEmpleado"));
              ClienteR.setReferencia(Deudor.getString("Referencia"));
              

        }
       
        return ClienteR;
    }
    
    //OBTENER INFORMACION DE DEUDORES
    public ResultSet ListClientes(){
        ResultSet ClienteR;
        ControllerCliente nuevo = new ControllerCliente();
        ClienteR = nuevo.consultarClientes();
        return ClienteR;
    }
    
 //------------------------------------------------------------------------METODOS-MODALIDAD--------------------------------------------------------------------------
 
                
    //CREA UN NUEVO Modalidad   (Retorno: si  fue eliminado con exito=1  de lo contrario = 0)
    public  int InsertarModalidad(String NombreModalidad){
        int resultado;
       ControllerModalidad nuevo = new ControllerModalidad();
       resultado = nuevo.CrearModalidad(NombreModalidad);
        return resultado;       
    }
    
    //ELIMINAR Modalidad    (Retorno: si  fue eliminado con exito=1  de lo contrario = 0)
    public int EliminarModalidad(int IdModalidad){
        int resultado;
        ControllerModalidad nuevo = new ControllerModalidad();
        resultado = nuevo.EliminarModalidad(IdModalidad);
        return resultado;
    }
    
    //ACTUALIZAR Modalidad  (Retorno: si  fue actualizado con exito=1  de lo contrario = 0)
    public int ActualizarModalidad(int IdModalidad,String NombreModalidad){
       int resultado;
       ControllerModalidad nuevo = new ControllerModalidad();
       resultado = nuevo.ActualizarModalidad(IdModalidad, NombreModalidad);
        return resultado;
    }
    
    //OBTER INFORMACION DE UN Modalidad 
    public Modalidad ListOneModalidad(int idModalidad) throws SQLException{
       ResultSet Modalidad;
       Modalidad ModalidadR = new Modalidad();
       ControllerModalidad nuevo = new ControllerModalidad();
       Modalidad = nuevo.consultarModalidad(idModalidad);
       
       while(Modalidad.next()){
            ModalidadR.setModalidad(Modalidad.getString("NombreModalidad"));
       }
       
        return ModalidadR;
    }
    
    //OBTENER INFORMACION DE Modalidades
    public ResultSet ListModalidades(){
       ResultSet Modalidades;
       ControllerModalidad nuevo = new ControllerModalidad();
       Modalidades = nuevo.consultarModalidades();
        return Modalidades;
    }
    
    
     //------------------------------------------------------------------------METODOS-MULTA--------------------------------------------------------------------------
                
    //CREA UNA NUEVA MULTA   (Retorno: si  fue eliminado con exito=1  de lo contrario = 0)
    public  int InsertarMulta(int IdCliente,String Fecha,int Monto){
        int resultado;
        ControllerMulta nuevo = new ControllerMulta();
        resultado = nuevo.CrearMulta(IdCliente, Fecha, Monto);
        return resultado;       
    }
    
    //ELIMINAR MULTA    (Retorno: si  fue eliminado con exito=1  de lo contrario = 0)
    public int EliminarMunlta(int IdMulta){
        int resultado;
        ControllerMulta nuevo = new ControllerMulta();
        resultado = nuevo.EliminarMulta(IdMulta);
        return resultado;
    }
    
    //ACTUALIZAR MULTA  (Retorno: si  fue actualizado con exito=1  de lo contrario = 0)
    public int ActualizarMulta(int IdCliente,int IdMulta,String Fecha,int Monto){
        int resultado;
        ControllerMulta nuevo = new ControllerMulta();
        resultado = nuevo.ActualizarMulta(IdMulta, IdCliente, Fecha, Monto);
        return resultado;
    }
    
    //OBTER INFORMACION DE UNA MULTA 
    public Multa ListOneMulta(int IdMulta) throws SQLException{
       ResultSet Multa;
       Multa MultaR = new Multa();
       ControllerMulta nuevo = new ControllerMulta();
       Multa = nuevo.consultarMulta(IdMulta);
       
       while(Multa.next()){
           MultaR.setFecha(Multa.getString("Fecha"));
           MultaR.setMonto(Multa.getFloat("Monto"));
       
       }
        return MultaR;
    }
    
    //OBTENER INFORMACION DE MULTAS
    public ResultSet ListMultas(){
       ResultSet Multas;
       ControllerMulta nuevo = new ControllerMulta();
       Multas = nuevo.consultarMultas();
        return Multas;
    }
    
    
    //------------------------------------------------------------------------METODOS-PAGO--------------------------------------------------------------------------
    
    //CREA UN NUEVO PAGO  (Retorno: si  fue eliminado con exito=1  de lo contrario = 0)
    public  int InsertarPago(int IdCliente,String Fecha,int Monto){
        int resultado;
        ControllerPago nuevo =new ControllerPago();
        resultado = nuevo.CrearPago(IdCliente, Fecha, Monto);
        return resultado;       
    }
    
    //ELIMINAR PAGO    (Retorno: si  fue eliminado con exito=1  de lo contrario = 0)
    public int EliminarPago(int IdPago){
        int resultado;
       ControllerPago nuevo = new ControllerPago();
       resultado = nuevo.EliminarPago(IdPago);        
        return resultado;
    }
    
    //ACTUALIZAR PAGO  (Retorno: si  fue actualizado con exito=1  de lo contrario = 0)
    public int ActualizarPago(int IdCliente,int IdPago,String Fecha,int Monto){
        int resultado;
        ControllerPago nuevo = new ControllerPago();
        resultado = nuevo.ActualizarPago(IdPago, IdCliente, Fecha, Monto);
        return resultado;
    }
    
    //OBTER INFORMACION DE UN PAGO  
    public Pago ListOnePago(int IdPago) throws SQLException{
        ResultSet Pago;
        Pago PagoR = new Pago();
        ControllerPago nuevo = new ControllerPago();
        Pago =nuevo.consultarPagos();
         
        while(Pago.next()){
            PagoR.setIdCliente(Pago.getInt("IdCliente"));
            PagoR.setFecha(Pago.getString("Fecha"));
            PagoR.setMonto(Pago.getInt("Pago"));
        }
        return PagoR;
    }
    
    //OBTENER INFORMACION DE PAGOS
    public ResultSet ListPagos(){
       ResultSet Pagos;
       ControllerPago nuevo = new ControllerPago();
       Pagos=nuevo.consultarPagos();
        return Pagos;
    }
    
    
     //------------------------------------------------------------------------METODOS-TIPOUSUARIO--------------------------------------------------------------------------
      //CREA UN NUEVO TIPOUSUARIO  (Retorno: si  fue eliminado con exito=1  de lo contrario = 0)
    public  int InsertarTipoUsuario(String NombreTipo){
        int resultado;
       ControllerTipoUsuario nuevo = new ControllerTipoUsuario();
       resultado = nuevo.CrearTipoUsuario(NombreTipo);
        return resultado;       
    }
    
    //ELIMINAR TIPOUSUARIO    (Retorno: si  fue eliminado con exito=1  de lo contrario = 0)
    public int EliminarTipoUsuario(int IdTipoUsuario){
        int resultado;
        ControllerTipoUsuario nuevo = new ControllerTipoUsuario();
        resultado = nuevo.EliminarTipoUsuario(IdTipoUsuario);
        return resultado;
    }
    
    //ACTUALIZAR TIPOUSUARIO  (Retorno: si  fue actualizado con exito=1  de lo contrario = 0)
    public int ActualizarTipoUsuario(int IdTipoUsuario,String NombreTipo){
        int resultado;
        ControllerTipoUsuario nuevo = new ControllerTipoUsuario();
        resultado = nuevo.ActualizarTipoUsuario(IdTipoUsuario, NombreTipo);
        return resultado;
    }
    
    //OBTER INFORMACION DE UN TIPOUSUARIO  
    public TipoUsuario ListOneTipoUsuario(int IdTipoUsuario) throws SQLException{
        ResultSet TipoUsuario;
        TipoUsuario TipoUsuarioR = new TipoUsuario();
        ControllerTipoUsuario nuevo = new ControllerTipoUsuario();
        TipoUsuario = nuevo.consultarTipoUsuarios(IdTipoUsuario);
        
        
        while(TipoUsuario.next()){
            TipoUsuarioR.setNombreTipo(TipoUsuario.getString("NombreTipo"));
        }
      
      
      
        return TipoUsuarioR;
    }
    
    //OBTENER INFORMACION DE TODOS LOS TIPOUSUARIO
    public ResultSet ListTipoUsuario(){
       ResultSet TipoUsuarios;
       ControllerTipoUsuario nuevo = new ControllerTipoUsuario();
       TipoUsuarios = nuevo.consultarTipoUsuario();
       
       
        return TipoUsuarios;
    }
    
    
       //------------------------------------------------------------------------METODOS-USUARIO--------------------------------------------------------------------------
      //CREA UN NUEVO USUARIO  (Retorno: si  fue eliminado con exito=1  de lo contrario = 0)
    public  int InsertarUsuario(Usuario nuevoUsuario){
        int resultado;
       ControllerUsuario nuevo = new ControllerUsuario();
       resultado = nuevo.CrearUsuario(nuevoUsuario.getIdTIpoUsuario(), nuevoUsuario.getNombre(), nuevoUsuario.getApellidoP(), nuevoUsuario.getApellidoM(), nuevoUsuario.getUsuario(), nuevoUsuario.getPassword(), nuevoUsuario.getHorario());
        return resultado;       
    }
    
    //ELIMINAR USUARIO    (Retorno: si  fue eliminado con exito=1  de lo contrario = 0)
    public int EliminarUsuario(int IdUsuario){
        int resultado;
        ControllerUsuario nuevo = new ControllerUsuario();
        resultado = nuevo.EliminarUsuario(IdUsuario);
        return resultado;
    }
    
    //ACTUALIZAR USUARIO  (Retorno: si  fue actualizado con exito=1  de lo contrario = 0)
    public int ActualizarUsuario(int IdUsuario,int IdTIpoUsuario,String Nombre,String ApellidoP,String ApellidoM,String Usuario,String Password,String Horario){
        int resultado;
        ControllerUsuario nuevo = new ControllerUsuario();
        resultado = nuevo.ActualizarUsuario(IdUsuario, IdTIpoUsuario, Nombre, ApellidoP, ApellidoM, Usuario, Password, Horario);
        return resultado;
    }
    
    //OBTER INFORMACION DE UN USUARIO  
    public Usuario ListOneUsuario(int IdUsuario) throws SQLException{
        ResultSet Usuario;
        Usuario UsuarioR = new Usuario();
        ControllerUsuario nuevo = new ControllerUsuario();
        Usuario = nuevo.consultarUsuario(IdUsuario);
        
        while(Usuario.next()){
            UsuarioR.setNombre(Usuario.getString("Nombre"));
            UsuarioR.setApellidoP(Usuario.getString("ApellidoP"));
            UsuarioR.setUsuario(Usuario.getString("Usuario"));   
            UsuarioR.setHorario(Usuario.getString("Horario"));
            
        }
      
      return UsuarioR;
    }
    
    //OBTENER INFORMACION DE TODOS LOS USUARIO
    public ResultSet ListUsuario(){
       ResultSet Usuario;
       ControllerUsuario nuevo = new ControllerUsuario();
       Usuario = nuevo.consultarUsuarios();
        return Usuario;
    }
    
    //Verificar si existe el usuario en la base de datos con su  Usuario, Password (si esiste re regresa el id, de lo contrario retorna un -1)
    public int Login(String Usuario,String Password){
        int resultado;
        ControllerUsuario nuevo = new ControllerUsuario();
        resultado = nuevo.login(Usuario, Password);
        return resultado;
    }
    
    
    public static void main(String[] args) throws SQLException {
        Boundary nuevo= new Boundary();
        ResultSet respuesta;
       
        //LOGIN
            //int id= nuevo.Login("brandon@gmail.com", "brandon");
            //System.out.println(id);
        //CREAR 
            //nuevo.InsertarAval("brandonAval2", "A22val", "Aval", "Aval", "Aval", "Aval", "Aval", "Aval");
           // nuevo.InsertarDeuda(0, 0, 0, 0, 0);
            //nuevo.InsertarDeuda(0, 0, 0, 0, 0);
            //nuevo.InsertarDeudor(0, 0, "brandonDeudor", "Deudor", "Deudor", "Deudor", "Deudor", "Deudor", "Deudor");
            //nuevo.InsertarModalidad("Modalidad");
            //nuevo.InsertarMulta("12/10/12", 2);
            //nuevo.InsertarPago("12/4", 3);
            //nuevo.InsertarTipoUsuario("TipoUsuario");
            //Usuario nuevoUsuario = new Usuario();
            //nuevoUsuario.setNombre("Brandon");
            //nuevoUsuario.setApellidoP("Ortiz");
            //nuevoUsuario.setApellidoM("Rojas");
            //nuevoUsuario.setUsuario("brandon@gmail.com");
            //nuevoUsuario.setPassword("brandon");
           // nuevoUsuario.setHorario("5:00am-5:00pm");
            //nuevoUsuario.setIdTIpoUsuario(0);
            
            //nuevo.InsertarUsuario(nuevoUsuario);
        //ACTUALIZAR
            //nuevo.ActualizarAval(0, "ActualizarAval", "", "", "", "", "", "", "");
            //nuevo.ActualizarDeuda(3, 1, 1, 1, 1, 1);
            //nuevo.ActualizarDeudor(0, 0, 0, "ActualizarDeudor", "", "", "", "", "", "");
            //nuevo.ActualizarModalidad(0, "ActualizarNormbreNodalidad");
            // nuevo.ActualizarMulta(0, "Actualizada", 100);
            //nuevo.ActualizarPago(0, "ActualizaPago", 100);
            //nuevo.ActualizarTipoUsuario(0, "NombrewTipoActualizado");
           // nuevo.ActualizarUsuario(0, 0, "brandon", "Ortiz", "Rojas", "brandon@gmail.com", "brandon","8:00am-5:00pm");
        //LISTAR LISTONE
            //USUARIO
                //Usuario UsuarioRespuesta= new Usuario();
                //UsuarioRespuesta = nuevo.ListOneUsuario(0);
                //System.out.println(UsuarioRespuesta.getNombre());
                //System.out.println(UsuarioRespuesta.getApellidoP());
                //System.out.println(UsuarioRespuesta.getUsuario());
               // System.out.println(UsuarioRespuesta.getHorario());
            //AVALES
               // Aval AvalRespuesta= new Aval();
               // AvalRespuesta = nuevo.ListOneAval(2);
                //System.out.println(AvalRespuesta.getNombre());
                //System.out.println(AvalRespuesta.getApellidosP());
                //System.out.println(AvalRespuesta.getApellidoM());
                //System.out.println(AvalRespuesta.getDireccion());
                //System.out.println(AvalRespuesta.getTelefonoCelular());
                //System.out.println(AvalRespuesta.getTelefonoCasa());
                //System.out.println(AvalRespuesta.getDireccionEmpleo());
                //System.out.println(AvalRespuesta.getReferencia());
            //DEUDA
                //Deuda DeudaRespuesta = new Deuda();
                //DeudaRespuesta =nuevo.ListOneDeuda(0);
                //System.out.println(DeudaRespuesta.getIdmulta());
                //System.out.println(DeudaRespuesta.getIdPago());
                //System.out.println(DeudaRespuesta.getIdModalidad());
                //System.out.println(DeudaRespuesta.getTotalPrestamo());
                //System.out.println(DeudaRespuesta.getRestante());
            //DEDUDOR
                //Deudor DeudaRespuesta = new Deudor();
                //DeudaRespuesta =nuevo.ListOneDeudor(0);
                //System.out.println(DeudaRespuesta.getIdAval());
                //System.out.println(DeudaRespuesta.getIdDeuda());
                //System.out.println(DeudaRespuesta.getNombre());
                //System.out.println(DeudaRespuesta.getApellidoP());
                
            //MODALIDAD
                //Modalidad ModalidadR = new Modalidad();
                //ModalidadR = nuevo.ListOneModalidad(0);
                //System.out.println(ModalidadR.getModalidad());
             
            //MULTA 
                    //Multa MultaR = new Multa();
                    //MultaR = nuevo.ListOneMulta(0);
                    //System.out.println(MultaR.getFecha());
                    //System.out.println(MultaR.getMonto());
            
         //LISTAR TODOS
            //AVALES
                //ResultSet AvalRespuesta;
                //AvalRespuesta = nuevo.ListAvales();
                //while(AvalRespuesta.next()){
                    //System.out.println(AvalRespuesta.getString("Nombre"));
                    //System.out.println(AvalRespuesta.getString("ApellidosP"));
                    //System.out.println(AvalRespuesta.getString("ApellidoM"));
                    //System.out.println(AvalRespuesta.getString("Direccion"));
                    //System.out.println(AvalRespuesta.getString("TelefonoCelular"));
                    //System.out.println(AvalRespuesta.getString("TelefonoCasa"));
                    //System.out.println(AvalRespuesta.getString("DireccionEmpleo"));
                    //System.out.println(AvalRespuesta.getString("Referencia"));   
                //}
             //DEUDAS
                //ResultSet DeudaRespuesta;
                //DeudaRespuesta =nuevo.ListDeudas();
                //while(DeudaRespuesta.next()){
                    //System.out.println(DeudaRespuesta.getString("Idmulta"));
                    //System.out.println(DeudaRespuesta.getString("IdPago"));
                    //System.out.println(DeudaRespuesta.getString("IdModalidad"));
                    //System.out.println(DeudaRespuesta.getString("TotalPrestamo"));
                    //System.out.println(DeudaRespuesta.getString("Restante"));  
                //}
           
            

            
    
      
         
       
     
        
     
        
    }
    
}
