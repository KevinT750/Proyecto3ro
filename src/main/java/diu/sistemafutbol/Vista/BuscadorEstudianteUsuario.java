/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package diu.sistemafutbol.Vista;

import diu.sistemafutbol.Controlador.EntrenadorControlador;
import diu.sistemafutbol.Controlador.EstudianteControlador;
import diu.sistemafutbol.Modelo.Entrenador;
import diu.sistemafutbol.Modelo.Estudiante;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin
 */
public class BuscadorEstudianteUsuario extends javax.swing.JInternalFrame {

    ArrayList<Estudiante> ListaEstudiante = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();
    public String Cedul;

    public BuscadorEstudianteUsuario() {
        initComponents();
        setModelo();

    }

    public void setModelo() {

        String[] cabecera = {"Nombre", "Apellido", "Edad","Teléfono", "Correo", "Posición", "SubPosición", "Peso", "Altura"};
        modelo.setColumnIdentifiers(cabecera);
        tbEstudiante.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEstudiante = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("BUSCADOR");

        txtBuscar.setBackground(new java.awt.Color(204, 204, 204));
        txtBuscar.setBorder(null);

        jLabel1.setText("Buscar Estudiante:");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin\\OneDrive\\Documentos\\NetBeansProjects\\SistemaFutbol\\src\\main\\Imagenes\\pngwing.com (1).png")); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        tbEstudiante.setModel(new javax.swing.table.DefaultTableModel(
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
        tbEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEstudianteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbEstudiante);

        Escritorio.setLayer(txtBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.cargarTabla();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void tbEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEstudianteMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tbEstudiante.getModel();

        ObtenerDatos ae = new ObtenerDatos();
        ae.txtNombre.setText(dtm.getValueAt(tbEstudiante.getSelectedRow(), 0).toString());
        ae.txtApellido.setText(dtm.getValueAt(tbEstudiante.getSelectedRow(), 1).toString());
        ae.jblEdad.setText(dtm.getValueAt(tbEstudiante.getSelectedRow(), 2).toString());
        ae.txtTelefono.setText(dtm.getValueAt(tbEstudiante.getSelectedRow(), 3).toString());
        ae.txtCorreo.setText(dtm.getValueAt(tbEstudiante.getSelectedRow(), 4).toString());
        ae.txtPeso.setText(dtm.getValueAt(tbEstudiante.getSelectedRow(), 7).toString());
        ae.txtAltura.setText(dtm.getValueAt(tbEstudiante.getSelectedRow(), 8).toString());
        ae.cbPosicion.setSelectedItem(dtm.getValueAt(tbEstudiante.getSelectedRow(), 5).toString());
        ae.cbSubPosicion.setSelectedItem(dtm.getValueAt(tbEstudiante.getSelectedRow(), 6).toString());      
        ae.jblCedula.setText(txtBuscar.getText());
        Escritorio.add(ae);
        ae.show();

    }//GEN-LAST:event_tbEstudianteMouseClicked
    private void setDatos() {

        Object[] filas = new Object[modelo.getColumnCount()];

        for (Estudiante datos : ListaEstudiante) {
            filas[0] = datos.getNombres();
            filas[1] = datos.getApellidos();
            filas[2] = datos.getEdad();
            filas[3] = datos.getTelefono();
            filas[4] = datos.getCorreo();
            filas[5] = datos.getPosicion();
            filas[6] = datos.getSubposicion();
            filas[7] = datos.getPeso();
            filas[8] = datos.getEstatura();

            modelo.addRow(filas);

        }
        tbEstudiante.setModel(modelo);
    }

    public void cargarTabla() {

        EstudianteControlador ec = new EstudianteControlador();
        ArrayList<Object[]> lista = ec.datosActualizar(txtBuscar.getText());
        for (Object[] Filas : lista) {
            modelo.addRow(Filas);

        }
        tbEstudiante.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbEstudiante;
    public static javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
