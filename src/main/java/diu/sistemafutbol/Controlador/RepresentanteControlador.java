/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diu.sistemafutbol.Controlador;

import diu.sistemafutbol.Modelo.Representante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class RepresentanteControlador {

    private Representante representante;
    Controlador conectar = new Controlador();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public RepresentanteControlador() {
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

    public void ingresarRepresentante(Representante r) {
        try {
            String SQL = "CALL InsertarRepresentante('" + r.getCiRepresentante()
                    + "', '" + r.getNombreRep()
                    + "', '" + r.getApellidoRep()
                    + "', '" + r.getTelefono() + "')";

            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);

            int res = ejecutar.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Representante Creado con Exito");
                ejecutar.close();

            } else {

                JOptionPane.showMessageDialog(null, "Revise la informacion ingresada");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA" + e);
        }

    }
}
