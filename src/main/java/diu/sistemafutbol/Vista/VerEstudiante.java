/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package diu.sistemafutbol.Vista;

import diu.sistemafutbol.Controlador.EstudianteControlador;
import diu.sistemafutbol.Modelo.Estudiante;
import java.util.ArrayList;
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

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(404, Short.MAX_VALUE))
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

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        EstudianteControlador ec = new EstudianteControlador();
        ArrayList<Object[]> lista = ec.datosEstudiante();
        for (Object[] Filas : lista) {
            modelo.addRow(Filas);
            
        }
        tbDatosEs.setModel(modelo);
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDatosEs;
    // End of variables declaration//GEN-END:variables
}
