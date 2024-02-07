/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package diu.sistemafutbol.Vista;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import diu.sistemafutbol.Controlador.EstudianteControlador;
import diu.sistemafutbol.Modelo.Estudiante;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
    public VerEstudiante() {
        initComponents();
        setModelo();
    }

    public void setModelo() {
        String[] cabecera = {"Cédula", "Nombres", "Apellidos", "Fecha de Nacimiento",  "Telefono", "Provincia", "Canton", "Correo" ,"Edad",  "Posicion", "SubPosicion", "Nacionalidad", "Peso", "Estatura"};
        modelo.setColumnIdentifiers(cabecera);
        tbDatosEs.setModel(modelo);
    }
    
    private void setDatos() {
        
        Object[] filas = new Object[modelo.getColumnCount()];
        
        for (Estudiante datos : ListaPersonaModelo) {
            
            filas[0] = datos.getCiEstudiante();
            filas[1] = datos.getNombres();
            filas[2] = datos.getApellidos();
            filas[3] = datos.getFechaNacimiento();
            filas[4] = datos.getTelefono(); 
            filas[5] = datos.getProvincia();
            filas[6] = datos.getCiudad();
            filas[7] = datos.getCorreo();
            filas[8] = datos.getEdad(); 
            filas[9] = datos.getPosicion();
            filas[10] = datos.getSubposicion();
            filas[11] = datos.getNacionalidad();
            filas[12] = datos.getPeso();
            filas[13] = datos.getEstatura();
            
            modelo.addRow(filas);

            
        }
        tbDatosEs.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatosEs = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();

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
        jScrollPane1.setViewportView(tbDatosEs);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnActualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(461, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
//    public void actualizarDatos(){
//        int fila = tbDatosEs.getSelectedRows();
//       
//        int ci = Integer.parseInt(this.tbDatosEs.getValueAt(fila, 0).toString());
//        
//        String nombre =tbDatosEs.getValueAt(fila, 1).toString();
//        String apellido =tbDatosEs.getValueAt(fila, 2).toString();
//        String fechaNa =tbDatosEs.getValueAt(fila, 3).toString();
//        String telefono =tbDatosEs.getValueAt(fila, 4).toString();
//        String provincia =tbDatosEs.getValueAt(fila, 5).toString();
//        String ciudad =tbDatosEs.getValueAt(fila, 6).toString();
//        String correo =tbDatosEs.getValueAt(fila, 7).toString();
//        String edad =tbDatosEs.getValueAt(fila, 8).toString();
//        String nacionalidad =tbDatosEs.getValueAt(fila, 9).toString();
//        String peso =tbDatosEs.getValueAt(fila, 10).toString();
//        String estatura =tbDatosEs.getValueAt(fila, 11).toString();
//       
//        try {
//            
//        } catch (Exception e) {
//        }
//         
//        
//    }
    
    
    public void actualizarDatos() {
    int fila = tbDatosEs.getSelectedRow();
    if (fila != -1) {
        String ci = tbDatosEs.getValueAt(fila, 0).toString();
        String nombre = tbDatosEs.getValueAt(fila, 1).toString();
        String apellido = tbDatosEs.getValueAt(fila, 2).toString();
        String fechaNa = tbDatosEs.getValueAt(fila, 3).toString();
        String telefono = tbDatosEs.getValueAt(fila, 4).toString();
        String provincia = tbDatosEs.getValueAt(fila, 5).toString();
        String ciudad = tbDatosEs.getValueAt(fila, 6).toString();
        String correo = tbDatosEs.getValueAt(fila, 7).toString();
        String edad = tbDatosEs.getValueAt(fila, 8).toString();
        String nacionalidad = tbDatosEs.getValueAt(fila, 9).toString();
        String peso = tbDatosEs.getValueAt(fila, 10).toString();
        String estatura = tbDatosEs.getValueAt(fila, 11).toString();

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddescuelafutbol1", "root", "24589790Br@yan");
            CallableStatement cstmt = conn.prepareCall("{CALL ActualizarEstudiante(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            cstmt.setString(1, ci);
            cstmt.setString(2, nombre);
            cstmt.setString(3, apellido);
            cstmt.setString(4, fechaNa);
            cstmt.setString(5, telefono);
            cstmt.setString(6, provincia);
            cstmt.setString(7, ciudad);
            cstmt.setString(8, correo);
            cstmt.setString(9, edad);
            cstmt.setString(10, nacionalidad);
            cstmt.setString(11, peso);
            cstmt.setString(12, estatura);
            cstmt.execute();

            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para actualizar");
    }
}


    public void eliminarCliente(){
         
        int fila = tbDatosEs.getSelectedRow();
        String valor = tbDatosEs.getValueAt(fila, 0).toString();
        
        try {
            PreparedStatement eliminar = conectado.prepareStatement("DELETE FROM estudiante WHERE CI_ESTUDIANTE = '"+valor+"'");
            eliminar.executeUpdate();
            limpiarTabla();
            cargarTabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e + " No se pudo eliminar el registro");
        }
    }
    
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        EstudianteControlador ec = new EstudianteControlador();
        ArrayList<Object[]> lista = ec.datosEstudiante();
        for (Object[] Filas : lista) {
            modelo.addRow(Filas);
            
        }
        tbDatosEs.setModel(modelo);
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        actualizarDatos(); 
    }//GEN-LAST:event_btnActualizarActionPerformed

    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDatosEs;
    // End of variables declaration//GEN-END:variables
}
