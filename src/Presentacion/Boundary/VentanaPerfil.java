/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.Boundary;

import Almacenamiento.Entity.Usuario;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nobls
 */
public class VentanaPerfil extends javax.swing.JFrame {
    private Usuario usuarioTemp = new Usuario();
    private final JFrame estaVentana = this;
    /**
     * Creates new form VentanaPerfil
     */
    public VentanaPerfil() {
        super("Modificar Perfil");   
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponents();
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
        labelGenerales = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        labelApellidoPat = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        labelApellidoMat = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        fieldApellidoPat = new javax.swing.JTextField();
        fieldApellidoMat = new javax.swing.JTextField();
        fieldUsuario = new javax.swing.JTextField();
        fieldContraseña = new javax.swing.JPasswordField();
        botonModificarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        logoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prestamilIcono.png"))); // NOI18N

        labelGenerales.setFont(new java.awt.Font("Rubik", 0, 14)); // NOI18N
        labelGenerales.setText("Datos Generales");
        labelGenerales.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelNombre.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        labelNombre.setText("Nombre(s):");

        labelUsuario.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        labelUsuario.setText("Usuario:");

        labelApellidoPat.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        labelApellidoPat.setText("Apellido Pat.:");

        labelContraseña.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        labelContraseña.setText("Contraseña:");

        labelApellidoMat.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        labelApellidoMat.setText("Apellido Mat.:");

        botonModificarDatos.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        botonModificarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro.png"))); // NOI18N
        botonModificarDatos.setText("Modificar Datos");
        botonModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelApellidoPat)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fieldApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelNombre)
                                    .addGap(32, 32, 32)
                                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelApellidoMat)
                                    .addGap(18, 18, 18)
                                    .addComponent(fieldApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(labelUsuario)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(labelContraseña)
                                            .addGap(25, 25, 25)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                        .addComponent(fieldContraseña))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(botonModificarDatos)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellidoPat)
                    .addComponent(fieldApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellidoMat)
                    .addComponent(fieldApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario)
                    .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelContraseña)
                    .addComponent(fieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(botonModificarDatos)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoEmpresa)
                        .addGap(36, 36, 36)
                        .addComponent(labelGenerales)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(labelGenerales)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarDatosActionPerformed
        // TODO add your handling code here:
        //BRANDON: Conectar a la base de datos, si dio error sale la alerta de error si no la de crea
        
        //Obtenemos los datos de los fields
        usuarioTemp.setNombre(fieldNombre.getText());
        usuarioTemp.setApellidoP(fieldApellidoPat.getText());
        usuarioTemp.setApellidoM(fieldApellidoMat.getText());
        usuarioTemp.setUsuario(fieldUsuario.getText());
        usuarioTemp.setPassword(String.valueOf(fieldContraseña.getPassword()));
        
        //MANDAMOS A LA BASE DE DATOS
        //BRANDON: Haz la inserción dependiendo de si se pudo meter o no se pone la alerta
        if(1 == 1){
            MostrarModificacionDatos();
        }else{
            MostrarErrorModificacion();
        }
        
    }//GEN-LAST:event_botonModificarDatosActionPerformed

    private void MostrarModificacionDatos(){
        String textoAlerta = "Sus datos fueron modificados correctamente";
        JOptionPane alertaError = new JOptionPane(textoAlerta,JOptionPane.INFORMATION_MESSAGE);
        JDialog modalAlerta = alertaError.createDialog("Inserción Correcta");
        modalAlerta.setAlwaysOnTop(true);
        modalAlerta.setVisible(true);
    }
    
    private void MostrarErrorModificacion(){
        String textoAlerta = "Error Modifcacr";
        
        JOptionPane alertaError = new JOptionPane(textoAlerta,JOptionPane.ERROR_MESSAGE);
        JDialog modalAlerta = alertaError.createDialog("Error al modificar sus datos");
        modalAlerta.setAlwaysOnTop(true);
        modalAlerta.setVisible(true);
    }
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
            java.util.logging.Logger.getLogger(VentanaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModificarDatos;
    private javax.swing.JTextField fieldApellidoMat;
    private javax.swing.JTextField fieldApellidoPat;
    private javax.swing.JPasswordField fieldContraseña;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelApellidoMat;
    private javax.swing.JLabel labelApellidoPat;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelGenerales;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel logoEmpresa;
    // End of variables declaration//GEN-END:variables
}
