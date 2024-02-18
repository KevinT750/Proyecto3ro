/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package diu.sistemafutbol.Vista;

import diu.sistemafutbol.Controlador.EntrenadorControlador;
import diu.sistemafutbol.Controlador.EstudianteControlador;
import diu.sistemafutbol.Modelo.Entrenador;
import diu.sistemafutbol.Modelo.Estudiante;
import static diu.sistemafutbol.Vista.BuscadorEstudiante.txtBuscar;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin
 */
public class buscadorEntrenadorUsuario extends javax.swing.JInternalFrame {

    ArrayList<Entrenador> ListaEntrenador = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();
    public String Cedul;

    public buscadorEntrenadorUsuario() {
        initComponents();
        setModelo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEntrenador = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscador de Entrenadores");

        txtBuscar.setBackground(new java.awt.Color(204, 204, 204));
        txtBuscar.setBorder(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\kevin\\OneDrive\\Documentos\\NetBeansProjects\\SistemaFutbol\\src\\main\\Imagenes\\pngwing.com (1).png")); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel1.setText("Buscar Entrenador:");

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
        tbEntrenador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEntrenadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbEntrenador);

        Escritorio.setLayer(txtBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
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

    private void tbEntrenadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEntrenadorMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tbEntrenador.getModel();
        ActualizarEntrenadorUsuario ae = new ActualizarEntrenadorUsuario();
        ae.jblNumero.setText(dtm.getValueAt(tbEntrenador.getSelectedRow(), 0).toString());
        ae.jblNombre.setText(dtm.getValueAt(tbEntrenador.getSelectedRow(), 2).toString());
        ae.jblApellido.setText(dtm.getValueAt(tbEntrenador.getSelectedRow(), 3).toString());
        ae.jblCedula.setText(dtm.getValueAt(tbEntrenador.getSelectedRow(), 1).toString());
        ae.JblTelefono.setText(dtm.getValueAt(tbEntrenador.getSelectedRow(), 4).toString());
        ae.jblUsuario.setText(dtm.getValueAt(tbEntrenador.getSelectedRow(), 5).toString());
        ae.jblContrasena.setText(dtm.getValueAt(tbEntrenador.getSelectedRow(), 6).toString());
        ae.jblRol.setText(dtm.getValueAt(tbEntrenador.getSelectedRow(), 7).toString());
        Escritorio.add(ae);
        ae.show();
    }//GEN-LAST:event_tbEntrenadorMouseClicked

    public void setModelo() {

        String[] cabecera = {"Nro", "Cedula","Nombre", "Apellido",  "Telefono", "Usuario", "Contraseña", "Rol"};
        modelo.setColumnIdentifiers(cabecera);
        tbEntrenador.setModel(modelo);
    }

    private void setDatos() {

        Object[] filas = new Object[modelo.getColumnCount()];
        int cont = 0;

        for (Entrenador datos : ListaEntrenador) {
            filas[0] = String.valueOf(cont);
            filas[1] = datos.getNombreEnt();
            filas[2] = datos.getApellidoEnt();
            filas[3] = datos.getCedulaE();
            filas[4] = datos.getTelefono();
            filas[5] = datos.getUsuario();
            filas[6] = datos.getContrasena();
            filas[7] = datos.getRol();
            cont++;
            modelo.addRow(filas);

        }
        tbEntrenador.setModel(modelo);
    }

    public void cargarTabla() {

        EntrenadorControlador ec = new EntrenadorControlador();
        ArrayList<Object[]> lista = ec.buscarCedula(txtBuscar.getText());
        for (Object[] Filas : lista) {
            modelo.addRow(Filas);

        }
        tbEntrenador.setModel(modelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbEntrenador;
    public static javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
