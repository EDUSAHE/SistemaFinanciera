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
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
    private Usuario usuarioTemp = new Usuario();
    private GridBagConstraints gbc = new GridBagConstraints();
    private int contador = 0;
    /**
     * Creates new form VentanaEmpleados
     */
    public VentanaEmpleados() {
        super("Empleados");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        usuarioTemp.setNombre("Prueba");
        usuarioTemp.setApellidoP("Apellido");
        usuarioTemp.setApellidoM("Materno");
        usuarioTemp.setUsuario("usuarioTemp");
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGeneralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelEmpleados))
                    .addGroup(panelGeneralLayout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(botonNuevoEmpleado)
                        .addGap(0, 295, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGeneralLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313))
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEmpleados)
                .addGap(10, 10, 10)
                .addComponent(panelEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addComponent(botonNuevoEmpleado)
                .addContainerGap())
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
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoEmpleadoActionPerformed
        // TODO add your handling code here:
        MostrarFormularioNuevoEmpleado();
        
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

        /* Create and display the orm */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEmpleados();
            }
        });
    }
    
    private JPanel CreaPanelInformacion(Usuario usuarioTemp){
        JPanel resultado = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        JTextArea textPanel;
        ImageIcon iconoEditar, iconoEliminar;
        JButton botonEditar, botonEliminar;
        String tempStr = "";
        
        //Creamos el texto que tendra el textArea
        tempStr += "Nombre(s): " + usuarioTemp.getNombre() + "\n";
        tempStr += "Apellido Pat. : " + usuarioTemp.getApellidoP() + "\n";
        tempStr += "Apellido Mat. : " + usuarioTemp.getApellidoM() + "\n";
        tempStr += "Usuario: " + usuarioTemp.getUsuario() + "\n";
        
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
                int idUsuario = 0;
                MostrarFormularioEdicionEmpleado(0);
            }
        });

        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev){
               /*Eliminamos de la base de datos*/
               //BRANDON: Eliminar de la base
               if(MostrarConfirmacionDeEliminacion() == 1){
                   //Aqui mandas a eliminar
               }
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
    
    private void MostrarListadoEmpleados(){
        initComponents();
        JPanel pruebaPanel = new JPanel(new GridBagLayout());
        
        pruebaPanel = AgregarNuevoPanel(pruebaPanel,usuarioTemp);
        pruebaPanel.updateUI();
        panelEmpleados.setViewportView(pruebaPanel);
        panelEmpleados.updateUI();
    }
    
    private JPanel AgregarNuevoPanel(JPanel panelRetorno, Usuario usuarioPanel){
        //Para agregar un nuevo usaremos una variable contador para las columnas asi sera reactivo
        // La columna de las y en la variable gbc son los renglones
        gbc.gridx = 0;
        gbc.gridy = contador;
        
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        contador++;
        
        panelRetorno.add(CreaPanelInformacion(usuarioTemp),gbc);
        
        //Regresamos as los valores default para el siguiente
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        return panelRetorno;
    }
    
    protected void MostrarConfirmacionDeCambios() {
        String textoAlerta = "Este empleado fue modificado correctamente";
       // String textoAlerta = "Este empleado no fue creado correctamente";
        JOptionPane alertaError = new JOptionPane(textoAlerta,JOptionPane.INFORMATION_MESSAGE);
        JDialog modalAlerta = alertaError.createDialog("Inserción Correcta");
        modalAlerta.setAlwaysOnTop(true);
        modalAlerta.setVisible(true);
    }
    
    private int MostrarAlertaCancelacion() {
        String textoAlerta = "¿Estas seguro de que quieres cancelar?";
        int resultadoOpcion;
        
        resultadoOpcion = JOptionPane.showConfirmDialog(null, textoAlerta , "Selecciona una opción", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        
        return resultadoOpcion;
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
    
    private void MostrarFormularioNuevoEmpleado(){
        JDialog modalFormulario = new JDialog();
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

        modalFormulario.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){               
                if(MostrarAlertaCancelacion() == JOptionPane.YES_OPTION){
                    e.getWindow().dispose();
                }
            }
        });
        modalFormulario.add(subirEmpleado);
        modalFormulario.setVisible(true);
    } 
    
    protected void MostrarFormularioEdicionEmpleado(int idUsuario) {
        JDialog modalFormulario = new JDialog();
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
