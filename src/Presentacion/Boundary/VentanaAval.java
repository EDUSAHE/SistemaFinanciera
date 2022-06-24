/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.Boundary;

import Almacenamiento.Entity.Aval;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nobls
 */
public class VentanaAval extends javax.swing.JFrame {
    private final JFrame estaVentana = this;
    private Aval avalTemp = new Aval();
    /**
     * Creates new form VentanaAval
     */
    public VentanaAval() {
        super("Nuevo aval");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        MostrarFormularioVacioAval();
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
        labelAval = new javax.swing.JLabel();
        panelAval = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelApellidoPat = new javax.swing.JLabel();
        labelApellidoMat = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        labelReferencia = new javax.swing.JLabel();
        fieldNombre = new javax.swing.JTextField();
        fieldApellidoPat = new javax.swing.JTextField();
        fieldApellidoMat = new javax.swing.JTextField();
        fieldDireccion = new javax.swing.JTextField();
        fieldTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldReferencia = new javax.swing.JTextArea();
        botonNuevoAval = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        logoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prestamilIcono.png"))); // NOI18N

        labelAval.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        labelAval.setText("Agregar nuevo Aval");

        labelNombre.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        labelNombre.setText("Nombre(s):");

        labelApellidoPat.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        labelApellidoPat.setText("Apellido Paterno :");

        labelApellidoMat.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        labelApellidoMat.setText("Apellido Materno:");

        labelDireccion.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        labelDireccion.setText("Dirección:");

        labelTelefono.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        labelTelefono.setText("Telefono:");

        labelReferencia.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        labelReferencia.setText("Referencia");

        fieldReferencia.setColumns(20);
        fieldReferencia.setRows(5);
        jScrollPane1.setViewportView(fieldReferencia);

        botonNuevoAval.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        botonNuevoAval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro.png"))); // NOI18N
        botonNuevoAval.setText("Agregar Aval");
        botonNuevoAval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoAvalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAvalLayout = new javax.swing.GroupLayout(panelAval);
        panelAval.setLayout(panelAvalLayout);
        panelAvalLayout.setHorizontalGroup(
            panelAvalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAvalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelAvalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAvalLayout.createSequentialGroup()
                        .addComponent(labelReferencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addGap(6, 6, 6))
                    .addGroup(panelAvalLayout.createSequentialGroup()
                        .addComponent(labelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAvalLayout.createSequentialGroup()
                        .addComponent(labelApellidoPat)
                        .addGap(18, 18, 18)
                        .addComponent(fieldApellidoPat))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAvalLayout.createSequentialGroup()
                        .addComponent(labelDireccion)
                        .addGap(38, 38, 38)
                        .addComponent(fieldApellidoMat))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAvalLayout.createSequentialGroup()
                        .addComponent(labelTelefono)
                        .addGap(18, 18, 18)
                        .addComponent(fieldTelefono))
                    .addGroup(panelAvalLayout.createSequentialGroup()
                        .addComponent(labelApellidoMat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAvalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonNuevoAval)
                .addGap(141, 141, 141))
        );
        panelAvalLayout.setVerticalGroup(
            panelAvalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAvalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelAvalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAvalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellidoPat)
                    .addComponent(fieldApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panelAvalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellidoMat)
                    .addComponent(fieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panelAvalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion)
                    .addComponent(fieldApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelAvalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefono)
                    .addComponent(fieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelAvalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAvalLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(labelReferencia))
                    .addGroup(panelAvalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(botonNuevoAval)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(labelAval))
                    .addComponent(panelAval, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelAval)
                    .addComponent(logoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAval, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevoAvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoAvalActionPerformed
        // TODO add your handling code here:
        //BRANDON: Conectar a la base de datos, si dio error sale la alerta de error si no la de creado
        
        //Sacamos los textos de los fields
        avalTemp.setNombre(fieldNombre.getText());
        avalTemp.setApellidoM(fieldApellidoMat.getText());
        avalTemp.setApellidosP(fieldApellidoPat.getText());
        avalTemp.setDireccion(fieldDireccion.getText());
        avalTemp.setTelefonoCasa(fieldTelefono.getText());
        avalTemp.setTelefonoCelular(fieldTelefono.getText());
        avalTemp.setReferencia(fieldReferencia.getText());
        
        if(1 == 1){
            
        }else{


        }
    }//GEN-LAST:event_botonNuevoAvalActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAval().setVisible(true);
            }
        });
    }
    
    private void MostrarFormularioVacioAval(){
        initComponents();
    }
    
    private void MostrarFormularioAval(Aval avalModificar){
        fieldNombre.setText(avalModificar.getNombre());        
        fieldApellidoPat.setText(avalModificar.getApellidosP());
        fieldApellidoMat.setText(avalModificar.getApellidoM());
        fieldDireccion.setText(avalModificar.getDireccion());
        fieldTelefono.setText(avalModificar.getTelefonoCasa());
        fieldReferencia.setText(avalModificar.getReferencia());
    }

    private int MostrarCancelarAval(){
        String textoAlerta = "¿Estas seguro de que quieres cancelar?";
        int resultadoOpcion;
        
        resultadoOpcion = JOptionPane.showConfirmDialog(null, textoAlerta , "Selecciona una opción", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        
        return resultadoOpcion;
    }
    
    private void ConfirmacionCrearAval(){
        String textoAlerta = "Este aval se subio correctamente a la base de datos";
       //String textoAlerta = "Error al crear/ rellene todos los campos";
        JOptionPane alertaError = new JOptionPane(textoAlerta,JOptionPane.INFORMATION_MESSAGE);
        JDialog modalAlerta = alertaError.createDialog("Inserción Correcta");
        modalAlerta.setAlwaysOnTop(true);
        modalAlerta.setVisible(true);
    }
    
    private void ConfirmacionModificacionAval(){
        String textoAlerta = "Este aval fue modificado correctamente";
       // String textoAlerta = "Este empleado no fue creado correctamente";
        JOptionPane alertaError = new JOptionPane(textoAlerta,JOptionPane.INFORMATION_MESSAGE);
        JDialog modalAlerta = alertaError.createDialog("Inserción Correcta");
        modalAlerta.setAlwaysOnTop(true);
        modalAlerta.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonNuevoAval;
    private javax.swing.JTextField fieldApellidoMat;
    private javax.swing.JTextField fieldApellidoPat;
    private javax.swing.JTextField fieldDireccion;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextArea fieldReferencia;
    private javax.swing.JTextField fieldTelefono;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelApellidoMat;
    private javax.swing.JLabel labelApellidoPat;
    private javax.swing.JLabel labelAval;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelReferencia;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel logoEmpresa;
    private javax.swing.JPanel panelAval;
    // End of variables declaration//GEN-END:variables
}
