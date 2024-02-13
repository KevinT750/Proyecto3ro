/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package diu.sistemafutbol.Vista;

import diu.sistemafutbol.Controlador.Controlador;
import diu.sistemafutbol.Controlador.EntrenadorControlador;
import diu.sistemafutbol.Controlador.EstudianteControlador;
import diu.sistemafutbol.Modelo.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin
 */
public class VerEstudiante extends javax.swing.JInternalFrame {

    ArrayList<Estudiante> ListaPersonaModelo = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();

    Controlador conectar = new Controlador();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public VerEstudiante() {
        initComponents();
        setModelo();
    }

    public void setModelo() {
        String[] cabecera = {"Nro", "Cédula", "Nombres", "Apellidos", "Fecha de Nacimiento", "Telefono", "Provincia", "Canton", "Correo", "Edad", "Posicion", "SubPosicion", "Nacionalidad", "Peso", "Estatura"};
        modelo.setColumnIdentifiers(cabecera);
        tbDatosEs.setModel(modelo);
    }

    private void setDatos() {

        Object[] filas = new Object[modelo.getColumnCount()];
        int contador = 1;
        for (Estudiante datos : ListaPersonaModelo) {

            filas[0] = contador;
            filas[1] = datos.getCiEstudiante();
            filas[2] = datos.getNombres();
            filas[3] = datos.getApellidos();
            filas[4] = datos.getFechaNacimiento();
            filas[5] = datos.getTelefono();
            filas[6] = datos.getProvincia();
            filas[7] = datos.getCiudad();
            filas[8] = datos.getCorreo();
            filas[9] = datos.getEdad();
            filas[10] = datos.getPosicion();
            filas[11] = datos.getSubposicion();
            filas[12] = datos.getNacionalidad();
            filas[13] = datos.getPeso();
            filas[14] = datos.getEstatura();

            modelo.addRow(filas);
            contador++;
        }
        tbDatosEs.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatosEs = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEliminar = new javax.swing.JButton();
        txtActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ver Usuarios");
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

        Escritorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EscritorioMouseClicked(evt);
            }
        });

        tbDatosEs.setModel(new javax.swing.table.DefaultTableModel(
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
        tbDatosEs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDatosEsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDatosEs);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel1.setText("Buscar Por:");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel2.setText("Cedula:");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtEliminar.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtEliminar.setText("Eliminar");
        txtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarActionPerformed(evt);
            }
        });

        txtActualizar.setText("Actualizar");
        txtActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel4.setText("Buscar po Categoria:");

        cbCategoria.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prebenjamines", "Benjamines", "Alevines", "Infantiles", "Cadetes", "Juveniles" }));
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });

        jButton1.setText("PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Escritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(txtCedula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(txtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(txtEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(txtActualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(cbCategoria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(EscritorioLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EscritorioLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jButton1)
                        .addGap(100, 100, 100)
                        .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(txtActualizar)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtActualizar)
                    .addComponent(txtEliminar)
                    .addComponent(jButton1))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        this.cargarTabla();
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

        EstudianteControlador ec = new EstudianteControlador();
        ArrayList<Object[]> lista = ec.buscarPorNombre(txtNombre.getText());
        this.limpiarTabla();
        for (Object[] Filas : lista) {
            modelo.addRow(Filas);

        }
        tbDatosEs.setModel(modelo);
    }//GEN-LAST:event_txtNombreKeyTyped

    public void cargarTabla() {

        EstudianteControlador ec = new EstudianteControlador();
        ArrayList<Object[]> lista = ec.datosEstudiante();
        for (Object[] Filas : lista) {
            modelo.addRow(Filas);

        }
        tbDatosEs.setModel(modelo);
    }
    private void EscritorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscritorioMouseClicked
        this.limpiarTabla();
        cargarTabla();
    }//GEN-LAST:event_EscritorioMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        EstudianteControlador ec = new EstudianteControlador();
        ArrayList<Object[]> lista = ec.buscarPorCI(txtCedula.getText());
        this.limpiarTabla();
        for (Object[] Filas : lista) {
            modelo.addRow(Filas);

        }
        tbDatosEs.setModel(modelo);
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed
        eliminarEstudiante();

    }//GEN-LAST:event_txtEliminarActionPerformed

    private void txtActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualizarActionPerformed
        actualizarDatos();
        limpiarTabla();
        cargarTabla();
    }//GEN-LAST:event_txtActualizarActionPerformed

    private void tbDatosEsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDatosEsMouseClicked


    }//GEN-LAST:event_tbDatosEsMouseClicked

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
        datosCategoria();
    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<Object[]> lista = new ArrayList<>();
        EstudianteControlador ec= new EstudianteControlador();
        lista = ec.datosEstudiante();
        PdfETablas pdf = new PdfETablas(LocalDate.now(), lista);
        pdf.crearpdfTablas();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void datosCategoria() {
        EstudianteControlador ec = new EstudianteControlador();
        String categoriaSeleccionada = cbCategoria.getSelectedItem().toString();
        int categoriaID;

        // Determinar el ID de la categoría basado en el nombre seleccionado
        switch (categoriaSeleccionada) {
            case "Prebenjamines":
                categoriaID = 1;
                break;
            case "Benjamines":
                categoriaID = 2;
                break;
            case "Alevines":
                categoriaID = 3;
                break;
            case "Infantiles":
                categoriaID = 4;
                break;
            case "Cadetes":
                categoriaID = 5;
                break;
            case "Juveniles":
                categoriaID = 6;
                break;
            default:
                // Si la categoría no coincide con ninguna de las anteriores, salir del método
                return;
        }

        ArrayList<Object[]> lista = ec.estudiantesCategoria(categoriaID);
        this.limpiarTabla();
        for (Object[] Filas : lista) {
            modelo.addRow(Filas);

        }
        tbDatosEs.setModel(modelo);
    }

    public void eliminarEstudiante() {

        int fila = tbDatosEs.getSelectedRow();
        String valor = tbDatosEs.getValueAt(fila, 1).toString();

        try {
            PreparedStatement eliminar = conectado.prepareStatement("DELETE FROM estudiante WHERE CI_ESTUDIANTE = '" + valor + "'");
            eliminar.executeUpdate();
            limpiarTabla();
            cargarTabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e + " No se pudo eliminar el registro");
        }
    }

    public void actualizarDatos() {
        int fila = tbDatosEs.getSelectedRow();

        String ci = tbDatosEs.getValueAt(fila, 0).toString();
        String nombre = tbDatosEs.getValueAt(fila, 1).toString();
        String apellido = tbDatosEs.getValueAt(fila, 2).toString();
        String fechaNa = tbDatosEs.getValueAt(fila, 3).toString();
        String telefono = tbDatosEs.getValueAt(fila, 4).toString();
        String provincia = tbDatosEs.getValueAt(fila, 5).toString();
        String ciudad = tbDatosEs.getValueAt(fila, 6).toString();
        String correo = tbDatosEs.getValueAt(fila, 7).toString();
        String edad = tbDatosEs.getValueAt(fila, 8).toString();
        String Posicion = tbDatosEs.getValueAt(fila, 9).toString();
        String SubPosicion = tbDatosEs.getValueAt(fila, 10).toString();
        String nacionalidad = tbDatosEs.getValueAt(fila, 11).toString();
        String peso = tbDatosEs.getValueAt(fila, 12).toString();
        String estatura = tbDatosEs.getValueAt(fila, 13).toString();

        if (fila < 0) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione el registro a modificar antes de presionar el botón");
            return;
        }

        try {

            String SQL = "CALL ActualizarEstudiante(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement actu = conectado.prepareStatement(SQL);
            actu.setString(1, ci);
            actu.setString(2, nombre);
            actu.setString(3, apellido);
            actu.setString(4, fechaNa);
            actu.setString(5, telefono);
            actu.setString(6, provincia);
            actu.setString(7, ciudad);
            actu.setString(8, correo);
            actu.setString(9, edad);
            actu.setString(10, Posicion);
            actu.setString(11, SubPosicion);
            actu.setString(12, nacionalidad);
            actu.setString(13, peso);
            actu.setString(14, estatura);

            int filasActualizadas = actu.executeUpdate();

            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar los datos");
            }

            // Actualizar la tabla después de la actualización
            limpiarTabla();
            cargarTabla();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + e.getMessage());
        }
    }

    public void limpiarTabla() {
        modelo.setDataVector(null, new Object[]{"Nro", "Cédula", "Nombres", "Apellidos", "Fecha de Nacimiento", "Telefono", "Provincia", "Canton", "Correo", "Edad", "Posicion", "SubPosicion", "Nacionalidad", "Peso", "Estatura"});
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDatosEs;
    private javax.swing.JButton txtActualizar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JButton txtEliminar;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
