/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package diu.sistemafutbol.Vista;

/**
 *
 * @author kevin
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jblBienvenido = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opCrearUs = new javax.swing.JMenuItem();
        opMostrarUs = new javax.swing.JMenuItem();
        opActualizar = new javax.swing.JMenuItem();
        Entrenador = new javax.swing.JMenu();
        opEntrenador = new javax.swing.JMenuItem();
        opEntrnador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");

        jblBienvenido.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N

        Escritorio.setLayer(jblBienvenido, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jblBienvenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1302, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jblBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(624, Short.MAX_VALUE))
        );

        jMenu1.setText("Estudiante");

        opCrearUs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opCrearUs.setText("Crear Estudiante");
        opCrearUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCrearUsActionPerformed(evt);
            }
        });
        jMenu1.add(opCrearUs);

        opMostrarUs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opMostrarUs.setText("Ver Estudiantes");
        opMostrarUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMostrarUsActionPerformed(evt);
            }
        });
        jMenu1.add(opMostrarUs);

        opActualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opActualizar.setText("Actualizar Estudiante");
        opActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opActualizarActionPerformed(evt);
            }
        });
        jMenu1.add(opActualizar);

        jMenuBar1.add(jMenu1);

        Entrenador.setText("Entrenador");

        opEntrenador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opEntrenador.setText("Crear Entrenador");
        opEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEntrenadorActionPerformed(evt);
            }
        });
        Entrenador.add(opEntrenador);

        opEntrnador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opEntrnador.setText("Mostrar Entrenador");
        opEntrnador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEntrnadorActionPerformed(evt);
            }
        });
        Entrenador.add(opEntrnador);

        jMenuBar1.add(Entrenador);

        setJMenuBar(jMenuBar1);

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

    private void opCrearUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCrearUsActionPerformed
        CrearEstudiante ce = new CrearEstudiante();
        Escritorio.add(ce);
        ce.show();
    }//GEN-LAST:event_opCrearUsActionPerformed

    private void opMostrarUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMostrarUsActionPerformed
        VerEstudiante ve = new VerEstudiante();
        Escritorio.add(ve);
        ve.show();
    }//GEN-LAST:event_opMostrarUsActionPerformed

    private void opEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEntrenadorActionPerformed
        CrearEntrenador ce = new CrearEntrenador();
        Escritorio.add(ce);
        ce.show();
    }//GEN-LAST:event_opEntrenadorActionPerformed

    private void opEntrnadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEntrnadorActionPerformed
        MostarEntrenador me = new MostarEntrenador();
        Escritorio.add(me);
        me.show();
    }//GEN-LAST:event_opEntrnadorActionPerformed

    private void opActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opActualizarActionPerformed
        BuscadorEstudiante be = new BuscadorEstudiante();
        Escritorio.add(be);
        be.show();
    }//GEN-LAST:event_opActualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Entrenador;
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jblBienvenido;
    private javax.swing.JMenuItem opActualizar;
    private javax.swing.JMenuItem opCrearUs;
    private javax.swing.JMenuItem opEntrenador;
    private javax.swing.JMenuItem opEntrnador;
    private javax.swing.JMenuItem opMostrarUs;
    // End of variables declaration//GEN-END:variables
}
