/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package diu.sistemafutbol.Vista;

import diu.sistemafutbol.Controlador.Controlador;
import diu.sistemafutbol.Controlador.EstudianteControlador;
import diu.sistemafutbol.Controlador.PagosControlador;
import diu.sistemafutbol.Modelo.Pagos;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Belial
 */
public class GestionPagos extends javax.swing.JInternalFrame {

    ArrayList<Pagos> ListaPagosModelo = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();
    // private List<Pagos> pagosList;

    Controlador conectar = new Controlador();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public GestionPagos() {
        initComponents();
        setModelo();
        
    }

    public void setModelo() {
        String[] cabecera = {"Cédula", "Nombres", "Apellidos", "Fecha de Pago", "Estado", "Monto"};
        modelo.setColumnIdentifiers(cabecera);
        tblPagos.setModel(modelo);
    }

    private void cargarDatosEnTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblPagos.getModel();
        modeloTabla.setRowCount(0);

        PagosControlador controlador = new PagosControlador();
        ArrayList<Object[]> listaPagos = controlador.obtenerPagos();
        for (Object[] pago : listaPagos) {
            modeloTabla.addRow(pago);
        }
    }

    private void mostrarPagosEnTabla(ArrayList<Pagos> listaPagos) {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblPagos.getModel();
        modeloTabla.setRowCount(0);

        for (Pagos pago : listaPagos) {
            Object[] fila = new Object[6];
            fila[0] = pago.getCiEstudiante();
            fila[1] = pago.getNombreEs();
            fila[2] = pago.getApellidoEs();
            fila[3] = pago.getFechaPago();
            fila[4] = pago.getEstado();
            fila[5] = pago.getMonto();
            modeloTabla.addRow(fila);
        }
    }

//    private void setDatos() {
//
//        Object[] filas = new Object[modelo.getColumnCount()];
//        int contador = 1;
//        for (Pagos datos : ListaPagosModelo) {
// 
//            filas[0] = contador;
//            filas[1] = datos.getCiEstudiante();
//            filas[2] = datos.getNombreEs();
//            filas[3] = datos.getApellidoEs();
//            filas[4] = datos.getFechaPago();
//            filas[5] = datos.getEstado();
//            filas[6] = datos.getMonto();
// 
//        }
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPagos = new javax.swing.JTable();
        txtCedula = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        btnver1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("PAGOS");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE PAGOS");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel2.setText("Buscar:");

        btnver.setText("Buscar");
        btnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverActionPerformed(evt);
            }
        });

        tblPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPagosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPagos);

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Debe", "Pagado" }));
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        btnver1.setText("PDF");
        btnver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnver1ActionPerformed(evt);
            }
        });

        jButton1.setText("PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnver)
                                .addGap(57, 57, 57)
                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 106, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(btnver1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(159, 159, 159))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnver1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverActionPerformed

        DefaultTableModel modeloTabla = (DefaultTableModel) tblPagos.getModel();
        modeloTabla.setRowCount(0);

        PagosControlador controlador = new PagosControlador();
        ArrayList<Object[]> listaPagos = controlador.VerPagosCedula(txtCedula.getText());
        for (Object[] pago : listaPagos) {
            modeloTabla.addRow(pago);
        }


    }//GEN-LAST:event_btnverActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        this.limpiarTabla();
        cargarDatosEnTabla();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        cargarDatosEnTabla();
    }//GEN-LAST:event_formInternalFrameActivated

    private void tblPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPagosMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tblPagos.getModel();
        PagosUsuario pu = new PagosUsuario();
        pu.jblCedula.setText(dtm.getValueAt(tblPagos.getSelectedRow(), 0).toString());
        pu.jblNombre.setText(dtm.getValueAt(tblPagos.getSelectedRow(), 1).toString());
        pu.jblApellido.setText(dtm.getValueAt(tblPagos.getSelectedRow(), 2).toString());
        pu.jblFecha.setText(dtm.getValueAt(tblPagos.getSelectedRow(), 3).toString());
        pu.jblEstado.setText(dtm.getValueAt(tblPagos.getSelectedRow(), 4).toString());
        pu.jblMonto.setText(dtm.getValueAt(tblPagos.getSelectedRow(), 5).toString());
        pu.setVisible(true);
        
    }//GEN-LAST:event_tblPagosMouseClicked

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        DefaultTableModel modeloTabla = (DefaultTableModel) tblPagos.getModel();
        modeloTabla.setRowCount(0);

        PagosControlador controlador = new PagosControlador();
        ArrayList<Object[]> listaPagos = controlador.VerPagosEstado(cbEstado.getSelectedItem().toString());
        for (Object[] pago : listaPagos) {
            modeloTabla.addRow(pago);
        }
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void btnver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnver1ActionPerformed
         ArrayList<Object[]> lista = new ArrayList<>();
        PagosControlador ec = new PagosControlador();
        lista = ec.obtenerPagos();
        pdfListaPagos pdf = new pdfListaPagos(LocalDate.now(), lista);
        try {
            pdf.crearpdfTablas();
        } catch (IOException ex) {
            Logger.getLogger(GestionPagos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnver1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<Object[]> lista = new ArrayList<>();
        PagosControlador ec = new PagosControlador();
        lista = ec.VerPagosEstado(cbEstado.getSelectedItem().toString());
        pdfListaPagos pdf = new pdfListaPagos(LocalDate.now(), lista);
        try {
            pdf.crearpdfTablasEstado(cbEstado.getSelectedItem().toString());
        } catch (IOException ex) {
            Logger.getLogger(GestionPagos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void limpiarTabla() {
        modelo.setDataVector(null, new Object[]{"Cédula", "Nombres", "Apellidos", "Fecha de Pago", "Estado", "Monto"});
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnver;
    private javax.swing.JButton btnver1;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPagos;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
