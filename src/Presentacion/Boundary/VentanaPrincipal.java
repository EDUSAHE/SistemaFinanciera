/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.Boundary;

import ReglasNegocio.Control.*;
import Almacenamiento.Entity.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author nobls
 */
public class VentanaPrincipal extends javax.swing.JFrame {
   
    private final JFrame estaVentana = this;
    private int idUsuario =VentanaLogin.idUsuario;
    private Usuario usuario = new Usuario();
    private ControlInicioSesion controliniciosesion=new ControlInicioSesion();
   
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        super("Creditos Financiera");   
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        initComponents();
         iniciar();
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
        botonEmpleados = new javax.swing.JButton();
        botonClientes = new javax.swing.JButton();
        botonCreditos = new javax.swing.JButton();
        panelTabla = new javax.swing.JPanel();
        NombreUsuario = new javax.swing.JLabel();
        NombreUsuario1 = new javax.swing.JLabel();
        NombreUsuario2 = new javax.swing.JLabel();
        NombreUsuario3 = new javax.swing.JLabel();
        NombreU = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        Horario = new javax.swing.JTextField();
        labelGenerales = new javax.swing.JLabel();
        botonPerfil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 800));

        logoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prestamilIcono.png"))); // NOI18N

        botonEmpleados.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        botonEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empleados.png"))); // NOI18N
        botonEmpleados.setText("Empleados");
        botonEmpleados.setPreferredSize(new java.awt.Dimension(285, 65));
        botonEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleadosActionPerformed(evt);
            }
        });

        botonClientes.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        botonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clientes.png"))); // NOI18N
        botonClientes.setText("Clientes");
        botonClientes.setPreferredSize(new java.awt.Dimension(285, 65));
        botonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClientesActionPerformed(evt);
            }
        });

        botonCreditos.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        botonCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Creditos.png"))); // NOI18N
        botonCreditos.setText("Creditos");
        botonCreditos.setPreferredSize(new java.awt.Dimension(285, 65));
        botonCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCreditosActionPerformed(evt);
            }
        });

        panelTabla.setBorder(new javax.swing.border.MatteBorder(null));

        NombreUsuario.setText("Nombre");

        NombreUsuario1.setText("Apellido");

        NombreUsuario2.setText("Horario");

        NombreUsuario3.setText("Correo");

        NombreU.setText("jTextField1");
        NombreU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreUActionPerformed(evt);
            }
        });

        Apellido.setText("jTextField2");

        Correo.setText("jTextField3");
        Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoActionPerformed(evt);
            }
        });

        Horario.setText("jTextField4");

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTablaLayout.createSequentialGroup()
                        .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreUsuario3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelTablaLayout.createSequentialGroup()
                                .addComponent(NombreUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 8, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Correo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelTablaLayout.createSequentialGroup()
                        .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Apellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        labelGenerales.setFont(new java.awt.Font("Rubik", 0, 14)); // NOI18N
        labelGenerales.setText("Datos Generales");
        labelGenerales.setToolTipText("");

        botonPerfil.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        botonPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario.png"))); // NOI18N
        botonPerfil.setText("Administrar Perfil");
        botonPerfil.setPreferredSize(new java.awt.Dimension(285, 65));
        botonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logoEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelGenerales)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelGenerales)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(botonEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(botonCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleadosActionPerformed
          
            new VentanaEmpleados();
    }//GEN-LAST:event_botonEmpleadosActionPerformed

    private void botonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClientesActionPerformed
        // TODO add your handling code here:
           
            new VentanaClientes();
    }//GEN-LAST:event_botonClientesActionPerformed

    private void botonCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCreditosActionPerformed
        // TODO add your handling code here:
        new VentanaCreditos();
    }//GEN-LAST:event_botonCreditosActionPerformed

    private void botonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPerfilActionPerformed

    private void CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoActionPerformed
        // TODO add your handling code here:
        
      
    }//GEN-LAST:event_CorreoActionPerformed

    private void NombreUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreUActionPerformed
    public void iniciar(){
       try {
            // TODO add your handling code here
            usuario = controliniciosesion.ObtenerInformacionUsuario(idUsuario);
            System.out.println(usuario.getNombre());
            System.out.println(usuario.getApellidoP());
            System.out.println(usuario.getUsuario());
            System.out.println(usuario.getHorario());
            NombreU.setText(usuario.getNombre());
            Apellido.setText(usuario.getApellidoP());
            Correo.setText(usuario.getUsuario());
            Horario.setText(usuario.getHorario());
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

               //new VentanaPrincipal().setVisible(true);
                 //new VentanaPrincipal().iniciar();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Correo;
    private javax.swing.JTextField Horario;
    private javax.swing.JTextField NombreU;
    private javax.swing.JLabel NombreUsuario;
    private javax.swing.JLabel NombreUsuario1;
    private javax.swing.JLabel NombreUsuario2;
    private javax.swing.JLabel NombreUsuario3;
    private javax.swing.JButton botonClientes;
    private javax.swing.JButton botonCreditos;
    private javax.swing.JButton botonEmpleados;
    private javax.swing.JButton botonPerfil;
    private javax.swing.JLabel labelGenerales;
    private javax.swing.JLabel logoEmpresa;
    private javax.swing.JPanel panelTabla;
    // End of variables declaration//GEN-END:variables
}
