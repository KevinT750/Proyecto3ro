/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package diu.sistemafutbol.Vista;

import diu.sistemafutbol.Controlador.Controlador;
import diu.sistemafutbol.Controlador.EstudianteControlador;
import diu.sistemafutbol.Controlador.PagosControlador;
import diu.sistemafutbol.Modelo.Estudiante;
import diu.sistemafutbol.Modelo.Pagos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Belial
 */
public class GestionPagos extends javax.swing.JInternalFrame {
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    ArrayList<Pagos> ListaPagosModelo = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();
     private List<Pagos> pagosList;
    
     Controlador conectar = new Controlador();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    
    
    
    public GestionPagos() {
        initComponents();
        setModelo();
    }

    
    public void setModelo() {
        String[] cabecera = {"Cédula", "Nombres", "Apellidos", "Fecha de Pago","Estado", "Monto"};
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

    
    private Estudiante obtenerEstudiantePorId(int idEstudiante) {
    for (Estudiante estudiante : listaEstudiantes) {
        if (estudiante.getIdEstudiante() == idEstudiante) {
            return estudiante;
        }
    }
    return null; // Si no se encuentra el estudiante con el ID dado
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
        txtCedula = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPagos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("PAGOS");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE PAGOS");

        btnPagar.setText("PAGAR");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel2.setText("Buscar:");

        btnver.setText("VER");
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
        jScrollPane1.setViewportView(tblPagos);

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
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnver, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnPagar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 168, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        // TODO add your handling code here:

        
    }//GEN-LAST:event_btnPagarActionPerformed
    
    private void btnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverActionPerformed
        // TODO add your handling code here:
   cargarDatosEnTabla();
    }//GEN-LAST:event_btnverActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPagos;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}






// public void llenarTabla() {
//        // Limpiar la tabla antes de llenarla
//        modelo.setRowCount(0);
//
//        // Obtener los vehículos de la base de datos
//        Estudiante Es = new Estudiante();
//        PagosControlador controlador = new PagosControlador();
//        ArrayList<Object[]> Pagos = controlador.buscarPorCI(Es);
//
//
//        // Llenar la tabla con los datos de los vehículos obtenidos
//        if (Pagos != null) {
//            for (Object[] fila : Pagos) {
//                modelo.addRow(fila);
//            }
//        }
//    }







//        // TODO add your handling code here:
//        
//    String cedula = (txtCedula.getText());
//    Estudiante es = new Estudiante();
//    es.setCiEstudiante(cedula); // Suponiendo que tienes un método setCedula en tu clase Persona
//    
//    // Crear una instancia de VehiculoControlador
//    PagosControlador controlador = new PagosControlador();
//    
//    // Llamar al método obtenerVehiculosPorPersona del controlador
//    ArrayList<Object[]> Pagos = controlador.buscarPorCI(cedula);
//    
//    // Luego, puedes usar los datos obtenidos en vehiculos para mostrarlos en la tabla
//    // Por ejemplo, podrías actualizar la tabla con estos datos
//    // Supongamos que tu tabla se llama tblDatosVehiculares
//    DefaultTableModel modeloTabla = (DefaultTableModel) tblPagos.getModel();
//    modeloTabla.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos
//    
//    // Luego, agregar los datos de vehiculos a la tabla
//    for (Object[] fila : Pagos) {
//        modeloTabla.addRow(fila);
//        
//    }