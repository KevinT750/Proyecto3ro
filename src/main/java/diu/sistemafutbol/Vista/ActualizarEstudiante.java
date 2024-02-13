/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package diu.sistemafutbol.Vista;

import diu.sistemafutbol.Controlador.EstudianteControlador;
import diu.sistemafutbol.Modelo.Estudiante;
import java.awt.Color;
import java.time.LocalDate;

/**
 *
 * @author kevin
 */
public class ActualizarEstudiante extends javax.swing.JInternalFrame {

    Estudiante es = new Estudiante();

    public ActualizarEstudiante() {
        initComponents();
        Estudiante.posicion(cbPosicion);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jblCedula1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbSubPosicion = new javax.swing.JComboBox<>();
        txtTelefono = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        jblCedula3 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        jblNombre = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jblNombre3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        cbPosicion = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        jblCedula6 = new javax.swing.JLabel();
        jblCedula5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jblCedula7 = new javax.swing.JLabel();
        txtActualizar = new javax.swing.JButton();
        jblCedula = new javax.swing.JLabel();
        jbaño = new javax.swing.JLabel();
        jblEdad = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ACTUALIZAR USUARIO");

        jblCedula1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jblCedula1.setText("Telefono:");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 3, 36)); // NOI18N
        jLabel9.setText("USUARIO");

        txtTelefono.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        txtPeso.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        jblCedula3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jblCedula3.setText("Apellido:");

        txtAltura.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        jblNombre.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jblNombre.setText("Nombres:");

        txtApellido.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        jblNombre3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jblNombre3.setText("Correo:");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel6.setText("Posicion:");

        cbPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPosicionActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        jblCedula6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jblCedula6.setText("SubPosicion:");

        jblCedula5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jblCedula5.setText("Peso:");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Actualizar Estudiante");

        jblCedula7.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jblCedula7.setText("Altura:");

        txtActualizar.setText("ACTUALIZAR");
        txtActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualizarActionPerformed(evt);
            }
        });

        jblCedula.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N

        jbaño.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jbaño.setText("AÑOS");

        jblEdad.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N

        jButton1.setText("PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("MODIFICAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jblCedula1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cbSubPosicion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtTelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtPeso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jblCedula3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtAltura, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jblNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jblNombre3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtCorreo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cbPosicion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jblCedula6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jblCedula5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jblCedula7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtActualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jblCedula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbaño, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jblEdad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(129, 129, 129)
                        .addComponent(jblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbaño, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jblCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jblCedula5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtActualizar, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jblCedula3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jblNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jblCedula6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCorreo)
                                            .addComponent(txtApellido)
                                            .addComponent(cbSubPosicion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(73, 73, 73)
                                                .addComponent(jblCedula7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(jButton2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addComponent(txtAltura)))))
                            .addComponent(jblCedula1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(87, 87, 87))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9)
                        .addComponent(jblCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbaño, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblCedula3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jblNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jblCedula6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbSubPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jblCedula7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cbPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jblCedula5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtActualizar)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPosicionActionPerformed
        Estudiante.subposicion(cbPosicion, cbSubPosicion);
    }//GEN-LAST:event_cbPosicionActionPerformed

    private void txtActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualizarActionPerformed
        validarNP(txtNombre.getText(), txtApellido.getText());
        System.out.println(txtNombre.getText()+ txtApellido.getText());
        System.out.println(jblCedula);
        //VALIDAR SI EL CAMPO TELEFONO CUMPLE CON EL REQUISITO DE 09 Y 8 DIGITOS MAS
        es.setTelefono(txtTelefono.getText());
        //VALIDA SI EL CORREO ELECTRONICO CUMPLE CON EL REQUISITO NOMBRE@GMAIL.COM
        validarCorreo(txtCorreo.getText());
        es.setPeso(Double.valueOf(txtPeso.getText()));
        es.setEstatura(Double.valueOf(txtAltura.getText()));
        es.setPosicion(cbPosicion.getSelectedItem().toString());
        es.setSubposicion(cbSubPosicion.getSelectedItem().toString());
        es.setCiEstudiante(jblCedula.getText());
        EstudianteControlador ec = new EstudianteControlador();
        
        ec.actualizarEstudiantes(es);
    }//GEN-LAST:event_txtActualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pdfEstudiante pd= new pdfEstudiante(LocalDate.now(), txtNombre.getText(), txtApellido.getText(),
                jblCedula.getText(), txtTelefono.getText(),
                jblEdad.getText(), txtCorreo.getText(),cbPosicion.getSelectedItem().toString()
                ,cbSubPosicion.getSelectedItem().toString()
                , txtPeso.getText(), txtAltura.getText());
        pd.crarPdfE();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public void validarNP(String nombre, String apellido) {

        String ValidaNom = "^[A-ZÁÉÍÓÚÜÑ][a-záéíóúüñ]+$";
        if (nombre.matches(ValidaNom)) {
            es.setNombres(nombre);
            txtNombre.setForeground(null);
        } else {

            txtNombre.setForeground(Color.red);
        }

        if (apellido.matches(ValidaNom)) {
            es.setApellidos(apellido);
            txtApellido.setForeground(null);
        } else {

            txtApellido.setForeground(Color.red);
        }
    }

    /*public void validarTelefono(String telefono) {
        String validar = "^09\\d+$";

        if (telefono.matches(validar)) {
            es.setTelefono(telefono);
            txtTelefono.setForeground(null);
        }
        txtTelefono.setForeground(Color.red);

    }*/

    public void validarCorreo(String correo) {
        String validar = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";
        if (correo.matches(validar)) {
            es.setCorreo(correo);
            txtCorreo.setForeground(null);
        } else {
            txtCorreo.setForeground(Color.red);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cbPosicion;
    public static javax.swing.JComboBox<String> cbSubPosicion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jbaño;
    public static javax.swing.JLabel jblCedula;
    private javax.swing.JLabel jblCedula1;
    private javax.swing.JLabel jblCedula3;
    private javax.swing.JLabel jblCedula5;
    private javax.swing.JLabel jblCedula6;
    private javax.swing.JLabel jblCedula7;
    public static javax.swing.JLabel jblEdad;
    private javax.swing.JLabel jblNombre;
    private javax.swing.JLabel jblNombre3;
    private javax.swing.JButton txtActualizar;
    public static javax.swing.JTextField txtAltura;
    public static javax.swing.JTextField txtApellido;
    public static javax.swing.JTextField txtCorreo;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtPeso;
    public static javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
