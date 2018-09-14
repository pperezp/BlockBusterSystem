package com.blockbuster.gui;

import com.blockbuster.model.Cliente;
import com.blockbuster.model.Data;
import com.blockbuster.model.Empleado;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class App extends javax.swing.JFrame {
    private Data d;
    private final String NOMBRE = "BlockBuster System";
    private final String VERSION = "v0.1";
    
    public App() {
        try {
            initComponents();
            
            d = new Data();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setLocationRelativeTo(null);
        setTitle(NOMBRE+" "+VERSION);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formMenu = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRunCrear = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccionCliente = new javax.swing.JTextArea();
        txtFechaNacimiento = new javax.swing.JTextField();
        btnCrearCliente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        lblEmpleado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRutSesion = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Emprestar", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Devolver", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Películas", jPanel2);

        jTabbedPane3.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel2.setText("RUN:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Dirección:");

        jLabel5.setText("Fecha de nacimiento:");

        txtRunCrear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRunCrearKeyReleased(evt);
            }
        });

        txtNombreCliente.setEditable(false);

        txtDireccionCliente.setEditable(false);
        txtDireccionCliente.setColumns(20);
        txtDireccionCliente.setRows(5);
        jScrollPane1.setViewportView(txtDireccionCliente);

        txtFechaNacimiento.setEditable(false);

        btnCrearCliente.setText("Crear cliente");
        btnCrearCliente.setEnabled(false);

        jLabel6.setText("Edad:");

        jTextField1.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaNacimiento)
                    .addComponent(jScrollPane1)
                    .addComponent(txtNombreCliente)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 199, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrearCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRunCrear))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRunCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearCliente)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Clientes", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Películas", jPanel7);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Registro", jPanel3);

        lblEmpleado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmpleado.setForeground(new java.awt.Color(0, 153, 153));
        lblEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout formMenuLayout = new javax.swing.GroupLayout(formMenu.getContentPane());
        formMenu.getContentPane().setLayout(formMenuLayout);
        formMenuLayout.setHorizontalGroup(
            formMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(lblEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        formMenuLayout.setVerticalGroup(
            formMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Inicio de sesión"));

        jLabel1.setText("RUN: ");

        txtRutSesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRutSesionKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtRutSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRutSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIniciarSesion)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        validacion();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void txtRutSesionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutSesionKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            validacion();
        }
    }//GEN-LAST:event_txtRutSesionKeyPressed

    private void txtRunCrearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRunCrearKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                String run = txtRunCrear.getText();
                
                Cliente c = d.getCliente(run);
                
                if(c == null){
                    // no esta en la bd
                    txtNombreCliente.setEditable(true);
                    txtDireccionCliente.setEditable(true);
                    txtFechaNacimiento.setEditable(true);
                    btnCrearCliente.setEnabled(true);
                }else{
                    txtNombreCliente.setText(c.getNombre());
                    txtDireccionCliente.setText(c.getDireccion());
                    // SimpleDateFormat
                    txtFechaNacimiento.setText(c.getFechaNacimiento().toString());
                    btnCrearCliente.setEnabled(false);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtRunCrearKeyReleased

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JFrame formMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JTextArea txtDireccionCliente;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtRunCrear;
    private javax.swing.JTextField txtRutSesion;
    // End of variables declaration//GEN-END:variables

    private void validacion() {
        try {
            String run = txtRutSesion.getText();
            
            Empleado emp = d.existeEmpleado(run);
            
            if(emp == null){
                txtRutSesion.selectAll();
                txtRutSesion.requestFocus();
                JOptionPane.showMessageDialog(this, "No puede ingresar el sistema", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                lblEmpleado.setText(emp.getNombre());
                formMenu.setBounds(0, 0, 800, 600);
                formMenu.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
