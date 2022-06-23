/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.Boundary;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author nobls
 */
public class VentanaEmpleados extends javax.swing.JFrame {
    private GridBagConstraints gridB = new GridBagConstraints();
    private final JFrame estaVentana = this;
    /**
     * Creates new form VentanaEmpleados
     */
    public VentanaEmpleados() {
        super("Empleados");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        MostrarListadoEmpleados();

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
        panelGeneral = new javax.swing.JPanel();
        labelEmpleados = new javax.swing.JLabel();
        botonNuevoEmpleado = new javax.swing.JButton();
        panelEmpleados = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empleados");
        setSize(new java.awt.Dimension(1002, 680));

        logoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prestamilIcono.png"))); // NOI18N

        panelGeneral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelEmpleados.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        labelEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEmpleados.setText("Empleados");

        botonNuevoEmpleado.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        botonNuevoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro.png"))); // NOI18N
        botonNuevoEmpleado.setText("Agregar Empleado");
        botonNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoEmpleadoActionPerformed(evt);
            }
        });

        panelEmpleados.setBorder(new javax.swing.border.MatteBorder(null));

        JPanel pruebaPanel = new JPanel();
        pruebaPanel.setLayout(new GridLayout(12,1));

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonNuevoEmpleado)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGeneralLayout.createSequentialGroup()
                        .addComponent(labelEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEmpleados)
                .addContainerGap())
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEmpleados)
                .addGap(10, 10, 10)
                .addComponent(panelEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonNuevoEmpleado)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonNuevoEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEmpleados();
            }
        });
    }
    
    private JPanel creaPanelInformacion(String nombre, String apellidoPat, String apellidoMat, String usuario){
        JPanel resultado = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        JTextArea textPanel;
        ImageIcon iconoEditar, iconoEliminar;
        JButton botonEditar, botonEliminar;
        String tempStr = "";
        
        //Creamos el texto que tendra el textArea
        tempStr += "Nombre(s): " + nombre + "\n";
        tempStr += "Apellido Pat. : " + apellidoPat + "\n";
        tempStr += "Apellido Mat. : " + apellidoMat + "\n";
        tempStr += "Usuario: " + usuario + "\n";
        
        //Creamos los iconos y reescalamos
        iconoEditar = new ImageIcon("src/Utilidades/Editar.png");
        Image imageEditar = iconoEditar.getImage();
        Image editarEscalado = imageEditar.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);

        iconoEliminar = new ImageIcon("src/Utilidades/Eliminar.png");
        Image imageEliminar = iconoEliminar.getImage();
        Image eliminarEscalado = imageEliminar.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
        
        iconoEditar = new ImageIcon(editarEscalado);
        iconoEliminar = new ImageIcon(eliminarEscalado);
        
        //Creamos los botones
        botonEditar = new JButton(iconoEditar);
        botonEliminar = new JButton(iconoEliminar);

        //Dimensiones de los botones
        botonEditar.setSize(new Dimension(120,120));
        botonEliminar.setSize(new Dimension(120,120));

        //Creamos el TextArea
        textPanel = new JTextArea(tempStr);
        textPanel.setSize(new Dimension(200,150));
        
        //Acciones Botones
        botonEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev){
                //Si le da click a editar mandaremos a llamar el metodo de editar
                //TODO: idUsuario
                int idUsuario = 0;
                //MostrarFormularioEdicionEmpleado(modalFormulario,0);
            }
        });

        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev){
               /*Eliminamos de la base de datos*/
            }
        });
        
        //Añadimos al panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(0,0,20,0);
        
        //Añadimos el panel
        resultado.add(textPanel,gbc);

        //Default gbc
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.CENTER;
        gbc.weightx = 0.0;
    
        //Añadimos los botones
        gbc.gridx = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;

        resultado.add(botonEditar,gbc);

        //Default
        gbc.weighty = 0.0;  

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;

        resultado.add(botonEliminar,gbc);

        //Default
        gbc.weighty = 0.0;
        return resultado;
    }
    
    private void MostrarListadoEmpleados(){
        initComponents();
        JPanel pruebaPanel = new JPanel(new GridLayout(12,1));
        //pruebaPanel.add(CreaPanelInformacion())
        panelEmpleados.setViewportView(pruebaPanel);
        
    }
    
    protected void MostrarConfirmacionDeCambios() {
        String textoAlerta = "Este empleado fue modificado correctamente";
       // String textoAlerta = "Este empleado no fue creado correctamente";
        JOptionPane alertaError = new JOptionPane(textoAlerta,JOptionPane.INFORMATION_MESSAGE);
        JDialog modalAlerta = alertaError.createDialog("Inserción Correcta");
        modalAlerta.setAlwaysOnTop(true);
        modalAlerta.setVisible(true);
    }
    
    private void MostrarAlertaCancelacion() {
        String textoAlerta = "¿Estas seguro de cancelar?";

        JOptionPane alertaCancelado = new JOptionPane(textoAlerta,JOptionPane.QUESTION_MESSAGE,JOptionPane.YES_NO_OPTION);
        JDialog modalAlerta = alertaCancelado.createDialog("Alerta cancelar");
        modalAlerta.setAlwaysOnTop(true);
        modalAlerta.setVisible(true);
    }

    private int MostrarConfirmacionDeEliminacion() {
        String textoAlerta = "¿Estas seguro de que quieres eliminar este Empleado?";
        int resultadoOpcion;
        
        resultadoOpcion = JOptionPane.showConfirmDialog(null, textoAlerta , "Selecciona una opción", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        
        return resultadoOpcion;
    }

    private void MostrarConfirmacionDeCreacion() {
        String textoAlerta = "Este empleado se subio correctamente a la base de datos";
       //String textoAlerta = "Error al crear/ rellene todos los campos";
        JOptionPane alertaError = new JOptionPane(textoAlerta,JOptionPane.INFORMATION_MESSAGE);
        JDialog modalAlerta = alertaError.createDialog("Inserción Correcta");
        modalAlerta.setAlwaysOnTop(true);
        modalAlerta.setVisible(true);
    }

    private void MostrarErrorEmpleadoExistente() {
        String textoAlerta = "Este empleado no existe en el sistema, favor verificar la información";

        JOptionPane alertaError = new JOptionPane(textoAlerta,JOptionPane.ERROR_MESSAGE);
        JDialog modalAlerta = alertaError.createDialog("Empleado existente");
        modalAlerta.setAlwaysOnTop(true);
        modalAlerta.setVisible(true);
    }
    
    private void MostrarFormularioNuevoEmpleado(JDialog modalFormulario){
        //Va a devolver un tipo de clase para la base de datos por lo mientras lo dejare en void
        JTextField nombreEmpleado, apellidoMat, apellidoPat, cargo, horario, usuario;
        JLabel nombreLabel, apellidoMatLabel, apellidoPatLabel, cargoLabel, horarioLabel, usuarioLabel, contraseñaLabel;
        JPasswordField contraseña;
        JButton subirEmpleado;
        ImageIcon iconoBotonSubir;

        // Propiedades de la ventana
        modalFormulario.setTitle("Nuevo Empleado");
		modalFormulario.setSize(1002, 680);
		modalFormulario.setLocationRelativeTo(null);
		modalFormulario.setResizable(false);
		modalFormulario.setLayout(new GridLayout(15,1));

        //Creamos los labels
        nombreLabel = new JLabel("Nombre(s):");
        apellidoMatLabel = new JLabel("Apellido Materno:");
        apellidoPatLabel = new JLabel("Apellido Paterno:");
        cargoLabel = new JLabel("Cargo:");
        horarioLabel = new JLabel("Horario:");
        usuarioLabel = new JLabel("Usuario:");
        contraseñaLabel = new JLabel("Contraseña:");

        //Creamos los Fields
        nombreEmpleado = new JTextField();
        apellidoMat = new JTextField();
        apellidoPat = new JTextField();
        cargo = new JTextField();
        horario = new JTextField();
        contraseña = new JPasswordField();
        usuario = new JTextField(); 
        
        //Definimos el tamaño de los Fields
        Dimension estandarTamaño = new Dimension(120,30); 
        nombreEmpleado.setSize(estandarTamaño);
        apellidoMat.setSize(estandarTamaño);
        apellidoPat.setSize(estandarTamaño);
        cargo.setSize(estandarTamaño);
        horario.setSize(estandarTamaño);
        contraseña.setSize(estandarTamaño);
        usuario.setSize(estandarTamaño);

        //Creamos el boton de submit con el icono
        iconoBotonSubir = new ImageIcon("src/Utilidades/Enviar.png");
        subirEmpleado = new JButton("Guardar",iconoBotonSubir);

        //Definimos el Tamaño del boton
        subirEmpleado.setSize(new Dimension(285,65));

        //Agregamos al Panel
        modalFormulario.add(nombreLabel);
        modalFormulario.add(nombreEmpleado);
        modalFormulario.add(apellidoMatLabel);
        modalFormulario.add(apellidoMat);
        modalFormulario.add(apellidoPatLabel);
        modalFormulario.add(apellidoPat);
        modalFormulario.add(cargoLabel);
        modalFormulario.add(cargo);
        modalFormulario.add(horarioLabel);
        modalFormulario.add(horario);
        modalFormulario.add(contraseñaLabel);
        modalFormulario.add(contraseña);
        modalFormulario.add(usuarioLabel);
        modalFormulario.add(usuario);

//        //Accion del boton
//        subirEmpleado.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //Sacamos los inputs de los Fields
//                usuarioTemp.setNombre(nombreEmpleado.getText());
//                usuarioTemp.setApellidoM(apellidoMat.getText());
//                usuarioTemp.setApellidoP(apellidoPat.getText());
//
//                //Sacamos la contraseña y la transformamos a string
//                temporal = String.valueOf(contraseña.getPassword());
//                usuarioTemp.setPassword(temporal);
//                usuarioTemp.setUsuario(usuario.getText());
//
//                System.out.println(usuarioTemp.getNombre());
//                System.out.println(usuarioTemp.getApellidoP());
//                System.out.println(usuarioTemp.getApellidoM());
//                System.out.println(usuarioTemp.getUsuario());
//                System.out.println(usuarioTemp.getPassword());
//
//                if(apiSQL.InsertarUsuario(0, usuarioTemp.getNombre(), usuarioTemp.getApellidoP(), usuarioTemp.getApellidoP(), usuarioTemp.getUsuario(), usuarioTemp.getPassword()) == 1){
//                    MostrarConfirmacionDeCreacion();
//                }else{
//                    MostrarErrorEmpleadoExistente();
//                }
//                
//            }
//        });

        if(modalFormulario.getDefaultCloseOperation() == 2){
            MostrarAlertaCancelacion();
        }
        modalFormulario.add(subirEmpleado);
        modalFormulario.setVisible(true);
    } 
    
    protected void MostrarFormularioEdicionEmpleado(JDialog modalFormulario, int idUsuario) {
        //Va a devolver un tipo de clase para la base de datos por lo mientras lo dejare en void
        JTextField nombreEmpleado, apellidoMat, apellidoPat, cargo, horario, usuario;
        JLabel nombreLabel, apellidoMatLabel, apellidoPatLabel, cargoLabel, horarioLabel, usuarioLabel, contraseñaLabel;
        JPasswordField contraseña;
        JButton subirEmpleado;
        ImageIcon iconoBotonSubir;

        // Propiedades de la ventana
        modalFormulario.setTitle("Nuevo Empleado");
        modalFormulario.setSize(1002, 680);
        modalFormulario.setLocationRelativeTo(null);
        modalFormulario.setResizable(false);
        modalFormulario.setLayout(new GridLayout(15,1));

        //Creamos los labels
        nombreLabel = new JLabel("Nombre(s):");
        apellidoMatLabel = new JLabel("Apellido Materno:");
        apellidoPatLabel = new JLabel("Apellido Paterno:");
        cargoLabel = new JLabel("Cargo:");
        horarioLabel = new JLabel("Horario:");
        usuarioLabel = new JLabel("Usuario:");
        contraseñaLabel = new JLabel("Contraseña:");

        //Creamos los Fields
        nombreEmpleado = new JTextField();
        apellidoMat = new JTextField();
        apellidoPat = new JTextField();
        cargo = new JTextField();
        horario = new JTextField();
        contraseña = new JPasswordField();
        usuario = new JTextField(); 

        //Definimos el tamaño de los Fields
        Dimension estandarTamaño = new Dimension(120,30); 
        nombreEmpleado.setSize(estandarTamaño);
        apellidoMat.setSize(estandarTamaño);
        apellidoPat.setSize(estandarTamaño);
        cargo.setSize(estandarTamaño);
        horario.setSize(estandarTamaño);
        contraseña.setSize(estandarTamaño);
        usuario.setSize(estandarTamaño);

        //Creamos el boton de submit con el icono
        iconoBotonSubir = new ImageIcon("src/Utilidades/Enviar.png");
        subirEmpleado = new JButton("Guardar",iconoBotonSubir);

        //Definimos el Tamaño del boton
        subirEmpleado.setSize(new Dimension(285,65));

        //Agregamos al Panel
        modalFormulario.add(nombreLabel);
        modalFormulario.add(nombreEmpleado);
        modalFormulario.add(apellidoMatLabel);
        modalFormulario.add(apellidoMat);
        modalFormulario.add(apellidoPatLabel);
        modalFormulario.add(apellidoPat);
        modalFormulario.add(cargoLabel);
        modalFormulario.add(cargo);
        modalFormulario.add(horarioLabel);
        modalFormulario.add(horario);
        modalFormulario.add(contraseñaLabel);
        modalFormulario.add(contraseña);
        modalFormulario.add(usuarioLabel);
        modalFormulario.add(usuario);

//        //Accion del boton
//        subirEmpleado.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //Sacamos los inputs de los Fields
//                usuarioTemp.setNombre(nombreEmpleado.getText());
//                usuarioTemp.setApellidoM(apellidoMat.getText());
//                usuarioTemp.setApellidoP(apellidoPat.getText());
//
//                //Sacamos la contraseña y la transformamos a string
//                temporal = String.valueOf(contraseña.getPassword());
//                usuarioTemp.setPassword(temporal);
//                usuarioTemp.setUsuario(usuario.getText());
//
//                
//                if(apiSQL.ActualizarUsuario(idUsuario, 0, usuarioTemp.getNombre(), usuarioTemp.getApellidoP(), usuarioTemp.getApellidoM(), usuarioTemp.getUsuario(), usuarioTemp.getPassword()) == 1){
//                    MostrarConfirmacionDeCambios();
//                }else{
//                    MostrarErrorEmpleadoExistente();
//                }
//               
//                
//            }
//        });
        modalFormulario.add(subirEmpleado);
        modalFormulario.setVisible(true);
        if(modalFormulario.getDefaultCloseOperation() == 2){
            MostrarAlertaCancelacion();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonNuevoEmpleado;
    private javax.swing.JLabel labelEmpleados;
    private javax.swing.JLabel logoEmpresa;
    private javax.swing.JScrollPane panelEmpleados;
    private javax.swing.JPanel panelGeneral;
    // End of variables declaration//GEN-END:variables
}
