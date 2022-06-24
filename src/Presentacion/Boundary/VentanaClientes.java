/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.Boundary;

import Almacenamiento.Entity.Usuario;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import ReglasNegocio.Control.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nobls
 */
public class VentanaClientes extends javax.swing.JFrame {
    private final JFrame estaVentana = this;
    private GridBagConstraints gbc = new GridBagConstraints();
    private Usuario usuarioTemp = new Usuario();
    private int contador = 0;
    ControlClientes API = new ControlClientes();
    /**
     * Creates new form VentanaClientes
     */
    public VentanaClientes() throws SQLException {
        super("Clientes");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        usuarioTemp.setNombre("Prueba");
        usuarioTemp.setApellidoP("Apellido");
        usuarioTemp.setApellidoM("Materno");
        usuarioTemp.setHorario("horarioTemp");
        MostrarListadoClientes();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoEmpresa = new javax.swing.JLabel();
        botonNuevoCliente = new javax.swing.JButton();
        labelClientes = new javax.swing.JLabel();
        panelClientes = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        logoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prestamilIcono.png"))); // NOI18N

        botonNuevoCliente.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        botonNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NuevoCliente.png"))); // NOI18N
        botonNuevoCliente.setText("Agregar Cliente");
        botonNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoClienteActionPerformed(evt);
            }
        });

        labelClientes.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        labelClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelClientes.setText("Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(panelClientes))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addComponent(labelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(botonNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(labelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonNuevoCliente)
                            .addComponent(logoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoClienteActionPerformed
        //Manda a llamar el formulario de nuevo cliente
        MostrarFormularioVacioCliente();
    }//GEN-LAST:event_botonNuevoClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaClientes();
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaClientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
   private JPanel CreaPanelInformacion(ResultSet clientes) throws SQLException{
        JPanel resultado = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        JTextArea textPanel = null;
        ImageIcon iconoEditar, iconoEliminar;
        JButton botonEditar = null, botonEliminar = null;
        String tempStr = "";
        int IdCliente =clientes.getInt("IdCliente");
        String Nombre = clientes.getString("Nombre");
        String ApellidoP =clientes.getString("ApellidoP");
        String ApellidoM = clientes.getString("ApellidoM");
        String Direccion = clientes.getString("Direccion");
        String Telefono = clientes.getString("Telefono");
        String Referencia = clientes.getString("Referencia");
    // System.out.println(IdCliente);
        
        
        //Creamos el texto que tendra el textArea
        tempStr += "Nombre(s): " + clientes.getString("Nombre") + "\n";
        tempStr += "Apellido Pat. : " + clientes.getString("ApellidoP") + "\n";
        tempStr += "Apellido Mat. : " + clientes.getString("ApellidoM") + "\n";
        tempStr += "Numero de telefono: " + clientes.getString("Telefono")+ "\n";
        
        
        
        
        
        
        
        
        //Creamos los iconos y reescalamos
        iconoEditar = new ImageIcon("/Imagenes/Editar.png");
        Image imageEditar = iconoEditar.getImage();
        Image editarEscalado = imageEditar.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);

        iconoEliminar = new ImageIcon("/Imagenes/Eliminar.png");
        Image imageEliminar = iconoEliminar.getImage();
        Image eliminarEscalado = imageEliminar.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
        
        iconoEditar = new ImageIcon(editarEscalado);
        iconoEliminar = new ImageIcon(eliminarEscalado);
        
        //Creamos los botones
        botonEditar = new JButton("Editar",iconoEditar);
        botonEliminar = new JButton("Eliminar",iconoEliminar);

        //Dimensiones de los botones
        botonEditar.setSize(new Dimension(120,120));
        botonEliminar.setSize(new Dimension(120,120));

        //Creamos el TextArea
        textPanel = new JTextArea(tempStr);
        textPanel.setEditable(false);
        textPanel.setSize(new Dimension(200,150));
        
        
        
        //Acciones Botones
       
        
        
        botonEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev){
                //Si le da click a editar mandaremos a llamar el metodo de editar
                //BRANDON Mandar a llamar el formulario pasale id como segundo parametro y ahi dentro del metodo busca al empleado  
                MostrarFormularioCliente(IdCliente, Nombre,ApellidoP ,ApellidoM,Direccion, Telefono,Referencia);
            }
        });

       
        
        
        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev){
               
                    /*Eliminamos de la base de datos*/
                    //BRANDON: Eliminar de la base
                    //int idCliente=clientes.getInt("IdCliente");
                     EliminarCliente();
                     int resultado;
                      
                    resultado=API.deleteCliente(IdCliente);
                    if(resultado==1){
                        
                             //PONER UNA ALERTA DE ELIMINADO CORRECTAMENTE y actualizar el listado 

                        
                    }else{
                        //PONER UNA ALERTA DE ELIMINACIONFALLIDAT
                    }
                   
                    //Se cierra la ventana
                    estaVentana.dispose();
               
            }
        });
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //Añadimos al panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.gridwidth = 2;
        gbc.weightx = 0.7;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        
        //Añadimos el panel
        resultado.add(textPanel,gbc);

        //Default gbc
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;
    
        //Añadimos los botones
        gbc.gridx = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weighty = 1.0;
        gbc.weightx = .1;
        gbc.fill = GridBagConstraints.BOTH;

        resultado.add(botonEditar,gbc);

        //Default  
        gbc.fill = GridBagConstraints.NONE;

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;

        resultado.add(botonEliminar,gbc);

        //Default
        gbc.weighty = 0.0;
        return resultado;
    }
    
    private void MostrarListadoClientes() throws SQLException{
        initComponents();
         ResultSet clientes;
        clientes = API.obtenerTodosClientes();
        
        JPanel pruebaPanel = new JPanel(new GridBagLayout());
        
        while(clientes.next()){
        pruebaPanel = AgregarNuevoPanel(pruebaPanel,clientes);
        }
        pruebaPanel.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me){
                //Mandamos a llamar a una ventana Aval
                new VentanaAval();
            }
        });
        pruebaPanel.updateUI();
        panelClientes.setViewportView(pruebaPanel);
        panelClientes.updateUI();
    }
    
    private JPanel AgregarNuevoPanel(JPanel panelRetorno, ResultSet clientes) throws SQLException{
        //Para agregar un nuevo usaremos una variable contador para las columnas asi sera reactivo
        // La columna de las y en la variable gbc son los renglones
        gbc.gridx = 0;
        gbc.gridy = contador;
        
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        contador++;
        //Agregamos el el String de Clientes 
        
       
        
        
        
        
        panelRetorno.add(CreaPanelInformacion(clientes),gbc);
        
        //Regresamos as los valores default para el siguiente
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        return panelRetorno;
    }
    
    private void MostrarFormularioVacioCliente(){
        JDialog modalCliente = new JDialog();
        //Va a devolver un tipo de clase para la base de datos por lo mientras lo dejare en void
        JTextField nombreCliente, apellidoMat, apellidoPat, direccion, telefono, referencia;
        JLabel nombreLabel, apellidoMatLabel, apellidoPatLabel, direccionLabel, telefonoLabel, referenciaLabel;
        JButton subirCliente;
        ImageIcon iconoBotonSubir;

        // Propiedades de la ventana
        modalCliente.setTitle("Nuevo Cliente");
	modalCliente.setSize(1002, 680);
	modalCliente.setLocationRelativeTo(null);
	modalCliente.setResizable(false);
	modalCliente.setLayout(new GridLayout(15,1));

        //Creamos los labels
        nombreLabel = new JLabel("Nombre(s):");
        apellidoPatLabel = new JLabel("Apellido Paterno:");
        apellidoMatLabel = new JLabel("Apellido Materno:");
        direccionLabel = new JLabel("direccion:");
        telefonoLabel = new JLabel("Telefono:");
        referenciaLabel = new JLabel("Referencia:");

        //Creamos los Fields
        nombreCliente = new JTextField();
        apellidoMat = new JTextField();
        apellidoPat = new JTextField();
        direccion = new JTextField();
        telefono = new JTextField();
        referencia = new JTextField(); 
        
        //Definimos el tamaño de los Fields
        Dimension estandarTamaño = new Dimension(120,30); 
        nombreCliente.setSize(estandarTamaño);
        apellidoMat.setSize(estandarTamaño);
        apellidoPat.setSize(estandarTamaño);
        direccion.setSize(estandarTamaño);
        telefono.setSize(estandarTamaño);
        referencia.setSize(estandarTamaño);

        //Creamos el boton de submit con el icono
        iconoBotonSubir = new ImageIcon("src/Utilidades/Enviar.png");
        subirCliente = new JButton("Guardar",iconoBotonSubir);

        //Definimos el Tamaño del boton
        subirCliente.setSize(new Dimension(285,65));

        //Agregamos al Panel
        modalCliente.add(nombreLabel);
        modalCliente.add(nombreCliente);
        modalCliente.add(apellidoPatLabel);
        modalCliente.add(apellidoPat);
        modalCliente.add(apellidoMatLabel);
        modalCliente.add(apellidoMat);
        modalCliente.add(direccionLabel);
        modalCliente.add(direccion);
        modalCliente.add(telefonoLabel);
        modalCliente.add(telefono);
        modalCliente.add(referenciaLabel);
        modalCliente.add(referencia);

        //Accion del boton
        subirCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Sacamos los textos de los formularios 
                // Ponlo en la clase que ocupes para la consultas
                nombreCliente.getText();
                apellidoMat.getText();
                apellidoPat.getText();
                direccion.getText();
                telefono.getText();
                referencia.getText();
                
                
                //Si retorna bien alerta de creacion si no de error
                if(API.addCliente(nombreCliente.getText(), apellidoPat.getText(), apellidoMat.getText(), direccion.getText(),  telefono.getText(), direccion.getText(), referencia.getText()) == 1){
                    ConfirmacionCliente();
                    modalCliente.dispatchEvent(new WindowEvent(modalCliente, WindowEvent.WINDOW_CLOSING));
                    
                }else{
                    MostrarErrorCiente();
                }
                
                //Cerramos la ventana
                modalCliente.dispose();
            }
        });

        
        modalCliente.add(subirCliente);
        modalCliente.setVisible(true);
    }
    
    private void MostrarFormularioCliente( int idCliente,String nombreCliente,String ApellidoP,String ApellidoM,String Direccion,String Telefono,String Referencia){
        JDialog modalCliente = new JDialog();
        //Va a devolver un tipo de clase para la base de datos por lo mientras lo dejare en void
        JTextField nombreEmpleado, apellidoMat, apellidoPat, direccion, telefono, referencia;
        JLabel nombreLabel, apellidoMatLabel, apellidoPatLabel, direccionLabel, telefonoLabel, referenciaLabel;
        JButton subirCliente;
        ImageIcon iconoBotonSubir;

        // Propiedades de la ventana
        modalCliente.setTitle("Nuevo Cliente");
	modalCliente.setSize(1002, 680);
	modalCliente.setLocationRelativeTo(null);
	modalCliente.setResizable(false);
	modalCliente.setLayout(new GridLayout(15,1));

        //Creamos los labels
        nombreLabel = new JLabel("Nombre(s):");
        apellidoMatLabel = new JLabel("Apellido Materno:");
        apellidoPatLabel = new JLabel("Apellido Paterno:");
        direccionLabel = new JLabel("direccion:");
        telefonoLabel = new JLabel("Telefono:");
        referenciaLabel = new JLabel("Referencia:");

        //Creamos los Fields
        nombreEmpleado = new JTextField(nombreCliente);
        apellidoMat = new JTextField(ApellidoM);
        apellidoPat = new JTextField(ApellidoP);
        direccion = new JTextField(Direccion);
        telefono = new JTextField(Telefono);
        referencia = new JTextField(Referencia); 
        
        
        
        
        
        //Definimos el tamaño de los Fields
        Dimension estandarTamaño = new Dimension(120,30); 
        nombreEmpleado.setSize(estandarTamaño);
        apellidoMat.setSize(estandarTamaño);
        apellidoPat.setSize(estandarTamaño);
        direccion.setSize(estandarTamaño);
        telefono.setSize(estandarTamaño);
        referencia.setSize(estandarTamaño);

        //Creamos el boton de submit con el icono
        iconoBotonSubir = new ImageIcon("src/Utilidades/Enviar.png");
        subirCliente = new JButton("Guardar",iconoBotonSubir);

        //Definimos el Tamaño del boton
        subirCliente.setSize(new Dimension(285,65));

        //Agregamos al Panel
        modalCliente.add(nombreLabel);
        modalCliente.add(nombreEmpleado);
        modalCliente.add(apellidoMatLabel);
        modalCliente.add(apellidoMat);
        modalCliente.add(apellidoPatLabel);
        modalCliente.add(apellidoPat);
        modalCliente.add(direccionLabel);
        modalCliente.add(direccion);
        modalCliente.add(telefonoLabel);
        modalCliente.add(telefono);
        modalCliente.add(referenciaLabel);
        modalCliente.add(referencia);

        //Accion del boton
        subirCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Sacamos los textos de los formularios 
                // Ponlo en la clase que ocupes para la consultas
                nombreEmpleado.getText();
                apellidoMat.getText();
                apellidoPat.getText();
                direccion.getText();
                telefono.getText();
                referencia.getText();
                
                //Si retorna bien alerta de creacion si no de error
                if( API.ActualizarCliente(idCliente, nombreEmpleado.getText(), apellidoPat.getText(), apellidoMat.getText(),  direccion.getText(), telefono.getText(),  direccion.getText(),  referencia.getText())==1){
                    ConfirmacionCliente();
                }else{
                    MostrarErrorCiente();
                }
                
                //Cerramos la ventana
                modalCliente.dispose();
            }
        });


        if(modalCliente.getDefaultCloseOperation() == 2){
            MostrarCancelarCliente();
        }
        modalCliente.add(subirCliente);
        modalCliente.setVisible(true);
    }
    
    private int MostrarCancelarCliente(){
        String textoAlerta = "¿Estas seguro de que quieres cancelar?";
        int resultadoOpcion;
        
        resultadoOpcion = JOptionPane.showConfirmDialog(null, textoAlerta , "Selecciona una opción", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        
        return resultadoOpcion;
    }
    
    private void MostrarErrorCiente(){
        String textoAlerta = "Error cliente";
        
        JOptionPane alertaError = new JOptionPane(textoAlerta,JOptionPane.ERROR_MESSAGE);
        JDialog modalAlerta = alertaError.createDialog("Cliente existente");
        modalAlerta.setAlwaysOnTop(true);
        modalAlerta.setVisible(true);
    }
    
    private void ConfirmacionCliente(){
        String textoAlerta = "Este Cliente se subio correctamente a la base de datos";
        JOptionPane alertaError = new JOptionPane(textoAlerta,JOptionPane.INFORMATION_MESSAGE);
        JDialog modalAlerta = alertaError.createDialog("Inserción Correcta");
        modalAlerta.setAlwaysOnTop(true);
        modalAlerta.setVisible(true);
    }
    
    private int EliminarCliente(){
        String textoAlerta = "¿Estas seguro de que quieres eliminar este Cliente?";
        int resultadoOpcion;
        
        resultadoOpcion = JOptionPane.showConfirmDialog(null, textoAlerta , "Selecciona una opción", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        
        return resultadoOpcion;
    }
    
    private void ConfirmarModificacionCliente(){
         String textoAlerta = "Este cliente fue modificado correctamente";
        JOptionPane alertaError = new JOptionPane(textoAlerta,JOptionPane.INFORMATION_MESSAGE);
        JDialog modalAlerta = alertaError.createDialog("Inserción Correcta");
        modalAlerta.setAlwaysOnTop(true);
        modalAlerta.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonNuevoCliente;
    private javax.swing.JLabel labelClientes;
    private javax.swing.JLabel logoEmpresa;
    private javax.swing.JScrollPane panelClientes;
    // End of variables declaration//GEN-END:variables
}
