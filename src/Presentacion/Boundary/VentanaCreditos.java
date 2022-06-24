/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.Boundary;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author nobls
 */
public class VentanaCreditos extends javax.swing.JFrame {
    private final JFrame estaVentana = this;
    private GridBagConstraints gbc = new GridBagConstraints();
    private int contador = 0;
    /**
     * Creates new form VentanaCreditos
     */
    public VentanaCreditos() {
        super("Creditos");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        MostrarListadoCreditosCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        logoEmpresa = new javax.swing.JLabel();
        labelInformacion = new javax.swing.JLabel();
        botonAgregarCredito = new javax.swing.JButton();
        botonEliminarCredito = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelCreditos = new javax.swing.JLabel();
        panelCreditos = new javax.swing.JScrollPane();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        logoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prestamilIcono.png"))); // NOI18N

        labelInformacion.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        labelInformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInformacion.setText("Información Cliente");

        botonAgregarCredito.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        botonAgregarCredito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarCredito.png"))); // NOI18N
        botonAgregarCredito.setText("Agregar Credito");
        botonAgregarCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarCreditoActionPerformed(evt);
            }
        });

        botonEliminarCredito.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        botonEliminarCredito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/QuitarCredito.png"))); // NOI18N
        botonEliminarCredito.setText("Quitar Credito");
        botonEliminarCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCreditoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelCreditos.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        labelCreditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCreditos.setText("Creditos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(labelCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCreditos)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(botonEliminarCredito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAgregarCredito)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAgregarCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminarCredito))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarCreditoActionPerformed
        //Manda a llamar el formulario de nuevo cliente
        MostrarFormularioNuevoCredito();
    }//GEN-LAST:event_botonAgregarCreditoActionPerformed

    private void botonEliminarCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCreditoActionPerformed
        /*Eliminamos de la base de datos*/
        //BRANDON: Eliminar de la base
        if(MostrarConfirmacionDeEliminacion() == 1){
           //Aqui mandas a eliminar
        }
    }//GEN-LAST:event_botonEliminarCreditoActionPerformed

    private JPanel CreaPanelCredito(String monto, String pago, String modalidad, String plazo){
        //BRANDON: Para esta parte cambia los parametros y pone la clase que ocupes y en vez de asignar los parametros hazle un get
        JPanel resultado = new JPanel(new GridLayout(2,2));
        JPanel auxiliarMonto, auxiliarPago, auxiliarModalidad, auxiliarPlazo;
        JLabel labelMonto, labelPago, labelModalidad, labelPlazo;
        JTextField fieldMonto, fieldPago, fieldModalidad, fieldPlazo;
        
        //Creamos los paneles auxiliares
        auxiliarMonto = new JPanel(new GridLayout(1,2));
        auxiliarPago = new JPanel(new GridLayout(1,2));
        auxiliarModalidad = new JPanel(new GridLayout(1,2));
        auxiliarPlazo = new JPanel(new GridLayout(1,2));
        
        //Creamos los labels y fields para cada panel y luego lo agregamos a su panel correspondiente
        //Monto
        labelMonto = new JLabel("Monto:");
        fieldMonto = new JTextField(monto);
        fieldMonto.setEditable(false);
        auxiliarMonto.add(labelMonto);
        auxiliarMonto.add(fieldMonto);
        
        //Pago
        labelPago = new JLabel("Pago:");
        fieldPago = new JTextField(pago);
        fieldPago.setEditable(false);
        auxiliarPago.add(labelPago);
        auxiliarPago.add(fieldPago);
        
        //Modalidad
        labelModalidad = new JLabel("Modalidad:");
        fieldModalidad = new JTextField(modalidad);
        fieldModalidad.setEditable(false);
        auxiliarModalidad.add(labelModalidad);
        auxiliarModalidad.add(fieldModalidad);
        
        //Plazo
        labelPlazo = new JLabel("Plazo:");
        fieldPlazo = new JTextField(plazo);
        fieldModalidad.setEditable(false);
        auxiliarPlazo.add(labelPlazo);
        auxiliarPlazo.add(fieldPlazo);
        
        //Agregamos todos los paneles auxiliares al panel principal
        resultado.add(auxiliarMonto);
        resultado.add(auxiliarPago);
        resultado.add(auxiliarModalidad);
        resultado.add(auxiliarPlazo);
        
        
        return resultado;
    }
    
    private void MostrarListadoCreditosCliente(){
        initComponents();
        JPanel pruebaPanel = new JPanel(new GridBagLayout());
        pruebaPanel = AgregarNuevoPanel(pruebaPanel);
        pruebaPanel.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me){
                MostrarFormularioEdicionCredito( 1);
            }
        });
        pruebaPanel.updateUI();
        panelCreditos.setViewportView(pruebaPanel);
        panelCreditos.updateUI();
        
    }
    
    private JPanel AgregarNuevoPanel(JPanel panelRetorno){
        //Para agregar un nuevo usaremos una variable contador para las columnas asi sera reactivo
        // La columna de las y en la variable gbc son los renglones
        gbc.gridx = 0;
        gbc.gridy = contador;
        
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        contador++;
        String monto = "$2000";
        String pago = "$300";
        String modalidad = "Diario";
        String plazo = "25 dias";
            
        panelRetorno.add(CreaPanelCredito(monto,pago,modalidad,plazo),gbc);
        
        //Regresamos as los valores default para el siguiente
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        return panelRetorno;
    }
    
    private void MostrarFormularioNuevoCredito(){
        JDialog modalCredito = new JDialog();
        //Va a devolver un tipo de clase para la base de datos por lo mientras lo dejare en void
        JTextField montoField, pagoNecesarioField;
        JLabel montoLabel, pagoModalidadLabel, pagoPlazoLabel, pagoNecesarioLabel;
        GridBagConstraints gbc = new GridBagConstraints();
        JButton subirCredito;
        JComboBox opcionesModalidad, opcionesPlazos;
        String [] opcionesTexto = {"Diario", "Semanal", "Quincenal", "Mensual"};
        String [] opcionesPlazoSemanal = {"8 Semanas", "12 Semanas", "16 Semanas", "20 Semanas"};
        String [] opcionesPlazoQuincenal = {"4 Quincenas", "6 Quincenas", "8 Quincenas"};
        ImageIcon iconoBotonSubir;

        // Propiedades de la ventana
        modalCredito.setTitle("Nuevo Credito");
	modalCredito.setSize(1002, 680);
	modalCredito.setLocationRelativeTo(null);
	modalCredito.setResizable(false);
	modalCredito.setLayout(new GridBagLayout());
        modalCredito.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //Creamos los labels
        montoLabel = new JLabel("Monto requerido");
        pagoModalidadLabel = new JLabel("Modalidad de pago");
        pagoPlazoLabel = new JLabel("Pazo de Plago");
        pagoNecesarioLabel = new JLabel("Pago necesario");

        //Creamos los Fields
        montoField = new JTextField();
        pagoNecesarioField = new JTextField();
       
        //Creamos el combobox
        DefaultComboBoxModel<String> modeloSemanal = new DefaultComboBoxModel<>(opcionesPlazoSemanal);
        DefaultComboBoxModel<String> modeloQuincenal = new DefaultComboBoxModel<>(opcionesPlazoQuincenal);
        opcionesPlazos = new JComboBox(modeloSemanal);
        opcionesModalidad = new JComboBox(opcionesTexto);
        
        opcionesModalidad.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int opcion = opcionesModalidad.getSelectedIndex();
                switch(opcion){
                    case 0:
                        opcionesPlazos.removeAllItems();
                        opcionesPlazos.addItem("25 dias");
                        break;
                        
                    case 1:
                        opcionesPlazos.setModel(modeloSemanal);
                        break;
                    
                    case 2:
                        opcionesPlazos.setModel(modeloQuincenal);
                        break;
                    
                    case 3:
                        opcionesPlazos.removeAllItems();
                        opcionesPlazos.addItem("1 Mes");
                        break;
                }
            }
        });
        

        //Creamos el boton de submit con el icono
        ImageIcon iconoBotonNuevoCredito = new ImageIcon("/Imagenes/AgregarCredito.png");
        subirCredito = new JButton("Nuevo Credito",iconoBotonNuevoCredito);

        //Definimos el Tamaño del boton
        subirCredito.setSize(new Dimension(285,65));

        //Creamos las configuraciones de las constantes
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        //Agregamos el monto
        modalCredito.add(montoLabel,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        modalCredito.add(montoField,gbc);
        
        //Agregamos el pago Modalidad
        gbc.gridx = 0;
        gbc.gridy = 1;
        modalCredito.add(pagoModalidadLabel,gbc);
        gbc.gridx = 1;
        gbc.gridx = 1;
        modalCredito.add(opcionesModalidad,gbc);
        
        //Agregamos el pago plazo
        gbc.gridx = 0;
        gbc.gridy = 2;
        modalCredito.add(pagoPlazoLabel,gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        modalCredito.add(opcionesPlazos,gbc);
        
        //Agreagamos el pago Necesario
        gbc.gridx = 0;
        gbc.gridy = 3;
        modalCredito.add(pagoNecesarioLabel,gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        modalCredito.add(pagoNecesarioField,gbc);
        
        
        
        //Default
        gbc.gridy = 0;
        gbc.gridx = 0; 

        //Accion del boton
        subirCredito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Sacamos los inputs de los Field
                //BRANDON: Pon el set de la clase que usaras antes de los gets para que se los asignes
                montoField.getText();
                pagoNecesarioField.getText();
                opcionesModalidad.getSelectedItem();
                opcionesPlazos.getSelectedItem();
                
                //Se sube a la base de datos 
                if(EnviarDatosNuevoCredito() == 1){
                    MostrarConfirmacionDeCreacion();
                }
                
            }
        });

        //Agregamos el boton
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        
        modalCredito.add(subirCredito,gbc);
        modalCredito.setVisible(true);
        
    }
    
    //BRANDON: Para este metodo pasale de parametro el objeto y haz la consulta desde el metodo
    private int EnviarDatosNuevoCredito(){
        return 1;
    }
    
    private void MostrarFormularioEdicionCredito( int parametroConsulta){
        JDialog modalCredito = new JDialog();
        //Va a devolver un tipo de clase para la base de datos por lo mientras lo dejare en void
        JTextField montoField, pagoNecesarioField;
        JLabel montoLabel, pagoModalidadLabel, pagoPlazoLabel, pagoNecesarioLabel;
        GridBagConstraints gbc = new GridBagConstraints();
        JButton subirCredito;
        JComboBox opcionesModalidad, opcionesPlazos;
        String [] opcionesTexto = {"Diario", "Semanal", "Quincenal", "Mensual"};
        String [] opcionesPlazoSemanal = {"8 Semanas", "12 Semanas", "16 Semanas", "20 Semanas"};
        String [] opcionesPlazoQuincenal = {"4 Quincenas", "6 Quincenas", "8 Quincenas"};
        ImageIcon iconoBotonSubir;

        // Propiedades de la ventana
        modalCredito.setTitle("Nuevo Credito");
        modalCredito.setModal(true);
	modalCredito.setSize(1002, 680);
	modalCredito.setLocationRelativeTo(null);
	modalCredito.setResizable(false);
	modalCredito.setLayout(new GridBagLayout());
        modalCredito.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //Creamos los labels
        //BRANDON :En los constructores haz un get de la clase para que lo ponga en el formulario
        montoLabel = new JLabel("Monto requerido");
        pagoModalidadLabel = new JLabel("Modalidad de pago");
        pagoPlazoLabel = new JLabel("Pazo de Plago");
        pagoNecesarioLabel = new JLabel("Pago necesario");

        //Creamos los Fields
        montoField = new JTextField();
        pagoNecesarioField = new JTextField();
       
        //Creamos el combobox
        DefaultComboBoxModel<String> modeloSemanal = new DefaultComboBoxModel<>(opcionesPlazoSemanal);
        DefaultComboBoxModel<String> modeloQuincenal = new DefaultComboBoxModel<>(opcionesPlazoQuincenal);
        opcionesPlazos = new JComboBox(modeloSemanal);
        opcionesModalidad = new JComboBox(opcionesTexto);
        
        opcionesModalidad.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int opcion = opcionesModalidad.getSelectedIndex();
                switch(opcion){
                    case 0:
                        opcionesPlazos.removeAllItems();
                        opcionesPlazos.addItem("25 dias");
                        break;
                        
                    case 1:
                        opcionesPlazos.setModel(modeloSemanal);
                        break;
                    
                    case 2:
                        opcionesPlazos.setModel(modeloQuincenal);
                        break;
                    
                    case 3:
                        opcionesPlazos.removeAllItems();
                        opcionesPlazos.addItem("1 Mes");
                        break;
                }
            }
        });
        

        //Creamos el boton de submit con el icono
        ImageIcon iconoBotonNuevoCredito = new ImageIcon("/Imagenes/AgregarCredito.png");
        subirCredito = new JButton("Nuevo Credito",iconoBotonNuevoCredito);

        //Definimos el Tamaño del boton
        subirCredito.setSize(new Dimension(285,65));

        //Creamos las configuraciones de las constantes
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        //Agregamos el monto
        modalCredito.add(montoLabel,gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        modalCredito.add(montoField,gbc);
        
        //Agregamos el pago Modalidad
        gbc.gridx = 0;
        gbc.gridy = 1;
        modalCredito.add(pagoModalidadLabel,gbc);
        gbc.gridx = 1;
        gbc.gridx = 1;
        modalCredito.add(opcionesModalidad,gbc);
        
        //Agregamos el pago plazo
        gbc.gridx = 0;
        gbc.gridy = 2;
        modalCredito.add(pagoPlazoLabel,gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        modalCredito.add(opcionesPlazos,gbc);
        
        //Agreagamos el pago Necesario
        gbc.gridx = 0;
        gbc.gridy = 3;
        modalCredito.add(pagoNecesarioLabel,gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        modalCredito.add(pagoNecesarioField,gbc);
        
        
        
        //Default
        gbc.gridy = 0;
        gbc.gridx = 0; 

        //Accion del boton
        subirCredito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Sacamos los inputs de los Field
                //BRANDON: Pon el set de la clase que usaras antes de los gets para que se los asignes
                montoField.getText();
                pagoNecesarioField.getText();
                opcionesModalidad.getSelectedItem();
                opcionesPlazos.getSelectedItem();
                
                //Se sube a la base de datos 
                if(EnviarDatosNuevoCredito() == 1){
                    MostrarConfirmacionDeCreacion();
                }
                
            }
        });

        //Agregamos el boton
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        
        modalCredito.add(subirCredito,gbc);
        modalCredito.setVisible(true);
    }
    
    private int MostrarConfirmacionDeEliminacion(){
        String textoAlerta = "¿Estas seguro de que quieres eliminar este Credito?";
        int resultadoOpcion;
        
        resultadoOpcion = JOptionPane.showConfirmDialog(null, textoAlerta , "Selecciona una opción", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        
        return resultadoOpcion;
    }
    
    private void MostrarConfirmacionDeCreacion(){
        String textoAlerta = "Este empleado se subio correctamente a la base de datos";
        JOptionPane alertaError = new JOptionPane(textoAlerta,JOptionPane.INFORMATION_MESSAGE);
        JDialog modalAlerta = alertaError.createDialog("Inserción Correcta");
        modalAlerta.setAlwaysOnTop(true);
        modalAlerta.setVisible(true);
    }
    
    private void MostrarConfirmacionDeCambios(){
        String textoAlerta = "Este credito fue modificado correctamente";
        JOptionPane alertaError = new JOptionPane(textoAlerta,JOptionPane.INFORMATION_MESSAGE);
        JDialog modalAlerta = alertaError.createDialog("Inserción Correcta");
        modalAlerta.setAlwaysOnTop(true);
        modalAlerta.setVisible(true);
    }
    
    private void MostrarErrorNumeroMaximoCreditosActuales(){
        String textoAlerta = "El cliente cuenta con el numero maximo de creditos";

        JOptionPane alertaError = new JOptionPane(textoAlerta,JOptionPane.ERROR_MESSAGE);
        JDialog modalAlerta = alertaError.createDialog("Limite Superado");
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
            java.util.logging.Logger.getLogger(VentanaCreditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCreditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCreditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCreditos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCreditos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCredito;
    private javax.swing.JButton botonEliminarCredito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelCreditos;
    private javax.swing.JLabel labelInformacion;
    private javax.swing.JLabel logoEmpresa;
    private javax.swing.JScrollPane panelCreditos;
    // End of variables declaration//GEN-END:variables
}
