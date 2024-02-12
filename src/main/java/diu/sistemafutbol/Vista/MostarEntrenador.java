/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package diu.sistemafutbol.Vista;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import diu.sistemafutbol.Controlador.Controlador;
import diu.sistemafutbol.Controlador.EntrenadorControlador;
import diu.sistemafutbol.Controlador.EstudianteControlador;
import diu.sistemafutbol.Modelo.Entrenador;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin
 */
public class MostarEntrenador extends javax.swing.JInternalFrame {

    ArrayList<Entrenador> ListaEntrenador = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();
    Controlador conectar = new Controlador();
    Connection conectado = (Connection) conectar.conectar();

    public MostarEntrenador() {
        initComponents();
        setModelo();
        btnUsuario.setEnabled(false);
        btnUsuario.setVisible(false);
        btnAdmin.setEnabled(false);
        btnAdmin.setVisible(false);
    }

    public void setModelo() {

        String[] cabecera = {"Nro", "Cedula", "Nombre", "Apellido", "Teléfono", "Usuario", "Contraseña", "Rol"};
        modelo.setColumnIdentifiers(cabecera);
        tbEntrenador.setModel(modelo);
    }

    private void setDatos() {

        Object[] filas = new Object[modelo.getColumnCount()];
        int contador = 1;
        for (Entrenador datos : ListaEntrenador) {
            filas[0] = contador;
            filas[1] = datos.getCedulaE();
            filas[2] = datos.getNombreEnt();
            filas[3] = datos.getApellidoEnt();
            filas[4] = datos.getTelefono();
            filas[5] = datos.getUsuario();
            filas[6] = datos.getContrasena();
            filas[7] = datos.getRol();

            modelo.addRow(filas);
            contador++;
        }
        tbEntrenador.setModel(modelo);
    }

    public void cargarTabla() {

        EntrenadorControlador ec = new EntrenadorControlador();
        ArrayList<Object[]> lista = ec.datosEntrenador();
        for (Object[] Filas : lista) {
            modelo.addRow(Filas);

        }
        tbEntrenador.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbEntrenador = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbRol = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mostrar Entrenador");
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
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        tbEntrenador.setFont(new java.awt.Font("Tw Cen MT", 2, 12)); // NOI18N
        tbEntrenador.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbEntrenador);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MOSTRAR ENTRENADORES");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ROL:");

        txtCedula.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOMBRE:");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CEDULA:");

        cbRol.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USUARIO", "ADMINISTRADOR" }));
        cbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRolActionPerformed(evt);
            }
        });

        jButton1.setText("pdf");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Descargar Entrenadores:");

        btnAdmin.setText("PDF");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnUsuario.setText("PDF");
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(195, 195, 195)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdmin)
                            .addComponent(btnUsuario))
                        .addGap(101, 101, 101))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4))
                    .addComponent(cbRol))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdmin)))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton1)
                    .addComponent(btnEliminar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        this.cargarTabla();
    }//GEN-LAST:event_formInternalFrameActivated

    private void cbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRolActionPerformed
        datosRol();
        if (cbRol.getSelectedItem().toString().equalsIgnoreCase("Usuario")) {
            btnUsuario.setEnabled(true);
            btnUsuario.setVisible(true);
            btnAdmin.setEnabled(false);
            btnAdmin.setVisible(false);
        } else {
            btnAdmin.setEnabled(true);
            btnAdmin.setVisible(true);
            btnUsuario.setEnabled(false);
            btnUsuario.setVisible(false);
        }

    }//GEN-LAST:event_cbRolActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       limpiarTabla();
       cargarTabla();
    }//GEN-LAST:event_formMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ArrayList<Object[]> lista = new ArrayList<>();
        EntrenadorControlador ec = new EntrenadorControlador();
        lista = ec.datosEntrenador();
        PdfEntrenador pdf = new PdfEntrenador(LocalDate.now(), lista);
        try {
            pdf.CrearPdf();
        } catch (DocumentException ex) {
            Logger.getLogger(MostarEntrenador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        EntrenadorControlador ec = new EntrenadorControlador();
        ArrayList<Object[]> lista = ec.buscarNombre(txtNombre.getText());
        this.limpiarTabla();
        for (Object[] Filas : lista) {
            modelo.addRow(Filas);

        }
        tbEntrenador.setModel(modelo);
    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
        EntrenadorControlador ec = new EntrenadorControlador();
        ArrayList<Object[]> lista = ec.buscarCedula(txtCedula.getText());
        this.limpiarTabla();
        for (Object[] Filas : lista) {
            modelo.addRow(Filas);

        }
        tbEntrenador.setModel(modelo);
    }//GEN-LAST:event_txtCedulaKeyPressed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        ArrayList<Object[]> lista = new ArrayList<>();
        EntrenadorControlador ec = new EntrenadorControlador();
        String usuario ="USUARIO";
        lista = ec.buscarRol(usuario);
        PdfEntrenador pdf = new PdfEntrenador(LocalDate.now(), lista);
        try {
            pdf.CrearPdfUsuario();
        } catch (DocumentException ex) {
            Logger.getLogger(MostarEntrenador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        ArrayList<Object[]> lista = new ArrayList<>();
        EntrenadorControlador ec = new EntrenadorControlador();
        String usuario ="ADMINISTRADOR";
        lista = ec.buscarRol(usuario);
        PdfEntrenador pdf = new PdfEntrenador(LocalDate.now(), lista);
        try {
            pdf.CrearPdfAdministrador();
        } catch (DocumentException ex) {
            Logger.getLogger(MostarEntrenador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarEntrenador();
    }//GEN-LAST:event_btnEliminarActionPerformed
    //OBTENER DATOS POR ROL
    public void datosRol() {
        EntrenadorControlador ec = new EntrenadorControlador();
        ArrayList<Object[]> lista = ec.buscarRol(cbRol.getSelectedItem().toString());
        this.limpiarTabla();
        for (Object[] Filas : lista) {
            modelo.addRow(Filas);

        }
        tbEntrenador.setModel(modelo);

    }

    public void limpiarTabla() {
        modelo.setDataVector(null, new Object[]{"Nro", "Cedula", "Nombre", "Apellido", "Teléfono", "Usuario", "Contraseña", "Rol"});
    }

       
    public void eliminarEntrenador() {

        int fila = tbEntrenador.getSelectedRow();
        String valor = tbEntrenador.getValueAt(fila, 0).toString();

        try {
            PreparedStatement eliminar = conectado.prepareStatement("DELETE FROM entrenador WHERE CedulaEntrenador = '" + valor + "'");
            eliminar.executeUpdate();
            limpiarTabla();
            cargarTabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e + " No se pudo eliminar el registro");
        }
    }

    /*public void generarEntrenador() {

        try {
            FileOutputStream ar = new FileOutputStream("Entrenadores.pdf");
            Document d = new Document();
            PdfWriter.getInstance(d, ar);
            d.open();

            Paragraph parrafo = new Paragraph();
            Paragraph titulo = parrafo;
            titulo.add("Lista de Entrenadores");
            parrafo.add("La escuela de fútbol \"IMBABURA\" se enorgullece de "
                    + "contar con un equipo de entrenadores altamente calificados "
                    + "y dedicados, comprometidos con el desarrollo deportivo y personal"
                    + " de cada estudiante. A continuación, se presenta una "
                    + "tabla con los datos de los entrenadores");
            titulo.setAlignment(1);
            parrafo.setAlignment(0);
            d.add(titulo);
            d.add(parrafo);
            int rowCount = tbEntrenador.getRowCount();
            int columnCount = tbEntrenador.getColumnCount();

            // Recorrer todas las filas y columnas de la tabla
            for (int row = 0; row < rowCount; row++) {
                for (int col = 0; col < columnCount; col++) {
                    // Obtener el valor de la celda en la posición actual
                    Object value = tbEntrenador.getValueAt(row, col);

                    // Agregar el valor al documento PDF
                    d.add(new Paragraph(value != null ? value.toString() : ""));
                }
            }

            // Cerrar el documento
            d.close();
            File file = new File("entrenadores.pdf");
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(file);
            }

            System.out.println("Documento PDF generado correctamente.");
        } catch (DocumentException | IOException e) {
            System.out.println(e);
        }

    }*/
    public ArrayList<Object[]> ObtenerDatos() {
        ArrayList<Object[]> listaEntrenadores = new ArrayList<>();
        for (int i = 1; i < modelo.getRowCount(); i++) {
            Object[] datosFila = new Object[modelo.getColumnCount()];

            for (int j = 0; j < modelo.getColumnCount(); j++) {
                datosFila[j] = modelo.getValueAt(i, j);
            }
            listaEntrenadores.add(datosFila);

        }
        System.out.println(listaEntrenadores);
        return listaEntrenadores;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JComboBox<String> cbRol;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbEntrenador;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
