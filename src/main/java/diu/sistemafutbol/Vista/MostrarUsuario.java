/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package diu.sistemafutbol.Vista;

import diu.sistemafutbol.Controlador.Controlador;
import diu.sistemafutbol.Controlador.EstudianteControlador;
import diu.sistemafutbol.Modelo.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Belial
 */
public class MostrarUsuario extends javax.swing.JInternalFrame {

    ArrayList<Estudiante> ListaPersonaModelo = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();

    Controlador conectar = new Controlador();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public MostrarUsuario() {
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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Usuarios");
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

        jLabel3.setText("Nombre:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        Escritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(txtCedula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(txtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(EscritorioLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EscritorioLayout.createSequentialGroup()
                                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
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

    private void tbDatosEsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDatosEsMouseClicked

    }//GEN-LAST:event_tbDatosEsMouseClicked

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        EstudianteControlador ec = new EstudianteControlador();
        ArrayList<Object[]> lista = ec.buscarPorCI(txtCedula.getText());
        this.limpiarTabla();
        for (Object[] Filas : lista) {
            modelo.addRow(Filas);

        }
        tbDatosEs.setModel(modelo);
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

        EstudianteControlador ec = new EstudianteControlador();
        ArrayList<Object[]> lista = ec.buscarPorNombre(txtNombre.getText());
        this.limpiarTabla();
        for (Object[] Filas : lista) {
            modelo.addRow(Filas);

        }
        tbDatosEs.setModel(modelo);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void EscritorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscritorioMouseClicked
        this.limpiarTabla();
        cargarTabla();

    }//GEN-LAST:event_EscritorioMouseClicked

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        cargarTabla();
    }//GEN-LAST:event_formInternalFrameActivated
    public void cargarTabla() {

        EstudianteControlador ec = new EstudianteControlador();
        ArrayList<Object[]> lista = ec.datosEstudiante();
        for (Object[] Filas : lista) {
            modelo.addRow(Filas);

        }
        tbDatosEs.setModel(modelo);
    }

    public void limpiarTabla() {
        modelo.setDataVector(null, new Object[]{"Cédula", "Nombres", "Apellidos", "Fecha de Nacimiento", "Telefono", "Provincia", "Canton", "Correo", "Edad", "Posicion", "SubPosicion", "Nacionalidad", "Peso", "Estatura"});
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDatosEs;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
