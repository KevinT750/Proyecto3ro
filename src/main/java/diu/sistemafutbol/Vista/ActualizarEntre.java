/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package diu.sistemafutbol.Vista;

import diu.sistemafutbol.Controlador.EntrenadorControlador;
import diu.sistemafutbol.Modelo.Entrenador;
import static diu.sistemafutbol.Vista.ActualizarEntrenador.txtApellido;
import static diu.sistemafutbol.Vista.ActualizarEntrenador.txtNombre;
import static diu.sistemafutbol.Vista.ActualizarEntrenador.txtTelefono;
import java.awt.Color;
import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author kevin
 */
public class ActualizarEntre extends javax.swing.JFrame {

    Entrenador es = new Entrenador();
    public ActualizarEntre() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtContrasena1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUsuario1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnModificar1 = new javax.swing.JButton();
        cbUsuario1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        bntActualizar1 = new javax.swing.JButton();
        btnPdf1 = new javax.swing.JButton();
        jblCedula1 = new javax.swing.JLabel();
        jblNumero1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 2, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CREAR ENTRENADOR");

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel10.setText("CEDULA:");

        txtNombre1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel11.setText("NOMBRE:");

        txtTelefono1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel12.setText("APELLIDO: ");

        txtApellido1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel13.setText("TELEFONO:");

        txtContrasena1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel14.setText("USUARIO:");

        txtUsuario1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel15.setText("CONTRASEÑA:");

        btnModificar1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btnModificar1.setText("Modificar");
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });

        cbUsuario1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador", " " }));
        cbUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUsuario1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel16.setText("ROL:");

        bntActualizar1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        bntActualizar1.setText("Actualizar");
        bntActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntActualizar1ActionPerformed(evt);
            }
        });

        btnPdf1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btnPdf1.setText("PDF");
        btnPdf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdf1ActionPerformed(evt);
            }
        });

        jblCedula1.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N

        jblNumero1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N

        jDesktopPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtNombre1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtTelefono1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtApellido1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtContrasena1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtUsuario1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnModificar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cbUsuario1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(bntActualizar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnPdf1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jblCedula1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jblNumero1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addComponent(jblNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jblCedula1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellido1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(bntActualizar1)
                .addGap(84, 84, 84)
                .addComponent(btnModificar1)
                .addGap(88, 88, 88)
                .addComponent(btnPdf1)
                .addGap(156, 156, 156))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel9))
                    .addComponent(jblNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txtContrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar1)
                            .addComponent(bntActualizar1)
                            .addComponent(btnPdf1))
                        .addGap(36, 36, 36))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        btnPdf1.setEnabled(false);
        btnPdf1.setVisible(false);
        bntActualizar1.setVisible(true);
        bntActualizar1.setEnabled(true);
    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void cbUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUsuario1ActionPerformed
        if (cbUsuario1.getSelectedItem().equals("Usuario")) {
            txtUsuario1.setEnabled(false);
            txtContrasena1.setEnabled(false);

        } else {

            txtUsuario1.setEnabled(true);
            txtContrasena1.setEnabled(true);
        }
    }//GEN-LAST:event_cbUsuario1ActionPerformed

    private void bntActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntActualizar1ActionPerformed
        validarNP(txtNombre1.getText(), txtApellido1.getText());
        validarTelefono(txtTelefono1.getText());
        es.setCedulaE(jblCedula1.getText());
        es.setRol(cbUsuario1.getSelectedItem().toString());
        es.setUsuario(txtUsuario1.getText());
        es.setContrasena(txtContrasena1.getText());
        EntrenadorControlador ec = new EntrenadorControlador();
        ec.ActualizarEntrenador(es);
    }//GEN-LAST:event_bntActualizar1ActionPerformed

    private void btnPdf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdf1ActionPerformed
        pdfEntrenadores pe = new pdfEntrenadores(LocalDate.now(), txtNombre1.getText(), txtApellido1.getText(),jblCedula1.getText() , txtTelefono1.getText());
        try {
            pe.crarPdfAdministrador();
        } catch (IOException ex) {
            Logger.getLogger(ActualizarEntrenador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPdf1ActionPerformed

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
            java.util.logging.Logger.getLogger(ActualizarEntre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarEntre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarEntre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarEntre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarEntre().setVisible(true);
            }
        });
    }
     public void validarNP(String nombre, String apellido) {

        String ValidaNom = "^[A-ZÁÉÍÓÚÜÑ][a-záéíóúüñ]+$";
        if (nombre.matches(ValidaNom)) {
            es.setNombreEnt(nombre);
            txtNombre1.setForeground(null);
        } else {

            txtNombre1.setForeground(Color.red);
        }

        if (apellido.matches(ValidaNom)) {
            es.setApellidoEnt(apellido);
            txtApellido1.setForeground(null);
        } else {

            txtApellido1.setForeground(Color.red);
        }
    }

    public void validarTelefono(String telefono) {
        String validar = "^09\\d+$";

        if (telefono.matches(validar)) {
            es.setTelefono(telefono);
            txtTelefono1.setForeground(null);
        }
        txtTelefono1.setForeground(Color.red);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntActualizar1;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JButton btnPdf1;
    public static javax.swing.JComboBox<String> cbUsuario1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jblCedula1;
    public static javax.swing.JLabel jblNumero1;
    public static javax.swing.JTextField txtApellido1;
    public static javax.swing.JTextField txtContrasena1;
    public static javax.swing.JTextField txtNombre1;
    public static javax.swing.JTextField txtTelefono1;
    public static javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables


}
